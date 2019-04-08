(ns prime-table.table-test
  (:require [clojure.test :refer [deftest testing is]]
            [prime-table.table :refer :all]))

(deftest generate-data-test
  (testing "`generate-data` function ..."
    (is (= (generate-data [2 3])
           [[4 6]
            [6 9]]))
    (is (= (generate-data [2 3 5 7])
           [[4 6 10 14]
            [6 9 15 21]
            [10 15 25 35]
            [14 21 35 49]]))))

(deftest table-str-test
  (testing "`table-str` function ..."
    (is (= (table-str [2 3]) "    2   3   \n2   4   6   \n3   6   9   "))))
