(ns org.apache.commons.math4.genetics.TournamentSelection
  "Tournament selection scheme. Each of the two selected chromosomes is selected
  based on n-ary tournament -- this is done by drawing arity random
  chromosomes without replacement from the population, and then selecting the
  fittest chromosome among them."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics TournamentSelection]))

(defn ->tournament-selection
  "Constructor.

  Creates a new TournamentSelection instance.

  arity - how many chromosomes will be drawn to the tournament - `int`"
  (^TournamentSelection [^Integer arity]
    (new TournamentSelection arity)))

(defn select
  "Select two chromosomes from the population. Each of the two selected
   chromosomes is selected based on n-ary tournament -- this is done by
   drawing arity random chromosomes without replacement from the
   population, and then selecting the fittest chromosome among them.

  population - the population from which the chromosomes are chosen. - `org.apache.commons.math4.genetics.Population`

  returns: the selected chromosomes. - `org.apache.commons.math4.genetics.ChromosomePair`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the tournament arity is bigger than the population size"
  (^org.apache.commons.math4.genetics.ChromosomePair [^TournamentSelection this ^org.apache.commons.math4.genetics.Population population]
    (-> this (.select population))))

(defn get-arity
  "Gets the arity (number of chromosomes drawn to the tournament).

  returns: arity of the tournament - `int`"
  (^Integer [^TournamentSelection this]
    (-> this (.getArity))))

(defn set-arity
  "Sets the arity (number of chromosomes drawn to the tournament).

  arity - arity of the tournament - `int`"
  ([^TournamentSelection this ^Integer arity]
    (-> this (.setArity arity))))

