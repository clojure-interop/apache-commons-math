(ns org.apache.commons.math4.linear.ArrayRealVector
  "This class implements the RealVector interface with a double array."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear ArrayRealVector]))

(defn ->array-real-vector
  "Constructor.

  Construct a vector from part of a array.

  d - Array. - `double[]`
  pos - Position of first entry. - `int`
  size - Number of entries to copy. - `int`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^ArrayRealVector [d ^Integer pos ^Integer size]
    (new ArrayRealVector d pos size))
  (^ArrayRealVector [^Integer size ^Double preset]
    (new ArrayRealVector size preset))
  (^ArrayRealVector [^Integer size]
    (new ArrayRealVector size))
  (^ArrayRealVector []
    (new ArrayRealVector )))

(defn map
  "Acts as if implemented as:


    return copy().mapToSelf(function);
   Returns a new vector. Does not change instance data.

  function - Function to apply to each entry. - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: a new vector. - `org.apache.commons.math4.linear.ArrayRealVector`"
  (^org.apache.commons.math4.linear.ArrayRealVector [^ArrayRealVector this ^org.apache.commons.math4.analysis.UnivariateFunction function]
    (-> this (.map function))))

(defn copy
  "Returns a (deep) copy of this vector.

  returns: a vector copy. - `org.apache.commons.math4.linear.ArrayRealVector`"
  (^org.apache.commons.math4.linear.ArrayRealVector [^ArrayRealVector this]
    (-> this (.copy))))

(defn map-divide-to-self
  "Divide each entry by the argument.
   The instance is changed in-place.

  d - Value to divide by. - `double`

  returns: this. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^ArrayRealVector this ^Double d]
    (-> this (.mapDivideToSelf d))))

(defn get-distance
  "Distance between two vectors.
   This method computes the distance consistent with the
   L2 norm, i.e. the square root of the sum of
   element differences, or Euclidean distance.

  v - Vector to which distance is requested. - `org.apache.commons.math4.linear.RealVector`

  returns: the distance between two vectors. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^Double [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.getDistance v))))

(defn get-entry
  "Return the entry at the specified index.

  index - Index location of entry to be fetched. - `int`

  returns: the vector entry at index. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  (^Double [^ArrayRealVector this ^Integer index]
    (-> this (.getEntry index))))

(defn dot-product
  "Compute the dot product of this vector with v.

  v - Vector with which dot product should be computed - `org.apache.commons.math4.linear.RealVector`

  returns: the scalar dot product between this instance and v. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^Double [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.dotProduct v))))

(defn get-data-ref
  "Get a reference to the underlying data array.
   This method does not make a fresh copy of the underlying data.

  returns: the array of entries. - `double[]`"
  ([^ArrayRealVector this]
    (-> this (.getDataRef))))

(defn get-sub-vector
  "Get a subvector from consecutive elements.

  index - index of first element. - `int`
  n - number of elements to be retrieved. - `int`

  returns: a vector containing n elements. - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  (^org.apache.commons.math4.linear.RealVector [^ArrayRealVector this ^Integer index ^Integer n]
    (-> this (.getSubVector index n))))

(defn walk-in-optimized-order
  "Visits (but does not alter) some entries of this vector in optimized
   order. The order in which the entries are visited is selected so as to
   lead to the most efficient implementation; it might depend on the
   concrete implementation of this abstract class.

   In this implementation, the optimized order is the default order.

  visitor - visitor to be used to process the entries of this vector - `org.apache.commons.math4.linear.RealVectorPreservingVisitor`
  start - the index of the first entry to be visited - `int`
  end - the index of the last entry to be visited (inclusive) - `int`

  returns: the value returned by RealVectorPreservingVisitor.end()
   at the end of the walk - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if end < start."
  (^Double [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVectorPreservingVisitor visitor ^Integer start ^Integer end]
    (-> this (.walkInOptimizedOrder visitor start end)))
  (^Double [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVectorPreservingVisitor visitor]
    (-> this (.walkInOptimizedOrder visitor))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ArrayRealVector this]
    (-> this (.toString))))

(defn get-dimension
  "Returns the size of the vector.

  returns: the size of this vector. - `int`"
  (^Integer [^ArrayRealVector this]
    (-> this (.getDimension))))

(defn get-l-1-distance
  "Distance between two vectors.
   This method computes the distance consistent with
   L1 norm, i.e. the sum of the absolute values of
   the elements differences.

  v - Vector to which distance is requested. - `org.apache.commons.math4.linear.RealVector`

  returns: the distance between two vectors. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^Double [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.getL1Distance v))))

