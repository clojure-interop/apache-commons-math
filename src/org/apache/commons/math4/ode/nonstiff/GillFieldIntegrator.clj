(ns org.apache.commons.math4.ode.nonstiff.GillFieldIntegrator
  "This class implements the Gill fourth order Runge-Kutta
  integrator for Ordinary Differential Equations .

  This method is an explicit Runge-Kutta method, its Butcher-array
  is the following one :


     0  |    0        0       0      0
    1/2 |   1/2       0       0      0
    1/2 | (q-1)/2  (2-q)/2    0      0
     1  |    0       -q/2  (2+q)/2   0
        |-------------------------------
        |   1/6    (2-q)/6 (2+q)/6  1/6
  where q = sqrt(2)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff GillFieldIntegrator]))

(defn ->gill-field-integrator
  "Constructor.

  Simple constructor.
   Build a fourth-order Gill integrator with the given step.

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  step - integration step - `T`"
  (^GillFieldIntegrator [^org.apache.commons.math4.Field field step]
    (new GillFieldIntegrator field step)))

(defn get-c
  "Get the time steps from Butcher array (without the first zero).

  returns: time steps from Butcher array (without the first zero - `T[]`"
  ([^GillFieldIntegrator this]
    (-> this (.getC))))

(defn get-a
  "Get the internal weights from Butcher array (without the first empty row).

  returns: internal weights from Butcher array (without the first empty row) - `T[][]`"
  ([^GillFieldIntegrator this]
    (-> this (.getA))))

(defn get-b
  "Get the external weights for the high order method from Butcher array.

  returns: external weights for the high order method from Butcher array - `T[]`"
  ([^GillFieldIntegrator this]
    (-> this (.getB))))

