(ns org.apache.commons.math4.util.Incrementor
  "Deprecated.
 Use IntegerSequence.Incrementor instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util Incrementor]))

(defn ->incrementor
  "Constructor.

  Deprecated.

  max - Maximal count. - `int`
  cb - Function to be called when the maximal count has been reached. - `org.apache.commons.math4.util.Incrementor$MaxCountExceededCallback`

  throws: org.apache.commons.math4.exception.NullArgumentException - if cb is null"
  (^Incrementor [^Integer max ^org.apache.commons.math4.util.Incrementor$MaxCountExceededCallback cb]
    (new Incrementor max cb))
  (^Incrementor [^Integer max]
    (new Incrementor max))
  (^Incrementor []
    (new Incrementor )))

(defn set-maximal-count
  "Deprecated.

  max - Upper limit of the counter. - `int`"
  ([^Incrementor this ^Integer max]
    (-> this (.setMaximalCount max))))

(defn get-maximal-count
  "Deprecated.

  returns: the counter upper limit. - `int`"
  (^Integer [^Incrementor this]
    (-> this (.getMaximalCount))))

(defn get-count
  "Deprecated.

  returns: the current count. - `int`"
  (^Integer [^Incrementor this]
    (-> this (.getCount))))

(defn can-increment?
  "Deprecated.

  returns: false if the next call to incrementCount will trigger a MaxCountExceededException,
   true otherwise. - `boolean`"
  (^Boolean [^Incrementor this]
    (-> this (.canIncrement))))

(defn increment-count
  "Deprecated.

  value - Number of increments. - `int`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - at counter exhaustion."
  ([^Incrementor this ^Integer value]
    (-> this (.incrementCount value)))
  ([^Incrementor this]
    (-> this (.incrementCount))))

(defn reset-count
  "Deprecated."
  ([^Incrementor this]
    (-> this (.resetCount))))

