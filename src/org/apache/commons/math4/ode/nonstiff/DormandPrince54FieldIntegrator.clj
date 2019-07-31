(ns org.apache.commons.math4.ode.nonstiff.DormandPrince54FieldIntegrator
  "This class implements the 5(4) Dormand-Prince integrator for Ordinary
  Differential Equations.

  This integrator is an embedded Runge-Kutta integrator
  of order 5(4) used in local extrapolation mode (i.e. the solution
  is computed using the high order formula) with stepsize control
  (and automatic step initialization) and continuous output. This
  method uses 7 functions evaluations per step. However, since this
  is an fsal, the last evaluation of one step is the same as
  the first evaluation of the next step and hence can be avoided. So
  the cost is really 6 functions evaluations per step.

  This method has been published (whithout the continuous output
  that was added by Shampine in 1986) in the following article :


   A family of embedded Runge-Kutta formulae
   J. R. Dormand and P. J. Prince
   Journal of Computational and Applied Mathematics
   volume 6, no 1, 1980, pp. 19-26"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff DormandPrince54FieldIntegrator]))

(defn ->dormand-prince-54-field-integrator
  "Constructor.

  Simple constructor.
   Build a fifth order Dormand-Prince integrator with the given step bounds

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  min-step - minimal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  max-step - maximal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  scal-absolute-tolerance - allowed absolute error - `double`
  scal-relative-tolerance - allowed relative error - `double`"
  (^DormandPrince54FieldIntegrator [^org.apache.commons.math4.Field field ^Double min-step ^Double max-step ^Double scal-absolute-tolerance ^Double scal-relative-tolerance]
    (new DormandPrince54FieldIntegrator field min-step max-step scal-absolute-tolerance scal-relative-tolerance)))

(defn get-c
  "Get the time steps from Butcher array (without the first zero).

  returns: time steps from Butcher array (without the first zero - `T[]`"
  ([^DormandPrince54FieldIntegrator this]
    (-> this (.getC))))

(defn get-a
  "Get the internal weights from Butcher array (without the first empty row).

  returns: internal weights from Butcher array (without the first empty row) - `T[][]`"
  ([^DormandPrince54FieldIntegrator this]
    (-> this (.getA))))

(defn get-b
  "Get the external weights for the high order method from Butcher array.

  returns: external weights for the high order method from Butcher array - `T[]`"
  ([^DormandPrince54FieldIntegrator this]
    (-> this (.getB))))

(defn get-order
  "Get the order of the method.

  returns: order of the method - `int`"
  (^Integer [^DormandPrince54FieldIntegrator this]
    (-> this (.getOrder))))

