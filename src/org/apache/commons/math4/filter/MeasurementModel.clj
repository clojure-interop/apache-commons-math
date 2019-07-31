(ns org.apache.commons.math4.filter.MeasurementModel
  "Defines the measurement model for the use with a KalmanFilter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.filter MeasurementModel]))

(defn get-measurement-matrix
  "Returns the measurement matrix.

  returns: the measurement matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^MeasurementModel this]
    (-> this (.getMeasurementMatrix))))

(defn get-measurement-noise
  "Returns the measurement noise matrix. This method is called by the KalmanFilter every
   correction step, so implementations of this interface may return a modified measurement noise
   depending on the current iteration step.

  returns: the measurement noise matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^MeasurementModel this]
    (-> this (.getMeasurementNoise))))

