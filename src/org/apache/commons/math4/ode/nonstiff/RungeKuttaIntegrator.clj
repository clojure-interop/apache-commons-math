(ns org.apache.commons.math4.ode.nonstiff.RungeKuttaIntegrator
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
  (:import [org.apache.commons.math4.ode.nonstiff RungeKuttaIntegrator]))

(defn integrate
  "Integrate a set of differential equations up to the given time.
   This method solves an Initial Value Problem (IVP).
   The set of differential equations is composed of a main set, which
   can be extended by some sets of secondary equations. The set of
   equations must be already set up with initial time and partial states.
   At integration completion, the final time and partial states will be
   available in the same object.
   Since this method stores some internal state variables made
   available in its public interface during integration (AbstractIntegrator.getCurrentSignedStepsize()), it is not thread-safe.

  equations - complete set of differential equations to integrate - `org.apache.commons.math4.ode.ExpandableStatefulODE`
  t - target time for the integration (can be set to a value smaller than t0 for backward integration) - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if integration step is too small"
  ([^RungeKuttaIntegrator this ^org.apache.commons.math4.ode.ExpandableStatefulODE equations ^Double t]
    (-> this (.integrate equations t))))

(defn single-step
  "Fast computation of a single step of ODE integration.
   This method is intended for the limited use case of
   very fast computation of only one step without using any of the
   rich features of general integrators that may take some time
   to set up (i.e. no step handlers, no events handlers, no additional
   states, no interpolators, no error control, no evaluations count,
   no sanity checks ...). It handles the strict minimum of computation,
   so it can be embedded in outer loops.

   This method is not used at all by the integrate(ExpandableStatefulODE, double)
   method. It also completely ignores the step set at construction time, and
   uses only a single step to go from t0 to t.


   As this method does not use any of the state-dependent features of the integrator,
   it should be reasonably thread-safe if and only if the provided differential
   equations are themselves thread-safe.

  equations - differential equations to integrate - `org.apache.commons.math4.ode.FirstOrderDifferentialEquations`
  t-0 - initial time - `double`
  y-0 - initial value of the state vector at t0 - `double[]`
  t - target time for the integration (can be set to a value smaller than t0 for backward integration) - `double`

  returns: state vector at t - `double[]`"
  ([^RungeKuttaIntegrator this ^org.apache.commons.math4.ode.FirstOrderDifferentialEquations equations ^Double t-0 y-0 ^Double t]
    (-> this (.singleStep equations t-0 y-0 t))))

