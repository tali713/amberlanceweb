(ns amberlanceweb.core
    (:require [reagent.core :as reagent :refer [atom]]
              [reagent.session :as session]
              [secretary.core :as secretary :include-macros true]
              [accountant.core :as accountant]))

;; -------------------------
;; Views

(defn home-page []
  [:div {:class "wrapper"}
   [:div {:class "header"}
    ;;    [:h2 "Welcome to amberlanceweb"]

    [:div {:class "nav-mobile"}
     [:button {:type "button" :class "nav-toggle"}
      [:span {:class "bar"}]
      [:span {:class "bar"}]
      [:span {:class "bar"}]]]
    
    [:nav {:class "amber-nav"}
     [:a {:href "https://placeholder.com" :class "amber-logo"}
      [:img {:alt "Amberlance Studios" :src "images/amberlance_logo.png"}]
      ]
     [:a {:href "deadlink.html"} "About Amberlance Studios"]
     [:a {:href "deadlink.html"} "button 2"]
     [:a {:href "deadlink.html"} "button 3"]
     [:a {:href "deadlink.html"} "button 4"]
     [:a {:class "join-fsf" :href "deadlink.html"}
      "Help Us Out"]]

    [:nav {:class "main"}
     [:a {:href "home.html"} "Home"]
     [:a {:href "about.html"} "About"]
     [:a {:href "news.html"} "News"]
     [:a {:href "comics.html"} "Comics"]
     [:a {:href "media.html"} "Media"]
     [:a {:href "marketplace.html"} "Marketplace"]]
    
    [:div {:class "container"}
     [:div {:class "logo"}
      [:img {:src "images/amberlance_logo.png"}]
      [:h1 "Amberlance Studios"]]
     [:h2 "Digital Media Studios"]
     [:p "Lorem ipsum dolor sit amet, consectetur adipiscing
     elit. Curabitur eget lorem sapien. In hac habitasse platea
     dictumst. Nullam vitae molestie nibh, eu mattis ipsum. Mauris
     pellentesque dolor at ex pharetra hendrerit. Sed quis purus
     augue. Nam ut consequat enim, sed volutpat quam. Morbi rutrum
     ante vitae accumsan faucibus. Nunc at erat faucibus, feugiat odio
     a, varius orci. Fusce faucibus orci eget lacinia luctus. In
     placerat at diam a sodales. Sed neque justo, sollicitudin ac nibh
     et, gravida cursus turpis. Nunc dapibus, eros eget tempor
     interdum, turpis sem efficitur augue, condimentum volutpat justo
     ex sit amet sapien. Proin porttitor elit risus, a egestas nunc
     vulputate sed. Aliquam id leo bibendum, varius odio quis,
     vehicula nulla."]]]

   [:div {:class "features"}
    [:div {:class "container"}
     [:h2 "Some Text"]
     [:ul
      [:li {:class "modes"}
       "hello there"]
      [:li {:class "documentation"}
       "hello there"]
      [:li {:class "unicode"}
       "hello there"]]
     [:ul
      [:li {:class "customization"}
       "hello there"]
      [:li {:class "extensions"}
       "hello there"]
      [:li {:class "packages"}
       "hello there"]]]]

   [:div {:class "tour-banner"}
    [:div {:class "container"}
     "Lorem Ipsum"]]

   [:div {:class "videos"}
    [:div {:class "container"}
     "Lorem Ipsum"]]

   [:div {:class "news"}
    [:div {:class "container"}
     [:h2 "Heading"]
     [:h3 "Subheading"]
     [:p "Lorem ipsum dolor sit amet, consectetur adipiscing
      elit. Curabitur eget lorem sapien. In hac habitasse platea
      dictumst. Nullam vitae molestie nibh, eu mattis ipsum. Mauris
      pellentesque dolor at ex pharetra hendrerit. Sed quis purus
      augue. Nam ut consequat enim, sed volutpat quam. Morbi rutrum
      ante vitae accumsan faucibus. Nunc at erat faucibus, feugiat
      odio a, varius orci. Fusce faucibus orci eget lacinia luctus. In
      placerat at diam a sodales. Sed neque justo, sollicitudin ac
      nibh et, gravida cursus turpis. Nunc dapibus, eros eget tempor
      interdum, turpis sem efficitur augue, condimentum volutpat justo
      ex sit amet sapien. Proin porttitor elit risus, a egestas nunc
      vulputate sed. Aliquam id leo bibendum, varius odio quis,
      vehicula nulla."  ]
     [:p
      "Mauris id metus vel libero rhoncus tincidunt. Pellentesque nec
      metus et risus elementum ultrices eu ac sapien. Quisque
      ultricies tellus nec nibh scelerisque tincidunt. Nulla
      facilisi. Nunc eu sapien quis lorem blandit suscipit tincidunt a
      neque. Proin dapibus nunc in ultrices volutpat. Curabitur ut
      sapien pellentesque, viverra nibh ut, fermentum mauris. Aliquam
      posuere imperdiet volutpat. Pellentesque sit amet ex non metus
      tincidunt lacinia. Lorem ipsum dolor sit amet, consectetur
      adipiscing elit."]]
    [:div {:class "container"}
     [:h2 "Heading2"]
     [:h3 "Subheading2"]
     [:p "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur eget lorem sapien. In hac habitasse platea dictumst. Nullam vitae molestie nibh, eu mattis ipsum. Mauris pellentesque dolor at ex pharetra hendrerit. Sed quis purus augue. Nam ut consequat enim, sed volutpat quam. Morbi rutrum ante vitae accumsan faucibus. Nunc at erat faucibus, feugiat odio a, varius orci. Fusce faucibus orci eget lacinia luctus. In placerat at diam a sodales. Sed neque justo, sollicitudin ac nibh et, gravida cursus turpis. Nunc dapibus, eros eget tempor interdum, turpis sem efficitur augue, condimentum volutpat justo ex sit amet sapien. Proin porttitor elit risus, a egestas nunc vulputate sed. Aliquam id leo bibendum, varius odio quis, vehicula nulla."
      ]
     [:p
      "Mauris id metus vel libero rhoncus tincidunt. Pellentesque nec metus et risus elementum ultrices eu ac sapien. Quisque ultricies tellus nec nibh scelerisque tincidunt. Nulla facilisi. Nunc eu sapien quis lorem blandit suscipit tincidunt a neque. Proin dapibus nunc in ultrices volutpat. Curabitur ut sapien pellentesque, viverra nibh ut, fermentum mauris. Aliquam posuere imperdiet volutpat. Pellentesque sit amet ex non metus tincidunt lacinia. Lorem ipsum dolor sit amet, consectetur adipiscing elit."]]
    ]

   [:div {:class "amberlance-banner"}
    [:div {:class "container"}
     [:div {:class "left"}
      [:a {:class "amberlance-logo"
           :href "http://www.null.org"}
       [:img {:src "images/amberlance_logo.png"
              :height "90"
              :alt "Free Software Fundation"}]]]
     [:div {:class "right"}
      [:p "“Mauris id metus vel libero rhoncus tincidunt.”"]
      [:p {:id "join-amberlance"}
       [:a {:href "http://somewhere"}
        "JOIN AMBERLANCE"]]]
     [:div {:class "clear"}]]] 
   
   ;; [:div {:class "header-cont"}
   ;;  [:h3 "imagine a menu here"]]
   ;; [:div {:class "content"}
   ;; [:div [:a {:href "/about"} "go to about page"]]]
   ])

(defn about-page []
  [:div [:h2 "About amberlanceweb"]
   [:div [:a {:href "/"} "go to the home page"]]])

(defn current-page []
  [:div [(session/get :current-page)]])

;; -------------------------
;; Routes

(secretary/defroute "/" []
  (session/put! :current-page #'home-page))

(secretary/defroute "/about" []
  (session/put! :current-page #'about-page))

;; -------------------------
;; Initialize app

(defn mount-root []
  (reagent/render [current-page] (.getElementById js/document "app")))

(defn init! []
  (accountant/configure-navigation!
   {:nav-handler
    (fn [path]
      (secretary/dispatch! path))
    :path-exists?
    (fn [path]
      (secretary/locate-route path))})
  (accountant/dispatch-current!)
  (mount-root))
