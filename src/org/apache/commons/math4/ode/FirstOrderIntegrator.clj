(ns org.apache.commons.math4.ode.FirstOrderIntegrator
  "This interface represents a first order integrator for
  differential equations.

  The classes which are devoted to solve first order differential
  equations should implement this interface. The problems which can
  be handled should implement the FirstOrderDifferentialEquations interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode FirstOrderIntegrator]))

(defn integrate
  "Integrate the differential equations up to the given time.
   This method solves an Initial Value Problem (IVP).
   Since this method stores some internal state variables made
   available in its public interface during integration (ODEIntegrator.getCurrentSignedStepsize()), it is not thread-safe.

  equations - differential equations to integrate - `org.apache.commons.math4.ode.FirstOrderDifferentialEquations`
  t-0 - initial time - `double`
  y-0 - initial value of the state vector at t0 - `double[]`
  t - target time for the integration (can be set to a value smaller than t0 for backward integration) - `double`
  y - placeholder where to put the state vector at each successful step (and hence at the end of integration), can be the same object as y0 - `double[]`

  returns: stop time, will be the same as target time if integration reached its
   target, but may be different if some EventHandler stops it at some point. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if arrays dimension do not match equations settings"
  (^Double [^FirstOrderIntegrator this ^org.apache.commons.math4.ode.FirstOrderDifferentialEquations equations ^Double t-0 y-0 ^Double t y]
    (-> this (.integrate equations t-0 y-0 t y))))

