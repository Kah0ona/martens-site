(ns martens-site.posts.contact)

(def contact-body 
  [:div {:class "address"}
    [:h3 "Get in touch!"]
    [:p "Interested in having me as a developer on your team? Need a guy for a few weeks or months? Let's get in touch!" ]
    [:p "I work on freelance basis. I don't mind working remotely, I actually do that pretty often. "]
    [:h3 "Contact details"]
    [:span [:a {:href "https://nl.linkedin.com/in/sytematic" :target "_blank"} "LinkedIn" ] "|"
       [:a {:href "mailto:marten@sytematic.nl" :target "_blank"} "E-mail" ]]])

(def contact-data
  {:title "Contact"
   :body contact-body })
