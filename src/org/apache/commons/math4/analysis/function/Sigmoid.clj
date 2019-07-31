(ns org.apache.commons.math4.analysis.function.Sigmoid
  "  Sigmoid function.
  It is the inverse of the logit function.
  A more flexible version, the generalised logistic, is implemented
  by the Logistic class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Sigmoid]))

(defn ->sigmoid
  "Constructor.

  Sigmoid function.

  lo - Lower asymptote. - `double`
  hi - Higher asymptote. - `double`"
  (^Sigmoid [^Double lo ^Double hi]
    (new Sigmoid lo hi))
  (^Sigmoid []
    (new Sigmoid )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Sigmoid this ^Double x]
    (-> this (.value x))))

