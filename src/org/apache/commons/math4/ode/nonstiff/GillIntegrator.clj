(ns org.apache.commons.math4.ode.nonstiff.GillIntegrator
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
  (:import [org.apache.commons.math4.ode.nonstiff GillIntegrator]))

(defn ->gill-integrator
  "Constructor.

  Simple constructor.
   Build a fourth-order Gill integrator with the given step.

  step - integration step - `double`"
  (^GillIntegrator [^Double step]
    (new GillIntegrator step)))

