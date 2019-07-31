(ns org.apache.commons.math4.ml.neuralnet.Neuron
  "Describes a neuron element of a neural network.

  This class aims to be thread-safe."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet Neuron]))

(defn copy
  "Performs a deep copy of this instance.
   Upon return, the copied and original instances will be independent:
   Updating one will not affect the other.

  returns: a new instance with the same state as this instance. - `org.apache.commons.math4.ml.neuralnet.Neuron`"
  (^org.apache.commons.math4.ml.neuralnet.Neuron [^Neuron this]
    (-> this (.copy))))

(defn get-identifier
  "Gets the neuron's identifier.

  returns: the identifier. - `long`"
  (^Long [^Neuron this]
    (-> this (.getIdentifier))))

(defn get-size
  "Gets the length of the feature set.

  returns: the number of features. - `int`"
  (^Integer [^Neuron this]
    (-> this (.getSize))))

(defn get-features
  "Gets the neuron's features.

  returns: a copy of the neuron's features. - `double[]`"
  ([^Neuron this]
    (-> this (.getFeatures))))

(defn compare-and-set-features
  "Tries to atomically update the neuron's features.
   Update will be performed only if the expected values match the
   current values.
   In effect, when concurrent threads call this method, the state
   could be modified by one, so that it does not correspond to the
   the state assumed by another.
   Typically, a caller retrieves the current state,
   and uses it to compute the new state.
   During this computation, another thread might have done the same
   thing, and updated the state: If the current thread were to proceed
   with its own update, it would overwrite the new state (which might
   already have been used by yet other threads).
   To prevent this, the method does not perform the update when a
   concurrent modification has been detected, and returns false.
   When this happens, the caller should fetch the new current state,
   redo its computation, and call this method again.

  expect - Current values of the features, as assumed by the caller. Update will never succeed if the contents of this array does not match the values returned by getFeatures(). - `double[]`
  update - Features's new values. - `double[]`

  returns: true if the update was successful, false
   otherwise. - `boolean`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the length of update is not the same as specified in the constructor."
  (^Boolean [^Neuron this expect update]
    (-> this (.compareAndSetFeatures expect update))))

(defn get-number-of-attempted-updates
  "Retrieves the number of calls to the
   compareAndSetFeatures
   method.
   Note that if the caller wants to use this method in combination with
   getNumberOfSuccessfulUpdates(), additional synchronization
   may be required to ensure consistency.

  returns: the number of update attempts. - `long`"
  (^Long [^Neuron this]
    (-> this (.getNumberOfAttemptedUpdates))))

(defn get-number-of-successful-updates
  "Retrieves the number of successful calls to the
   compareAndSetFeatures
   method.
   Note that if the caller wants to use this method in combination with
   getNumberOfAttemptedUpdates(), additional synchronization
   may be required to ensure consistency.

  returns: the number of successful updates. - `long`"
  (^Long [^Neuron this]
    (-> this (.getNumberOfSuccessfulUpdates))))

