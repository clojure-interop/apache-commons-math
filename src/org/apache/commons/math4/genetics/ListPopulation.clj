(ns org.apache.commons.math4.genetics.ListPopulation
  "Population of chromosomes represented by a List."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics ListPopulation]))

(defn ->list-population
  "Constructor.

  Creates a new ListPopulation instance.

   Note: the chromosomes of the specified list are added to the population.

  chromosomes - list of chromosomes to be added to the population - `java.util.List`
  population-limit - maximal size of the population - `int`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the list of chromosomes is null"
  (^ListPopulation [^java.util.List chromosomes ^Integer population-limit]
    (new ListPopulation chromosomes population-limit))
  (^ListPopulation [^Integer population-limit]
    (new ListPopulation population-limit)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ListPopulation this]
    (-> this (.toString))))

(defn set-population-limit
  "Sets the maximal population size.

  population-limit - maximal population size. - `int`

  throws: org.apache.commons.math4.exception.NotPositiveException - if the population limit is not a positive number (< 1)"
  ([^ListPopulation this ^Integer population-limit]
    (-> this (.setPopulationLimit population-limit))))

(defn iterator
  "Returns an iterator over the unmodifiable list of chromosomes.
   Any call to Iterator.remove() will result in a UnsupportedOperationException.

  returns: chromosome iterator - `java.util.Iterator<org.apache.commons.math4.genetics.Chromosome>`"
  (^java.util.Iterator [^ListPopulation this]
    (-> this (.iterator))))

(defn get-population-limit
  "Access the maximum population size.

  returns: the maximum population size. - `int`"
  (^Integer [^ListPopulation this]
    (-> this (.getPopulationLimit))))

(defn add-chromosome
  "Add the given chromosome to the population.

  chromosome - the chromosome to add. - `org.apache.commons.math4.genetics.Chromosome`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if the population would exceed the populationLimit after adding this chromosome"
  ([^ListPopulation this ^org.apache.commons.math4.genetics.Chromosome chromosome]
    (-> this (.addChromosome chromosome))))

(defn get-chromosomes
  "Returns an unmodifiable list of the chromosomes in this population.

  returns: the unmodifiable list of chromosomes - `java.util.List<org.apache.commons.math4.genetics.Chromosome>`"
  (^java.util.List [^ListPopulation this]
    (-> this (.getChromosomes))))

(defn add-chromosomes
  "Add a Collection of chromosomes to this Population.

  chromosome-coll - a Collection of chromosomes - `java.util.Collection`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if the population would exceed the population limit when adding this chromosome"
  ([^ListPopulation this ^java.util.Collection chromosome-coll]
    (-> this (.addChromosomes chromosome-coll))))

(defn get-population-size
  "Access the current population size.

  returns: the current population size. - `int`"
  (^Integer [^ListPopulation this]
    (-> this (.getPopulationSize))))

(defn get-fittest-chromosome
  "Access the fittest chromosome in this population.

  returns: the fittest chromosome. - `org.apache.commons.math4.genetics.Chromosome`"
  (^org.apache.commons.math4.genetics.Chromosome [^ListPopulation this]
    (-> this (.getFittestChromosome))))

