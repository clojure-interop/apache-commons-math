(ns org.apache.commons.math4.filter.DefaultMeasurementModel
  "Default implementation of a MeasurementModel for the use with a KalmanFilter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.filter DefaultMeasurementModel]))

(defn ->default-measurement-model
  "Constructor.

  Create a new MeasurementModel, taking double arrays as input parameters for the
   respective measurement matrix and noise.

  meas-matrix - the measurement matrix - `double[][]`
  meas-noise - the measurement noise matrix - `double[][]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if any of the input matrices is null"
  (^DefaultMeasurementModel [meas-matrix meas-noise]
    (new DefaultMeasurementModel meas-matrix meas-noise)))

(defn get-measurement-matrix
  "Returns the measurement matrix.

  returns: the measurement matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^DefaultMeasurementModel this]
    (-> this (.getMeasurementMatrix))))

(defn get-measurement-noise
  "Returns the measurement noise matrix. This method is called by the KalmanFilter every
   correction step, so implementations of this interface may return a modified measurement noise
   depending on the current iteration step.

  returns: the measurement noise matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^DefaultMeasurementModel this]
    (-> this (.getMeasurementNoise))))

