(ns martens-site.handler
  (:require [compojure.core :refer [defroutes routes]]
            [ring.middleware.resource :refer [wrap-resource]]
            [ring.middleware.file-info :refer [wrap-file-info]]
            [hiccup.middleware :refer [wrap-base-url]]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [martens-site.routes.routes :refer [site-routes]])) 

(defn init []
  (println "martens-site is starting"))

(defn destroy []
  (println "martens-site is shutting down"))

(defroutes app-routes
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (routes site-routes app-routes)
      (handler/site)
      (wrap-base-url)))
