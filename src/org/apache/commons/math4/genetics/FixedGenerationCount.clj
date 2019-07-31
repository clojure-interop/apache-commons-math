(ns org.apache.commons.math4.genetics.FixedGenerationCount
  "Stops after a fixed number of generations.

  Each time isSatisfied(Population) is invoked, a generation counter
  is incremented. Once the counter reaches the configured
  maxGenerations value, isSatisfied(Population) returns true."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics FixedGenerationCount]))

(defn ->fixed-generation-count
  "Constructor.

  Create a new FixedGenerationCount instance.

  max-generations - number of generations to evolve - `int`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if the number of generations is < 1"
  (^FixedGenerationCount [^Integer max-generations]
    (new FixedGenerationCount max-generations)))

(defn satisfied?
  "Determine whether or not the given number of generations have passed. Increments the number of generations
   counter if the maximum has not been reached.

  population - ignored (no impact on result) - `org.apache.commons.math4.genetics.Population`

  returns: true IFF the maximum number of generations has been exceeded - `boolean`"
  (^Boolean [^FixedGenerationCount this ^org.apache.commons.math4.genetics.Population population]
    (-> this (.isSatisfied population))))

(defn get-num-generations
  "Returns the number of generations that have already passed.

  returns: the number of generations that have passed - `int`"
  (^Integer [^FixedGenerationCount this]
    (-> this (.getNumGenerations))))

