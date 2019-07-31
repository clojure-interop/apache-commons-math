(ns org.apache.commons.math4.fitting.HarmonicCurveFitter
  "Fits points to a harmonic oscillator
  function.

  The initial guess values must be passed
  in the following order:

   Amplitude
   Angular frequency
   phase

  The optimal values will be returned in the same order."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting HarmonicCurveFitter]))

(defn *create
  "Creates a default curve fitter.
   The initial guess for the parameters will be HarmonicCurveFitter.ParameterGuesser
   computed automatically, and the maximum number of iterations of the
   optimization algorithm is set to Integer.MAX_VALUE.

  returns: a curve fitter. - `org.apache.commons.math4.fitting.HarmonicCurveFitter`"
  (^org.apache.commons.math4.fitting.HarmonicCurveFitter []
    (HarmonicCurveFitter/create )))

(defn with-start-point
  "Configure the start point (initial guess).

  new-start - new start point (initial guess) - `double[]`

  returns: a new instance. - `org.apache.commons.math4.fitting.HarmonicCurveFitter`"
  (^org.apache.commons.math4.fitting.HarmonicCurveFitter [^HarmonicCurveFitter this new-start]
    (-> this (.withStartPoint new-start))))

(defn with-max-iterations
  "Configure the maximum number of iterations.

  new-max-iter - maximum number of iterations - `int`

  returns: a new instance. - `org.apache.commons.math4.fitting.HarmonicCurveFitter`"
  (^org.apache.commons.math4.fitting.HarmonicCurveFitter [^HarmonicCurveFitter this ^Integer new-max-iter]
    (-> this (.withMaxIterations new-max-iter))))

