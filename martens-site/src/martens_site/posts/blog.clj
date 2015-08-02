(ns martens-site.posts.blog
  (:require 
    [clojure.java.io :as io]
    [clojure.string :as s]))

(defn only-txts [file]
  (.endsWith file ".txt" ))

(defn blogpost-filenames []
  (filter only-txts (.list (io/file "resources/public/blogposts"))))

(defn parsepost [filename]
  (let [slug filename
        filecontents (slurp (s/join "" ["resources/public/blogposts/", filename]))
        lines (s/split-lines filecontents)
        title (nth lines 0)
        date (nth lines 1)
        body (s/join "\n"  (rest (rest lines)))] 
    {:slug slug
     :title title
     :date date
     :body lines}))

(defn blogposts []
  (map parsepost (blogpost-filenames)))

(defn single-post [id] 
  (let 
    [postnames (filter #(= id %) (blogpost-filenames))
     post (if (empty? postnames) 
              nil
              (parsepost (first postnames)))]
     post))

(defn blog-post [post]
  [:div
    [:h1 (:title post)]
    [:small (:date post)]
    [:div {:class "blogcontent"} (:body post)]])

(def blog-data
  {:title "Blog"
   :body (map blog-post (blogposts))})


