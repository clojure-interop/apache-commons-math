(ns org.apache.commons.math4.util.IntegerSequence$Incrementor
  "Utility that increments a counter until a maximum is reached, at
  which point, the instance will by default throw a
  MaxCountExceededException.
  However, the user is able to override this behaviour by defining a
  custom callback, in order to e.g.
  select which exception must be thrown."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util IntegerSequence$Incrementor]))

(defn *create
  "Factory method that creates a default instance.
   The initial and maximal values are set to 0.
   For the new instance to be useful, the maximal count must be set
   by calling withMaximalCount.

  returns: an new instance. - `org.apache.commons.math4.util.IntegerSequence$Incrementor`"
  (^org.apache.commons.math4.util.IntegerSequence$Incrementor []
    (IntegerSequence$Incrementor/create )))

(defn with-start
  "Creates a new instance with a given initial value.
   The counter is reset to the initial value.

  start - Initial value of the counter. - `int`

  returns: a new instance. - `org.apache.commons.math4.util.IntegerSequence$Incrementor`"
  (^org.apache.commons.math4.util.IntegerSequence$Incrementor [^IntegerSequence$Incrementor this ^Integer start]
    (-> this (.withStart start))))

(defn get-count
  "Gets the current count.

  returns: the current count. - `int`"
  (^Integer [^IntegerSequence$Incrementor this]
    (-> this (.getCount))))

(defn next
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^IntegerSequence$Incrementor this]
    (-> this (.next))))

(defn with-maximal-count
  "Creates a new instance with a given maximal count.
   The counter is reset to the initial value.

  max - Maximal count. - `int`

  returns: a new instance. - `org.apache.commons.math4.util.IntegerSequence$Incrementor`"
  (^org.apache.commons.math4.util.IntegerSequence$Incrementor [^IntegerSequence$Incrementor this ^Integer max]
    (-> this (.withMaximalCount max))))

(defn with-callback
  "Creates a new instance with a given callback.
   The counter is reset to the initial value.

  cb - Callback to be called at counter exhaustion. - `org.apache.commons.math4.util.IntegerSequence$Incrementor$MaxCountExceededCallback`

  returns: a new instance. - `org.apache.commons.math4.util.IntegerSequence$Incrementor`"
  (^org.apache.commons.math4.util.IntegerSequence$Incrementor [^IntegerSequence$Incrementor this ^org.apache.commons.math4.util.IntegerSequence$Incrementor$MaxCountExceededCallback cb]
    (-> this (.withCallback cb))))

(defn increment
  "Performs multiple increments.

  n-times - Number of increments. - `int`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - at counter exhaustion."
  ([^IntegerSequence$Incrementor this ^Integer n-times]
    (-> this (.increment n-times)))
  ([^IntegerSequence$Incrementor this]
    (-> this (.increment))))

(defn remove
  "Not applicable.

  throws: org.apache.commons.math4.exception.MathUnsupportedOperationException"
  ([^IntegerSequence$Incrementor this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^IntegerSequence$Incrementor this]
    (-> this (.hasNext))))

(defn can-increment?
  "Checks whether incrementing the counter several times is allowed.

  n-times - Number of increments. - `int`

  returns: false if calling increment(nTimes) would call the callback
   true otherwise. - `boolean`"
  (^Boolean [^IntegerSequence$Incrementor this ^Integer n-times]
    (-> this (.canIncrement n-times)))
  (^Boolean [^IntegerSequence$Incrementor this]
    (-> this (.canIncrement))))

(defn with-increment
  "Creates a new instance with a given increment.
   The counter is reset to the initial value.

  step - Increment. - `int`

  returns: a new instance. - `org.apache.commons.math4.util.IntegerSequence$Incrementor`"
  (^org.apache.commons.math4.util.IntegerSequence$Incrementor [^IntegerSequence$Incrementor this ^Integer step]
    (-> this (.withIncrement step))))

(defn get-maximal-count
  "Gets the upper limit of the counter.

  returns: the counter upper limit. - `int`"
  (^Integer [^IntegerSequence$Incrementor this]
    (-> this (.getMaximalCount))))

