(defn my-map
  [f sequence-data]
  (loop [remaining-data sequence-data
         final-data []]
    (if (empty? remaining-data)
      final-data
      (let [[part & remaining] remaining-data]
        (recur remaining
               (conj final-data
                     (f part)))))))
