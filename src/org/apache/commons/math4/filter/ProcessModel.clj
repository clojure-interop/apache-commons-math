(ns org.apache.commons.math4.filter.ProcessModel
  "Defines the process dynamics model for the use with a KalmanFilter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.filter ProcessModel]))

(defn get-state-transition-matrix
  "Returns the state transition matrix.

  returns: the state transition matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^ProcessModel this]
    (-> this (.getStateTransitionMatrix))))

(defn get-control-matrix
  "Returns the control matrix.

  returns: the control matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^ProcessModel this]
    (-> this (.getControlMatrix))))

(defn get-process-noise
  "Returns the process noise matrix. This method is called by the KalmanFilter every
   prediction step, so implementations of this interface may return a modified process noise
   depending on the current iteration step.

  returns: the process noise matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^ProcessModel this]
    (-> this (.getProcessNoise))))

(defn get-initial-state-estimate
  "Returns the initial state estimation vector.

   Note: if the return value is zero, the Kalman filter will initialize the
   state estimation with a zero vector.

  returns: the initial state estimation vector - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^ProcessModel this]
    (-> this (.getInitialStateEstimate))))

(defn get-initial-error-covariance
  "Returns the initial error covariance matrix.

   Note: if the return value is zero, the Kalman filter will initialize the
   error covariance with the process noise matrix.

  returns: the initial error covariance matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^ProcessModel this]
    (-> this (.getInitialErrorCovariance))))

