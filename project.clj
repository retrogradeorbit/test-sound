(defproject test-sound "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2725"]]

  :node-dependencies [[source-map-support "0.2.8"]]

  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-npm "0.4.0"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["out/test_sound" "test_sound.js" "test_sound.min.js"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :compiler {
                :main test-sound.core
                :output-to "out/test_sound.js"
                :output-dir "out"
                :optimizations :none
                :cache-analysis true
                :source-map true}}
             {:id "release"
              :source-paths ["src"]
              :compiler {
                :main test-sound.core
                :output-to "out-adv/test_sound.min.js"
                :output-dir "out-adv"
                :optimizations :advanced
                :pretty-print true
                :externs ["src/w3c_audio.js"]
                         }}]})
