(ns org.apache.commons.math4.ode.sampling.FieldStepNormalizer
  "This class wraps an object implementing FieldFixedStepHandler
  into a FieldStepHandler.

  This wrapper allows to use fixed step handlers with general
  integrators which cannot guaranty their integration steps will
  remain constant and therefore only accept general step
  handlers.

  The stepsize used is selected at construction time. The handleStep method of the underlying
  FieldFixedStepHandler object is called at normalized times. The
  normalized times can be influenced by the StepNormalizerMode and
  StepNormalizerBounds.

  There is no constraint on the integrator, it can use any time step
  it needs (time steps longer or shorter than the fixed time step and
  non-integer ratios are all allowed).



  Examples (step size = 0.5)
  Start timeEnd time
   DirectionMode
   BoundsOutput
  0.33.1forwardINCREMENTNEITHER0.8, 1.3, 1.8, 2.3, 2.8
  0.33.1forwardINCREMENTFIRST0.3, 0.8, 1.3, 1.8, 2.3, 2.8
  0.33.1forwardINCREMENTLAST0.8, 1.3, 1.8, 2.3, 2.8, 3.1
  0.33.1forwardINCREMENTBOTH0.3, 0.8, 1.3, 1.8, 2.3, 2.8, 3.1
  0.33.1forwardMULTIPLESNEITHER0.5, 1.0, 1.5, 2.0, 2.5, 3.0
  0.33.1forwardMULTIPLESFIRST0.3, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0
  0.33.1forwardMULTIPLESLAST0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.1
  0.33.1forwardMULTIPLESBOTH0.3, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.1
  0.03.0forwardINCREMENTNEITHER0.5, 1.0, 1.5, 2.0, 2.5, 3.0
  0.03.0forwardINCREMENTFIRST0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0
  0.03.0forwardINCREMENTLAST0.5, 1.0, 1.5, 2.0, 2.5, 3.0
  0.03.0forwardINCREMENTBOTH0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0
  0.03.0forwardMULTIPLESNEITHER0.5, 1.0, 1.5, 2.0, 2.5, 3.0
  0.03.0forwardMULTIPLESFIRST0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0
  0.03.0forwardMULTIPLESLAST0.5, 1.0, 1.5, 2.0, 2.5, 3.0
  0.03.0forwardMULTIPLESBOTH0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0
  3.10.3backwardINCREMENTNEITHER2.6, 2.1, 1.6, 1.1, 0.6
  3.10.3backwardINCREMENTFIRST3.1, 2.6, 2.1, 1.6, 1.1, 0.6
  3.10.3backwardINCREMENTLAST2.6, 2.1, 1.6, 1.1, 0.6, 0.3
  3.10.3backwardINCREMENTBOTH3.1, 2.6, 2.1, 1.6, 1.1, 0.6, 0.3
  3.10.3backwardMULTIPLESNEITHER3.0, 2.5, 2.0, 1.5, 1.0, 0.5
  3.10.3backwardMULTIPLESFIRST3.1, 3.0, 2.5, 2.0, 1.5, 1.0, 0.5
  3.10.3backwardMULTIPLESLAST3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.3
  3.10.3backwardMULTIPLESBOTH3.1, 3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.3
  3.00.0backwardINCREMENTNEITHER2.5, 2.0, 1.5, 1.0, 0.5, 0.0
  3.00.0backwardINCREMENTFIRST3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0
  3.00.0backwardINCREMENTLAST2.5, 2.0, 1.5, 1.0, 0.5, 0.0
  3.00.0backwardINCREMENTBOTH3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0
  3.00.0backwardMULTIPLESNEITHER2.5, 2.0, 1.5, 1.0, 0.5, 0.0
  3.00.0backwardMULTIPLESFIRST3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0
  3.00.0backwardMULTIPLESLAST2.5, 2.0, 1.5, 1.0, 0.5, 0.0
  3.00.0backwardMULTIPLESBOTH3.0, 2.5, 2.0, 1.5, 1.0, 0.5, 0.0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling FieldStepNormalizer]))

(defn ->field-step-normalizer
  "Constructor.

  Simple constructor.

  h - fixed time step (sign is not used) - `double`
  handler - fixed time step handler to wrap - `org.apache.commons.math4.ode.sampling.FieldFixedStepHandler`
  mode - step normalizer mode to use - `org.apache.commons.math4.ode.sampling.StepNormalizerMode`
  bounds - step normalizer bounds setting to use - `org.apache.commons.math4.ode.sampling.StepNormalizerBounds`"
  (^FieldStepNormalizer [^Double h ^org.apache.commons.math4.ode.sampling.FieldFixedStepHandler handler ^org.apache.commons.math4.ode.sampling.StepNormalizerMode mode ^org.apache.commons.math4.ode.sampling.StepNormalizerBounds bounds]
    (new FieldStepNormalizer h handler mode bounds))
  (^FieldStepNormalizer [^Double h ^org.apache.commons.math4.ode.sampling.FieldFixedStepHandler handler ^org.apache.commons.math4.ode.sampling.StepNormalizerMode mode]
    (new FieldStepNormalizer h handler mode))
  (^FieldStepNormalizer [^Double h ^org.apache.commons.math4.ode.sampling.FieldFixedStepHandler handler]
    (new FieldStepNormalizer h handler)))

(defn init
  "Initialize step handler at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the step handler to initialize some internal data
   if needed.

  initial-state - initial time, state vector and derivative - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`
  final-time - target time for the integration - `T`"
  ([^FieldStepNormalizer this ^org.apache.commons.math4.ode.FieldODEStateAndDerivative initial-state final-time]
    (-> this (.init initial-state final-time))))

(defn handle-step
  "Handle the last accepted step

  interpolator - interpolator for the last accepted step. For efficiency purposes, the various integrators reuse the same object on each call, so if the instance wants to keep it across all calls (for example to provide at the end of the integration a continuous model valid throughout the integration range), it should build a local copy using the clone method and store this copy. - `org.apache.commons.math4.ode.sampling.FieldStepInterpolator`
  is-last - true if the step is the last one - `boolean`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the interpolator throws one because the number of functions evaluations is exceeded"
  ([^FieldStepNormalizer this ^org.apache.commons.math4.ode.sampling.FieldStepInterpolator interpolator ^Boolean is-last]
    (-> this (.handleStep interpolator is-last))))

