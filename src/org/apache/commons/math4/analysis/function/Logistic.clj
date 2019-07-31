(ns org.apache.commons.math4.analysis.function.Logistic
  "  Generalised logistic function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Logistic]))

(defn ->logistic
  "Constructor.

  k - If b > 0, value of the function for x going towards ∞. If b < 0, value of the function for x going towards -∞. - `double`
  m - Abscissa of maximum growth. - `double`
  b - Growth rate. - `double`
  q - Parameter that affects the position of the curve along the ordinate axis. - `double`
  a - If b > 0, value of the function for x going towards -∞. If b < 0, value of the function for x going towards ∞. - `double`
  n - Parameter that affects near which asymptote the maximum growth occurs. - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if n <= 0."
  (^Logistic [^Double k ^Double m ^Double b ^Double q ^Double a ^Double n]
    (new Logistic k m b q a n)))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Logistic this ^Double x]
    (-> this (.value x))))

