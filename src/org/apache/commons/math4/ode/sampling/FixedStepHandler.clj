(ns org.apache.commons.math4.ode.sampling.FixedStepHandler
  "This interface represents a handler that should be called after
  each successful fixed step.

  This interface should be implemented by anyone who is interested
  in getting the solution of an ordinary differential equation at
  fixed time steps. Objects implementing this interface should be
  wrapped within an instance of StepNormalizer that itself
  is used as the general StepHandler by the integrator. The
  StepNormalizer object is called according to the integrator
  internal algorithms and it calls objects implementing this
  interface as necessary at fixed time steps."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling FixedStepHandler]))

(defn init
  "Initialize step handler at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the step handler to initialize some internal data
   if needed.

  t-0 - start value of the independent time variable - `double`
  y-0 - array containing the start value of the state vector - `double[]`
  t - target time for the integration - `double`"
  ([^FixedStepHandler this ^Double t-0 y-0 ^Double t]
    (-> this (.init t-0 y-0 t))))

(defn handle-step
  "Handle the last accepted step

  t - time of the current step - `double`
  y - state vector at t. For efficiency purposes, the StepNormalizer class reuses the same array on each call, so if the instance wants to keep it across all calls (for example to provide at the end of the integration a complete array of all steps), it should build a local copy store this copy. - `double[]`
  y-dot - derivatives of the state vector state vector at t. For efficiency purposes, the StepNormalizer class reuses the same array on each call, so if the instance wants to keep it across all calls (for example to provide at the end of the integration a complete array of all steps), it should build a local copy store this copy. - `double[]`
  is-last - true if the step is the last one - `boolean`"
  ([^FixedStepHandler this ^Double t y y-dot ^Boolean is-last]
    (-> this (.handleStep t y y-dot is-last))))

