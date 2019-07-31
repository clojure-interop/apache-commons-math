(ns org.apache.commons.math4.complex.RootsOfUnity
  "A helper class for the computation and caching of the n-th roots of
  unity."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.complex RootsOfUnity]))

(defn ->roots-of-unity
  "Constructor.

  Build an engine for computing the n-th roots of unity."
  (^RootsOfUnity []
    (new RootsOfUnity )))

(defn counter-clock-wise?
  "Returns true if computeRoots(int) was called with a
   positive value of its argument n. If true, then
   counter-clockwise ordering of the roots of unity should be used.

  returns: true if the roots of unity are stored in
   counter-clockwise order - `boolean`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if no roots of unity have been computed yet"
  (^Boolean [^RootsOfUnity this]
    (-> this (.isCounterClockWise))))

(defn compute-roots
  "Computes the n-th roots of unity. The roots are stored in
   omega[], such that omega[k] = w ^ k, where
   k = 0, ..., n - 1, w = exp(2 * pi * i / n) and
   i = sqrt(-1).


   Note that n can be positive of negative


   abs(n) is always the number of roots of unity.
   If n > 0, then the roots are stored in counter-clockwise order.
   If n < 0, then the roots are stored in clockwise order.

  n - the (signed) number of roots of unity to be computed - `int`

  throws: org.apache.commons.math4.exception.ZeroException - if n = 0"
  ([^RootsOfUnity this ^Integer n]
    (-> this (.computeRoots n))))

(defn get-real
  "Get the real part of the k-th n-th root of unity.

  k - index of the n-th root of unity - `int`

  returns: real part of the k-th n-th root of unity - `double`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if no roots of unity have been computed yet"
  (^Double [^RootsOfUnity this ^Integer k]
    (-> this (.getReal k))))

(defn get-imaginary
  "Get the imaginary part of the k-th n-th root of unity.

  k - index of the n-th root of unity - `int`

  returns: imaginary part of the k-th n-th root of unity - `double`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if no roots of unity have been computed yet"
  (^Double [^RootsOfUnity this ^Integer k]
    (-> this (.getImaginary k))))

(defn get-number-of-roots
  "Returns the number of roots of unity currently stored. If
   computeRoots(int) was called with n, then this method
   returns abs(n). If no roots of unity have been computed yet, this
   method returns 0.

  returns: the number of roots of unity currently stored - `int`"
  (^Integer [^RootsOfUnity this]
    (-> this (.getNumberOfRoots))))

