(ns org.apache.commons.math4.ode.nonstiff.MidpointFieldIntegrator
  "This class implements a second order Runge-Kutta integrator for
  Ordinary Differential Equations.

  This method is an explicit Runge-Kutta method, its Butcher-array
  is the following one :


     0  |  0    0
    1/2 | 1/2   0
        |----------
        |  0    1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff MidpointFieldIntegrator]))

(defn ->midpoint-field-integrator
  "Constructor.

  Simple constructor.
   Build a midpoint integrator with the given step.

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  step - integration step - `T`"
  (^MidpointFieldIntegrator [^org.apache.commons.math4.Field field step]
    (new MidpointFieldIntegrator field step)))

(defn get-c
  "Get the time steps from Butcher array (without the first zero).

  returns: time steps from Butcher array (without the first zero - `T[]`"
  ([^MidpointFieldIntegrator this]
    (-> this (.getC))))

(defn get-a
  "Get the internal weights from Butcher array (without the first empty row).

  returns: internal weights from Butcher array (without the first empty row) - `T[][]`"
  ([^MidpointFieldIntegrator this]
    (-> this (.getA))))

(defn get-b
  "Get the external weights for the high order method from Butcher array.

  returns: external weights for the high order method from Butcher array - `T[]`"
  ([^MidpointFieldIntegrator this]
    (-> this (.getB))))

