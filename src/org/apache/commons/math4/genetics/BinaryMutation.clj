(ns org.apache.commons.math4.genetics.BinaryMutation
  "Mutation for BinaryChromosomes. Randomly changes one gene."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics BinaryMutation]))

(defn ->binary-mutation
  "Constructor."
  (^BinaryMutation []
    (new BinaryMutation )))

(defn mutate
  "Mutate the given chromosome. Randomly changes one gene.

  original - the original chromosome. - `org.apache.commons.math4.genetics.Chromosome`

  returns: the mutated chromosome. - `org.apache.commons.math4.genetics.Chromosome`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if original is not an instance of BinaryChromosome."
  (^org.apache.commons.math4.genetics.Chromosome [^BinaryMutation this ^org.apache.commons.math4.genetics.Chromosome original]
    (-> this (.mutate original))))

