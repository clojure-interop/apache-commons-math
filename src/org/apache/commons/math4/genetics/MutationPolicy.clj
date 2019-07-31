(ns org.apache.commons.math4.genetics.MutationPolicy
  "Algorithm used to mutate a chromosome."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics MutationPolicy]))

(defn mutate
  "Mutate the given chromosome.

  original - the original chromosome. - `org.apache.commons.math4.genetics.Chromosome`

  returns: the mutated chromosome. - `org.apache.commons.math4.genetics.Chromosome`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the given chromosome is not compatible with this MutationPolicy"
  (^org.apache.commons.math4.genetics.Chromosome [^MutationPolicy this ^org.apache.commons.math4.genetics.Chromosome original]
    (-> this (.mutate original))))

