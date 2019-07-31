(ns org.apache.commons.math4.ode.nonstiff.HighamHall54Integrator
  "This class implements the 5(4) Higham and Hall integrator for
  Ordinary Differential Equations.

  This integrator is an embedded Runge-Kutta integrator
  of order 5(4) used in local extrapolation mode (i.e. the solution
  is computed using the high order formula) with stepsize control
  (and automatic step initialization) and continuous output. This
  method uses 7 functions evaluations per step."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff HighamHall54Integrator]))

(defn ->higham-hall-54-integrator
  "Constructor.

  Simple constructor.
   Build a fifth order Higham and Hall integrator with the given step bounds

  min-step - minimal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  max-step - maximal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  scal-absolute-tolerance - allowed absolute error - `double`
  scal-relative-tolerance - allowed relative error - `double`"
  (^HighamHall54Integrator [^Double min-step ^Double max-step ^Double scal-absolute-tolerance ^Double scal-relative-tolerance]
    (new HighamHall54Integrator min-step max-step scal-absolute-tolerance scal-relative-tolerance)))

(defn get-order
  "Get the order of the method.

  returns: order of the method - `int`"
  (^Integer [^HighamHall54Integrator this]
    (-> this (.getOrder))))

