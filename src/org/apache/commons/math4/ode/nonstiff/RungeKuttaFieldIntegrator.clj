(ns org.apache.commons.math4.ode.nonstiff.RungeKuttaFieldIntegrator
  "This class implements the common part of all fixed step Runge-Kutta
  integrators for Ordinary Differential Equations.

  These methods are explicit Runge-Kutta methods, their Butcher
  arrays are as follows :


     0  |
    c2  | a21
    c3  | a31  a32
    ... |        ...
    cs  | as1  as2  ...  ass-1
        |--------------------------
        |  b1   b2  ...   bs-1  bs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff RungeKuttaFieldIntegrator]))

(defn integrate
  "Integrate the differential equations up to the given time.
   This method solves an Initial Value Problem (IVP).
   Since this method stores some internal state variables made
   available in its public interface during integration (FirstOrderFieldIntegrator.getCurrentSignedStepsize()), it is not thread-safe.

  equations - differential equations to integrate - `org.apache.commons.math4.ode.FieldExpandableODE`
  initial-state - initial state (time, primary and secondary state vectors) - `org.apache.commons.math4.ode.FieldODEState`
  final-time - target time for the integration (can be set to a value smaller than t0 for backward integration) - `T`

  returns: final state, its time will be the same as finalTime if
   integration reached its target, but may be different if some FieldEventHandler stops it at some point. - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if integration step is too small"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^RungeKuttaFieldIntegrator this ^org.apache.commons.math4.ode.FieldExpandableODE equations ^org.apache.commons.math4.ode.FieldODEState initial-state final-time]
    (-> this (.integrate equations initial-state final-time))))

(defn single-step
  "Fast computation of a single step of ODE integration.
   This method is intended for the limited use case of
   very fast computation of only one step without using any of the
   rich features of general integrators that may take some time
   to set up (i.e. no step handlers, no events handlers, no additional
   states, no interpolators, no error control, no evaluations count,
   no sanity checks ...). It handles the strict minimum of computation,
   so it can be embedded in outer loops.

   This method is not used at all by the integrate(FieldExpandableODE,
   FieldODEState, RealFieldElement) method. It also completely ignores the step set at
   construction time, and uses only a single step to go from t0 to t.


   As this method does not use any of the state-dependent features of the integrator,
   it should be reasonably thread-safe if and only if the provided differential
   equations are themselves thread-safe.

  equations - differential equations to integrate - `org.apache.commons.math4.ode.FirstOrderFieldDifferentialEquations`
  t-0 - initial time - `T`
  y-0 - initial value of the state vector at t0 - `T[]`
  t - target time for the integration (can be set to a value smaller than t0 for backward integration) - `T`

  returns: state vector at t - `T[]`"
  ([^RungeKuttaFieldIntegrator this ^org.apache.commons.math4.ode.FirstOrderFieldDifferentialEquations equations t-0 y-0 t]
    (-> this (.singleStep equations t-0 y-0 t))))

