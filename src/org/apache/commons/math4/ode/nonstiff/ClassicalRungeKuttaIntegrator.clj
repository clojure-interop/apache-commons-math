(ns org.apache.commons.math4.ode.nonstiff.ClassicalRungeKuttaIntegrator
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
  (:import [org.apache.commons.math4.ode.nonstiff ClassicalRungeKuttaIntegrator]))

(defn ->classical-runge-kutta-integrator
  "Constructor.

  Simple constructor.
   Build a fourth-order Runge-Kutta integrator with the given
   step.

  step - integration step - `double`"
  (^ClassicalRungeKuttaIntegrator [^Double step]
    (new ClassicalRungeKuttaIntegrator step)))

