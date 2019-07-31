(ns org.apache.commons.math4.ode.nonstiff.EulerFieldIntegrator
  "This class implements a simple Euler integrator for Ordinary
  Differential Equations.

  The Euler algorithm is the simplest one that can be used to
  integrate ordinary differential equations. It is a simple inversion
  of the forward difference expression :
  f'=(f(t+h)-f(t))/h which leads to
  f(t+h)=f(t)+hf'. The interpolation scheme used for
  dense output is the linear scheme already used for integration.

  This algorithm looks cheap because it needs only one function
  evaluation per step. However, as it uses linear estimates, it needs
  very small steps to achieve high accuracy, and small steps lead to
  numerical errors and instabilities.

  This algorithm is almost never used and has been included in
  this package only as a comparison reference for more useful
  integrators."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff EulerFieldIntegrator]))

(defn ->euler-field-integrator
  "Constructor.

  Simple constructor.
   Build an Euler integrator with the given step.

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  step - integration step - `T`"
  (^EulerFieldIntegrator [^org.apache.commons.math4.Field field step]
    (new EulerFieldIntegrator field step)))

(defn get-c
  "Get the time steps from Butcher array (without the first zero).

  returns: time steps from Butcher array (without the first zero - `T[]`"
  ([^EulerFieldIntegrator this]
    (-> this (.getC))))

(defn get-a
  "Get the internal weights from Butcher array (without the first empty row).

  returns: internal weights from Butcher array (without the first empty row) - `T[][]`"
  ([^EulerFieldIntegrator this]
    (-> this (.getA))))

(defn get-b
  "Get the external weights for the high order method from Butcher array.

  returns: external weights for the high order method from Butcher array - `T[]`"
  ([^EulerFieldIntegrator this]
    (-> this (.getB))))

