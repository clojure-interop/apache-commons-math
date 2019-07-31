(ns org.apache.commons.math4.analysis.function.Gaussian
  "  Gaussian function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Gaussian]))

(defn ->gaussian
  "Constructor.

  Gaussian with given normalization factor, mean and standard deviation.

  norm - Normalization factor. - `double`
  mean - Mean. - `double`
  sigma - Standard deviation. - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if sigma <= 0."
  (^Gaussian [^Double norm ^Double mean ^Double sigma]
    (new Gaussian norm mean sigma))
  (^Gaussian [^Double mean ^Double sigma]
    (new Gaussian mean sigma))
  (^Gaussian []
    (new Gaussian )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Gaussian this ^Double x]
    (-> this (.value x))))

