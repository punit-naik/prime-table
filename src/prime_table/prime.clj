(ns prime-table.prime)

(defn check-prime
  "Check if a number is a prime number or not"
  [n]
  {:pre [(pos-int? n)]}
  (when (> n 1)
    (loop [i 2]
      (if (> i (int (/ n 2)))
        (if (= (dec i) 1) true (not (zero? (mod n (dec i)))))
        (if (zero? (mod n i))
          false (recur (inc i)))))))

(defn first-n-primes
  "Returns a list of first `n` prime numbers"
  [n]
  {:pre [(pos-int? n)]}
  (loop [i 2
         result []]
    (if (= (count result) n)
      result
      (recur (inc i)
             (cond-> result
                     (check-prime i) (conj i))))))
