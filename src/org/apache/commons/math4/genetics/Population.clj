(ns org.apache.commons.math4.genetics.Population
  "A collection of chromosomes that facilitates generational evolution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics Population]))

(defn get-population-size
  "Access the current population size.

  returns: the current population size. - `int`"
  (^Integer [^Population this]
    (-> this (.getPopulationSize))))

(defn get-population-limit
  "Access the maximum population size.

  returns: the maximum population size. - `int`"
  (^Integer [^Population this]
    (-> this (.getPopulationLimit))))

(defn next-generation
  "Start the population for the next generation.

  returns: the beginnings of the next generation. - `org.apache.commons.math4.genetics.Population`"
  (^org.apache.commons.math4.genetics.Population [^Population this]
    (-> this (.nextGeneration))))

(defn add-chromosome
  "Add the given chromosome to the population.

  chromosome - the chromosome to add. - `org.apache.commons.math4.genetics.Chromosome`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if the population would exceed the population limit when adding this chromosome"
  ([^Population this ^org.apache.commons.math4.genetics.Chromosome chromosome]
    (-> this (.addChromosome chromosome))))

(defn get-fittest-chromosome
  "Access the fittest chromosome in this population.

  returns: the fittest chromosome. - `org.apache.commons.math4.genetics.Chromosome`"
  (^org.apache.commons.math4.genetics.Chromosome [^Population this]
    (-> this (.getFittestChromosome))))

