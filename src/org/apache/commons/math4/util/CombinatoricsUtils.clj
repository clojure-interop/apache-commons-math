(ns org.apache.commons.math4.util.CombinatoricsUtils
  "Combinatorial utilities."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util CombinatoricsUtils]))

(defn *binomial-coefficient
  "Returns an exact representation of the  Binomial
   Coefficient, \"n choose k\", the number of
   k-element subsets that can be selected from an
   n-element set.

   Preconditions:

    0 <= k <= n  (otherwise
   MathIllegalArgumentException is thrown)
    The result is small enough to fit into a long. The
   largest value of n for which all coefficients are
   < Long.MAX_VALUE is 66. If the computed value exceeds
   Long.MAX_VALUE a MathArithMeticException is
   thrown.

  n - the size of the set - `int`
  k - the size of the subsets to be counted - `int`

  returns: n choose k - `long`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n < 0."
  (^Long [^Integer n ^Integer k]
    (CombinatoricsUtils/binomialCoefficient n k)))

(defn *stirling-s-2
  "Returns the
   Stirling number of the second kind, \"S(n,k)\", the number of
   ways of partitioning an n-element set into k non-empty
   subsets.

   The preconditions are 0 <= k <= n  (otherwise
   NotPositiveException is thrown)

  n - the size of the set - `int`
  k - the number of non-empty subsets - `int`

  returns: S(n,k) - `long`

  throws: org.apache.commons.math4.exception.NotPositiveException - if k < 0."
  (^Long [^Integer n ^Integer k]
    (CombinatoricsUtils/stirlingS2 n k)))

(defn *factorial-double
  "Compute n!, the
   factorial of n (the product of the numbers 1 to n), as a
   double.
   The result should be small enough to fit into a double: The
   largest n for which n! does not exceed
   Double.MAX_VALUE is 170. If the computed value exceeds
   Double.MAX_VALUE, Double.POSITIVE_INFINITY is returned.

  n - Argument. - `int`

  returns: n! - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n < 0."
  (^Double [^Integer n]
    (CombinatoricsUtils/factorialDouble n)))

(defn *check-binomial
  "Check binomial preconditions.

  n - Size of the set. - `int`
  k - Size of the subsets to be counted. - `int`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n < 0."
  ([^Integer n ^Integer k]
    (CombinatoricsUtils/checkBinomial n k)))

(defn *factorial
  "Returns n!. Shorthand for n  Factorial, the
   product of the numbers 1,...,n.

   Preconditions:

    n >= 0 (otherwise
   MathIllegalArgumentException is thrown)
    The result is small enough to fit into a long. The
   largest value of n for which n! does not exceed
   Long.MAX_VALUE} is 20. If the computed value exceeds Long.MAX_VALUE
   an MathArithMeticException  is thrown.

  n - argument - `int`

  returns: n! - `long`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if n > 20: The factorial value is too large to fit in a long."
  (^Long [^Integer n]
    (CombinatoricsUtils/factorial n)))

(defn *binomial-coefficient-log
  "Returns the natural log of the  Binomial
   Coefficient, \"n choose k\", the number of
   k-element subsets that can be selected from an
   n-element set.

   Preconditions:

    0 <= k <= n  (otherwise
   MathIllegalArgumentException is thrown)

  n - the size of the set - `int`
  k - the size of the subsets to be counted - `int`

  returns: n choose k - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n < 0."
  (^Double [^Integer n ^Integer k]
    (CombinatoricsUtils/binomialCoefficientLog n k)))

(defn *combinations-iterator
  "Returns an iterator whose range is the k-element subsets of {0, ..., n - 1}
   represented as int[] arrays.

   The arrays returned by the iterator are sorted in descending order and
   they are visited in lexicographic order with significance from right to
   left. For example, combinationsIterator(4, 2) returns an Iterator that
   will generate the following sequence of arrays on successive calls to
   next():
   [0, 1], [0, 2], [1, 2], [0, 3], [1, 3], [2, 3]

   If k == 0 an Iterator containing an empty array is returned and
   if k == n an Iterator containing [0, ..., n -1] is returned.

  n - Size of the set from which subsets are selected. - `int`
  k - Size of the subsets to be enumerated. - `int`

  returns: an iterator over the k-sets in n. - `java.util.Iterator<int[]>`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n < 0."
  ([^Integer n ^Integer k]
    (CombinatoricsUtils/combinationsIterator n k)))

(defn *binomial-coefficient-double
  "Returns a double representation of the  Binomial
   Coefficient, \"n choose k\", the number of
   k-element subsets that can be selected from an
   n-element set.

   Preconditions:

    0 <= k <= n  (otherwise
   IllegalArgumentException is thrown)
    The result is small enough to fit into a double. The
   largest value of n for which all coefficients are <
   Double.MAX_VALUE is 1029. If the computed value exceeds Double.MAX_VALUE,
   Double.POSITIVE_INFINITY is returned

  n - the size of the set - `int`
  k - the size of the subsets to be counted - `int`

  returns: n choose k - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n < 0."
  (^Double [^Integer n ^Integer k]
    (CombinatoricsUtils/binomialCoefficientDouble n k)))

(defn *factorial-log
  "Compute the natural logarithm of the factorial of n.

  n - Argument. - `int`

  returns: log(n!) - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n < 0."
  (^Double [^Integer n]
    (CombinatoricsUtils/factorialLog n)))

