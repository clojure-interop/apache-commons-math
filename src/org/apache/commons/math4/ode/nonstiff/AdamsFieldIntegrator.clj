(ns org.apache.commons.math4.ode.nonstiff.AdamsFieldIntegrator
  "Base class for Adams-Bashforth and
  Adams-Moulton integrators."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff AdamsFieldIntegrator]))

(defn ->adams-field-integrator
  "Constructor.

  Build an Adams integrator with the given order and step control parameters.

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  name - name of the method - `java.lang.String`
  n-steps - number of steps of the method excluding the one being computed - `int`
  order - order of the method - `int`
  min-step - minimal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  max-step - maximal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  scal-absolute-tolerance - allowed absolute error - `double`
  scal-relative-tolerance - allowed relative error - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if order is 1 or less"
  (^AdamsFieldIntegrator [^org.apache.commons.math4.Field field ^java.lang.String name ^Integer n-steps ^Integer order ^Double min-step ^Double max-step ^Double scal-absolute-tolerance ^Double scal-relative-tolerance]
    (new AdamsFieldIntegrator field name n-steps order min-step max-step scal-absolute-tolerance scal-relative-tolerance)))

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
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^AdamsFieldIntegrator this ^org.apache.commons.math4.ode.FieldExpandableODE equations ^org.apache.commons.math4.ode.FieldODEState initial-state final-time]
    (-> this (.integrate equations initial-state final-time))))

(defn update-high-order-derivatives-phase-1
  "Update the high order scaled derivatives for Adams integrators (phase 1).
   The complete update of high order derivatives has a form similar to:


   rn+1 = (s1(n) - s1(n+1)) P-1 u  P-1 A P rn
   this method computes the P-1 A P rn part.

  high-order - high order scaled derivatives (h2/2 y'', ... hk/k! y(k)) - `org.apache.commons.math4.linear.Array2DRowFieldMatrix`

  returns: updated high order derivatives - `org.apache.commons.math4.linear.Array2DRowFieldMatrix<T>`"
  (^org.apache.commons.math4.linear.Array2DRowFieldMatrix [^AdamsFieldIntegrator this ^org.apache.commons.math4.linear.Array2DRowFieldMatrix high-order]
    (-> this (.updateHighOrderDerivativesPhase1 high-order))))

(defn update-high-order-derivatives-phase-2
  "Update the high order scaled derivatives Adams integrators (phase 2).
   The complete update of high order derivatives has a form similar to:


   rn+1 = (s1(n) - s1(n+1)) P-1 u  P-1 A P rn
   this method computes the (s1(n) - s1(n+1)) P-1 u part.
   Phase 1 of the update must already have been performed.

  start - first order scaled derivatives at step start - `T[]`
  end - first order scaled derivatives at step end - `T[]`
  high-order - high order scaled derivatives, will be modified (h2/2 y'', ... hk/k! y(k)) - `org.apache.commons.math4.linear.Array2DRowFieldMatrix`"
  ([^AdamsFieldIntegrator this start end ^org.apache.commons.math4.linear.Array2DRowFieldMatrix high-order]
    (-> this (.updateHighOrderDerivativesPhase2 start end high-order))))

