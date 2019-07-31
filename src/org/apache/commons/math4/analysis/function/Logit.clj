(ns org.apache.commons.math4.analysis.function.Logit
  "  Logit function.
  It is the inverse of the sigmoid function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Logit]))

(defn ->logit
  "Constructor.

  Logit function.

  lo - Lower bound of the function domain. - `double`
  hi - Higher bound of the function domain. - `double`"
  (^Logit [^Double lo ^Double hi]
    (new Logit lo hi))
  (^Logit []
    (new Logit )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException"
  (^Double [^Logit this ^Double x]
    (-> this (.value x))))

