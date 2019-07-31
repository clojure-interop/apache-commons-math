(ns org.apache.commons.math4.ode.nonstiff.DormandPrince853FieldIntegrator
  "This class implements the 8(5,3) Dormand-Prince integrator for Ordinary
  Differential Equations.

  This integrator is an embedded Runge-Kutta integrator
  of order 8(5,3) used in local extrapolation mode (i.e. the solution
  is computed using the high order formula) with stepsize control
  (and automatic step initialization) and continuous output. This
  method uses 12 functions evaluations per step for integration and 4
  evaluations for interpolation. However, since the first
  interpolation evaluation is the same as the first integration
  evaluation of the next step, we have included it in the integrator
  rather than in the interpolator and specified the method was an
  fsal. Hence, despite we have 13 stages here, the cost is
  really 12 evaluations per step even if no interpolation is done,
  and the overcost of interpolation is only 3 evaluations.

  This method is based on an 8(6) method by Dormand and Prince
  (i.e. order 8 for the integration and order 6 for error estimation)
  modified by Hairer and Wanner to use a 5th order error estimator
  with 3rd order correction. This modification was introduced because
  the original method failed in some cases (wrong steps can be
  accepted when step size is too large, for example in the
  Brusselator problem) and also had severe difficulties when
  applied to problems with discontinuities. This modification is
  explained in the second edition of the first volume (Nonstiff
  Problems) of the reference book by Hairer, Norsett and Wanner:
  Solving Ordinary Differential Equations (Springer-Verlag,
  ISBN 3-540-56670-8)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff DormandPrince853FieldIntegrator]))

(defn ->dormand-prince-853-field-integrator
  "Constructor.

  Simple constructor.
   Build an eighth order Dormand-Prince integrator with the given step bounds

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  min-step - minimal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  max-step - maximal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  scal-absolute-tolerance - allowed absolute error - `double`
  scal-relative-tolerance - allowed relative error - `double`"
  (^DormandPrince853FieldIntegrator [^org.apache.commons.math4.Field field ^Double min-step ^Double max-step ^Double scal-absolute-tolerance ^Double scal-relative-tolerance]
    (new DormandPrince853FieldIntegrator field min-step max-step scal-absolute-tolerance scal-relative-tolerance)))

(defn get-c
  "Get the time steps from Butcher array (without the first zero).

  returns: time steps from Butcher array (without the first zero - `T[]`"
  ([^DormandPrince853FieldIntegrator this]
    (-> this (.getC))))

(defn get-a
  "Get the internal weights from Butcher array (without the first empty row).

  returns: internal weights from Butcher array (without the first empty row) - `T[][]`"
  ([^DormandPrince853FieldIntegrator this]
    (-> this (.getA))))

(defn get-b
  "Get the external weights for the high order method from Butcher array.

  returns: external weights for the high order method from Butcher array - `T[]`"
  ([^DormandPrince853FieldIntegrator this]
    (-> this (.getB))))

(defn get-order
  "Get the order of the method.

  returns: order of the method - `int`"
  (^Integer [^DormandPrince853FieldIntegrator this]
    (-> this (.getOrder))))

