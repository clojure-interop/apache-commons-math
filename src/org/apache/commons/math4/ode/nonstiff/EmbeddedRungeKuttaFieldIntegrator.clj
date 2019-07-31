(ns org.apache.commons.math4.ode.nonstiff.EmbeddedRungeKuttaFieldIntegrator
  "This class implements the common part of all embedded Runge-Kutta
  integrators for Ordinary Differential Equations.

  These methods are embedded explicit Runge-Kutta methods with two
  sets of coefficients allowing to estimate the error, their Butcher
  arrays are as follows :


     0  |
    c2  | a21
    c3  | a31  a32
    ... |        ...
    cs  | as1  as2  ...  ass-1
        |--------------------------
        |  b1   b2  ...   bs-1  bs
        |  b'1  b'2 ...   b's-1 b's


  In fact, we rather use the array defined by ej = bj - b'j to
  compute directly the error rather than computing two estimates and
  then comparing them.

  Some methods are qualified as fsal (first same as last)
  methods. This means the last evaluation of the derivatives in one
  step is the same as the first in the next step. Then, this
  evaluation can be reused from one step to the next one and the cost
  of such a method is really s-1 evaluations despite the method still
  has s stages. This behaviour is true only for successful steps, if
  the step is rejected after the error estimation phase, no
  evaluation is saved. For an fsal method, we have cs = 1 and
  asi = bi for all i."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff EmbeddedRungeKuttaFieldIntegrator]))

(defn get-order
  "Get the order of the method.

  returns: order of the method - `int`"
  (^Integer [^EmbeddedRungeKuttaFieldIntegrator this]
    (-> this (.getOrder))))

(defn get-safety
  "Get the safety factor for stepsize control.

  returns: safety factor - `T`"
  ([^EmbeddedRungeKuttaFieldIntegrator this]
    (-> this (.getSafety))))

(defn set-safety
  "Set the safety factor for stepsize control.

  safety - safety factor - `T`"
  ([^EmbeddedRungeKuttaFieldIntegrator this safety]
    (-> this (.setSafety safety))))

(defn integrate
  "Integrate the differential equations up to the given time.
   This method solves an Initial Value Problem (IVP).
   Since this method stores some internal state variables made
   available in its public interface during integration (FirstOrderFieldIntegrator.getCurrentSignedStepsize()), it is not thread-safe.

  equations - differential equations to integrate - `org.apache.commons.math4.ode.FieldExpandableODE`
  initial-state - initial state (time, primary and secondary state vectors) - `org.apache.commons.math4.ode.FieldODEState`
  final-time - target time for the integration (can be set to a value smaller than t0 for backward integration) - `T`

  returns: final state, its time will be the same as finalTime if
   integration reached its target, but may be different if some FieldEventHandler stops it at some point. - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if integration step is too small"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^EmbeddedRungeKuttaFieldIntegrator this ^org.apache.commons.math4.ode.FieldExpandableODE equations ^org.apache.commons.math4.ode.FieldODEState initial-state final-time]
    (-> this (.integrate equations initial-state final-time))))

(defn get-min-reduction
  "Get the minimal reduction factor for stepsize control.

  returns: minimal reduction factor - `T`"
  ([^EmbeddedRungeKuttaFieldIntegrator this]
    (-> this (.getMinReduction))))

(defn set-min-reduction
  "Set the minimal reduction factor for stepsize control.

  min-reduction - minimal reduction factor - `T`"
  ([^EmbeddedRungeKuttaFieldIntegrator this min-reduction]
    (-> this (.setMinReduction min-reduction))))

(defn get-max-growth
  "Get the maximal growth factor for stepsize control.

  returns: maximal growth factor - `T`"
  ([^EmbeddedRungeKuttaFieldIntegrator this]
    (-> this (.getMaxGrowth))))

(defn set-max-growth
  "Set the maximal growth factor for stepsize control.

  max-growth - maximal growth factor - `T`"
  ([^EmbeddedRungeKuttaFieldIntegrator this max-growth]
    (-> this (.setMaxGrowth max-growth))))

