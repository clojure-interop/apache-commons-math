(ns org.apache.commons.math4.genetics.CrossoverPolicy
  "Policy used to create a pair of new chromosomes by performing a crossover
  operation on a source pair of chromosomes."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics CrossoverPolicy]))

(defn crossover
  "Perform a crossover operation on the given chromosomes.

  first - the first chromosome. - `org.apache.commons.math4.genetics.Chromosome`
  second - the second chromosome. - `org.apache.commons.math4.genetics.Chromosome`

  returns: the pair of new chromosomes that resulted from the crossover. - `org.apache.commons.math4.genetics.ChromosomePair`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the given chromosomes are not compatible with this CrossoverPolicy"
  (^org.apache.commons.math4.genetics.ChromosomePair [^CrossoverPolicy this ^org.apache.commons.math4.genetics.Chromosome first ^org.apache.commons.math4.genetics.Chromosome second]
    (-> this (.crossover first second))))

