(ns org.apache.commons.math4.ode.FirstOrderFieldIntegrator
  "This interface represents a first order integrator for
  differential equations.

  The classes which are devoted to solve first order differential
  equations should implement this interface. The problems which can
  be handled should implement the FirstOrderDifferentialEquations interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode FirstOrderFieldIntegrator]))

(defn get-evaluations
  "Get the number of evaluations of the differential equations function.

   The number of evaluations corresponds to the last call to the
   integrate method. It is 0 if the method has not been called yet.

  returns: number of evaluations of the differential equations function - `int`"
  (^Integer [^FirstOrderFieldIntegrator this]
    (-> this (.getEvaluations))))

(defn get-current-signed-stepsize
  "Get the current signed value of the integration stepsize.
   This method can be called during integration (typically by
   the object implementing the differential equations problem) if the signed value of the current stepsize
   that is tried is needed.
   The result is undefined if the method is called outside of
   calls to integrate.

  returns: current signed value of the stepsize - `T`"
  ([^FirstOrderFieldIntegrator this]
    (-> this (.getCurrentSignedStepsize))))

(defn set-max-evaluations
  "Set the maximal number of differential equations function evaluations.
   The purpose of this method is to avoid infinite loops which can occur
   for example when stringent error constraints are set or when lots of
   discrete events are triggered, thus leading to many rejected steps.

  max-evaluations - maximal number of function evaluations (negative values are silently converted to maximal integer value, thus representing almost unlimited evaluations) - `int`"
  ([^FirstOrderFieldIntegrator this ^Integer max-evaluations]
    (-> this (.setMaxEvaluations max-evaluations))))

(defn get-max-evaluations
  "Get the maximal number of functions evaluations.

  returns: maximal number of functions evaluations - `int`"
  (^Integer [^FirstOrderFieldIntegrator this]
    (-> this (.getMaxEvaluations))))

(defn integrate
  "Integrate the differential equations up to the given time.
   This method solves an Initial Value Problem (IVP).
   Since this method stores some internal state variables made
   available in its public interface during integration (getCurrentSignedStepsize()), it is not thread-safe.

  equations - differential equations to integrate - `org.apache.commons.math4.ode.FieldExpandableODE`
  initial-state - initial state (time, primary and secondary state vectors) - `org.apache.commons.math4.ode.FieldODEState`
  final-time - target time for the integration (can be set to a value smaller than t0 for backward integration) - `T`

  returns: final state, its time will be the same as finalTime if
   integration reached its target, but may be different if some FieldEventHandler stops it at some point. - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if integration step is too small"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^FirstOrderFieldIntegrator this ^org.apache.commons.math4.ode.FieldExpandableODE equations ^org.apache.commons.math4.ode.FieldODEState initial-state final-time]
    (-> this (.integrate equations initial-state final-time))))

(defn get-step-handlers
  "Get all the step handlers that have been added to the integrator.

  returns: an unmodifiable collection of the added events handlers - `java.util.Collection<org.apache.commons.math4.ode.sampling.FieldStepHandler<T>>`"
  (^java.util.Collection [^FirstOrderFieldIntegrator this]
    (-> this (.getStepHandlers))))

(defn get-name
  "Get the name of the method.

  returns: name of the method - `java.lang.String`"
  (^java.lang.String [^FirstOrderFieldIntegrator this]
    (-> this (.getName))))

(defn clear-step-handlers
  "Remove all the step handlers that have been added to the integrator."
  ([^FirstOrderFieldIntegrator this]
    (-> this (.clearStepHandlers))))

(defn get-event-handlers
  "Get all the event handlers that have been added to the integrator.

  returns: an unmodifiable collection of the added events handlers - `java.util.Collection<org.apache.commons.math4.ode.events.FieldEventHandler<T>>`"
  (^java.util.Collection [^FirstOrderFieldIntegrator this]
    (-> this (.getEventHandlers))))

(defn get-current-step-start
  "Get the current value of the step start time ti.
   This method can be called during integration (typically by
   the object implementing the differential equations problem) if the value of the current step that
   is attempted is needed.
   The result is undefined if the method is called outside of
   calls to integrate.

  returns: current value of the state at step start time ti - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^FirstOrderFieldIntegrator this]
    (-> this (.getCurrentStepStart))))

(defn add-event-handler
  "Add an event handler to the integrator.

  handler - event handler - `org.apache.commons.math4.ode.events.FieldEventHandler`
  max-check-interval - maximal time interval between switching function checks (this interval prevents missing sign changes in case the integration steps becomes very large) - `double`
  convergence - convergence threshold in the event time search - `double`
  max-iteration-count - upper limit of the iteration count in the event time search events. - `int`
  solver - solver to use to locate the event - `org.apache.commons.math4.analysis.solvers.BracketedRealFieldUnivariateSolver`"
  ([^FirstOrderFieldIntegrator this ^org.apache.commons.math4.ode.events.FieldEventHandler handler ^Double max-check-interval ^Double convergence ^Integer max-iteration-count ^org.apache.commons.math4.analysis.solvers.BracketedRealFieldUnivariateSolver solver]
    (-> this (.addEventHandler handler max-check-interval convergence max-iteration-count solver)))
  ([^FirstOrderFieldIntegrator this ^org.apache.commons.math4.ode.events.FieldEventHandler handler ^Double max-check-interval ^Double convergence ^Integer max-iteration-count]
    (-> this (.addEventHandler handler max-check-interval convergence max-iteration-count))))

(defn add-step-handler
  "Add a step handler to this integrator.
   The handler will be called by the integrator for each accepted
   step.

  handler - handler for the accepted steps - `org.apache.commons.math4.ode.sampling.FieldStepHandler`"
  ([^FirstOrderFieldIntegrator this ^org.apache.commons.math4.ode.sampling.FieldStepHandler handler]
    (-> this (.addStepHandler handler))))

(defn clear-event-handlers
  "Remove all the event handlers that have been added to the integrator."
  ([^FirstOrderFieldIntegrator this]
    (-> this (.clearEventHandlers))))

