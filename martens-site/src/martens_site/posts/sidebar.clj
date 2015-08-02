(ns martens-site.posts.sidebar
  (:require [hiccup.page :refer [html5 include-css]]))

(defn about-sidebar [] 
  [:div 
    [:h3 "About Me"] 
    [:img {:src "/img/marten_sytema.jpg" 
           :class "me" 
           :alt "Marten Sytema, Freelance Software Developer"}] 
    [:p "I am a <b>Software Engineer</b> based in <b>The Hague</b> in <b>The Netherlands</b>. 
         In 2010 I earned my Masters degree in <b>Computer Science</b> from <b>Twente University in Enschede</b>."]
    [:p "In the recent years I developed numerous <b>(web) applications</b> using a lot of different technologies.
         Due to my strong interests in <b>software architecture</b> and <b>programming languages</b>, I've come
         to learn a lot of languages, frameworks and libraries, amongst which: "]
    [:h3 "Languages"]
    [:ul 
      [:li "Java"]
      [:li "PHP"]
      [:li "C#"]
      [:li "Clojure (this website is written in it)"]
      [:li "Haskell"]
      [:li "SQL"]
      [:li "Elm"]
     ]
    [:h3 "Technologies/frameworks"]
    [:ul
      [:li "ReactJS, AngularJS, MeteorJS, etc."]
      [:li "Laravel, Zend"]
      [:li "Node"]
      [:li "Google Web Toolkit"]
      [:li "and many, many more"]]

    [:p "Interested in my services or experiences? " 
      [:a {"href" "/contact" :class "button"} "Let's talk!"]]
   ])


