(ns org.apache.commons.math4.ode.nonstiff.AdaptiveStepsizeIntegrator
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


  If the Ordinary Differential Equations is an extended ODE rather than a basic ODE, then
  only the primary part
  of the state vector is used for stepsize control, not the complete state vector.


  If the estimated error for ym+1 is such that


  sqrt((sum (errEst_i / threshold_i)^2 ) / n) < 1

  (where n is the main set dimension) then the step is accepted,
  otherwise the step is rejected and a new attempt is made with a new
  stepsize."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff AdaptiveStepsizeIntegrator]))

(defn ->adaptive-stepsize-integrator
  "Constructor.

  Build an integrator with the given stepsize bounds.
   The default step handler does nothing.

  name - name of the method - `java.lang.String`
  min-step - minimal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  max-step - maximal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  scal-absolute-tolerance - allowed absolute error - `double`
  scal-relative-tolerance - allowed relative error - `double`"
  (^AdaptiveStepsizeIntegrator [^java.lang.String name ^Double min-step ^Double max-step ^Double scal-absolute-tolerance ^Double scal-relative-tolerance]
    (new AdaptiveStepsizeIntegrator name min-step max-step scal-absolute-tolerance scal-relative-tolerance)))

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
  ([^AdaptiveStepsizeIntegrator this ^Double minimal-step ^Double maximal-step ^Double absolute-tolerance ^Double relative-tolerance]
    (-> this (.setStepSizeControl minimal-step maximal-step absolute-tolerance relative-tolerance))))

(defn set-initial-step-size
  "Set the initial step size.
   This method allows the user to specify an initial positive
   step size instead of letting the integrator guess it by
   itself. If this method is not called before integration is
   started, the initial step size will be estimated by the
   integrator.

  initial-step-size - initial step size to use (must be positive even for backward integration ; providing a negative value or a value outside of the min/max step interval will lead the integrator to ignore the value and compute the initial step size by itself) - `double`"
  ([^AdaptiveStepsizeIntegrator this ^Double initial-step-size]
    (-> this (.setInitialStepSize initial-step-size))))

(defn initialize-step
  "Initialize the integration step.

  forward - forward integration indicator - `boolean`
  order - order of the method - `int`
  scale - scaling vector for the state vector (can be shorter than state vector) - `double[]`
  t-0 - start time - `double`
  y-0 - state vector at t0 - `double[]`
  y-dot-0 - first time derivative of y0 - `double[]`
  y-1 - work array for a state vector - `double[]`
  y-dot-1 - work array for the first time derivative of y1 - `double[]`

  returns: first integration step - `double`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  (^Double [^AdaptiveStepsizeIntegrator this ^Boolean forward ^Integer order scale ^Double t-0 y-0 y-dot-0 y-1 y-dot-1]
    (-> this (.initializeStep forward order scale t-0 y-0 y-dot-0 y-1 y-dot-1))))

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
  ([^AdaptiveStepsizeIntegrator this ^org.apache.commons.math4.ode.ExpandableStatefulODE equations ^Double t]
    (-> this (.integrate equations t))))

(defn get-current-step-start
  "Get the current value of the step start time ti.
   This method can be called during integration (typically by
   the object implementing the differential equations problem) if the value of the current step that
   is attempted is needed.
   The result is undefined if the method is called outside of
   calls to integrate.

  returns: current value of the step start time ti - `double`"
  (^Double [^AdaptiveStepsizeIntegrator this]
    (-> this (.getCurrentStepStart))))

(defn get-min-step
  "Get the minimal step.

  returns: minimal step - `double`"
  (^Double [^AdaptiveStepsizeIntegrator this]
    (-> this (.getMinStep))))

(defn get-max-step
  "Get the maximal step.

  returns: maximal step - `double`"
  (^Double [^AdaptiveStepsizeIntegrator this]
    (-> this (.getMaxStep))))

