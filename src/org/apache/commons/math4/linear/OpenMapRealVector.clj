(ns org.apache.commons.math4.linear.OpenMapRealVector
  "This class implements the RealVector interface with a
  OpenIntToDoubleHashMap backing store.

   Caveat: This implementation assumes that, for any x,
   the equality x * 0d == 0d holds. But it is is not true for
   NaN. Moreover, zero entries will lose their sign.
   Some operations (that involve NaN and/or infinities) may
   thus give incorrect results, like multiplications, divisions or
   functions mapping."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear OpenMapRealVector]))

(defn ->open-map-real-vector
  "Constructor.

  Build a vector with known the sparseness and zero tolerance
   setting (for advanced use only).

  dimension - Size of the vector. - `int`
  expected-size - Expected number of non-zero entries. - `int`
  epsilon - Tolerance below which a value is considered zero. - `double`"
  (^OpenMapRealVector [^Integer dimension ^Integer expected-size ^Double epsilon]
    (new OpenMapRealVector dimension expected-size epsilon))
  (^OpenMapRealVector [^Integer dimension ^Double epsilon]
    (new OpenMapRealVector dimension epsilon))
  (^OpenMapRealVector [^Integer dimension]
    (new OpenMapRealVector dimension))
  (^OpenMapRealVector []
    (new OpenMapRealVector )))

(def *-default-zero-tolerance
  "Static Constant.

  Default Tolerance for having a value considered zero.

  type: double"
  OpenMapRealVector/DEFAULT_ZERO_TOLERANCE)

(defn unitize
  "Converts this vector into a unit vector.
   The instance itself is changed by this method.

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the norm is zero."
  ([^OpenMapRealVector this]
    (-> this (.unitize))))

(defn copy
  "Returns a (deep) copy of this vector.

  returns: a vector copy. - `org.apache.commons.math4.linear.OpenMapRealVector`"
  (^org.apache.commons.math4.linear.OpenMapRealVector [^OpenMapRealVector this]
    (-> this (.copy))))

(defn get-distance
  "Optimized method to compute distance.

  v - Vector to compute distance to. - `org.apache.commons.math4.linear.OpenMapRealVector`

  returns: the distance from this and v. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimensions do not match."
  (^Double [^OpenMapRealVector this ^org.apache.commons.math4.linear.OpenMapRealVector v]
    (-> this (.getDistance v))))

(defn get-entry
  "Return the entry at the specified index.

  index - Index location of entry to be fetched. - `int`

  returns: the vector entry at index. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  (^Double [^OpenMapRealVector this ^Integer index]
    (-> this (.getEntry index))))

(defn map-add
  "Add a value to each entry.
   Returns a new vector. Does not change instance data.

  d - Value to be added to each entry. - `double`

  returns: this  d. - `org.apache.commons.math4.linear.OpenMapRealVector`"
  (^org.apache.commons.math4.linear.OpenMapRealVector [^OpenMapRealVector this ^Double d]
    (-> this (.mapAdd d))))

(defn get-sub-vector
  "Get a subvector from consecutive elements.

  index - index of first element. - `int`
  n - number of elements to be retrieved. - `int`

  returns: a vector containing n elements. - `org.apache.commons.math4.linear.OpenMapRealVector`

  throws: org.apache.commons.math4.exception.NotPositiveException - if the number of elements is not positive."
  (^org.apache.commons.math4.linear.OpenMapRealVector [^OpenMapRealVector this ^Integer index ^Integer n]
    (-> this (.getSubVector index n))))

(defn get-dimension
  "Returns the size of the vector.

  returns: the size of this vector. - `int`"
  (^Integer [^OpenMapRealVector this]
    (-> this (.getDimension))))

(defn get-l-1-distance
  "Distance between two vectors.
   This method computes the distance consistent with
   L1 norm, i.e. the sum of the absolute values of
   elements differences.

  v - Vector to which distance is requested. - `org.apache.commons.math4.linear.OpenMapRealVector`

  returns: distance between this vector and v. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimensions do not match."
  (^Double [^OpenMapRealVector this ^org.apache.commons.math4.linear.OpenMapRealVector v]
    (-> this (.getL1Distance v))))

(defn unit-vector
  "Creates a unit vector pointing in the direction of this vector.
   The instance is not changed by this method.

  returns: a unit vector pointing in direction of this vector. - `org.apache.commons.math4.linear.OpenMapRealVector`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the norm is zero."
  (^org.apache.commons.math4.linear.OpenMapRealVector [^OpenMapRealVector this]
    (-> this (.unitVector))))

(defn infinite?
  "Check whether any coordinate of this vector is infinite and none are NaN.

  returns: true if any coordinate of this vector is infinite and
   none are NaN, false otherwise. - `boolean`"
  (^Boolean [^OpenMapRealVector this]
    (-> this (.isInfinite))))

(defn subtract
  "Optimized method to subtract OpenMapRealVectors.

  v - Vector to subtract from this. - `org.apache.commons.math4.linear.OpenMapRealVector`

  returns: the difference of this and v. - `org.apache.commons.math4.linear.OpenMapRealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimensions do not match."
  (^org.apache.commons.math4.linear.OpenMapRealVector [^OpenMapRealVector this ^org.apache.commons.math4.linear.OpenMapRealVector v]
    (-> this (.subtract v))))

(defn na-n?
  "Check whether any coordinate of this vector is NaN.

  returns: true if any coordinate of this vector is NaN,
   false otherwise. - `boolean`"
  (^Boolean [^OpenMapRealVector this]
    (-> this (.isNaN))))

(defn ebe-divide
  "Element-by-element division.

  v - Vector by which instance elements must be divided. - `org.apache.commons.math4.linear.RealVector`

  returns: a vector containing this[i] / v[i] for all i. - `org.apache.commons.math4.linear.OpenMapRealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^org.apache.commons.math4.linear.OpenMapRealVector [^OpenMapRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.ebeDivide v))))

