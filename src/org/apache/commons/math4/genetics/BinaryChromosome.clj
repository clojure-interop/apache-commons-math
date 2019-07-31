(ns org.apache.commons.math4.genetics.BinaryChromosome
  "Chromosome represented by a vector of 0s and 1s."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics BinaryChromosome]))

(defn ->binary-chromosome
  "Constructor.

  Constructor.

  representation - list of {0,1} values representing the chromosome - `java.util.List`

  throws: org.apache.commons.math4.genetics.InvalidRepresentationException - iff the representation can not represent a valid chromosome"
  (^BinaryChromosome [^java.util.List representation]
    (new BinaryChromosome representation)))

(defn *random-binary-representation
  "Returns a representation of a random binary array of length length.

  length - length of the array - `int`

  returns: a random binary array of length length - `java.util.List<java.lang.Integer>`"
  (^java.util.List [^Integer length]
    (BinaryChromosome/randomBinaryRepresentation length)))

