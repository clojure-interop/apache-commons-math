(ns org.apache.commons.math4.special.BesselJ$BesselJResult
  "Encapsulates the results returned by BesselJ.rjBesl(double, double, int).

  getVals() returns the computed function values.
  getnVals() is the number of values among those returned by getnVals()
  that can be considered accurate.


  nVals < 0: An argument is out of range. For example, nb <= 0, alpha
  < 0 or > 1, or x is too large. In this case, b(0) is set to zero, the
  remainder of the b-vector is not calculated, and nVals is set to
  MIN(nb,0) - 1 so that nVals != nb.
  nb > nVals > 0: Not all requested function values could be calculated
  accurately. This usually occurs because nb is much larger than abs(x). In
  this case, b(n) is calculated to the desired accuracy for n < nVals, but
  precision is lost for nVals < n <= nb. If b(n) does not vanish for n >
  nVals (because it is too small to be represented), and b(n)/b(nVals) =
  \\(10^{-k}\\), then only the first NSIG-k significant figures of b(n) can be
  trusted."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.special BesselJ$BesselJResult]))

(defn ->bessel-j-result
  "Constructor.

  Create a new BesselJResult with the given values and valid value count.

  b - values - `double[]`
  n - count of valid values - `int`"
  (^BesselJ$BesselJResult [b ^Integer n]
    (new BesselJ$BesselJResult b n)))

(defn get-vals
  "returns: the computed function values - `double[]`"
  ([^BesselJ$BesselJResult this]
    (-> this (.getVals))))

(defn getn-vals
  "returns: the number of valid function values (normally the same as the
           length of the array returned by getnVals()) - `int`"
  (^Integer [^BesselJ$BesselJResult this]
    (-> this (.getnVals))))

