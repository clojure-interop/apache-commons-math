(ns org.apache.commons.math4.ode.sampling.AbstractStepInterpolator
  "This abstract class represents an interpolator over the last step
  during an ODE integration.

  The various ODE integrators provide objects extending this class
  to the step handlers. The handlers can use these objects to
  retrieve the state vector at intermediate times between the
  previous and the current grid points (dense output)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling AbstractStepInterpolator]))

(defn finalize-step
  "Finalize the step.

   Some embedded Runge-Kutta integrators need fewer functions
   evaluations than their counterpart step interpolators. These
   interpolators should perform the last evaluations they need by
   themselves only if they need them. This method triggers these
   extra evaluations. It can be called directly by the user step
   handler and it is called automatically if setInterpolatedTime(double) is called.

   Once this method has been called, no other
   evaluation will be performed on this step. If there is a need to
   have some side effects between the step handler and the
   differential equations (for example update some data in the
   equations once the step has been done), it is advised to call
   this method explicitly from the step handler before these side
   effects are set up. If the step handler induces no side effect,
   then this method can safely be ignored, it will be called
   transparently as needed.

   Warning: since the step interpolator provided
   to the step handler as a parameter of the handleStep is valid only for the duration
   of the handleStep call, one cannot
   simply store a reference and reuse it later. One should first
   finalize the instance, then copy this finalized instance into a
   new object that can be kept.

   This method calls the protected doFinalize method
   if it has never been called during this step and set a flag
   indicating that it has been called once. It is the
   doFinalize method which should perform the evaluations.
   This wrapping prevents from calling doFinalize several
   times and hence evaluating the differential equations too often.
   Therefore, subclasses are not allowed not reimplement it, they
   should rather reimplement doFinalize.

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^AbstractStepInterpolator this]
    (-> this (.finalizeStep))))

(defn get-interpolated-derivatives
  "Get the derivatives of the state vector of the interpolated point.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls to the associated
   StepInterpolator.setInterpolatedTime(double) method.

  returns: derivatives of the state vector at time StepInterpolator.getInterpolatedTime() - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^AbstractStepInterpolator this]
    (-> this (.getInterpolatedDerivatives))))

(defn copy
  "Copy the instance.
   The copied instance is guaranteed to be independent from the
   original one. Both can be used with different settings for
   interpolated time without any side effect.

  returns: a deep copy of the instance, which can be used independently. - `org.apache.commons.math4.ode.sampling.StepInterpolator`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded during step finalization"
  (^org.apache.commons.math4.ode.sampling.StepInterpolator [^AbstractStepInterpolator this]
    (-> this (.copy))))

(defn get-global-previous-time
  "Get the previous global grid point time.

  returns: previous global grid point time - `double`"
  (^Double [^AbstractStepInterpolator this]
    (-> this (.getGlobalPreviousTime))))

(defn store-time
  "Store the current step time.

  t - current time - `double`"
  ([^AbstractStepInterpolator this ^Double t]
    (-> this (.storeTime t))))

(defn get-interpolated-time
  "Get the time of the interpolated point.
   If StepInterpolator.setInterpolatedTime(double) has not been called, it returns
   the current grid point time.

  returns: interpolation point time - `double`"
  (^Double [^AbstractStepInterpolator this]
    (-> this (.getInterpolatedTime))))

(defn write-external
  "out - `java.io.ObjectOutput`

  throws: java.io.IOException"
  ([^AbstractStepInterpolator this ^java.io.ObjectOutput out]
    (-> this (.writeExternal out))))

(defn set-interpolated-time
  "Set the time of the interpolated point.
   Setting the time outside of the current step is now allowed, but
   should be used with care since the accuracy of the interpolator will
   probably be very poor far from this step. This allowance has been
   added to simplify implementation of search algorithms near the
   step endpoints.
   Setting the time changes the instance internal state. This includes
   the internal arrays returned in StepInterpolator.getInterpolatedState(),
   StepInterpolator.getInterpolatedDerivatives(), StepInterpolator.getInterpolatedSecondaryState(int) and StepInterpolator.getInterpolatedSecondaryDerivatives(int). So if their content must be preserved
   across several calls, user must copy them.

  time - time of the interpolated point - `double`"
  ([^AbstractStepInterpolator this ^Double time]
    (-> this (.setInterpolatedTime time))))

(defn shift
  "Shift one step forward.
   Copy the current time into the previous time, hence preparing the
   interpolator for future calls to storeTime"
  ([^AbstractStepInterpolator this]
    (-> this (.shift))))

(defn get-interpolated-state
  "Get the state vector of the interpolated point.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls to the associated
   StepInterpolator.setInterpolatedTime(double) method.

  returns: state vector at time StepInterpolator.getInterpolatedTime() - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^AbstractStepInterpolator this]
    (-> this (.getInterpolatedState))))

(defn get-current-time
  "Get the current soft grid point time.

  returns: current soft grid point time - `double`"
  (^Double [^AbstractStepInterpolator this]
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
  (^Boolean [^AbstractStepInterpolator this]
    (-> this (.isForward))))

(defn set-soft-previous-time
  "Restrict step range to a limited part of the global step.

   This method can be used to restrict a step and make it appear
   as if the original step was smaller. Calling this method
   only changes the value returned by getPreviousTime(),
   it does not change any other property

  soft-previous-time - start of the restricted step - `double`"
  ([^AbstractStepInterpolator this ^Double soft-previous-time]
    (-> this (.setSoftPreviousTime soft-previous-time))))

(defn get-interpolated-secondary-derivatives
  "Get the interpolated secondary derivatives corresponding to the secondary equations.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls.

  index - index of the secondary set, as returned by ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations) - `int`

  returns: interpolated secondary derivatives at the current interpolation date - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^AbstractStepInterpolator this ^Integer index]
    (-> this (.getInterpolatedSecondaryDerivatives index))))

(defn set-soft-current-time
  "Restrict step range to a limited part of the global step.

   This method can be used to restrict a step and make it appear
   as if the original step was smaller. Calling this method
   only changes the value returned by getCurrentTime(),
   it does not change any other property

  soft-current-time - end of the restricted step - `double`"
  ([^AbstractStepInterpolator this ^Double soft-current-time]
    (-> this (.setSoftCurrentTime soft-current-time))))

(defn get-previous-time
  "Get the previous soft grid point time.

  returns: previous soft grid point time - `double`"
  (^Double [^AbstractStepInterpolator this]
    (-> this (.getPreviousTime))))

(defn read-external
  "in - `java.io.ObjectInput`

  throws: java.io.IOException"
  ([^AbstractStepInterpolator this ^java.io.ObjectInput in]
    (-> this (.readExternal in))))

(defn get-global-current-time
  "Get the current global grid point time.

  returns: current global grid point time - `double`"
  (^Double [^AbstractStepInterpolator this]
    (-> this (.getGlobalCurrentTime))))

(defn get-interpolated-secondary-state
  "Get the interpolated secondary state corresponding to the secondary equations.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls to the associated
   StepInterpolator.setInterpolatedTime(double) method.

  index - index of the secondary set, as returned by ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations) - `int`

  returns: interpolated secondary state at the current interpolation date - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^AbstractStepInterpolator this ^Integer index]
    (-> this (.getInterpolatedSecondaryState index))))

