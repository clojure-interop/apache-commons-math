(ns org.apache.commons.math4.genetics.RandomKeyMutation
  "Mutation operator for RandomKeys. Changes a randomly chosen element
  of the array representation to a random value uniformly distributed in [0,1]."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics RandomKeyMutation]))

(defn ->random-key-mutation
  "Constructor."
  (^RandomKeyMutation []
    (new RandomKeyMutation )))

(defn mutate
  "Mutate the given chromosome.

  original - the original chromosome. - `org.apache.commons.math4.genetics.Chromosome`

  returns: the mutated chromosome. - `org.apache.commons.math4.genetics.Chromosome`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if original is not a RandomKey instance"
  (^org.apache.commons.math4.genetics.Chromosome [^RandomKeyMutation this ^org.apache.commons.math4.genetics.Chromosome original]
    (-> this (.mutate original))))