(defn set-entry
  "Set a single element.

  index - element index. - `int`
  value - new value for the element. - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  ([^OpenMapRealVector this ^Integer index ^Double value]
    (-> this (.setEntry index value))))

(defn append
  "Optimized method to append a OpenMapRealVector.

  v - vector to append - `org.apache.commons.math4.linear.OpenMapRealVector`

  returns: The result of appending v to self - `org.apache.commons.math4.linear.OpenMapRealVector`"
  (^org.apache.commons.math4.linear.OpenMapRealVector [^OpenMapRealVector this ^org.apache.commons.math4.linear.OpenMapRealVector v]
    (-> this (.append v))))

(defn sparse-iterator
  "Create a sparse iterator over the vector, which may omit some entries.
   The ommitted entries are either exact zeroes (for dense implementations)
   or are the entries which are not stored (for real sparse vectors).
   No guarantees are made about order of iteration.

   Note: derived classes are required to return an Iterator that
   returns non-null RealVector.Entry objects as long as Iterator.hasNext()
   returns true.

  returns: a sparse iterator. - `java.util.Iterator<org.apache.commons.math4.linear.RealVector$Entry>`"
  (^java.util.Iterator [^OpenMapRealVector this]
    (-> this (.sparseIterator))))

(defn hash-code
  ". This method must be overriden by concrete
   subclasses of RealVector (current implementation throws an
   exception).
   Implementation Note: This works on exact values, and as a result
   it is possible for a.subtract(b) to be the zero vector, while
   a.hashCode() != b.hashCode().

  returns: `int`"
  (^Integer [^OpenMapRealVector this]
    (-> this (.hashCode))))

(defn ebe-multiply
  "Element-by-element multiplication.

  v - Vector by which instance elements must be multiplied - `org.apache.commons.math4.linear.RealVector`

  returns: a vector containing this[i] * v[i] for all i. - `org.apache.commons.math4.linear.OpenMapRealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^org.apache.commons.math4.linear.OpenMapRealVector [^OpenMapRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.ebeMultiply v))))

(defn add
  "Compute the sum of this vector and v.
   Returns a new vector. Does not change instance data.

  v - Vector to be added. - `org.apache.commons.math4.linear.RealVector`

  returns: this  v. - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^org.apache.commons.math4.linear.RealVector [^OpenMapRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.add v))))

(defn set-sub-vector
  "Set a sequence of consecutive elements.

  index - index of first element to be set. - `int`
  v - vector containing the values to set. - `org.apache.commons.math4.linear.RealVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  ([^OpenMapRealVector this ^Integer index ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.setSubVector index v))))

(defn set
  "Set all elements to a single value.

  value - Single value to set for all elements. - `double`"
  ([^OpenMapRealVector this ^Double value]
    (-> this (.set value))))

(defn to-array
  "Convert the vector to an array of doubles.
   The array is independent from this vector data: the elements
   are copied.

  returns: an array containing a copy of the vector elements. - `double[]`"
  ([^OpenMapRealVector this]
    (-> this (.toArray))))

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

   Implementation Note: This performs an exact comparison, and as a result
   it is possible for a.subtract(b} to be the zero vector, while
   a.equals(b) == false.

  obj - Object to test for equality. - `java.lang.Object`

  returns: true if two vector objects are equal, false if
   other is null, not an instance of RealVector, or
   not equal to this RealVector instance. - `boolean`"
  (^Boolean [^OpenMapRealVector this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn map-add-to-self
  "Add a value to each entry.
   The instance is changed in-place.

  d - Value to be added to each entry. - `double`

  returns: this. - `org.apache.commons.math4.linear.OpenMapRealVector`"
  (^org.apache.commons.math4.linear.OpenMapRealVector [^OpenMapRealVector this ^Double d]
    (-> this (.mapAddToSelf d))))

(defn get-sparsity
  "returns: the percentage of none zero elements as a decimal percent. - `double`"
  (^Double [^OpenMapRealVector this]
    (-> this (.getSparsity))))

(defn get-l-inf-distance
  "Distance between two vectors.
   This method computes the distance consistent with
   L∞ norm, i.e. the max of the absolute values of
   element differences.

  v - Vector to which distance is requested. - `org.apache.commons.math4.linear.RealVector`

  returns: the distance between two vectors. - `double`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this vector."
  (^Double [^OpenMapRealVector this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.getLInfDistance v))))

