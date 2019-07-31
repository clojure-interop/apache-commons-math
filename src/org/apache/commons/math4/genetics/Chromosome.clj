(ns org.apache.commons.math4.genetics.Chromosome
  "Individual in a population. Chromosomes are compared based on their fitness.

  The chromosomes are IMMUTABLE, and so their fitness is also immutable and
  therefore it can be cached."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics Chromosome]))

(defn ->chromosome
  "Constructor."
  (^Chromosome []
    (new Chromosome )))

(defn get-fitness
  "Access the fitness of this chromosome. The bigger the fitness, the better the chromosome.

   Computation of fitness is usually very time-consuming task, therefore the fitness is cached.

  returns: the fitness - `double`"
  (^Double [^Chromosome this]
    (-> this (.getFitness))))

(defn compare-to
  "Compares two chromosomes based on their fitness. The bigger the fitness, the better the chromosome.

  another - another chromosome to compare - `org.apache.commons.math4.genetics.Chromosome`

  returns: -1 if another is better than this
     1 if another is worse than this
     0 if the two chromosomes have the same fitness - `int`"
  (^Integer [^Chromosome this ^org.apache.commons.math4.genetics.Chromosome another]
    (-> this (.compareTo another))))

(defn search-for-fitness-update
  "Searches the population for a chromosome representing the same solution, and if it finds one,
   updates the fitness to its value.

  population - Population to search - `org.apache.commons.math4.genetics.Population`"
  ([^Chromosome this ^org.apache.commons.math4.genetics.Population population]
    (-> this (.searchForFitnessUpdate population))))

