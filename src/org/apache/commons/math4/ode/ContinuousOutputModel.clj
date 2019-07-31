(ns org.apache.commons.math4.ode.ContinuousOutputModel
  "This class stores all information provided by an ODE integrator
  during the integration process and build a continuous model of the
  solution from this.

  This class act as a step handler from the integrator point of
  view. It is called iteratively during the integration process and
  stores a copy of all steps information in a sorted collection for
  later use. Once the integration process is over, the user can use
  the setInterpolatedTime and getInterpolatedState to retrieve this
  information at any time. It is important to wait for the
  integration to be over before attempting to call setInterpolatedTime because some internal
  variables are set only once the last step has been handled.

  This is useful for example if the main loop of the user
  application should remain independent from the integration process
  or if one needs to mimic the behaviour of an analytical model
  despite a numerical model is used (i.e. one needs the ability to
  get the model value at any time or to navigate through the
  data).

  If problem modeling is done with several separate
  integration phases for contiguous intervals, the same
  ContinuousOutputModel can be used as step handler for all
  integration phases as long as they are performed in order and in
  the same direction. As an example, one can extrapolate the
  trajectory of a satellite with one model (i.e. one set of
  differential equations) up to the beginning of a maneuver, use
  another more complex model including thrusters modeling and
  accurate attitude control during the maneuver, and revert to the
  first model after the end of the maneuver. If the same continuous
  output model handles the steps of all integration phases, the user
  do not need to bother when the maneuver begins or ends, he has all
  the data available in a transparent manner.

  An important feature of this class is that it implements the
  Serializable interface. This means that the result of
  an integration can be serialized and reused later (if stored into a
  persistent medium like a filesystem or a database) or elsewhere (if
  sent to another application). Only the result of the integration is
  stored, there is no reference to the integrated problem by
  itself.

  One should be aware that the amount of data stored in a
  ContinuousOutputModel instance can be important if the state vector
  is large, if the integration interval is long or if the steps are
  small (which can result from small tolerance settings in adaptive
  step size integrators)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode ContinuousOutputModel]))

(defn ->continuous-output-model
  "Constructor.

  Simple constructor.
   Build an empty continuous output model."
  (^ContinuousOutputModel []
    (new ContinuousOutputModel )))

(defn get-interpolated-derivatives
  "Get the derivatives of the state vector of the interpolated point.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls to the associated
   setInterpolatedTime(double) method.

  returns: derivatives of the state vector at time getInterpolatedTime() - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^ContinuousOutputModel this]
    (-> this (.getInterpolatedDerivatives))))

(defn get-final-time
  "Get the final integration time.

  returns: final integration time - `double`"
  (^Double [^ContinuousOutputModel this]
    (-> this (.getFinalTime))))

(defn get-interpolated-time
  "Get the time of the interpolated point.
   If setInterpolatedTime(double) has not been called, it returns
   the final integration time.

  returns: interpolation point time - `double`"
  (^Double [^ContinuousOutputModel this]
    (-> this (.getInterpolatedTime))))

(defn get-initial-time
  "Get the initial integration time.

  returns: initial integration time - `double`"
  (^Double [^ContinuousOutputModel this]
    (-> this (.getInitialTime))))

(defn set-interpolated-time
  "Set the time of the interpolated point.
   This method should not be called before the
   integration is over because some internal variables are set only
   once the last step has been handled.
   Setting the time outside of the integration interval is now
   allowed, but should be used with care since the accuracy of the
   interpolator will probably be very poor far from this interval.
   This allowance has been added to simplify implementation of search
   algorithms near the interval endpoints.
   Note that each time this method is called, the internal arrays
   returned in getInterpolatedState(), getInterpolatedDerivatives() and getInterpolatedSecondaryState(int)
   will be overwritten. So if their content must be preserved
   across several calls, user must copy them.

  time - time of the interpolated point - `double`"
  ([^ContinuousOutputModel this ^Double time]
    (-> this (.setInterpolatedTime time))))

(defn get-interpolated-state
  "Get the state vector of the interpolated point.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls to the associated
   setInterpolatedTime(double) method.

  returns: state vector at time getInterpolatedTime() - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^ContinuousOutputModel this]
    (-> this (.getInterpolatedState))))

(defn get-interpolated-secondary-derivatives
  "Get the interpolated secondary derivatives corresponding to the secondary equations.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls to the associated
   setInterpolatedTime(double) method.

  secondary-state-index - index of the secondary set, as returned by ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations) - `int`

  returns: interpolated secondary derivatives at the current interpolation date - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^ContinuousOutputModel this ^Integer secondary-state-index]
    (-> this (.getInterpolatedSecondaryDerivatives secondary-state-index))))

(defn init
  "Initialize step handler at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the step handler to initialize some internal data
   if needed.

  t-0 - start value of the independent time variable - `double`
  y-0 - array containing the start value of the state vector - `double[]`
  t - target time for the integration - `double`"
  ([^ContinuousOutputModel this ^Double t-0 y-0 ^Double t]
    (-> this (.init t-0 y-0 t))))

(defn append
  "Append another model at the end of the instance.

  model - model to add at the end of the instance - `org.apache.commons.math4.ode.ContinuousOutputModel`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the model to append is not compatible with the instance (dimension of the state vector, propagation direction, hole between the dates)"
  ([^ContinuousOutputModel this ^org.apache.commons.math4.ode.ContinuousOutputModel model]
    (-> this (.append model))))

(defn handle-step
  "Handle the last accepted step.
   A copy of the information provided by the last step is stored in
   the instance for later use.

  interpolator - interpolator for the last accepted step. - `org.apache.commons.math4.ode.sampling.StepInterpolator`
  is-last - true if the step is the last one - `boolean`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded during step finalization"
  ([^ContinuousOutputModel this ^org.apache.commons.math4.ode.sampling.StepInterpolator interpolator ^Boolean is-last]
    (-> this (.handleStep interpolator is-last))))

(defn get-interpolated-secondary-state
  "Get the interpolated secondary state corresponding to the secondary equations.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls to the associated
   setInterpolatedTime(double) method.

  secondary-state-index - index of the secondary set, as returned by ExpandableStatefulODE.addSecondaryEquations(SecondaryEquations) - `int`

  returns: interpolated secondary state at the current interpolation date - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^ContinuousOutputModel this ^Integer secondary-state-index]
    (-> this (.getInterpolatedSecondaryState secondary-state-index))))

