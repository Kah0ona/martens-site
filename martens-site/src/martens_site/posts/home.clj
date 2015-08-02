(ns martens-site.posts.home
  (:require [hiccup.page :refer [html5 include-css]]))

(def home-body
  [:div 
   [:p {:class "intro" }
      "Hello! Thanks for visiting. I am a freelance software developer based in The Netherlands.
       I just love to write code, build cool things, and solve puzzles on a daily basis. 
       I am doing this for seven years now, and it's still a thrill to work with ever changing technology stacks. 
       Staying on top of that and absorbing it all is one of my passions."
   ]
   [:p "Apart from new technology I love listening to old Rock'n'Roll, and I have a love for cars."]
   [:p "Have a look at my "
      [:a {:href "/portfolio"} "portfolio"] 
       " or my "
      [:a {:href "/blog"} "blog"] "."]])

(def home-data 
  { :title "Marten Sytema - Freelance Software Engineer, The Netherlands"
    :body home-body })

