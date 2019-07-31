(ns org.apache.commons.math4.ode.events.EventHandler
  "This interface represents a handler for discrete events triggered
  during ODE integration.

  Some events can be triggered at discrete times as an ODE problem
  is solved. This occurs for example when the integration process
  should be stopped as some state is reached (G-stop facility) when the
  precise date is unknown a priori, or when the derivatives have
  discontinuities, or simply when the user wants to monitor some
  states boundaries crossings.


  These events are defined as occurring when a g
  switching function sign changes.

  Since events are only problem-dependent and are triggered by the
  independent time variable and the state vector, they can
  occur at virtually any time, unknown in advance. The integrators will
  take care to avoid sign changes inside the steps, they will reduce
  the step size when such an event is detected in order to put this
  event exactly at the end of the current step. This guarantees that
  step interpolation (which always has a one step scope) is relevant
  even in presence of discontinuities. This is independent from the
  stepsize control provided by integrators that monitor the local
  error (this event handling feature is available for all integrators,
  including fixed step ones)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.events EventHandler]))

(defn init
  "Initialize event handler at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the event handler to initialize some internal data
   if needed.

  t-0 - start value of the independent time variable - `double`
  y-0 - array containing the start value of the state vector - `double[]`
  t - target time for the integration - `double`"
  ([^EventHandler this ^Double t-0 y-0 ^Double t]
    (-> this (.init t-0 y-0 t))))

(defn g
  "Compute the value of the switching function.

   The discrete events are generated when the sign of this
   switching function changes. The integrator will take care to change
   the stepsize in such a way these events occur exactly at step boundaries.
   The switching function must be continuous in its roots neighborhood
   (but not necessarily smooth), as the integrator will need to find its
   roots to locate precisely the events.
   Also note that the integrator expect that once an event has occurred,
   the sign of the switching function at the start of the next step (i.e.
   just after the event) is the opposite of the sign just before the event.
   This consistency between the steps must be preserved,
   otherwise exceptions related to root not being bracketed will occur.
   This need for consistency is sometimes tricky to achieve. A typical
   example is using an event to model a ball bouncing on the floor. The first
   idea to represent this would be to have g(t) = h(t) where h is the
   height above the floor at time t. When g(t) reaches 0, the
   ball is on the floor, so it should bounce and the typical way to do this is
   to reverse its vertical velocity. However, this would mean that before the
   event g(t) was decreasing from positive values to 0, and after the
   event g(t) would be increasing from 0 to positive values again.
   Consistency is broken here! The solution here is to have g(t) = sign
   * h(t), where sign is a variable with initial value set to +1. Each
   time eventOccurred is called,
   sign is reset to -sign. This allows the g(t)
   function to remain continuous (and even smooth) even across events, despite
   h(t) is not. Basically, the event is used to fold h(t)
   at bounce points, and sign is used to unfold it back, so the
   solvers sees a g(t) function which behaves smoothly even across events.

  t - current value of the independent time variable - `double`
  y - array containing the current value of the state vector - `double[]`

  returns: value of the g switching function - `double`"
  (^Double [^EventHandler this ^Double t y]
    (-> this (.g t y))))

(defn event-occurred
  "Handle an event and choose what to do next.

   This method is called when the integrator has accepted a step
   ending exactly on a sign change of the function, just before
   the step handler itself is called (see below for scheduling). It
   allows the user to update his internal data to acknowledge the fact
   the event has been handled (for example setting a flag in the differential equations to switch the derivatives computation in
   case of discontinuity), or to direct the integrator to either stop
   or continue integration, possibly with a reset state or derivatives.


     if EventHandler.Action.STOP is returned, the step handler will be called
     with the isLast flag of the handleStep
     method set to true and the integration will be stopped,
     if EventHandler.Action.RESET_STATE is returned, the resetState method will be called once the step handler has
     finished its task, and the integrator will also recompute the
     derivatives,
     if EventHandler.Action.RESET_DERIVATIVES is returned, the integrator
     will recompute the derivatives,
     if EventHandler.Action.CONTINUE is returned, no specific action will
     be taken (apart from having called this method) and integration
     will continue.


   The scheduling between this method and the StepHandler method handleStep(interpolator, isLast) is to call this method first and
   handleStep afterwards. This scheduling allows the integrator to
   pass true as the isLast parameter to the step
   handler to make it aware the step will be the last one if this method
   returns EventHandler.Action.STOP. As the interpolator may be used to navigate back
   throughout the last step (as StepNormalizer
   does for example), user code called by this method and user
   code called by step handlers may experience apparently out of order values
   of the independent time variable. As an example, if the same user object
   implements both this EventHandler interface and the
   FixedStepHandler
   interface, a forward integration may call its
   eventOccurred method with t = 10 first and call its
   handleStep method with t = 9 afterwards. Such out of order
   calls are limited to the size of the integration step for variable step handlers and
   to the size of the fixed step for fixed step handlers.

  t - current value of the independent time variable - `double`
  y - array containing the current value of the state vector - `double[]`
  increasing - if true, the value of the switching function increases when times increases around event (note that increase is measured with respect to physical time, not with respect to integration which may go backward in time) - `boolean`

  returns: indication of what the integrator should do next, this
   value must be one of EventHandler.Action.STOP, EventHandler.Action.RESET_STATE,
   EventHandler.Action.RESET_DERIVATIVES or EventHandler.Action.CONTINUE - `org.apache.commons.math4.ode.events.EventHandler$Action`"
  (^org.apache.commons.math4.ode.events.EventHandler$Action [^EventHandler this ^Double t y ^Boolean increasing]
    (-> this (.eventOccurred t y increasing))))

(defn reset-state
  "Reset the state prior to continue the integration.

   This method is called after the step handler has returned and
   before the next step is started, but only when eventOccurred(double, double[], boolean) has itself returned the EventHandler.Action.RESET_STATE
   indicator. It allows the user to reset the state vector for the
   next step, without perturbing the step handler of the finishing
   step. If the eventOccurred(double, double[], boolean) never returns the EventHandler.Action.RESET_STATE indicator, this function will never be called, and it is
   safe to leave its body empty.

  t - current value of the independent time variable - `double`
  y - array containing the current value of the state vector the new state should be put in the same array - `double[]`"
  ([^EventHandler this ^Double t y]
    (-> this (.resetState t y))))

