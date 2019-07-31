(ns org.apache.commons.math4.ode.sampling.FieldFixedStepHandler
  "This interface represents a handler that should be called after
  each successful fixed step.

  This interface should be implemented by anyone who is interested
  in getting the solution of an ordinary differential equation at
  fixed time steps. Objects implementing this interface should be
  wrapped within an instance of FieldStepNormalizer that itself
  is used as the general FieldStepHandler by the integrator. The
  FieldStepNormalizer object is called according to the integrator
  internal algorithms and it calls objects implementing this
  interface as necessary at fixed time steps."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling FieldFixedStepHandler]))

(defn init
  "Initialize step handler at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the step handler to initialize some internal data
   if needed.

  initial-state - initial time, state vector and derivative - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`
  final-time - target time for the integration - `T`"
  ([^FieldFixedStepHandler this ^org.apache.commons.math4.ode.FieldODEStateAndDerivative initial-state final-time]
    (-> this (.init initial-state final-time))))

(defn handle-step
  "Handle the last accepted step

  state - current value of the independent time variable, state vector and derivative For efficiency purposes, the FieldStepNormalizer class reuses the same array on each call, so if the instance wants to keep it across all calls (for example to provide at the end of the integration a complete array of all steps), it should build a local copy store this copy. - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`
  is-last - true if the step is the last one - `boolean`"
  ([^FieldFixedStepHandler this ^org.apache.commons.math4.ode.FieldODEStateAndDerivative state ^Boolean is-last]
    (-> this (.handleStep state is-last))))

