(ns org.apache.commons.math4.ode.sampling.NordsieckStepInterpolator
  "This class implements an interpolator for integrators using Nordsieck representation.

  This interpolator computes dense output around the current point.
  The interpolation equation is based on Taylor series formulas."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling NordsieckStepInterpolator]))

(defn ->nordsieck-step-interpolator
  "Constructor.

  Copy constructor.

  interpolator - interpolator to copy from. The copy is a deep copy: its arrays are separated from the original arrays of the instance - `org.apache.commons.math4.ode.sampling.NordsieckStepInterpolator`"
  (^NordsieckStepInterpolator [^org.apache.commons.math4.ode.sampling.NordsieckStepInterpolator interpolator]
    (new NordsieckStepInterpolator interpolator))
  (^NordsieckStepInterpolator []
    (new NordsieckStepInterpolator )))

(defn reinitialize
  "Reinitialize the instance.
   Beware that all arrays must be references to integrator
   arrays, in order to ensure proper update without copy.

  y - reference to the integrator array holding the state at the end of the step - `double[]`
  forward - integration direction indicator - `boolean`
  primary-mapper - equations mapper for the primary equations set - `org.apache.commons.math4.ode.EquationsMapper`
  secondary-mappers - equations mappers for the secondary equations sets - `org.apache.commons.math4.ode.EquationsMapper[]`"
  ([^NordsieckStepInterpolator this y ^Boolean forward ^org.apache.commons.math4.ode.EquationsMapper primary-mapper secondary-mappers]
    (-> this (.reinitialize y forward primary-mapper secondary-mappers))))

(defn rescale
  "Rescale the instance.
   Since the scaled and Nordsieck arrays are shared with the caller,
   this method has the side effect of rescaling this arrays in the caller too.

  step-size - new step size to use in the scaled and Nordsieck arrays - `double`"
  ([^NordsieckStepInterpolator this ^Double step-size]
    (-> this (.rescale step-size))))

(defn get-interpolated-state-variation
  "Get the state vector variation from current to interpolated state.
   This method is aimed at computing y(tinterpolation)
   -y(tcurrent) accurately by avoiding the cancellation errors
   that would occur if the subtraction were performed explicitly.
   The returned vector is a reference to a reused array, so
   it should not be modified and it should be copied if it needs
   to be preserved across several calls.

  returns: state vector at time AbstractStepInterpolator.getInterpolatedTime() - `double[]`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the number of functions evaluations is exceeded"
  ([^NordsieckStepInterpolator this]
    (-> this (.getInterpolatedStateVariation))))

(defn write-external
  "out - `java.io.ObjectOutput`

  throws: java.io.IOException"
  ([^NordsieckStepInterpolator this ^java.io.ObjectOutput out]
    (-> this (.writeExternal out))))

(defn read-external
  "in - `java.io.ObjectInput`

  throws: java.io.IOException"
  ([^NordsieckStepInterpolator this ^java.io.ObjectInput in]
    (-> this (.readExternal in))))

