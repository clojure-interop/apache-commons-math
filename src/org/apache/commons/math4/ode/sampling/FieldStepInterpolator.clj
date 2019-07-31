(ns org.apache.commons.math4.ode.sampling.FieldStepInterpolator
  "This interface represents an interpolator over the last step
  during an ODE integration.

  The various ODE integrators provide objects implementing this
  interface to the step handlers. These objects are often custom
  objects tightly bound to the integrator internal algorithms. The
  handlers can use these objects to retrieve the state vector at
  intermediate times between the previous and the current grid points
  (this feature is often called dense output)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling FieldStepInterpolator]))

(defn get-previous-state
  "Get the state at previous grid point time.

  returns: state at previous grid point time - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^FieldStepInterpolator this]
    (-> this (.getPreviousState))))

(defn get-current-state
  "Get the state at current grid point time.

  returns: state at current grid point time - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^FieldStepInterpolator this]
    (-> this (.getCurrentState))))

(defn get-interpolated-state
  "Get the state at interpolated time.
   Setting the time outside of the current step is allowed, but
   should be used with care since the accuracy of the interpolator will
   probably be very poor far from this step. This allowance has been
   added to simplify implementation of search algorithms near the
   step endpoints.

  time - time of the interpolated point - `T`

  returns: state at interpolated time - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^FieldStepInterpolator this time]
    (-> this (.getInterpolatedState time))))

(defn forward?
  "Check if the natural integration direction is forward.
   This method provides the integration direction as specified by
   the integrator itself, it avoid some nasty problems in
   degenerated cases like null steps due to cancellation at step
   initialization, step control or discrete events
   triggering.

  returns: true if the integration variable (time) increases during
   integration - `boolean`"
  (^Boolean [^FieldStepInterpolator this]
    (-> this (.isForward))))

