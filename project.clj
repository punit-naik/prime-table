(defproject prime-table "0.1.0-SNAPSHOT"
  :description "Generates a list of prime numbers and displays the result of multiplying
                that list with itself in an array-like fashion as a table"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main prime-table.core
  :profiles {:uberjar {:aot :all
                       :uberjar-name "prime-table-standalone.jar"}})
