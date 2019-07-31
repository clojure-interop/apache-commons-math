(ns org.apache.commons.math4.util.MathArrays
  "Arrays utilities."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util MathArrays]))

(defn *check-positive
  "Check that all entries of the input array are strictly positive.

  in - Array to be tested - `double[]`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if any entries of the array are not strictly positive."
  ([in]
    (MathArrays/checkPositive in)))

(defn *sort-in-place
  "Sort an array in place and perform the same reordering of entries on
   other arrays.  This method works the same as the other
   sortInPlace method, but
   allows the order of the sort to be provided in the dir
   parameter.

  x - Array to be sorted and used as a pattern for permutation of the other arrays. - `double[]`
  dir - Order direction. - `org.apache.commons.math4.util.MathArrays$OrderDirection`
  y-list - Set of arrays whose permutations of entries will follow those performed on x. - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if any y is not the same size as x."
  ([x ^org.apache.commons.math4.util.MathArrays$OrderDirection dir y-list]
    (MathArrays/sortInPlace x dir y-list))
  ([x y-list]
    (MathArrays/sortInPlace x y-list)))

(defn *check-rectangular
  "Throws DimensionMismatchException if the input array is not rectangular.

  in - array to be tested - `long[][]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if input array is null"
  ([in]
    (MathArrays/checkRectangular in)))

(defn *scale
  "Create a copy of an array scaled by a value.

  val - Scalar. - `double`
  arr - Array to scale. - `double[]`

  returns: scaled copy of array with each entry multiplied by val. - `double[]`"
  ([^Double val arr]
    (MathArrays/scale val arr)))

(defn *cos-angle
  "Calculates the cosine of the angle between two vectors.

  v-1 - Cartesian coordinates of the first vector. - `double[]`
  v-2 - Cartesian coordinates of the second vector. - `double[]`

  returns: the cosine of the angle between the vectors. - `double`"
  (^Double [v-1 v-2]
    (MathArrays/cosAngle v-1 v-2)))

(defn *distance-inf
  "Calculates the L∞ (max of abs) distance between two points.

  p-1 - the first point - `double[]`
  p-2 - the second point - `double[]`

  returns: the L∞ distance between the two points - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  (^Double [p-1 p-2]
    (MathArrays/distanceInf p-1 p-2)))

(defn *natural
  "Returns an array representing the natural number n.

  n - Natural number. - `int`

  returns: an array whose entries are the numbers 0, 1, ..., n-1.
   If n == 0, the returned array is empty. - `int[]`"
  ([^Integer n]
    (MathArrays/natural n)))

(defn *distance-1
  "Calculates the L1 (sum of abs) distance between two points.

  p-1 - the first point - `double[]`
  p-2 - the second point - `double[]`

  returns: the L1 distance between the two points - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  (^Double [p-1 p-2]
    (MathArrays/distance1 p-1 p-2)))

(defn *is-monotonic
  "Check that an array is monotonically increasing or decreasing.

  val - Values. - `T[]`
  dir - Ordering direction. - `org.apache.commons.math4.util.MathArrays$OrderDirection`
  strict - Whether the order should be strict. - `boolean`

  returns: true if sorted, false otherwise. - `<T extends java.lang.Comparable<? super T>> boolean`"
  ([val ^org.apache.commons.math4.util.MathArrays$OrderDirection dir ^Boolean strict]
    (MathArrays/isMonotonic val dir strict)))

(defn *safe-norm
  "Returns the Cartesian norm (2-norm), handling both overflow and underflow.
   Translation of the minpack enorm subroutine.

   The redistribution policy for MINPACK is available
   here, for
   convenience, it is reproduced below.



      Minpack Copyright Notice (1999) University of Chicago.
      All rights reserved


   Redistribution and use in source and binary forms, with or without
   modification, are permitted provided that the following conditions
   are met:

    Redistributions of source code must retain the above copyright
        notice, this list of conditions and the following disclaimer.
   Redistributions in binary form must reproduce the above
       copyright notice, this list of conditions and the following
       disclaimer in the documentation and/or other materials provided
       with the distribution.
   The end-user documentation included with the redistribution, if any,
       must include the following acknowledgment:
       This product includes software developed by the University of
             Chicago, as Operator of Argonne National Laboratory.
       Alternately, this acknowledgment may appear in the software itself,
       if and wherever such third-party acknowledgments normally appear.
   WARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"
       WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE
       UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND
       THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR
       IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES
       OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE
       OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY
       OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR
       USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF
       THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)
       DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION
       UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL
       BE CORRECTED.
   LIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT
       HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF
       ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,
       INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF
       ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF
       PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER
       SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT
       (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,
       EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE
       POSSIBILITY OF SUCH LOSS OR DAMAGES.

  v - Vector of doubles. - `double[]`

  returns: the 2-norm of the vector. - `double`"
  (^Double [v]
    (MathArrays/safeNorm v)))

(defn *ebe-add
  "Creates an array whose contents will be the element-by-element
   addition of the arguments.

  a - First term of the addition. - `double[]`
  b - Second term of the addition. - `double[]`

  returns: a new array r where r[i] = a[i]  b[i]. - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  ([a b]
    (MathArrays/ebeAdd a b)))

(defn *shuffle
  "Shuffle the entries of the given array, using the

   Fisher–Yates algorithm.
   The start and pos parameters select which portion
   of the array is randomized and which is left untouched.

  list - Array whose entries will be shuffled (in-place). - `int[]`
  start - Index at which shuffling begins. - `int`
  pos - Shuffling is performed for index positions between start and either the end (if MathArrays.Position.TAIL) or the beginning (if MathArrays.Position.HEAD) of the array. - `org.apache.commons.math4.util.MathArrays$Position`
  rng - Random number generator. - `org.apache.commons.rng.UniformRandomProvider`"
  ([list ^Integer start ^org.apache.commons.math4.util.MathArrays$Position pos ^org.apache.commons.rng.UniformRandomProvider rng]
    (MathArrays/shuffle list start pos rng))
  ([list ^Integer start ^org.apache.commons.math4.util.MathArrays$Position pos]
    (MathArrays/shuffle list start pos))
  ([list ^org.apache.commons.rng.UniformRandomProvider rng]
    (MathArrays/shuffle list rng))
  ([list]
    (MathArrays/shuffle list)))

(defn *check-not-na-n
  "Check that no entry of the input array is NaN.

  in - Array to be tested. - `double[]`

  throws: org.apache.commons.math4.exception.NotANumberException - if an entry is NaN."
  ([in]
    (MathArrays/checkNotNaN in)))

(defn *build-array
  "Build a double dimension  array of elements.

   Arrays are filled with field.getZero()

  field - field to which array elements belong - `org.apache.commons.math4.Field`
  rows - number of rows in the array - `int`
  columns - number of columns (may be negative to build partial arrays in the same way new Field[rows][] works) - `int`

  returns: a new array - `<T> T[][]`"
  ([^org.apache.commons.math4.Field field ^Integer rows ^Integer columns]
    (MathArrays/buildArray field rows columns))
  ([^org.apache.commons.math4.Field field ^Integer length]
    (MathArrays/buildArray field length)))

(defn *sequence
  "Returns an array of size integers starting at start,
   skipping stride numbers.

  size - Natural number. - `int`
  start - Natural number. - `int`
  stride - Natural number. - `int`

  returns: an array whose entries are the numbers
   start, start  stride, ..., start  (size - 1) * stride.
   If size == 0, the returned array is empty. - `int[]`"
  ([^Integer size ^Integer start ^Integer stride]
    (MathArrays/sequence size start stride)))

(defn *check-order
  "Check that the given array is sorted.

  val - Values. - `double[]`
  dir - Ordering direction. - `org.apache.commons.math4.util.MathArrays$OrderDirection`
  strict - Whether the order should be strict. - `boolean`
  abort - Whether to throw an exception if the check fails. - `boolean`

  returns: true if the array is sorted. - `boolean`

  throws: org.apache.commons.math4.exception.NonMonotonicSequenceException - if the array is not sorted and abort is true."
  (^Boolean [val ^org.apache.commons.math4.util.MathArrays$OrderDirection dir ^Boolean strict ^Boolean abort]
    (MathArrays/checkOrder val dir strict abort))
  ([val ^org.apache.commons.math4.util.MathArrays$OrderDirection dir ^Boolean strict]
    (MathArrays/checkOrder val dir strict))
  ([val]
    (MathArrays/checkOrder val)))

(defn *ebe-subtract
  "Creates an array whose contents will be the element-by-element
   subtraction of the second argument from the first.

  a - First term. - `double[]`
  b - Element to be subtracted. - `double[]`

  returns: a new array r where r[i] = a[i] - b[i]. - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  ([a b]
    (MathArrays/ebeSubtract a b)))

(defn *distance
  "Calculates the L2 (Euclidean) distance between two points.

  p-1 - the first point - `double[]`
  p-2 - the second point - `double[]`

  returns: the L2 distance between the two points - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  (^Double [p-1 p-2]
    (MathArrays/distance p-1 p-2)))

(defn *normalize-array
  "Normalizes an array to make it sum to a specified value.
   Returns the result of the transformation


      x |-> x * normalizedSum / sum
   applied to each non-NaN element x of the input array, where sum is the
   sum of the non-NaN entries in the input array.

   Throws IllegalArgumentException if normalizedSum is infinite
   or NaN and ArithmeticException if the input array contains any infinite elements
   or sums to 0.

   Ignores (i.e., copies unchanged to the output array) NaNs in the input array.

  values - Input array to be normalized - `double[]`
  normalized-sum - Target sum for the normalized array - `double`

  returns: the normalized array. - `double[]`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the input array contains infinite elements or sums to zero."
  ([values ^Double normalized-sum]
    (MathArrays/normalizeArray values normalized-sum)))

(defn *ebe-divide
  "Creates an array whose contents will be the element-by-element
   division of the first argument by the second.

  a - Numerator of the division. - `double[]`
  b - Denominator of the division. - `double[]`

  returns: a new array r where r[i] = a[i] / b[i]. - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  ([a b]
    (MathArrays/ebeDivide a b)))

(defn *check-equal-length
  "Check that both arrays have the same length.

  a - Array. - `double[]`
  b - Array. - `double[]`
  abort - Whether to throw an exception if the check fails. - `boolean`

  returns: true if the arrays have the same length. - `boolean`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the lengths differ and abort is true."
  (^Boolean [a b ^Boolean abort]
    (MathArrays/checkEqualLength a b abort))
  ([a b]
    (MathArrays/checkEqualLength a b)))

(defn *ebe-multiply
  "Creates an array whose contents will be the element-by-element
   multiplication of the arguments.

  a - First factor of the multiplication. - `double[]`
  b - Second factor of the multiplication. - `double[]`

  returns: a new array r where r[i] = a[i] * b[i]. - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the array lengths differ."
  ([a b]
    (MathArrays/ebeMultiply a b)))

(defn *copy-of
  "Creates a copy of the source array.

  source - Array to be copied. - `int[]`
  len - Number of entries to copy. If smaller then the source length, the copy will be truncated, if larger it will padded with zeroes. - `int`

  returns: the copied array. - `int[]`"
  ([source ^Integer len]
    (MathArrays/copyOf source len))
  ([source]
    (MathArrays/copyOf source)))

(defn *convolve
  "Calculates the
   convolution between two sequences.

   The solution is obtained via straightforward computation of the
   convolution sum (and not via FFT). Whenever the computation needs
   an element that would be located at an index outside the input arrays,
   the value is assumed to be zero.

  x - First sequence. Typically, this sequence will represent an input signal to a system. - `double[]`
  h - Second sequence. Typically, this sequence will represent the impulse response of the system. - `double[]`

  returns: the convolution of x and h.
   This array's length will be x.length  h.length - 1. - `double[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if either x or h is null."
  ([x h]
    (MathArrays/convolve x h)))

(defn *equals-including-na-n
  "Returns true iff both arguments are null or have same dimensions and all
   their elements are equal as defined by
   this method.

  x - first array - `float[]`
  y - second array - `float[]`

  returns: true if the values are both null or have same dimension and
   equal elements - `boolean`"
  (^Boolean [x y]
    (MathArrays/equalsIncludingNaN x y)))

(defn *scale-in-place
  "Multiply each element of an array by a value.

   The array is modified in place (no copy is created).

  val - Scalar - `double`
  arr - Array to scale - `double[]`"
  ([^Double val arr]
    (MathArrays/scaleInPlace val arr)))

(defn *copy-of-range
  "Creates a copy of the source array.

  source - Array to be copied. - `double[]`
  from - Initial index of the range to be copied, inclusive. - `int`
  to - Final index of the range to be copied, exclusive. (This index may lie outside the array.) - `int`

  returns: the copied array. - `double[]`"
  ([source ^Integer from ^Integer to]
    (MathArrays/copyOfRange source from to)))

(defn *equals
  "Returns true iff both arguments are null or have same dimensions and all
   their elements are equal as defined by
   Precision.equals(float,float).

  x - first array - `float[]`
  y - second array - `float[]`

  returns: true if the values are both null or have same dimension
   and equal elements. - `boolean`"
  (^Boolean [x y]
    (MathArrays/equals x y)))

(defn *check-non-negative
  "Check that all entries of the input array are >= 0.

  in - Array to be tested - `long[]`

  throws: org.apache.commons.math4.exception.NotPositiveException - if any array entries are less than 0."
  ([in]
    (MathArrays/checkNonNegative in)))

(defn *verify-values
  "This method is used
   to verify that the input parameters designate a subarray of positive length.


   returns true iff the parameters designate a subarray of
   positive length
   throws MathIllegalArgumentException if the array is null or
   or the indices are invalid
   returns false if the array is non-null, but
   length is 0.

  values - `double[]`
  begin - `int`
  length - `int`

  returns: `boolean`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException"
  (^Boolean [values ^Integer begin ^Integer length]
    (MathArrays/verifyValues values begin length)))

(defn *linear-combination
  "Compute a linear combination accurately.

   This method computes a1×b1
   a2×b2  a3×b3
   a4×b4
   to high accuracy. It does so by using specific multiplication and
   addition algorithms to preserve accuracy and reduce cancellation effects.
   It is based on the 2005 paper
   Accurate Sum and Dot Product by Takeshi Ogita,
   Siegfried M. Rump, and Shin'ichi Oishi published in SIAM J. Sci. Comput.

  a-1 - first factor of the first term - `double`
  b-1 - second factor of the first term - `double`
  a-2 - first factor of the second term - `double`
  b-2 - second factor of the second term - `double`
  a-3 - first factor of the third term - `double`
  b-3 - second factor of the third term - `double`
  a-4 - first factor of the third term - `double`
  b-4 - second factor of the third term - `double`

  returns: a1×b1
   a2×b2  a3×b3
   a4×b4 - `double`"
  (^Double [^Double a-1 ^Double b-1 ^Double a-2 ^Double b-2 ^Double a-3 ^Double b-3 ^Double a-4 ^Double b-4]
    (MathArrays/linearCombination a-1 b-1 a-2 b-2 a-3 b-3 a-4 b-4))
  (^Double [^Double a-1 ^Double b-1 ^Double a-2 ^Double b-2 ^Double a-3 ^Double b-3]
    (MathArrays/linearCombination a-1 b-1 a-2 b-2 a-3 b-3))
  (^Double [^Double a-1 ^Double b-1 ^Double a-2 ^Double b-2]
    (MathArrays/linearCombination a-1 b-1 a-2 b-2))
  (^Double [a b]
    (MathArrays/linearCombination a b)))

