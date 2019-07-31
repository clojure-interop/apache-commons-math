(ns org.apache.commons.math4.ode.ContinuousOutputFieldModel
  "This class stores all information provided by an ODE integrator
  during the integration process and build a continuous model of the
  solution from this.

  This class act as a step handler from the integrator point of
  view. It is called iteratively during the integration process and
  stores a copy of all steps information in a sorted collection for
  later use. Once the integration process is over, the user can use
  the getInterpolatedState
  method to retrieve this information at any time. It is important to wait
  for the integration to be over before attempting to call getInterpolatedState(RealFieldElement) because some internal
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

  One should be aware that the amount of data stored in a
  ContinuousOutputFieldModel instance can be important if the state vector
  is large, if the integration interval is long or if the steps are
  small (which can result from small tolerance settings in adaptive
  step size integrators)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode ContinuousOutputFieldModel]))

(defn ->continuous-output-field-model
  "Constructor.

  Simple constructor.
   Build an empty continuous output model."
  (^ContinuousOutputFieldModel []
    (new ContinuousOutputFieldModel )))

(defn append
  "Append another model at the end of the instance.

  model - model to add at the end of the instance - `org.apache.commons.math4.ode.ContinuousOutputFieldModel`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the model to append is not compatible with the instance (dimension of the state vector, propagation direction, hole between the dates)"
  ([^ContinuousOutputFieldModel this ^org.apache.commons.math4.ode.ContinuousOutputFieldModel model]
    (-> this (.append model))))

(defn init
  "Initialize step handler at the start of an ODE integration.

   This method is called once at the start of the integration. It
   may be used by the step handler to initialize some internal data
   if needed.

  initial-state - initial time, state vector and derivative - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`
  t - target time for the integration - `T`"
  ([^ContinuousOutputFieldModel this ^org.apache.commons.math4.ode.FieldODEStateAndDerivative initial-state t]
    (-> this (.init initial-state t))))

(defn handle-step
  "Handle the last accepted step.
   A copy of the information provided by the last step is stored in
   the instance for later use.

  interpolator - interpolator for the last accepted step. - `org.apache.commons.math4.ode.sampling.FieldStepInterpolator`
  is-last - true if the step is the last one - `boolean`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded during step finalization"
  ([^ContinuousOutputFieldModel this ^org.apache.commons.math4.ode.sampling.FieldStepInterpolator interpolator ^Boolean is-last]
    (-> this (.handleStep interpolator is-last))))

(defn get-initial-time
  "Get the initial integration time.

  returns: initial integration time - `T`"
  ([^ContinuousOutputFieldModel this]
    (-> this (.getInitialTime))))

(defn get-final-time
  "Get the final integration time.

  returns: final integration time - `T`"
  ([^ContinuousOutputFieldModel this]
    (-> this (.getFinalTime))))

(defn get-interpolated-state
  "Get the state at interpolated time.

  time - time of the interpolated point - `T`

  returns: state at interpolated time - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^ContinuousOutputFieldModel this time]
    (-> this (.getInterpolatedState time))))

