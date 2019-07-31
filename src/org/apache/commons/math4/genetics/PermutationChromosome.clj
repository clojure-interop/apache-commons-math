(ns org.apache.commons.math4.genetics.PermutationChromosome
  "Interface indicating that the chromosome represents a permutation of objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics PermutationChromosome]))

(defn decode
  "Permutes the sequence of objects of type T according to the
   permutation this chromosome represents. For example, if this chromosome
   represents a permutation (3,0,1,2), and the unpermuted sequence is
   (a,b,c,d), this yields (d,a,b,c).

  sequence - the unpermuted (original) sequence of objects - `java.util.List`

  returns: permutation of sequence represented by this permutation - `java.util.List<T>`"
  (^java.util.List [^PermutationChromosome this ^java.util.List sequence]
    (-> this (.decode sequence))))

