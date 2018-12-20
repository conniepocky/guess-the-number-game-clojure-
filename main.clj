(def n (rand-int 100))

;;(prn n)

(println "You have 10 guesses :D")
(println "HINT: My number is between 1 and 100")

  (loop [guess (read-line)
         tries 10]
    (if (= guess (str n))
      (println "Well done! :D" tries)
      (do
        (println "Wrong :( You have got  " tries " tries left!")
        (if (> (Integer/parseInt guess) (int n))
          (println "Your guess was too big!")
          (println "Your guess was too small!"))
        (if (zero? tries )
           (System/exit 0) 
           (recur (read-line) (dec tries))))))

