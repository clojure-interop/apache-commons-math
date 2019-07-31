(ns org.apache.commons.math4.genetics.AbstractListChromosome
  "Chromosome represented by an immutable list of a fixed length."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics AbstractListChromosome]))

(defn ->abstract-list-chromosome
  "Constructor.

  Constructor.

  representation - inner representation of the chromosome - `java.util.List`
  copy-list - if true, the representation will be copied, otherwise it will be referenced. - `boolean`"
  (^AbstractListChromosome [^java.util.List representation ^Boolean copy-list]
    (new AbstractListChromosome representation copy-list))
  (^AbstractListChromosome [^java.util.List representation]
    (new AbstractListChromosome representation)))

(defn get-length
  "Returns the length of the chromosome.

  returns: the length of the chromosome - `int`"
  (^Integer [^AbstractListChromosome this]
    (-> this (.getLength))))

(defn new-fixed-length-chromosome
  "Creates a new instance of the same class as this is, with a given arrayRepresentation.
   This is needed in crossover and mutation operators, where we need a new instance of the same class, but with
   different array representation.

   Usually, this method just calls a constructor of the class.

  chromosome-representation - the inner array representation of the new chromosome. - `java.util.List`

  returns: new instance extended from FixedLengthChromosome with the given arrayRepresentation - `org.apache.commons.math4.genetics.AbstractListChromosome<T>`"
  (^org.apache.commons.math4.genetics.AbstractListChromosome [^AbstractListChromosome this ^java.util.List chromosome-representation]
    (-> this (.newFixedLengthChromosome chromosome-representation))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AbstractListChromosome this]
    (-> this (.toString))))

