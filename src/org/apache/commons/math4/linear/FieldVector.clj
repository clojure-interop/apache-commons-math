(ns org.apache.commons.math4.linear.FieldVector
  "Interface defining a field-valued vector with basic algebraic operations.

  vector element indexing is 0-based -- e.g., getEntry(0)
  returns the first element of the vector.


  The various mapXxx and mapXxxToSelf methods operate
  on vectors element-wise, i.e. they perform the same operation (adding a scalar,
  applying a function ...) on each element in turn. The mapXxx
  versions create a new vector to hold the result and do not change the instance.
  The mapXxxToSelf versions use the instance itself to store the
  results, so the instance is changed by these methods. In both cases, the result
  vector is returned by the methods, this allows to use the fluent API
  style, like this:



    RealVector result = v.mapAddToSelf(3.0).mapTanToSelf().mapSquareToSelf();

  Note that as almost all operations on FieldElement throw NullArgumentException when operating on a null element, it is the responsibility
  of FieldVector implementations to make sure no null elements
  are inserted into the vector. This must be done in all constructors and
  all setters."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear FieldVector]))

(defn copy
  "Returns a (deep) copy of this.

  returns: vector copy - `org.apache.commons.math4.linear.FieldVector<T>`"
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this]
    (-> this (.copy))))

(defn map-divide-to-self
  "Map a division operation to each entry.
   The instance is changed by this method.

  d - value to divide all entries by - `T`

  returns: for convenience, return this - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this d]
    (-> this (.mapDivideToSelf d))))

(defn get-entry
  "Returns the entry in the specified index.

  index - Index location of entry to be fetched. - `int`

  returns: the vector entry at index. - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  ([^FieldVector this ^Integer index]
    (-> this (.getEntry index))))

(defn map-add
  "Map an addition operation to each entry.

  d - value to be added to each entry - `T`

  returns: this  d - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this d]
    (-> this (.mapAdd d))))

(defn map-inv-to-self
  "Map the 1/x function to each entry.
   The instance is changed by this method.

  returns: for convenience, return this - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if one of the entries is zero."
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this]
    (-> this (.mapInvToSelf))))

(defn dot-product
  "Compute the dot product.

  v - vector with which dot product should be computed - `org.apache.commons.math4.linear.FieldVector`

  returns: the scalar dot product of this and v - `T`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  ([^FieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.dotProduct v))))

(defn map-inv
  "Map the 1/x function to each entry.

  returns: a vector containing the result of applying the function to each entry. - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if one of the entries is zero."
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this]
    (-> this (.mapInv))))

(defn map-multiply
  "Map a multiplication operation to each entry.

  d - value to multiply all entries by - `T`

  returns: this * d - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this d]
    (-> this (.mapMultiply d))))

(defn get-sub-vector
  "Get a subvector from consecutive elements.

  index - index of first element. - `int`
  n - number of elements to be retrieved. - `int`

  returns: a vector containing n elements. - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this ^Integer index ^Integer n]
    (-> this (.getSubVector index n))))

(defn get-dimension
  "Returns the size of the vector.

  returns: size - `int`"
  (^Integer [^FieldVector this]
    (-> this (.getDimension))))

(defn map-multiply-to-self
  "Map a multiplication operation to each entry.
   The instance is changed by this method.

  d - value to multiply all entries by - `T`

  returns: for convenience, return this - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this d]
    (-> this (.mapMultiplyToSelf d))))

(defn map-subtract
  "Map a subtraction operation to each entry.

  d - value to be subtracted to each entry - `T`

  returns: this - d - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null"
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this d]
    (-> this (.mapSubtract d))))

(defn subtract
  "Compute this minus v.

  v - vector to be subtracted - `org.apache.commons.math4.linear.FieldVector`

  returns: this - v - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.subtract v))))

(defn get-field
  "Get the type of field elements of the vector.

  returns: type of field elements of the vector - `org.apache.commons.math4.Field<T>`"
  (^org.apache.commons.math4.Field [^FieldVector this]
    (-> this (.getField))))

(defn outer-product
  "Compute the outer product.

  v - vector with which outer product should be computed - `org.apache.commons.math4.linear.FieldVector`

  returns: the matrix outer product between instance and v - `org.apache.commons.math4.linear.FieldMatrix<T>`"
  (^org.apache.commons.math4.linear.FieldMatrix [^FieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.outerProduct v))))

(defn projection
  "Find the orthogonal projection of this vector onto another vector.

  v - vector onto which this must be projected - `org.apache.commons.math4.linear.FieldVector`

  returns: projection of this onto v - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.projection v))))

(defn map-divide
  "Map a division operation to each entry.

  d - value to divide all entries by - `T`

  returns: this / d - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this d]
    (-> this (.mapDivide d))))

(defn ebe-divide
  "Element-by-element division.

  v - vector by which instance elements must be divided - `org.apache.commons.math4.linear.FieldVector`

  returns: a vector containing this[i] / v[i] for all i - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.ebeDivide v))))

(defn set-entry
  "Set a single element.

  index - element index. - `int`
  value - new value for the element. - `T`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  ([^FieldVector this ^Integer index value]
    (-> this (.setEntry index value))))

(defn append
  "Construct a vector by appending a vector to this vector.

  v - vector to append to this one. - `org.apache.commons.math4.linear.FieldVector`

  returns: a new vector - `org.apache.commons.math4.linear.FieldVector<T>`"
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.append v))))

(defn ebe-multiply
  "Element-by-element multiplication.

  v - vector by which instance elements must be multiplied - `org.apache.commons.math4.linear.FieldVector`

  returns: a vector containing this[i] * v[i] for all i - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.ebeMultiply v))))

(defn add
  "Compute the sum of this and v.

  v - vector to be added - `org.apache.commons.math4.linear.FieldVector`

  returns: this  v - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if v is not the same size as this"
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.add v))))

(defn set-sub-vector
  "Set a set of consecutive elements.

  index - index of first element to be set. - `int`
  v - vector containing the values to set. - `org.apache.commons.math4.linear.FieldVector`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the index is not valid."
  ([^FieldVector this ^Integer index ^org.apache.commons.math4.linear.FieldVector v]
    (-> this (.setSubVector index v))))

(defn set
  "Set all elements to a single value.

  value - single value to set for all elements - `T`"
  ([^FieldVector this value]
    (-> this (.set value))))

(defn to-array
  "Convert the vector to a T array.
   The array is independent from vector data, it's elements
   are copied.

  returns: array containing a copy of vector elements - `T[]`"
  ([^FieldVector this]
    (-> this (.toArray))))

(defn map-add-to-self
  "Map an addition operation to each entry.
   The instance is changed by this method.

  d - value to be added to each entry - `T`

  returns: for convenience, return this - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null."
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this d]
    (-> this (.mapAddToSelf d))))

(defn map-subtract-to-self
  "Map a subtraction operation to each entry.
   The instance is changed by this method.

  d - value to be subtracted to each entry - `T`

  returns: for convenience, return this - `org.apache.commons.math4.linear.FieldVector<T>`

  throws: org.apache.commons.math4.exception.NullArgumentException - if d is null"
  (^org.apache.commons.math4.linear.FieldVector [^FieldVector this d]
    (-> this (.mapSubtractToSelf d))))

