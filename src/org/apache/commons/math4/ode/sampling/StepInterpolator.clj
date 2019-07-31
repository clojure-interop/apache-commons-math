(ns org.apache.commons.math4.ode.sampling.StepInterpolator
  "This interface represents an interpolator over the last step
  during an ODE integration.

  The various ODE integrators provide objects implementing this
  interface to the step handlers. These objects are often custom
  objects tightly bound to the integrator internal algorithms. The
  handlers can use these objects to retrieve the state vector at
  intermediate times between the previous and the current grid points
  (this feature is often called dense output).
  One important thing to note is that the step handlers may be so
  tightly bound to the integrators that they often share some internal
  state arrays. This imply that one should never use a direct
  reference to a step interpolator outside of the step handler, either
  for future use or for use in another thread. If such a need arise, the
  step interpolator must be copied using the dedicated
  copy() method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling StepInterpolator]))

(defn get-interpolated-derivatives
  "Get the derivatives of the state vector of the interpolated point.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls to the associated
   setInterpolatedTime(double) method.

  returns: derivatives of the state vector at time getInterpolatedTime() - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^StepInterpolator this]
    (-> this (.getInterpolatedDerivatives))))

(defn copy
  "Copy the instance.
   The copied instance is guaranteed to be independent from the
   original one. Both can be used with different settings for
   interpolated time without any side effect.

  returns: a deep copy of the instance, which can be used independently. - `org.apache.commons.math4.ode.sampling.StepInterpolator`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded during step finalization"
  (^org.apache.commons.math4.ode.sampling.StepInterpolator [^StepInterpolator this]
    (-> this (.copy))))

(defn get-interpolated-time
  "Get the time of the interpolated point.
   If setInterpolatedTime(double) has not been called, it returns
   the current grid point time.

  returns: interpolation point time - `double`"
  (^Double [^StepInterpolator this]
    (-> this (.getInterpolatedTime))))

(defn set-interpolated-time
  "Set the time of the interpolated point.
   Setting the time outside of the current step is now allowed, but
   should be used with care since the accuracy of the interpolator will
   probably be very poor far from this step. This allowance has been
   added to simplify implementation of search algorithms near the
   step endpoints.
   Setting the time changes the instance internal state. This includes
   the internal arrays returned in getInterpolatedState(),
   getInterpolatedDerivatives(), getInterpolatedSecondaryState(int) and getInterpolatedSecondaryDerivatives(int). So if their content must be preserved
   across several calls, user must copy them.

  time - time of the interpolated point - `double`"
  ([^StepInterpolator this ^Double time]
    (-> this (.setInterpolatedTime time))))

(defn get-interpolated-state
  "Get the state vector of the interpolated point.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls to the associated
   setInterpolatedTime(double) method.

  returns: state vector at time getInterpolatedTime() - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^StepInterpolator this]
    (-> this (.getInterpolatedState))))

(defn get-current-time
  "Get the current grid point time.

  returns: current grid point time - `double`"
  (^Double [^StepInterpolator this]
    (-> this (.getCurrentTime))))

(defn forward?
  "Check if the natural integration direction is forward.
   This method provides the integration direction as specified by
   the integrator itself, it avoid some nasty problems in
   degenerated cases like null steps due to cancellation at step
   initialization, step control or discrete events
   triggering.

  returns: true if the integration variable (time) increases during
   integration - `boolean`"
  (^Boolean [^StepInterpolator this]
    (-> this (.isForward))))

(defn get-interpolated-secondary-derivatives
  "Get the interpolated secondary derivatives corresponding to the secondary equations.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls.

  index - index of the secondary set, as returned by ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations) - `int`

  returns: interpolated secondary derivatives at the current interpolation date - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^StepInterpolator this ^Integer index]
    (-> this (.getInterpolatedSecondaryDerivatives index))))

(defn get-previous-time
  "Get the previous grid point time.

  returns: previous grid point time - `double`"
  (^Double [^StepInterpolator this]
    (-> this (.getPreviousTime))))

(defn get-interpolated-secondary-state
  "Get the interpolated secondary state corresponding to the secondary equations.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls to the associated
   setInterpolatedTime(double) method.

  index - index of the secondary set, as returned by ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations) - `int`

  returns: interpolated secondary state at the current interpolation date - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^StepInterpolator this ^Integer index]
    (-> this (.getInterpolatedSecondaryState index))))

