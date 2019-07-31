(ns org.apache.commons.math4.ode.events.FieldEventState
  "This class handles the state for one event handler during integration steps.

  Each time the integrator proposes a step, the event handler
  switching function should be checked. This class handles the state
  of one handler during one integration step, with references to the
  state at the end of the preceding step. This information is used to
  decide if the handler should trigger an event or not during the
  proposed step."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.events FieldEventState]))

(defn ->field-event-state
  "Constructor.

  Simple constructor.

  handler - event handler - `org.apache.commons.math4.ode.events.FieldEventHandler`
  max-check-interval - maximal time interval between switching function checks (this interval prevents missing sign changes in case the integration steps becomes very large) - `double`
  convergence - convergence threshold in the event time search - `T`
  max-iteration-count - upper limit of the iteration count in the event time search - `int`
  solver - Root-finding algorithm to use to detect state events - `org.apache.commons.math4.analysis.solvers.BracketedRealFieldUnivariateSolver`"
  (^FieldEventState [^org.apache.commons.math4.ode.events.FieldEventHandler handler ^Double max-check-interval convergence ^Integer max-iteration-count ^org.apache.commons.math4.analysis.solvers.BracketedRealFieldUnivariateSolver solver]
    (new FieldEventState handler max-check-interval convergence max-iteration-count solver)))

(defn stop
  "Check if the integration should be stopped at the end of the
   current step.

  returns: true if the integration should be stopped - `boolean`"
  (^Boolean [^FieldEventState this]
    (-> this (.stop))))

(defn get-convergence
  "Get the convergence threshold for event localization.

  returns: convergence threshold for event localization - `T`"
  ([^FieldEventState this]
    (-> this (.getConvergence))))

(defn step-accepted
  "Acknowledge the fact the step has been accepted by the integrator.

  state - state at the end of the step - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`"
  ([^FieldEventState this ^org.apache.commons.math4.ode.FieldODEStateAndDerivative state]
    (-> this (.stepAccepted state))))

(defn get-event-handler
  "Get the underlying event handler.

  returns: underlying event handler - `org.apache.commons.math4.ode.events.FieldEventHandler<T>`"
  (^org.apache.commons.math4.ode.events.FieldEventHandler [^FieldEventState this]
    (-> this (.getEventHandler))))

(defn reset
  "Let the event handler reset the state if it wants.

  state - state at the beginning of the next step - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`

  returns: reset state (may by the same as initial state if only
   derivatives should be reset), or null if nothing is reset - `org.apache.commons.math4.ode.FieldODEState<T>`"
  (^org.apache.commons.math4.ode.FieldODEState [^FieldEventState this ^org.apache.commons.math4.ode.FieldODEStateAndDerivative state]
    (-> this (.reset state))))

(defn evaluate-step
  "Evaluate the impact of the proposed step on the event handler.

  interpolator - step interpolator for the proposed step - `org.apache.commons.math4.ode.sampling.FieldStepInterpolator`

  returns: true if the event handler triggers an event before
   the end of the proposed step - `boolean`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the interpolator throws one because the number of functions evaluations is exceeded"
  (^Boolean [^FieldEventState this ^org.apache.commons.math4.ode.sampling.FieldStepInterpolator interpolator]
    (-> this (.evaluateStep interpolator))))

(defn get-max-check-interval
  "Get the maximal time interval between events handler checks.

  returns: maximal time interval between events handler checks - `double`"
  (^Double [^FieldEventState this]
    (-> this (.getMaxCheckInterval))))

(defn reinitialize-begin
  "Reinitialize the beginning of the step.

  interpolator - valid for the current step - `org.apache.commons.math4.ode.sampling.FieldStepInterpolator`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the interpolator throws one because the number of functions evaluations is exceeded"
  ([^FieldEventState this ^org.apache.commons.math4.ode.sampling.FieldStepInterpolator interpolator]
    (-> this (.reinitializeBegin interpolator))))

(defn get-event-time
  "Get the occurrence time of the event triggered in the current step.

  returns: occurrence time of the event triggered in the current
   step or infinity if no events are triggered - `T`"
  ([^FieldEventState this]
    (-> this (.getEventTime))))

(defn get-max-iteration-count
  "Get the upper limit in the iteration count for event localization.

  returns: upper limit in the iteration count for event localization - `int`"
  (^Integer [^FieldEventState this]
    (-> this (.getMaxIterationCount))))

