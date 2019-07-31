(ns org.apache.commons.math4.genetics.StoppingCondition
  "Algorithm used to determine when to stop evolution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics StoppingCondition]))

(defn satisfied?
  "Determine whether or not the given population satisfies the stopping condition.

  population - the population to test. - `org.apache.commons.math4.genetics.Population`

  returns: true if this stopping condition is met by the given population,
     false otherwise. - `boolean`"
  (^Boolean [^StoppingCondition this ^org.apache.commons.math4.genetics.Population population]
    (-> this (.isSatisfied population))))

