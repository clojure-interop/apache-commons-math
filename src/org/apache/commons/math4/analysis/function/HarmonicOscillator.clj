(ns org.apache.commons.math4.analysis.function.HarmonicOscillator
  "  simple harmonic oscillator function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.function HarmonicOscillator]))

(defn ->harmonic-oscillator
  "Constructor.

  Harmonic oscillator function.

  amplitude - Amplitude. - `double`
  omega - Angular frequency. - `double`
  phase - Phase. - `double`"
  (^HarmonicOscillator [^Double amplitude ^Double omega ^Double phase]
    (new HarmonicOscillator amplitude omega phase)))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `double`

  returns: the value of the function. - `double`"
  (^Double [^HarmonicOscillator this ^Double x]
    (-> this (.value x))))

