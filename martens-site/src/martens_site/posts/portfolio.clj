(ns martens-site.posts.portfolio)

(def portfolio-items
  [
   {:client "Bosch Transmission Technology - Tilburg, Netherlands"
    :body "I did a project for Bosch's HR department, where I developed a system for assessing competencies and 
           skills of their engineering staff. This tool gives Bosch valuable insights in the skill sets people had, and distills
           educational planning for their employees."
    :tech "Java, MySQL, Google Web Toolkit"
    :url "http://www.bosch.nl/transmission_technology/nl/html/5835.htm"
    :img  "img/bosch.gif"}
   {:client "Technicom - Hoogvliet, Netherlands"
    :body "Since 2011 I did a string of projects for Technicom. Technicom is an educational institute educating people
          for various jobs in the oil and off-shore industries. Their complete student administration runs on a bespoke web-application
          I built. This system holds grades, schedules, exams, registrations, etc."
    :url "http://www.technicom.nl"
    :tech "Java, MySQL, Google Web Toolkit, Code generation"
    :img "img/technicom.png"}
   {:client "Republic-M - Zoetermeer, Netherlands"
    :body "Republic-M creates bespoke solutions for the pharmaceutic industry. 
           For them I worked as a team member in multiple projects ranging from internal tooling to a project 
           for a large multinational pharmaceutical firm."
    :tech "ReactJS, PHP (Laravel), MySQL"
    :url "http://www.republic-m.com"
    :img "img/republicm.png"}
   {:client "WhiteWorks - Utrecht, Netherlands"
    :body "WhiteWorks is a hot startup in Utrecht. They've built a web-based project management application that's taking the Dutch market by storm.
           For them I worked on various integrations of WhiteWorks with external web applications."
    :tech "PHP, JavaScript, MySQL"
    :url "http://www.whiteworks.nl"
    :img "img/whiteworks.png"}
   {:client "CateringSoftware - The Hague, Netherlands"
    :body "CateringSoftware is a web application I developed. Since a few years various catering businesses in the Netherlands adopted it. 
           It provides all kinds of helpful tools and reports helping them in their day to day operations"
    :tech "Java, Google Web Toolkit, Code generation, JavaScript, MySQL"
    :url "http://www.cateringsoftware.nl"
    :img "img/cateringsoftware.png"}
   {:client "Sytematic Software - The Hague, Netherlands"
    :body "In 2010 I started out as a software company building custom business software. For this I developed a code-generator application
           which generates enterprise software at rapid speed. From a software model, it generates human-readable Google Web Toolkit code. 
           The tool is called RADOS and for many of the above clients it proved very beneficial. 
           At some point Sytematic grew up to 5 people. However, I now prefer the more light-weight working life of a freelancer. 
           One of the reasons is that I simply enjoy writing code more than I enjoy being a manager."
    :tech "Java, Google Web Toolkit, Code generation, JavaScript, MySQL"
    :url "http://www.sytematic.nl"
    :img "img/sytematic.png"}
   ])

(defn render-portfolio [item]
  [:div {:class "portfolio"} 
    [:div  {:class "img"}
      [:img {:src (:img item) }]]
    [:h3 (:client item) ]
    [:p  (:body item)   ]
    [:small (:tech item) " | " [:a {:href (:url item) :target "_blank"} (:url item)]]])

(def portfolio-body 
  [:div 
    [:h1 "Portfolio"]
    [:p "Below you can find some of the companies I worked for, along with a short description about what I did. 
         If you want to know more details about any of these, please contact me, I'll be happy to elaborate."]
    (map render-portfolio portfolio-items)
   ])

(def portfolio-data
  { :title "Portfolio"
    :body portfolio-body })

