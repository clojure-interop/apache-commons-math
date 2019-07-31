(ns org.apache.commons.math4.ode.sampling.FieldStepHandler
  "This interface represents a handler that should be called after
  each successful step.

  The ODE integrators compute the evolution of the state vector at
  some grid points that depend on their own internal algorithm. Once
  they have found a new grid point (possibly after having computed
  several evaluation of the derivative at intermediate points), they
  provide it to objects implementing this interface. These objects
  typically either ignore the intermediate steps and wait for the
  last one, store the points in an ephemeris, or forward them to
  specialized processing or output methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling FieldStepHandler]))

(defn init
  "Initialize step handler at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the step handler to initialize some internal data
   if needed.

  initial-state - initial time, state vector and derivative - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`
  final-time - target time for the integration - `T`"
  ([^FieldStepHandler this ^org.apache.commons.math4.ode.FieldODEStateAndDerivative initial-state final-time]
    (-> this (.init initial-state final-time))))

(defn handle-step
  "Handle the last accepted step

  interpolator - interpolator for the last accepted step. For efficiency purposes, the various integrators reuse the same object on each call, so if the instance wants to keep it across all calls (for example to provide at the end of the integration a continuous model valid throughout the integration range, as the ContinuousOutputModel class does), it should build a local copy using the clone method of the interpolator and store this copy. Keeping only a reference to the interpolator and reusing it will result in unpredictable behavior (potentially crashing the application). - `org.apache.commons.math4.ode.sampling.FieldStepInterpolator`
  is-last - true if the step is the last one - `boolean`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the interpolator throws one because the number of functions evaluations is exceeded"
  ([^FieldStepHandler this ^org.apache.commons.math4.ode.sampling.FieldStepInterpolator interpolator ^Boolean is-last]
    (-> this (.handleStep interpolator is-last))))

