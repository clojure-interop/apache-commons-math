(ns org.apache.commons.math4.linear.ArrayFieldVector
  "This class implements the FieldVector interface with a FieldElement array."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear ArrayFieldVector]))

(defn ->array-field-vector
  "Constructor.

  Construct a vector from part of a array.

  field - Field to which the elements belong. - `org.apache.commons.math4.Field`
  d - Array. - `T[]`
  pos - Position of the first entry. - `int`
  size - Number of entries to copy. - `int`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^ArrayFieldVector [^org.apache.commons.math4.Field field d ^Integer pos ^Integer size]
    (new ArrayFieldVector field d pos size))
  (^ArrayFieldVector [^org.apache.commons.math4.Field field d ^Boolean copy-array]
    (new ArrayFieldVector field d copy-array))
  (^ArrayFieldVector [^org.apache.commons.math4.Field field ^Integer size]
    (new ArrayFieldVector field size))
  (^ArrayFieldVector [^org.apache.commons.math4.Field field]
    (new ArrayFieldVector field)))

(defn copy
  "Returns a (deep) copy of this.

  returns: vector copy - `org.apache.commons.math4.linear.FieldVector<T>`"
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this]
    (-> this (.copy))))

(defn map-divide-to-self
  "Map a division operation to each entry.
   The instance is changed by this method.

  d - value to divide all entries by - `T`

  returns: for convenience, return this - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this d]
    (-> this (.mapDivideToSelf d))))

(defn get-entry
  "Returns the entry in the specified index.

  index - Index location of entry to be fetched. - `int`

  returns: the vector entry at index. - `T`"
  ([^ArrayFieldVector this ^Integer index]
    (-> this (.getEntry index))))

(defn map-add
  "Map an addition operation to each entry.

  d - value to be added to each entry - `T`

  returns: this  d - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this d]
    (-> this (.mapAdd d))))

(defn map-inv-to-self
  "Map the 1/x function to each entry.
   The instance is changed by this method.

  returns: for convenience, return this - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if one of the entries is zero."
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this]
    (-> this (.mapInvToSelf))))

(defn dot-product
  "Compute the dot product.

  v - vector with which dot product should be computed - `org.apache.commons.math4.linear.FieldVector`

  returns: the scalar dot product of this and v - `T`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  ([^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.dotProduct v))))

(defn get-data-ref
  "Returns a reference to the underlying data array.
   Does not make a fresh copy of the underlying data.

  returns: array of entries - `T[]`"
  ([^ArrayFieldVector this]
    (-> this (.getDataRef))))

(defn map-inv
  "Map the 1/x function to each entry.

  returns: a vector containing the result of applying the function to each entry. - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if one of the entries is zero."
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this]
    (-> this (.mapInv))))

(defn map-multiply
  "Map a multiplication operation to each entry.

  d - value to multiply all entries by - `T`

  returns: this * d - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this d]
    (-> this (.mapMultiply d))))

(defn get-sub-vector
  "Get a subvector from consecutive elements.

  index - index of first element. - `int`
  n - number of elements to be retrieved. - `int`

  returns: a vector containing n elements. - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this ^Integer index ^Integer n]
    (-> this (.getSubVector index n))))

(defn walk-in-optimized-order
  "Visits (but does not alter) some entries of this vector in optimized
   order. The order in which the entries are visited is selected so as to
   lead to the most efficient implementation; it might depend on the
   concrete implementation of this abstract class.

  visitor - visitor to be used to process the entries of this vector - `org.apache.commons.math4.linear.FieldVectorPreservingVisitor`
  start - the index of the first entry to be visited - `int`
  end - the index of the last entry to be visited (inclusive) - `int`

  returns: the value returned by FieldVectorPreservingVisitor.end()
   at the end of the walk - `T`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if end < start."
  ([^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVectorPreservingVisitor visitor ^Integer start ^Integer end]
    (-> this (.walkInOptimizedOrder visitor start end)))
  ([^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVectorPreservingVisitor visitor]
    (-> this (.walkInOptimizedOrder visitor))))

(defn get-dimension
  "Returns the size of the vector.

  returns: size - `int`"
  (^Integer [^ArrayFieldVector this]
    (-> this (.getDimension))))

(defn map-multiply-to-self
  "Map a multiplication operation to each entry.
   The instance is changed by this method.

  d - value to multiply all entries by - `T`

  returns: for convenience, return this - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this d]
    (-> this (.mapMultiplyToSelf d))))

(defn map-subtract
  "Map a subtraction operation to each entry.

  d - value to be subtracted to each entry - `T`

  returns: this - d - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null"
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this d]
    (-> this (.mapSubtract d))))

(defn subtract
  "Compute this minus v.

  v - vector to be subtracted - `org.apache.commons.math4.linear.FieldVector`

  returns: this - v - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.subtract v))))