(defn get-l-inf-norm
  "Returns the L∞ norm of the vector.
   The L∞ norm is the max of the absolute
   values of the elements.

  returns: the norm. - `double`"
  (^Double [^ArrayRealVector this]
    (-> this (.getLInfNorm))))

(defn map-multiply-to-self
  "Multiply each entry.
   The instance is changed in-place.

  d - Multiplication factor. - `double`

  returns: this. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^ArrayRealVector this ^Double d]
    (-> this (.mapMultiplyToSelf d))))

(defn infinite?
  "Check whether any coordinate of this vector is infinite and none
   are NaN.

  returns: true if any coordinate of this vector is infinite and
   none are NaN, false otherwise. - `boolean`"
  (^Boolean [^ArrayRealVector this]
    (-> this (.isInfinite))))

(defn combine-to-self
  "Updates this with the linear combination of this and
   y.

  a - Weight of this. - `double`
  b - Weight of y. - `double`
  y - Vector with which this is linearly combined. - `org.apache.commons.math4.linear.RealVector`

  returns: this, with components equal to
   a * this[i]  b * y[i] for all i. - `org.apache.commons.math4.linear.ArrayRealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if y is not the same size as this vector."
  (^org.apache.commons.math4.linear.ArrayRealVector [^ArrayRealVector this ^Double a ^Double b ^org.apache.commons.math4.linear.RealVector y]
    (-> this (.combineToSelf a b y))))

(defn subtract
  "Subtract v from this vector.
   Returns a new vector. Does not change instance data.

  v - Vector to be subtracted. - `org.apache.commons.math4.linear.RealVector`

  returns: this - v. - `org.apache.commons.math4.linear.ArrayRealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^org.apache.commons.math4.linear.ArrayRealVector [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.subtract v))))

(defn walk-in-default-order
  "Visits (but does not alter) some entries of this vector in default order
   (increasing index).

  visitor - visitor to be used to process the entries of this vector - `org.apache.commons.math4.linear.RealVectorPreservingVisitor`
  start - the index of the first entry to be visited - `int`
  end - the index of the last entry to be visited (inclusive) - `int`

  returns: the value returned by RealVectorPreservingVisitor.end()
   at the end of the walk - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if end < start."
  (^Double [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVectorPreservingVisitor visitor ^Integer start ^Integer end]
    (-> this (.walkInDefaultOrder visitor start end)))
  (^Double [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVectorPreservingVisitor visitor]
    (-> this (.walkInDefaultOrder visitor))))

(defn outer-product
  "Compute the outer product.

  v - Vector with which outer product should be computed. - `org.apache.commons.math4.linear.RealVector`

  returns: the matrix outer product between this instance and v. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.outerProduct v))))

(defn map-to-self
  "Acts as if it is implemented as:


    Entry e = null;
    for(Iterator it = iterator(); it.hasNext(); e = it.next()) {
        e.setValue(function.value(e.getValue()));
    }
   Entries of this vector are modified in-place by this method.

  function - Function to apply to each entry. - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: a reference to this vector. - `org.apache.commons.math4.linear.ArrayRealVector`"
  (^org.apache.commons.math4.linear.ArrayRealVector [^ArrayRealVector this ^org.apache.commons.math4.analysis.UnivariateFunction function]
    (-> this (.mapToSelf function))))

(defn get-norm
  "Returns the L2 norm of the vector.
   The L2 norm is the root of the sum of
   the squared elements.

  returns: the norm. - `double`"
  (^Double [^ArrayRealVector this]
    (-> this (.getNorm))))

(defn na-n?
  "Check if any coordinate of this vector is NaN.

  returns: true if any coordinate of this vector is NaN,
   false otherwise. - `boolean`"
  (^Boolean [^ArrayRealVector this]
    (-> this (.isNaN))))

