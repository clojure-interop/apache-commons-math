(ns org.apache.commons.math4.genetics.ElitisticListPopulation
  "Population of chromosomes which uses elitism (certain percentage of the best
  chromosomes is directly copied to the next generation)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics ElitisticListPopulation]))

(defn ->elitistic-list-population
  "Constructor.

  Creates a new ElitisticListPopulation instance.

  chromosomes - list of chromosomes in the population - `java.util.List`
  population-limit - maximal size of the population - `int`
  elitism-rate - how many best chromosomes will be directly transferred to the next generation [in %] - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the list of chromosomes is null"
  (^ElitisticListPopulation [^java.util.List chromosomes ^Integer population-limit ^Double elitism-rate]
    (new ElitisticListPopulation chromosomes population-limit elitism-rate))
  (^ElitisticListPopulation [^Integer population-limit ^Double elitism-rate]
    (new ElitisticListPopulation population-limit elitism-rate)))

(defn next-generation
  "Start the population for the next generation. The elitismRate
   percents of the best chromosomes are directly copied to the next generation.

  returns: the beginnings of the next generation. - `org.apache.commons.math4.genetics.Population`"
  (^org.apache.commons.math4.genetics.Population [^ElitisticListPopulation this]
    (-> this (.nextGeneration))))

(defn set-elitism-rate
  "Sets the elitism rate, i.e. how many best chromosomes will be directly transferred to the next generation [in %].

  elitism-rate - how many best chromosomes will be directly transferred to the next generation [in %] - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the elitism rate is outside the [0, 1] range"
  ([^ElitisticListPopulation this ^Double elitism-rate]
    (-> this (.setElitismRate elitism-rate))))

(defn get-elitism-rate
  "Access the elitism rate.

  returns: the elitism rate - `double`"
  (^Double [^ElitisticListPopulation this]
    (-> this (.getElitismRate))))

