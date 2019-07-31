(ns org.apache.commons.math4.ode.sampling.AbstractFieldStepInterpolator
  "This abstract class represents an interpolator over the last step
  during an ODE integration.

  The various ODE integrators provide objects extending this class
  to the step handlers. The handlers can use these objects to
  retrieve the state vector at intermediate times between the
  previous and the current grid points (dense output)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling AbstractFieldStepInterpolator]))

(defn restrict-step
  "Create a new restricted version of the instance.

   The instance is not changed at all.

  previous-state - start of the restricted step - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`
  current-state - end of the restricted step - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`

  returns: restricted version of the instance - `org.apache.commons.math4.ode.sampling.AbstractFieldStepInterpolator<T>`"
  (^org.apache.commons.math4.ode.sampling.AbstractFieldStepInterpolator [^AbstractFieldStepInterpolator this ^org.apache.commons.math4.ode.FieldODEStateAndDerivative previous-state ^org.apache.commons.math4.ode.FieldODEStateAndDerivative current-state]
    (-> this (.restrictStep previous-state current-state))))

(defn get-global-previous-state
  "Get the previous global grid point state.

  returns: previous global grid point state - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^AbstractFieldStepInterpolator this]
    (-> this (.getGlobalPreviousState))))

(defn get-global-current-state
  "Get the current global grid point state.

  returns: current global grid point state - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^AbstractFieldStepInterpolator this]
    (-> this (.getGlobalCurrentState))))

(defn get-previous-state
  "Get the state at previous grid point time.

  returns: state at previous grid point time - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^AbstractFieldStepInterpolator this]
    (-> this (.getPreviousState))))

(defn get-current-state
  "Get the state at current grid point time.

  returns: state at current grid point time - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^AbstractFieldStepInterpolator this]
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
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^AbstractFieldStepInterpolator this time]
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
  (^Boolean [^AbstractFieldStepInterpolator this]
    (-> this (.isForward))))

