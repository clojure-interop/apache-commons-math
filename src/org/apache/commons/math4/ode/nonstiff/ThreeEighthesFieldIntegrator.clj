(ns org.apache.commons.math4.ode.nonstiff.ThreeEighthesFieldIntegrator
  "This class implements the 3/8 fourth order Runge-Kutta
  integrator for Ordinary Differential Equations.

  This method is an explicit Runge-Kutta method, its Butcher-array
  is the following one :


     0  |  0    0    0    0
    1/3 | 1/3   0    0    0
    2/3 |-1/3   1    0    0
     1  |  1   -1    1    0
        |--------------------
        | 1/8  3/8  3/8  1/8"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff ThreeEighthesFieldIntegrator]))

(defn ->three-eighthes-field-integrator
  "Constructor.

  Simple constructor.
   Build a 3/8 integrator with the given step.

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  step - integration step - `T`"
  (^ThreeEighthesFieldIntegrator [^org.apache.commons.math4.Field field step]
    (new ThreeEighthesFieldIntegrator field step)))

(defn get-c
  "Get the time steps from Butcher array (without the first zero).

  returns: time steps from Butcher array (without the first zero - `T[]`"
  ([^ThreeEighthesFieldIntegrator this]
    (-> this (.getC))))

(defn get-a
  "Get the internal weights from Butcher array (without the first empty row).

  returns: internal weights from Butcher array (without the first empty row) - `T[][]`"
  ([^ThreeEighthesFieldIntegrator this]
    (-> this (.getA))))

(defn get-b
  "Get the external weights for the high order method from Butcher array.

  returns: external weights for the high order method from Butcher array - `T[]`"
  ([^ThreeEighthesFieldIntegrator this]
    (-> this (.getB))))

