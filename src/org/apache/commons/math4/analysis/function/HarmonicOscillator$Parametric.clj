(ns org.apache.commons.math4.analysis.function.HarmonicOscillator$Parametric
  "Parametric function where the input array contains the parameters of
  the harmonic oscillator function, ordered as follows:

   Amplitude
   Angular frequency
   Phase"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function HarmonicOscillator$Parametric]))

(defn ->parametric
  "Constructor."
  (^HarmonicOscillator$Parametric []
    (new HarmonicOscillator$Parametric )))

(defn value
  "Computes the value of the harmonic oscillator at x.

  x - Value for which the function must be computed. - `double`
  param - Values of norm, mean and standard deviation. - `double`

  returns: the value of the function. - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if param is null."
  (^Double [^HarmonicOscillator$Parametric this ^Double x ^Double param]
    (-> this (.value x param))))

(defn gradient
  "Computes the value of the gradient at x.
   The components of the gradient vector are the partial
   derivatives of the function with respect to each of the
   parameters (amplitude, angular frequency and phase).

  x - Value at which the gradient must be computed. - `double`
  param - Values of amplitude, angular frequency and phase. - `double`

  returns: the gradient vector at x. - `double[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if param is null."
  ([^HarmonicOscillator$Parametric this ^Double x ^Double param]
    (-> this (.gradient x param))))

