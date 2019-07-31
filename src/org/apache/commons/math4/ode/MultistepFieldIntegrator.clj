(ns org.apache.commons.math4.ode.MultistepFieldIntegrator
  "This class is the base class for multistep integrators for Ordinary
  Differential Equations.
  We define scaled derivatives si(n) at step n as:


  s1(n) = h y'n for first derivative
  s2(n) = h2/2 y''n for second derivative
  s3(n) = h3/6 y'''n for third derivative
  ...
  sk(n) = hk/k! y(k)n for kth derivative
  Rather than storing several previous steps separately, this implementation uses
  the Nordsieck vector with higher degrees scaled derivatives all taken at the same
  step (yn, s1(n) and rn) where rn is defined as:


  rn = [ s2(n), s3(n) ... sk(n) ]T
  (we omit the k index in the notation for clarity)

  Multistep integrators with Nordsieck representation are highly sensitive to
  large step changes because when the step is multiplied by factor a, the
  kth component of the Nordsieck vector is multiplied by ak
  and the last components are the least accurate ones. The default max growth
  factor is therefore set to a quite low value: 21/order."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode MultistepFieldIntegrator]))

(defn get-max-growth
  "Get the maximal growth factor for stepsize control.

  returns: maximal growth factor - `double`"
  (^Double [^MultistepFieldIntegrator this]
    (-> this (.getMaxGrowth))))

(defn set-starter-integrator
  "Set the starter integrator.
   The various step and event handlers for this starter integrator
   will be managed automatically by the multi-step integrator. Any
   user configuration for these elements will be cleared before use.

  starter-integrator - starter integrator - `org.apache.commons.math4.ode.FirstOrderFieldIntegrator`"
  ([^MultistepFieldIntegrator this ^org.apache.commons.math4.ode.FirstOrderFieldIntegrator starter-integrator]
    (-> this (.setStarterIntegrator starter-integrator))))

(defn get-starter-integrator
  "Get the starter integrator.

  returns: starter integrator - `org.apache.commons.math4.ode.FirstOrderFieldIntegrator<T>`"
  (^org.apache.commons.math4.ode.FirstOrderFieldIntegrator [^MultistepFieldIntegrator this]
    (-> this (.getStarterIntegrator))))

(defn get-min-reduction
  "Get the minimal reduction factor for stepsize control.

  returns: minimal reduction factor - `double`"
  (^Double [^MultistepFieldIntegrator this]
    (-> this (.getMinReduction))))

(defn set-min-reduction
  "Set the minimal reduction factor for stepsize control.

  min-reduction - minimal reduction factor - `double`"
  ([^MultistepFieldIntegrator this ^Double min-reduction]
    (-> this (.setMinReduction min-reduction))))

(defn get-n-steps
  "Get the number of steps of the multistep method (excluding the one being computed).

  returns: number of steps of the multistep method (excluding the one being computed) - `int`"
  (^Integer [^MultistepFieldIntegrator this]
    (-> this (.getNSteps))))

(defn set-max-growth
  "Set the maximal growth factor for stepsize control.

  max-growth - maximal growth factor - `double`"
  ([^MultistepFieldIntegrator this ^Double max-growth]
    (-> this (.setMaxGrowth max-growth))))

(defn set-safety
  "Set the safety factor for stepsize control.

  safety - safety factor - `double`"
  ([^MultistepFieldIntegrator this ^Double safety]
    (-> this (.setSafety safety))))

(defn get-safety
  "Get the safety factor for stepsize control.

  returns: safety factor - `double`"
  (^Double [^MultistepFieldIntegrator this]
    (-> this (.getSafety))))

