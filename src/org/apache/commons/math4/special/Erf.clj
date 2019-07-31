(ns org.apache.commons.math4.special.Erf
  "This is a utility class that provides computation methods related to the
  error functions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.special Erf]))

(defn *erf
  "Returns the difference between erf(x1) and erf(x2).

   The implementation uses either erf(double) or erfc(double)
   depending on which provides the most precise result.

  x-1 - the first value - `double`
  x-2 - the second value - `double`

  returns: erf(x2) - erf(x1) - `double`"
  (^Double [^Double x-1 ^Double x-2]
    (Erf/erf x-1 x-2))
  (^Double [^Double x]
    (Erf/erf x)))

(defn *erfc
  "Returns the complementary error function.

   erfc(x) = 2/√π x∫∞ e-t2dt

      = 1 - erf(x)

   This implementation computes erfc(x) using the
   regularized gamma function,
   following  Erf, equation (3).

   The value returned is always between 0 and 2 (inclusive).
   If abs(x) > 40, then erf(x) is indistinguishable from
   either 0 or 2 as a double, so the appropriate extreme value is returned.

  x - the value - `double`

  returns: the complementary error function erfc(x) - `double`

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the algorithm fails to converge."
  (^Double [^Double x]
    (Erf/erfc x)))

(defn *erf-inv
  "Returns the inverse erf.

   This implementation is described in the paper:
   Approximating
   the erfinv function by Mike Giles, Oxford-Man Institute of Quantitative Finance,
   which was published in GPU Computing Gems, volume 2, 2010.
   The source code is available here.

  x - the value - `double`

  returns: t such that x = erf(t) - `double`"
  (^Double [^Double x]
    (Erf/erfInv x)))

(defn *erfc-inv
  "Returns the inverse erfc.

  x - the value - `double`

  returns: t such that x = erfc(t) - `double`"
  (^Double [^Double x]
    (Erf/erfcInv x)))

