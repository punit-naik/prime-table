(ns prime-table.prime-test
  (:require [clojure.test :refer [deftest testing is]]
            [prime-table.prime :refer :all]))

(deftest check-prime-test
  (testing "`check-prime` function ..."
    (is (not (check-prime 1)))
    (is (check-prime 2))
    (is (check-prime 5))
    (is (not (check-prime 9)))))

(deftest first-n-primes-test
  (testing "`first-n-primes` function ..."
    (is (= (first-n-primes 1) [2]))
    (is (= (first-n-primes 2) [2 3]))
    (is (= (first-n-primes 10)
           [2 3 5 7 11 13 17 19 23 29]))))
