(ns org.apache.commons.math4.analysis.function.StepFunction
  "  Step function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function StepFunction]))

(defn ->step-function
  "Constructor.

  Builds a step function from a list of arguments and the corresponding
   values. Specifically, returns the function h(x) defined by

   h(x) = y[0] for all x < x[1]
          y[1] for x[1] ≤ x < x[2]
          ...
          y[y.length - 1] for x ≥ x[x.length - 1]
   The value of x[0] is ignored, but it must be strictly less than
   x[1].

  x - Domain values where the function changes value. - `double[]`
  y - Values of the function. - `double[]`

  throws: org.apache.commons.math4.exception.NonMonotonicSequenceException - if the x array is not sorted in strictly increasing order."
  (^StepFunction [x y]
    (new StepFunction x y)))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^StepFunction this ^Double x]
    (-> this (.value x))))

