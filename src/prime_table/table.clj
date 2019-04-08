(ns prime-table.table
  (:require [prime-table.prime]
            [clojure.string :refer [join]]))

(defn generate-data
  "Generates the data to be shown in the table"
  [prime-nos]
  (map
    (fn [i]
      (map
        (fn [j]
          (* i j))
        prime-nos))
    prime-nos))

(defn prep-row
  "Preps the string for the table row to be printed"
  [num-list max-char-size]
  (join
    (map
      #(let [char-size (count (str %))
             padding (join (take (+ (- max-char-size char-size) 3) (repeat " ")))]
         (str % padding))
      num-list)))

(defn table-str
  "Generates string for the table of prime numbers multiplied according to their rows and columns"
  [prime-nos]
  (let [data (as-> (generate-data prime-nos) $
                   ;; Adding the `prime-nos` as headers on the left and top of the table data
                   (map conj $ prime-nos)
                   (conj $ (cons "" prime-nos)))
        max-char-size (count (str (last prime-nos)))]
    (join "\n" (map #(prep-row % max-char-size) data))))
