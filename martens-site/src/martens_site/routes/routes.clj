(ns martens-site.routes.routes
  (:require [compojure.core :refer :all]
            [martens-site.views.layout :as layout]
            [martens-site.posts.home :as home]
            [martens-site.posts.portfolio :as portfolio]
            [martens-site.posts.sidebar :as sidebar]
            [martens-site.posts.contact :as contact]
            [martens-site.posts.blog :as blog]
            [hiccup.form :refer :all]))

(defn page [contents]
  (layout/common contents (sidebar/about-sidebar)))

(defn fw-page [contents]
  (layout/fullwidth contents))

(defroutes site-routes
  (GET "/" [] (page home/home-data))
  (GET "/blog" [] (page blog/blog-data))
  (GET "/blog/:id" [id] (let [post (blog/single-post id)]
                          (if post (page {
                                           :title (:title post)
                                           :body (blog/blog-post post)}))))
  (GET "/portfolio" [] (page portfolio/portfolio-data))
  (GET "/contact" [] (fw-page contact/contact-data))) 