(defn get-field
  "Get the type of field elements of the vector.

  returns: type of field elements of the vector - `org.apache.commons.math4.Field<T>`"
  (^org.apache.commons.math4.Field [^ArrayFieldVector this]
    (-> this (.getField))))

(defn walk-in-default-order
  "Visits (but does not alter) some entries of this vector in default order
   (increasing index).

  visitor - visitor to be used to process the entries of this vector - `org.apache.commons.math4.linear.FieldVectorPreservingVisitor`
  start - the index of the first entry to be visited - `int`
  end - the index of the last entry to be visited (inclusive) - `int`

  returns: the value returned by FieldVectorPreservingVisitor.end()
   at the end of the walk - `T`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if end < start."
  ([^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVectorPreservingVisitor visitor ^Integer start ^Integer end]
    (-> this (.walkInDefaultOrder visitor start end)))
  ([^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVectorPreservingVisitor visitor]
    (-> this (.walkInDefaultOrder visitor))))

(defn outer-product
  "Compute the outer product.

  v - vector with which outer product should be computed - `org.apache.commons.math4.linear.FieldVector`

  returns: the matrix outer product between instance and v - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.outerProduct v))))

(defn projection
  "Find the orthogonal projection of this vector onto another vector.

  v - vector onto which this must be projected - `org.apache.commons.math4.linear.FieldVector`

  returns: projection of this onto v - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.projection v))))

(defn map-divide
  "Map a division operation to each entry.

  d - value to divide all entries by - `T`

  returns: this / d - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this d]
    (-> this (.mapDivide d))))

(defn ebe-divide
  "Element-by-element division.

  v - vector by which instance elements must be divided - `org.apache.commons.math4.linear.FieldVector`

  returns: a vector containing this[i] / v[i] for all i - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.ebeDivide v))))

(defn set-entry
  "Set a single element.

  index - element index. - `int`
  value - new value for the element. - `T`"
  ([^ArrayFieldVector this ^Integer index value]
    (-> this (.setEntry index value))))

(defn append
  "Construct a vector by appending a vector to this vector.

  v - vector to append to this one. - `org.apache.commons.math4.linear.FieldVector`

  returns: a new vector - `org.apache.commons.math4.linear.FieldVector<T>`"
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.append v))))

(defn hash-code
  "Get a hashCode for the real vector.
   All NaN values have the same hash code.

  returns: a hash code value for this object - `int`"
  (^Integer [^ArrayFieldVector this]
    (-> this (.hashCode))))

(defn ebe-multiply
  "Element-by-element multiplication.

  v - vector by which instance elements must be multiplied - `org.apache.commons.math4.linear.FieldVector`

  returns: a vector containing this[i] * v[i] for all i - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.ebeMultiply v))))

(defn add
  "Compute the sum of this and v.

  v - vector to be added - `org.apache.commons.math4.linear.FieldVector`

  returns: this  v - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.add v))))

(defn set-sub-vector
  "Set a set of consecutive elements.

  index - index of first element to be set. - `int`
  v - vector containing the values to set. - `org.apache.commons.math4.linear.FieldVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  ([^ArrayFieldVector this ^Integer index ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.setSubVector index v))))

(defn set
  "Set a set of consecutive elements.

  index - index of first element to be set. - `int`
  v - vector containing the values to set. - `org.apache.commons.math4.linear.ArrayFieldVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is invalid."
  ([^ArrayFieldVector this ^Integer index ^org.apache.commons.math4.linear.ArrayFieldVector v]
    (-> this (.set index v)))
  ([^ArrayFieldVector this value]
    (-> this (.set value))))

(defn to-array
  "Convert the vector to a T array.
   The array is independent from vector data, it's elements
   are copied.

  returns: array containing a copy of vector elements - `T[]`"
  ([^ArrayFieldVector this]
    (-> this (.toArray))))

(defn equals
  "Test for the equality of two vectors.

  other - Object to test for equality. - `java.lang.Object`

  returns: true if two vector objects are equal, false
   otherwise. - `boolean`"
  (^Boolean [^ArrayFieldVector this ^java.lang.Object other]
    (-> this (.equals other))))

(defn map-add-to-self
  "Map an addition operation to each entry.
   The instance is changed by this method.

  d - value to be added to each entry - `T`

  returns: for convenience, return this - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this d]
    (-> this (.mapAddToSelf d))))

(defn map-subtract-to-self
  "Map a subtraction operation to each entry.
   The instance is changed by this method.

  d - value to be subtracted to each entry - `T`

  returns: for convenience, return this - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null"
  (^org.apache.commons.math4.linear.FieldVector [^ArrayFieldVector this d]
    (-> this (.mapSubtractToSelf d))))