(defn ebe-divide
  "Element-by-element division.

  v - Vector by which instance elements must be divided. - `org.apache.commons.math4.linear.RealVector`

  returns: a vector containing this[i] / v[i] for all i. - `org.apache.commons.math4.linear.ArrayRealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^org.apache.commons.math4.linear.ArrayRealVector [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.ebeDivide v))))

(defn set-entry
  "Set a single element.

  index - element index. - `int`
  value - new value for the element. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  ([^ArrayRealVector this ^Integer index ^Double value]
    (-> this (.setEntry index value))))

(defn append
  "Construct a new vector by appending a vector to this vector.

  v - vector to append to this one. - `org.apache.commons.math4.linear.RealVector`

  returns: a new vector. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.append v))))

(defn add-to-entry
  "Change an entry at the specified index.

  index - Index location of entry to be set. - `int`
  increment - Value to add to the vector entry. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  ([^ArrayRealVector this ^Integer index ^Double increment]
    (-> this (.addToEntry index increment))))

(defn hash-code
  ". This method must be overriden by concrete
   subclasses of RealVector (current implementation throws an
   exception). All NaN values have the same hash code.

  returns: `int`"
  (^Integer [^ArrayRealVector this]
    (-> this (.hashCode))))

(defn ebe-multiply
  "Element-by-element multiplication.

  v - Vector by which instance elements must be multiplied - `org.apache.commons.math4.linear.RealVector`

  returns: a vector containing this[i] * v[i] for all i. - `org.apache.commons.math4.linear.ArrayRealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^org.apache.commons.math4.linear.ArrayRealVector [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.ebeMultiply v))))

(defn add
  "Compute the sum of this vector and v.
   Returns a new vector. Does not change instance data.

  v - Vector to be added. - `org.apache.commons.math4.linear.RealVector`

  returns: this  v. - `org.apache.commons.math4.linear.ArrayRealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^org.apache.commons.math4.linear.ArrayRealVector [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.add v))))

(defn set-sub-vector
  "Set a sequence of consecutive elements.

  index - index of first element to be set. - `int`
  v - vector containing the values to set. - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  ([^ArrayRealVector this ^Integer index ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.setSubVector index v))))

(defn set
  "Set all elements to a single value.

  value - Single value to set for all elements. - `double`"
  ([^ArrayRealVector this ^Double value]
    (-> this (.set value))))

(defn get-l-1-norm
  "Returns the L1 norm of the vector.
   The L1 norm is the sum of the absolute
   values of the elements.

  returns: the norm. - `double`"
  (^Double [^ArrayRealVector this]
    (-> this (.getL1Norm))))

(defn to-array
  "Convert the vector to an array of doubles.
   The array is independent from this vector data: the elements
   are copied.

  returns: an array containing a copy of the vector elements. - `double[]`"
  ([^ArrayRealVector this]
    (-> this (.toArray))))

(defn combine
  "Returns a new vector representing a * this  b * y, the linear
   combination of this and y.
   Returns a new vector. Does not change instance data.

  a - Coefficient of this. - `double`
  b - Coefficient of y. - `double`
  y - Vector with which this is linearly combined. - `org.apache.commons.math4.linear.RealVector`

  returns: a vector containing a * this[i]  b * y[i] for all
   i. - `org.apache.commons.math4.linear.ArrayRealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if y is not the same size as this vector."
  (^org.apache.commons.math4.linear.ArrayRealVector [^ArrayRealVector this ^Double a ^Double b ^org.apache.commons.math4.linear.RealVector y]
    (-> this (.combine a b y))))

(defn equals
  "Test for the equality of two real vectors. If all coordinates of two real
   vectors are exactly the same, and none are NaN, the two real
   vectors are considered to be equal. NaN coordinates are
   considered to affect globally the vector and be equals to each other -
   i.e, if either (or all) coordinates of the real vector are equal to
   NaN, the real vector is equal to a vector with all NaN
   coordinates.


   This method must be overriden by concrete subclasses of
   RealVector (the current implementation throws an exception).

  other - Object to test for equality. - `java.lang.Object`

  returns: true if two vector objects are equal, false if
   other is null, not an instance of RealVector, or
   not equal to this RealVector instance. - `boolean`"
  (^Boolean [^ArrayRealVector this ^java.lang.Object other]
    (-> this (.equals other))))

(defn map-add-to-self
  "Add a value to each entry.
   The instance is changed in-place.

  d - Value to be added to each entry. - `double`

  returns: this. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^ArrayRealVector this ^Double d]
    (-> this (.mapAddToSelf d))))

(defn map-subtract-to-self
  "Subtract a value from each entry.
   The instance is changed in-place.

  d - Value to be subtracted. - `double`

  returns: this. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^ArrayRealVector this ^Double d]
    (-> this (.mapSubtractToSelf d))))

(defn get-l-inf-distance
  "Distance between two vectors.
   This method computes the distance consistent with
   L∞ norm, i.e. the max of the absolute values of
   element differences.

  v - Vector to which distance is requested. - `org.apache.commons.math4.linear.RealVector`

  returns: the distance between two vectors. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^Double [^ArrayRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.getLInfDistance v))))

