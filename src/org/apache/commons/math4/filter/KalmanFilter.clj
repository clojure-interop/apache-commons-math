(ns org.apache.commons.math4.filter.KalmanFilter
  "Implementation of a Kalman filter to estimate the state xk
  of a discrete-time controlled process that is governed by the linear
  stochastic difference equation:



  xk = Axk-1  Buk-1  wk-1

  with a measurement xk that is



  zk = Hxk  vk.


  The random variables wk and vk represent
  the process and measurement noise and are assumed to be independent of each
  other and distributed with normal probability (white noise).

  The Kalman filter cycle involves the following steps:

  predict: project the current state estimate ahead in time
  correct: adjust the projected estimate by an actual measurement


  The Kalman filter is initialized with a ProcessModel and a
  MeasurementModel, which contain the corresponding transformation and
  noise covariance matrices. The parameter names used in the respective models
  correspond to the following names commonly used in the mathematical
  literature:

  A - state transition matrix
  B - control input matrix
  H - measurement matrix
  Q - process noise covariance matrix
  R - measurement noise covariance matrix
  P - error covariance matrix"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.filter KalmanFilter]))

(defn ->kalman-filter
  "Constructor.

  Creates a new Kalman filter with the given process and measurement models.

  process - the model defining the underlying process dynamics - `org.apache.commons.math4.filter.ProcessModel`
  measurement - the model defining the given measurement characteristics - `org.apache.commons.math4.filter.MeasurementModel`

  throws: org.apache.commons.math4.exception.NullArgumentException - if any of the given inputs is null (except for the control matrix)"
  (^KalmanFilter [^org.apache.commons.math4.filter.ProcessModel process ^org.apache.commons.math4.filter.MeasurementModel measurement]
    (new KalmanFilter process measurement)))

(defn get-state-dimension
  "Returns the dimension of the state estimation vector.

  returns: the state dimension - `int`"
  (^Integer [^KalmanFilter this]
    (-> this (.getStateDimension))))

(defn get-measurement-dimension
  "Returns the dimension of the measurement vector.

  returns: the measurement vector dimension - `int`"
  (^Integer [^KalmanFilter this]
    (-> this (.getMeasurementDimension))))

(defn get-state-estimation
  "Returns the current state estimation vector.

  returns: the state estimation vector - `double[]`"
  ([^KalmanFilter this]
    (-> this (.getStateEstimation))))

(defn get-state-estimation-vector
  "Returns a copy of the current state estimation vector.

  returns: the state estimation vector - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^KalmanFilter this]
    (-> this (.getStateEstimationVector))))

(defn get-error-covariance
  "Returns the current error covariance matrix.

  returns: the error covariance matrix - `double[][]`"
  ([^KalmanFilter this]
    (-> this (.getErrorCovariance))))

(defn get-error-covariance-matrix
  "Returns a copy of the current error covariance matrix.

  returns: the error covariance matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^KalmanFilter this]
    (-> this (.getErrorCovarianceMatrix))))

(defn predict
  "Predict the internal state estimation one time step ahead.

  u - the control vector - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimension of the control vector does not fit"
  ([^KalmanFilter this u]
    (-> this (.predict u)))
  ([^KalmanFilter this]
    (-> this (.predict))))

(defn correct
  "Correct the current state estimate with an actual measurement.

  z - the measurement vector - `double[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the measurement vector is null"
  ([^KalmanFilter this z]
    (-> this (.correct z))))

