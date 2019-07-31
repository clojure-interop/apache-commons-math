(ns org.apache.commons.math4.ode.nonstiff.EmbeddedRungeKuttaIntegrator
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
  (:import [org.apache.commons.math4.ode.nonstiff EmbeddedRungeKuttaIntegrator]))

(defn get-order
  "Get the order of the method.

  returns: order of the method - `int`"
  (^Integer [^EmbeddedRungeKuttaIntegrator this]
    (-> this (.getOrder))))

(defn get-safety
  "Get the safety factor for stepsize control.

  returns: safety factor - `double`"
  (^Double [^EmbeddedRungeKuttaIntegrator this]
    (-> this (.getSafety))))

(defn set-safety
  "Set the safety factor for stepsize control.

  safety - safety factor - `double`"
  ([^EmbeddedRungeKuttaIntegrator this ^Double safety]
    (-> this (.setSafety safety))))

(defn integrate
  "Integrate a set of differential equations up to the given time.
   This method solves an Initial Value Problem (IVP).
   The set of differential equations is composed of a main set, which
   can be extended by some sets of secondary equations. The set of
   equations must be already set up with initial time and partial states.
   At integration completion, the final time and partial states will be
   available in the same object.
   Since this method stores some internal state variables made
   available in its public interface during integration (AbstractIntegrator.getCurrentSignedStepsize()), it is not thread-safe.

  equations - complete set of differential equations to integrate - `org.apache.commons.math4.ode.ExpandableStatefulODE`
  t - target time for the integration (can be set to a value smaller than t0 for backward integration) - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if integration step is too small"
  ([^EmbeddedRungeKuttaIntegrator this ^org.apache.commons.math4.ode.ExpandableStatefulODE equations ^Double t]
    (-> this (.integrate equations t))))

(defn get-min-reduction
  "Get the minimal reduction factor for stepsize control.

  returns: minimal reduction factor - `double`"
  (^Double [^EmbeddedRungeKuttaIntegrator this]
    (-> this (.getMinReduction))))

(defn set-min-reduction
  "Set the minimal reduction factor for stepsize control.

  min-reduction - minimal reduction factor - `double`"
  ([^EmbeddedRungeKuttaIntegrator this ^Double min-reduction]
    (-> this (.setMinReduction min-reduction))))

(defn get-max-growth
  "Get the maximal growth factor for stepsize control.

  returns: maximal growth factor - `double`"
  (^Double [^EmbeddedRungeKuttaIntegrator this]
    (-> this (.getMaxGrowth))))

(defn set-max-growth
  "Set the maximal growth factor for stepsize control.

  max-growth - maximal growth factor - `double`"
  ([^EmbeddedRungeKuttaIntegrator this ^Double max-growth]
    (-> this (.setMaxGrowth max-growth))))

