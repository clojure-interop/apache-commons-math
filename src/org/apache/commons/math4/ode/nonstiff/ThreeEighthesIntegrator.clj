(ns org.apache.commons.math4.ode.nonstiff.ThreeEighthesIntegrator
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
  (:import [org.apache.commons.math4.ode.nonstiff ThreeEighthesIntegrator]))

(defn ->three-eighthes-integrator
  "Constructor.

  Simple constructor.
   Build a 3/8 integrator with the given step.

  step - integration step - `double`"
  (^ThreeEighthesIntegrator [^Double step]
    (new ThreeEighthesIntegrator step)))

