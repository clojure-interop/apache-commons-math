(ns org.apache.commons.math4.ode.MultistepIntegrator$NordsieckTransformer
  "Deprecated.
 as of 3.6 this unused interface is deprecated"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode MultistepIntegrator$NordsieckTransformer]))

(defn initialize-high-order-derivatives
  "Deprecated.

  h - step size to use for scaling - `double`
  t - first steps times - `double[]`
  y - first steps states - `double[][]`
  y-dot - first steps derivatives - `double[][]`

  returns: Nordieck vector at first step (h2/2 y''n,
   h3/6 y'''n ... hk/k! y(k)n) - `org.apache.commons.math4.linear.Array2DRowRealMatrix`"
  (^org.apache.commons.math4.linear.Array2DRowRealMatrix [^MultistepIntegrator$NordsieckTransformer this ^Double h t y y-dot]
    (-> this (.initializeHighOrderDerivatives h t y y-dot))))

