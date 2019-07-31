(ns org.apache.commons.math4.fitting.GaussianCurveFitter
  "Fits points to a Gaussian
  function.

  The initial guess values must be passed
  in the following order:

   Normalization
   Mean
   Sigma

  The optimal values will be returned in the same order.


  Usage example:


    WeightedObservedPoints obs = new WeightedObservedPoints();
    obs.add(4.0254623,  531026.0);
    obs.add(4.03128248, 984167.0);
    obs.add(4.03839603, 1887233.0);
    obs.add(4.04421621, 2687152.0);
    obs.add(4.05132976, 3461228.0);
    obs.add(4.05326982, 3580526.0);
    obs.add(4.05779662, 3439750.0);
    obs.add(4.0636168,  2877648.0);
    obs.add(4.06943698, 2175960.0);
    obs.add(4.07525716, 1447024.0);
    obs.add(4.08237071, 717104.0);
    obs.add(4.08366408, 620014.0);
    double[] parameters = GaussianCurveFitter.create().fit(obs.toList());"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting GaussianCurveFitter]))

(defn *create
  "Creates a default curve fitter.
   The initial guess for the parameters will be GaussianCurveFitter.ParameterGuesser
   computed automatically, and the maximum number of iterations of the
   optimization algorithm is set to Integer.MAX_VALUE.

  returns: a curve fitter. - `org.apache.commons.math4.fitting.GaussianCurveFitter`"
  (^org.apache.commons.math4.fitting.GaussianCurveFitter []
    (GaussianCurveFitter/create )))

(defn with-start-point
  "Configure the start point (initial guess).

  new-start - new start point (initial guess) - `double[]`

  returns: a new instance. - `org.apache.commons.math4.fitting.GaussianCurveFitter`"
  (^org.apache.commons.math4.fitting.GaussianCurveFitter [^GaussianCurveFitter this new-start]
    (-> this (.withStartPoint new-start))))

(defn with-max-iterations
  "Configure the maximum number of iterations.

  new-max-iter - maximum number of iterations - `int`

  returns: a new instance. - `org.apache.commons.math4.fitting.GaussianCurveFitter`"
  (^org.apache.commons.math4.fitting.GaussianCurveFitter [^GaussianCurveFitter this ^Integer new-max-iter]
    (-> this (.withMaxIterations new-max-iter))))

