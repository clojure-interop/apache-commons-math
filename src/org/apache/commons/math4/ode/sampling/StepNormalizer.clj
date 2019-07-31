(ns org.apache.commons.math4.ode.sampling.StepNormalizer
  "This class wraps an object implementing FixedStepHandler
  into a StepHandler.

  This wrapper allows to use fixed step handlers with general
  integrators which cannot guaranty their integration steps will
  remain constant and therefore only accept general step
  handlers.

  The stepsize used is selected at construction time. The handleStep method of the underlying
  FixedStepHandler object is called at normalized times. The
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
  (:import [org.apache.commons.math4.ode.sampling StepNormalizer]))

(defn ->step-normalizer
  "Constructor.

  Simple constructor.

  h - fixed time step (sign is not used) - `double`
  handler - fixed time step handler to wrap - `org.apache.commons.math4.ode.sampling.FixedStepHandler`
  mode - step normalizer mode to use - `org.apache.commons.math4.ode.sampling.StepNormalizerMode`
  bounds - step normalizer bounds setting to use - `org.apache.commons.math4.ode.sampling.StepNormalizerBounds`"
  (^StepNormalizer [^Double h ^org.apache.commons.math4.ode.sampling.FixedStepHandler handler ^org.apache.commons.math4.ode.sampling.StepNormalizerMode mode ^org.apache.commons.math4.ode.sampling.StepNormalizerBounds bounds]
    (new StepNormalizer h handler mode bounds))
  (^StepNormalizer [^Double h ^org.apache.commons.math4.ode.sampling.FixedStepHandler handler ^org.apache.commons.math4.ode.sampling.StepNormalizerMode mode]
    (new StepNormalizer h handler mode))
  (^StepNormalizer [^Double h ^org.apache.commons.math4.ode.sampling.FixedStepHandler handler]
    (new StepNormalizer h handler)))

(defn init
  "Initialize step handler at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the step handler to initialize some internal data
   if needed.

  t-0 - start value of the independent time variable - `double`
  y-0 - array containing the start value of the state vector - `double[]`
  t - target time for the integration - `double`"
  ([^StepNormalizer this ^Double t-0 y-0 ^Double t]
    (-> this (.init t-0 y-0 t))))

(defn handle-step
  "Handle the last accepted step

  interpolator - interpolator for the last accepted step. For efficiency purposes, the various integrators reuse the same object on each call, so if the instance wants to keep it across all calls (for example to provide at the end of the integration a continuous model valid throughout the integration range), it should build a local copy using the clone method and store this copy. - `org.apache.commons.math4.ode.sampling.StepInterpolator`
  is-last - true if the step is the last one - `boolean`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the interpolator throws one because the number of functions evaluations is exceeded"
  ([^StepNormalizer this ^org.apache.commons.math4.ode.sampling.StepInterpolator interpolator ^Boolean is-last]
    (-> this (.handleStep interpolator is-last))))

