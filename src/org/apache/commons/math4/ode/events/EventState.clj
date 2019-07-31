(ns org.apache.commons.math4.ode.events.EventState
  "This class handles the state for one event handler during integration steps.

  Each time the integrator proposes a step, the event handler
  switching function should be checked. This class handles the state
  of one handler during one integration step, with references to the
  state at the end of the preceding step. This information is used to
  decide if the handler should trigger an event or not during the
  proposed step."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.events EventState]))

(defn ->event-state
  "Constructor.

  Simple constructor.

  handler - event handler - `org.apache.commons.math4.ode.events.EventHandler`
  max-check-interval - maximal time interval between switching function checks (this interval prevents missing sign changes in case the integration steps becomes very large) - `double`
  convergence - convergence threshold in the event time search - `double`
  max-iteration-count - upper limit of the iteration count in the event time search - `int`
  solver - Root-finding algorithm to use to detect state events - `org.apache.commons.math4.analysis.solvers.UnivariateSolver`"
  (^EventState [^org.apache.commons.math4.ode.events.EventHandler handler ^Double max-check-interval ^Double convergence ^Integer max-iteration-count ^org.apache.commons.math4.analysis.solvers.UnivariateSolver solver]
    (new EventState handler max-check-interval convergence max-iteration-count solver)))

(defn stop
  "Check if the integration should be stopped at the end of the
   current step.

  returns: true if the integration should be stopped - `boolean`"
  (^Boolean [^EventState this]
    (-> this (.stop))))

(defn get-convergence
  "Get the convergence threshold for event localization.

  returns: convergence threshold for event localization - `double`"
  (^Double [^EventState this]
    (-> this (.getConvergence))))

(defn step-accepted
  "Acknowledge the fact the step has been accepted by the integrator.

  t - value of the independent time variable at the end of the step - `double`
  y - array containing the current value of the state vector at the end of the step - `double[]`"
  ([^EventState this ^Double t y]
    (-> this (.stepAccepted t y))))

(defn set-expandable
  "Set the equation.

  expandable - equation being integrated - `org.apache.commons.math4.ode.ExpandableStatefulODE`"
  ([^EventState this ^org.apache.commons.math4.ode.ExpandableStatefulODE expandable]
    (-> this (.setExpandable expandable))))

(defn get-event-handler
  "Get the underlying event handler.

  returns: underlying event handler - `org.apache.commons.math4.ode.events.EventHandler`"
  (^org.apache.commons.math4.ode.events.EventHandler [^EventState this]
    (-> this (.getEventHandler))))

(defn reset
  "Let the event handler reset the state if it wants.

  t - value of the independent time variable at the beginning of the next step - `double`
  y - array were to put the desired state vector at the beginning of the next step - `double[]`

  returns: true if the integrator should reset the derivatives too - `boolean`"
  (^Boolean [^EventState this ^Double t y]
    (-> this (.reset t y))))

(defn evaluate-step
  "Evaluate the impact of the proposed step on the event handler.

  interpolator - step interpolator for the proposed step - `org.apache.commons.math4.ode.sampling.StepInterpolator`

  returns: true if the event handler triggers an event before
   the end of the proposed step - `boolean`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the interpolator throws one because the number of functions evaluations is exceeded"
  (^Boolean [^EventState this ^org.apache.commons.math4.ode.sampling.StepInterpolator interpolator]
    (-> this (.evaluateStep interpolator))))

(defn get-max-check-interval
  "Get the maximal time interval between events handler checks.

  returns: maximal time interval between events handler checks - `double`"
  (^Double [^EventState this]
    (-> this (.getMaxCheckInterval))))

(defn reinitialize-begin
  "Reinitialize the beginning of the step.

  interpolator - valid for the current step - `org.apache.commons.math4.ode.sampling.StepInterpolator`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the interpolator throws one because the number of functions evaluations is exceeded"
  ([^EventState this ^org.apache.commons.math4.ode.sampling.StepInterpolator interpolator]
    (-> this (.reinitializeBegin interpolator))))

(defn get-event-time
  "Get the occurrence time of the event triggered in the current step.

  returns: occurrence time of the event triggered in the current
   step or infinity if no events are triggered - `double`"
  (^Double [^EventState this]
    (-> this (.getEventTime))))

(defn get-max-iteration-count
  "Get the upper limit in the iteration count for event localization.

  returns: upper limit in the iteration count for event localization - `int`"
  (^Integer [^EventState this]
    (-> this (.getMaxIterationCount))))

