(ns org.apache.commons.math4.ode.sampling.DummyStepHandler
  "This class is a step handler that does nothing.

  This class is provided as a convenience for users who are only
  interested in the final state of an integration and not in the
  intermediate steps. Its handleStep method does nothing.

  Since this class has no internal state, it is implemented using
  the Singleton design pattern. This means that only one instance is
  ever created, which can be retrieved using the getInstance
  method. This explains why there is no public constructor."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling DummyStepHandler]))

(defn *get-instance
  "Get the only instance.

  returns: the only instance - `org.apache.commons.math4.ode.sampling.DummyStepHandler`"
  (^org.apache.commons.math4.ode.sampling.DummyStepHandler []
    (DummyStepHandler/getInstance )))

(defn init
  "Initialize step handler at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the step handler to initialize some internal data
   if needed.

  t-0 - start value of the independent time variable - `double`
  y-0 - array containing the start value of the state vector - `double[]`
  t - target time for the integration - `double`"
  ([^DummyStepHandler this ^Double t-0 y-0 ^Double t]
    (-> this (.init t-0 y-0 t))))

(defn handle-step
  "Handle the last accepted step.
   This method does nothing in this class.

  interpolator - interpolator for the last accepted step. For efficiency purposes, the various integrators reuse the same object on each call, so if the instance wants to keep it across all calls (for example to provide at the end of the integration a continuous model valid throughout the integration range), it should build a local copy using the clone method and store this copy. - `org.apache.commons.math4.ode.sampling.StepInterpolator`
  is-last - true if the step is the last one - `boolean`"
  ([^DummyStepHandler this ^org.apache.commons.math4.ode.sampling.StepInterpolator interpolator ^Boolean is-last]
    (-> this (.handleStep interpolator is-last))))

