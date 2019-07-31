(ns org.apache.commons.math4.genetics.SelectionPolicy
  "Algorithm used to select a chromosome pair from a population."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics SelectionPolicy]))

(defn select
  "Select two chromosomes from the population.

  population - the population from which the chromosomes are choosen. - `org.apache.commons.math4.genetics.Population`

  returns: the selected chromosomes. - `org.apache.commons.math4.genetics.ChromosomePair`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the population is not compatible with this SelectionPolicy"
  (^org.apache.commons.math4.genetics.ChromosomePair [^SelectionPolicy this ^org.apache.commons.math4.genetics.Population population]
    (-> this (.select population))))

