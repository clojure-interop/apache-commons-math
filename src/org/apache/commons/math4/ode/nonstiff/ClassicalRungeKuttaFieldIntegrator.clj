(ns org.apache.commons.math4.ode.nonstiff.ClassicalRungeKuttaFieldIntegrator
  "This class implements the classical fourth order Runge-Kutta
  integrator for Ordinary Differential Equations (it is the most
  often used Runge-Kutta method).

  This method is an explicit Runge-Kutta method, its Butcher-array
  is the following one :


     0  |  0    0    0    0
    1/2 | 1/2   0    0    0
    1/2 |  0   1/2   0    0
     1  |  0    0    1    0
        |--------------------
        | 1/6  1/3  1/3  1/6"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff ClassicalRungeKuttaFieldIntegrator]))

(defn ->classical-runge-kutta-field-integrator
  "Constructor.

  Simple constructor.
   Build a fourth-order Runge-Kutta integrator with the given step.

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  step - integration step - `T`"
  (^ClassicalRungeKuttaFieldIntegrator [^org.apache.commons.math4.Field field step]
    (new ClassicalRungeKuttaFieldIntegrator field step)))

(defn get-c
  "Get the time steps from Butcher array (without the first zero).

  returns: time steps from Butcher array (without the first zero - `T[]`"
  ([^ClassicalRungeKuttaFieldIntegrator this]
    (-> this (.getC))))

(defn get-a
  "Get the internal weights from Butcher array (without the first empty row).

  returns: internal weights from Butcher array (without the first empty row) - `T[][]`"
  ([^ClassicalRungeKuttaFieldIntegrator this]
    (-> this (.getA))))

(defn get-b
  "Get the external weights for the high order method from Butcher array.

  returns: external weights for the high order method from Butcher array - `T[]`"
  ([^ClassicalRungeKuttaFieldIntegrator this]
    (-> this (.getB))))

