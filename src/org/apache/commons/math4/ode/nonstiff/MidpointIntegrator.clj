(ns org.apache.commons.math4.ode.nonstiff.MidpointIntegrator
  "This class implements a second order Runge-Kutta integrator for
  Ordinary Differential Equations.

  This method is an explicit Runge-Kutta method, its Butcher-array
  is the following one :


     0  |  0    0
    1/2 | 1/2   0
        |----------
        |  0    1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff MidpointIntegrator]))

(defn ->midpoint-integrator
  "Constructor.

  Simple constructor.
   Build a midpoint integrator with the given step.

  step - integration step - `double`"
  (^MidpointIntegrator [^Double step]
    (new MidpointIntegrator step)))

