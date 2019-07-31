(ns org.apache.commons.math4.genetics.Fitness
  "Fitness of a chromosome."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics Fitness]))

(defn fitness
  "Compute the fitness. This is usually very time-consuming, so the value should be cached.

  returns: fitness - `double`"
  (^Double [^Fitness this]
    (-> this (.fitness))))

