(ns org.apache.commons.math4.ode.nonstiff.AdaptiveStepsizeFieldIntegrator
  "This abstract class holds the common part of all adaptive
  stepsize integrators for Ordinary Differential Equations.

  These algorithms perform integration with stepsize control, which
  means the user does not specify the integration step but rather a
  tolerance on error. The error threshold is computed as


  threshold_i = absTol_i  relTol_i * max (abs (ym), abs (ym+1))
  where absTol_i is the absolute tolerance for component i of the
  state vector and relTol_i is the relative tolerance for the same
  component. The user can also use only two scalar values absTol and
  relTol which will be used for all components.


  Note that only the main part
  of the state vector is used for stepsize control. The secondary parts of the state
  vector are explicitly ignored for stepsize control.


  If the estimated error for ym+1 is such that


  sqrt((sum (errEst_i / threshold_i)^2 ) / n) < 1

  (where n is the main set dimension) then the step is accepted,
  otherwise the step is rejected and a new attempt is made with a new
  stepsize."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff AdaptiveStepsizeFieldIntegrator]))

(defn ->adaptive-stepsize-field-integrator
  "Constructor.

  Build an integrator with the given stepsize bounds.
   The default step handler does nothing.

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  name - name of the method - `java.lang.String`
  min-step - minimal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  max-step - maximal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  scal-absolute-tolerance - allowed absolute error - `double`
  scal-relative-tolerance - allowed relative error - `double`"
  (^AdaptiveStepsizeFieldIntegrator [^org.apache.commons.math4.Field field ^java.lang.String name ^Double min-step ^Double max-step ^Double scal-absolute-tolerance ^Double scal-relative-tolerance]
    (new AdaptiveStepsizeFieldIntegrator field name min-step max-step scal-absolute-tolerance scal-relative-tolerance)))

(defn set-step-size-control
  "Set the adaptive step size control parameters.

   A side effect of this method is to also reset the initial
   step so it will be automatically computed by the integrator
   if setInitialStepSize
   is not called by the user.

  minimal-step - minimal step (must be positive even for backward integration), the last step can be smaller than this - `double`
  maximal-step - maximal step (must be positive even for backward integration) - `double`
  absolute-tolerance - allowed absolute error - `double`
  relative-tolerance - allowed relative error - `double`"
  ([^AdaptiveStepsizeFieldIntegrator this ^Double minimal-step ^Double maximal-step ^Double absolute-tolerance ^Double relative-tolerance]
    (-> this (.setStepSizeControl minimal-step maximal-step absolute-tolerance relative-tolerance))))

(defn set-initial-step-size
  "Set the initial step size.
   This method allows the user to specify an initial positive
   step size instead of letting the integrator guess it by
   itself. If this method is not called before integration is
   started, the initial step size will be estimated by the
   integrator.

  initial-step-size - initial step size to use (must be positive even for backward integration ; providing a negative value or a value outside of the min/max step interval will lead the integrator to ignore the value and compute the initial step size by itself) - `T`"
  ([^AdaptiveStepsizeFieldIntegrator this initial-step-size]
    (-> this (.setInitialStepSize initial-step-size))))

(defn initialize-step
  "Initialize the integration step.

  forward - forward integration indicator - `boolean`
  order - order of the method - `int`
  scale - scaling vector for the state vector (can be shorter than state vector) - `T[]`
  state-0 - state at integration start time - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`
  mapper - mapper for all the equations - `org.apache.commons.math4.ode.FieldEquationsMapper`

  returns: first integration step - `T`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^AdaptiveStepsizeFieldIntegrator this ^Boolean forward ^Integer order scale ^org.apache.commons.math4.ode.FieldODEStateAndDerivative state-0 ^org.apache.commons.math4.ode.FieldEquationsMapper mapper]
    (-> this (.initializeStep forward order scale state-0 mapper))))

(defn get-min-step
  "Get the minimal step.

  returns: minimal step - `T`"
  ([^AdaptiveStepsizeFieldIntegrator this]
    (-> this (.getMinStep))))

(defn get-max-step
  "Get the maximal step.

  returns: maximal step - `T`"
  ([^AdaptiveStepsizeFieldIntegrator this]
    (-> this (.getMaxStep))))

