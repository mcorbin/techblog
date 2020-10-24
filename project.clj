(defproject cryogen "0.1.0"
  :description "My personal blog"
  :url "https://mcorbin.fr"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring-devel "1.7.1"]
                 [compojure "1.6.1"]
                 [ring-server "0.5.0"]
                 [cryogen-asciidoc "0.1.4"]
                 [cryogen-core "0.1.65-mcorbin"]]
  :plugins [[lein-ring "0.12.5"]]
  :main cryogen.core
  :ring {:init cryogen.server/init
         :handler cryogen.server/handler})
