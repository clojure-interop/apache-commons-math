(ns org.apache.commons.math4.ode.ODEIntegrator
  "This interface defines the common parts shared by integrators
  for first and second order differential equations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode ODEIntegrator]))

(defn get-evaluations
  "Get the number of evaluations of the differential equations function.

   The number of evaluations corresponds to the last call to the
   integrate method. It is 0 if the method has not been called yet.

  returns: number of evaluations of the differential equations function - `int`"
  (^Integer [^ODEIntegrator this]
    (-> this (.getEvaluations))))

(defn get-current-signed-stepsize
  "Get the current signed value of the integration stepsize.
   This method can be called during integration (typically by
   the object implementing the differential equations problem) if the signed value of the current stepsize
   that is tried is needed.
   The result is undefined if the method is called outside of
   calls to integrate.

  returns: current signed value of the stepsize - `double`"
  (^Double [^ODEIntegrator this]
    (-> this (.getCurrentSignedStepsize))))

(defn set-max-evaluations
  "Set the maximal number of differential equations function evaluations.
   The purpose of this method is to avoid infinite loops which can occur
   for example when stringent error constraints are set or when lots of
   discrete events are triggered, thus leading to many rejected steps.

  max-evaluations - maximal number of function evaluations (negative values are silently converted to maximal integer value, thus representing almost unlimited evaluations) - `int`"
  ([^ODEIntegrator this ^Integer max-evaluations]
    (-> this (.setMaxEvaluations max-evaluations))))

(defn get-max-evaluations
  "Get the maximal number of functions evaluations.

  returns: maximal number of functions evaluations - `int`"
  (^Integer [^ODEIntegrator this]
    (-> this (.getMaxEvaluations))))

(defn get-step-handlers
  "Get all the step handlers that have been added to the integrator.

  returns: an unmodifiable collection of the added events handlers - `java.util.Collection<org.apache.commons.math4.ode.sampling.StepHandler>`"
  (^java.util.Collection [^ODEIntegrator this]
    (-> this (.getStepHandlers))))

(defn get-name
  "Get the name of the method.

  returns: name of the method - `java.lang.String`"
  (^java.lang.String [^ODEIntegrator this]
    (-> this (.getName))))

(defn clear-step-handlers
  "Remove all the step handlers that have been added to the integrator."
  ([^ODEIntegrator this]
    (-> this (.clearStepHandlers))))

(defn get-event-handlers
  "Get all the event handlers that have been added to the integrator.

  returns: an unmodifiable collection of the added events handlers - `java.util.Collection<org.apache.commons.math4.ode.events.EventHandler>`"
  (^java.util.Collection [^ODEIntegrator this]
    (-> this (.getEventHandlers))))

(defn get-current-step-start
  "Get the current value of the step start time ti.
   This method can be called during integration (typically by
   the object implementing the differential equations problem) if the value of the current step that
   is attempted is needed.
   The result is undefined if the method is called outside of
   calls to integrate.

  returns: current value of the step start time ti - `double`"
  (^Double [^ODEIntegrator this]
    (-> this (.getCurrentStepStart))))

(defn add-event-handler
  "Add an event handler to the integrator.

  handler - event handler - `org.apache.commons.math4.ode.events.EventHandler`
  max-check-interval - maximal time interval between switching function checks (this interval prevents missing sign changes in case the integration steps becomes very large) - `double`
  convergence - convergence threshold in the event time search - `double`
  max-iteration-count - upper limit of the iteration count in the event time search - `int`
  solver - The root-finding algorithm to use to detect the state events. - `org.apache.commons.math4.analysis.solvers.UnivariateSolver`"
  ([^ODEIntegrator this ^org.apache.commons.math4.ode.events.EventHandler handler ^Double max-check-interval ^Double convergence ^Integer max-iteration-count ^org.apache.commons.math4.analysis.solvers.UnivariateSolver solver]
    (-> this (.addEventHandler handler max-check-interval convergence max-iteration-count solver)))
  ([^ODEIntegrator this ^org.apache.commons.math4.ode.events.EventHandler handler ^Double max-check-interval ^Double convergence ^Integer max-iteration-count]
    (-> this (.addEventHandler handler max-check-interval convergence max-iteration-count))))

(defn add-step-handler
  "Add a step handler to this integrator.
   The handler will be called by the integrator for each accepted
   step.

  handler - handler for the accepted steps - `org.apache.commons.math4.ode.sampling.StepHandler`"
  ([^ODEIntegrator this ^org.apache.commons.math4.ode.sampling.StepHandler handler]
    (-> this (.addStepHandler handler))))

(defn clear-event-handlers
  "Remove all the event handlers that have been added to the integrator."
  ([^ODEIntegrator this]
    (-> this (.clearEventHandlers))))

