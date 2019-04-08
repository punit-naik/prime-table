(ns prime-table.core
  (:require [prime-table.prime :as prime]
            [prime-table.table :as table])
  (:gen-class))

(defn -main
  [& args]
  (println
    (try
      (table/table-str
        (prime/first-n-primes
          (Integer/parseInt (first args))))
      (catch Exception e (str "Caught Exception: " (.getMessage e))))))
