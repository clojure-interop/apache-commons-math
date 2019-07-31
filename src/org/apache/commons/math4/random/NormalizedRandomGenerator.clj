(ns org.apache.commons.math4.random.NormalizedRandomGenerator
  "This interface represent a normalized random generator for
  scalars.
  Normalized generator provide null mean and unit standard deviation scalars."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random NormalizedRandomGenerator]))

(defn next-normalized-double
  "Generate a random scalar with null mean and unit standard deviation.
   This method does not specify the shape of the
   distribution, it is the implementing class that provides it. The
   only contract here is to generate numbers with null mean and unit
   standard deviation.

  returns: a random scalar with null mean and unit standard deviation - `double`"
  (^Double [^NormalizedRandomGenerator this]
    (-> this (.nextNormalizedDouble))))

