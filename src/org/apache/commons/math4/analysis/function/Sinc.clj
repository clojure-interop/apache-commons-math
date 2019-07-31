(ns org.apache.commons.math4.analysis.function.Sinc
  "Sinc function,
  defined by


    sinc(x) = 1            if x = 0,
              sin(x) / x   otherwise."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function Sinc]))

(defn ->sinc
  "Constructor.

  Instantiates the sinc function.

  normalized - If true, the function is sin(πx) / πx, otherwise sin(x) / x. - `boolean`"
  (^Sinc [^Boolean normalized]
    (new Sinc normalized))
  (^Sinc []
    (new Sinc )))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^Sinc this ^Double x]
    (-> this (.value x))))

