(ns martens-site.views.layout
  (:require [hiccup.page :refer [html5 include-css]]))

(def navigation-data 
  [{ :label "Home"      :url "/" }
   { :label "Blog" :url "/blog" }
   { :label "Portfolio" :url "/portfolio" }
   { :label "Contact"   :url "/contact" }])

(defn nav-item [item] 
  [:li {:class "nav-item"}
    [:a {:href (:url item)} (:label item)]])

(defn navigation [data]
  [:ul {:class "navigation"}
   (map nav-item data)])

(defn fullwidth [contents]
  (html5
    [:head
     [:title (:title contents)]
     [:link {:href "http://fonts.googleapis.com/css?family=Open+Sans:400,600" 
             :rel "stylesheet" 
             :type "text/css"}]
     (include-css "/css/screen.css")]
    [:body 
      [:div {:class "container"} 
        (navigation navigation-data)
        [:h1 {:class "title"} "Marten Sytema" [:span {:class "subtitle"} "Freelance Software Developer"] ]
        [:hr]
        [:div {:class ""} (:body contents) ]]]))
(defn common [contents sidebar]
  (html5
    [:head
     [:title (:title contents)]
     [:link {:href "http://fonts.googleapis.com/css?family=Open+Sans:400,600" 
             :rel "stylesheet" 
             :type "text/css"}]
     (include-css "/css/screen.css")]
    [:body 
      [:div {:class "container"} 
        (navigation navigation-data)
        [:h1 {:class "title"} "Marten Sytema" [:span {:class "subtitle"} "Freelance Software Developer"] ]
        [:hr]
        [:div {:class "content"} (:body contents) ]
        [:div {:class "sidebar"} sidebar]]]))
      
