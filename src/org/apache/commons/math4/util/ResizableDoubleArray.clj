(ns org.apache.commons.math4.util.ResizableDoubleArray
  "A variable length DoubleArray implementation that automatically
  handles expanding and contracting its internal storage array as elements
  are added and removed.

  The internal storage array starts with capacity determined by the
  initialCapacity property, which can be set by the constructor.
  The default initial capacity is 16.  Adding elements using
  addElement(double) appends elements to the end of the array.
  When there are no open entries at the end of the internal storage array,
  the array is expanded.  The size of the expanded array depends on the
  expansionMode and expansionFactor properties.
  The expansionMode determines whether the size of the array is
  multiplied by the expansionFactor
  (ResizableDoubleArray.ExpansionMode.MULTIPLICATIVE) or if the expansion is additive
  (ResizableDoubleArray.ExpansionMode.ADDITIVE -- expansionFactor storage
  locations added).
  The default expansionMode is MULTIPLICATIVE and the default
  expansionFactor is 2.

  The addElementRolling(double) method adds a new element to the end
  of the internal storage array and adjusts the \"usable window\" of the
  internal array forward by one position (effectively making what was the
  second element the first, and so on).  Repeated activations of this method
  (or activation of discardFrontElements(int)) will effectively orphan
  the storage locations at the beginning of the internal storage array.  To
  reclaim this storage, each time one of these methods is activated, the size
  of the internal storage array is compared to the number of addressable
  elements (the numElements property) and if the difference
  is too large, the internal array is contracted to size
  numElements  1.  The determination of when the internal
  storage array is \"too large\" depends on the expansionMode and
  contractionFactor properties.  If  the expansionMode
  is MULTIPLICATIVE, contraction is triggered when the
  ratio between storage array length and numElements exceeds
  contractionFactor.  If the expansionMode
  is ADDITIVE, the number of excess storage locations
  is compared to contractionFactor.

  To avoid cycles of expansions and contractions, the
  expansionFactor must not exceed the contractionFactor.
  Constructors and mutators for both of these properties enforce this
  requirement, throwing a MathIllegalArgumentException if it is
  violated.

  Note: this class is NOT thread-safe."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util ResizableDoubleArray]))

(defn ->resizable-double-array
  "Constructor.

  Creates an instance with the specified properties.

   Throws MathIllegalArgumentException if the following conditions
   are not met:

    initialCapacity > 0
    expansionFactor > 1
    contractionCriterion >= expansionFactor

  initial-capacity - Initial size of the internal storage array. - `int`
  expansion-factor - The array will be expanded based on this parameter. - `double`
  contraction-criterion - Contraction criteria. - `double`
  expansion-mode - Expansion mode. - `org.apache.commons.math4.util.ResizableDoubleArray$ExpansionMode`
  data - Initial contents of the array. - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the parameters are not valid."
  (^ResizableDoubleArray [^Integer initial-capacity ^Double expansion-factor ^Double contraction-criterion ^org.apache.commons.math4.util.ResizableDoubleArray$ExpansionMode expansion-mode ^Double data]
    (new ResizableDoubleArray initial-capacity expansion-factor contraction-criterion expansion-mode data))
  (^ResizableDoubleArray [^Integer initial-capacity ^Double expansion-factor ^Double contraction-criterion]
    (new ResizableDoubleArray initial-capacity expansion-factor contraction-criterion))
  (^ResizableDoubleArray [^Integer initial-capacity ^Double expansion-factor]
    (new ResizableDoubleArray initial-capacity expansion-factor))
  (^ResizableDoubleArray [^Integer initial-capacity]
    (new ResizableDoubleArray initial-capacity))
  (^ResizableDoubleArray []
    (new ResizableDoubleArray )))

(defn add-element-rolling
  "Adds an element to the end of the array and removes the first
   element in the array.  Returns the discarded first element.

   The effect is similar to a push operation in a FIFO queue.

   Example: If the array contains the elements 1, 2, 3, 4 (in that order)
   and addElementRolling(5) is invoked, the result is an array containing
   the entries 2, 3, 4, 5 and the value returned is 1.

  value - Value to be added to the array. - `double`

  returns: the value which has been discarded or \"pushed\" out of the array
   by this rolling insert. - `double`"
  (^Double [^ResizableDoubleArray this ^Double value]
    (-> this (.addElementRolling value))))

(defn get-contraction-criterion
  "The contraction criterion defines when the internal array will contract
   to store only the number of elements in the element array.

   If the expansionMode is MULTIPLICATIVE,
   contraction is triggered when the ratio between storage array length
   and numElements exceeds contractionFactor.
   If the expansionMode is ADDITIVE, the
   number of excess storage locations is compared to contractionFactor.

  returns: the contraction criterion used to reclaim memory. - `double`"
  (^Double [^ResizableDoubleArray this]
    (-> this (.getContractionCriterion))))

(defn get-expansion-factor
  "The expansion factor controls the size of a new array when an array
   needs to be expanded.

   The expansionMode determines whether the size of the array
   is multiplied by the expansionFactor (MULTIPLICATIVE) or if
   the expansion is additive (ADDITIVE -- expansionFactor
   storage locations added).  The default expansionMode is
   MULTIPLICATIVE and the default expansionFactor is 2.0.

  returns: the expansion factor of this expandable double array - `double`"
  (^Double [^ResizableDoubleArray this]
    (-> this (.getExpansionFactor))))

(defn set-num-elements
  "This function allows you to control the number of elements contained
   in this array, and can be used to \"throw out\" the last n values in an
   array. This function will also expand the internal array as needed.

  i - a new number of elements - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if i is negative."
  ([^ResizableDoubleArray this ^Integer i]
    (-> this (.setNumElements i))))

(defn copy
  "Returns a copy of the ResizableDoubleArray.  Does not contract before
   the copy, so the returned object is an exact copy of this.

  returns: a new ResizableDoubleArray with the same data and configuration
   properties as this - `org.apache.commons.math4.util.ResizableDoubleArray`"
  (^org.apache.commons.math4.util.ResizableDoubleArray [^ResizableDoubleArray this]
    (-> this (.copy))))

(defn add-element
  "Adds an element to the end of this expandable array.

  value - Value to be added to end of array. - `double`"
  ([^ResizableDoubleArray this ^Double value]
    (-> this (.addElement value))))

(defn get-element
  "Returns the element at the specified index.

  index - index to fetch a value from - `int`

  returns: value stored at the specified index - `double`

  throws: java.lang.ArrayIndexOutOfBoundsException - if index is less than zero or is greater than getNumElements() - 1."
  (^Double [^ResizableDoubleArray this ^Integer index]
    (-> this (.getElement index))))

(defn get-capacity
  "Gets the currently allocated size of the internal data structure used
   for storing elements.
   This is not to be confused with the number of
   elements actually stored.

  returns: the length of the internal array. - `int`"
  (^Integer [^ResizableDoubleArray this]
    (-> this (.getCapacity))))

(defn add-elements
  "Adds several element to the end of this expandable array.

  values - Values to be added to end of array. - `double[]`"
  ([^ResizableDoubleArray this values]
    (-> this (.addElements values))))

(defn get-elements
  "Returns a double array containing the elements of this ResizableArray.

   This method returns a copy, not a reference to the underlying array,
   so that changes made to the returned array have no effect on this ResizableArray.

  returns: the double array. - `double[]`"
  ([^ResizableDoubleArray this]
    (-> this (.getElements))))

(defn set-element
  "Sets the element at the specified index.

   If the specified index is greater than getNumElements() - 1,
   the numElements property is increased to index 1
   and additional storage is allocated (if necessary) for the new element and
   all (uninitialized) elements between the new element and the previous end
   of the array).

  index - index to store a value in - `int`
  value - value to store at the specified index - `double`

  throws: java.lang.ArrayIndexOutOfBoundsException - if index < 0."
  ([^ResizableDoubleArray this ^Integer index ^Double value]
    (-> this (.setElement index value))))

(defn contract
  "Contracts the storage array to the (size of the element set)  1 - to avoid
   a zero length array. This function also resets the startIndex to zero."
  ([^ResizableDoubleArray this]
    (-> this (.contract))))

(defn discard-most-recent-elements
  "Discards the i last elements of the array.

   For example, if the array contains the elements 1,2,3,4, invoking
   discardMostRecentElements(2) will cause the last two elements
   to be discarded, leaving 1,2 in the array.

  i - the number of elements to discard from the end of the array - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if i is greater than numElements."
  ([^ResizableDoubleArray this ^Integer i]
    (-> this (.discardMostRecentElements i))))

(defn get-expansion-mode
  "The expansion mode determines whether the internal storage
   array grows additively or multiplicatively when it is expanded.

  returns: the expansion mode. - `org.apache.commons.math4.util.ResizableDoubleArray$ExpansionMode`"
  (^org.apache.commons.math4.util.ResizableDoubleArray$ExpansionMode [^ResizableDoubleArray this]
    (-> this (.getExpansionMode))))

(defn hash-code
  "Returns a hash code consistent with equals.

  returns: the hash code representing this ResizableDoubleArray. - `int`"
  (^Integer [^ResizableDoubleArray this]
    (-> this (.hashCode))))

(defn discard-front-elements
  "Discards the i initial elements of the array.

   For example, if the array contains the elements 1,2,3,4, invoking
   discardFrontElements(2) will cause the first two elements
   to be discarded, leaving 3,4 in the array.

  i - the number of elements to discard from the front of the array - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if i is greater than numElements."
  ([^ResizableDoubleArray this ^Integer i]
    (-> this (.discardFrontElements i))))

(defn clear
  "Clear the array contents, resetting the number of elements to zero."
  ([^ResizableDoubleArray this]
    (-> this (.clear))))

(defn get-num-elements
  "Returns the number of elements currently in the array.  Please note
   that this is different from the length of the internal storage array.

  returns: the number of elements. - `int`"
  (^Integer [^ResizableDoubleArray this]
    (-> this (.getNumElements))))

(defn equals
  "Returns true iff object is a ResizableDoubleArray with the same properties
   as this and an identical internal storage array.

  object - object to be compared for equality with this - `java.lang.Object`

  returns: true iff object is a ResizableDoubleArray with the same data and
   properties as this - `boolean`"
  (^Boolean [^ResizableDoubleArray this ^java.lang.Object object]
    (-> this (.equals object))))

(defn compute
  "Performs an operation on the addressable elements of the array.

  f - Function to be applied on this array. - `org.apache.commons.math4.util.MathArrays$Function`

  returns: the result. - `double`"
  (^Double [^ResizableDoubleArray this ^org.apache.commons.math4.util.MathArrays$Function f]
    (-> this (.compute f))))

(defn substitute-most-recent-element
  "Substitutes value for the most recently added value.

   Returns the value that has been replaced. If the array is empty (i.e.
   if numElements is zero), an MathIllegalStateException is thrown.

  value - New value to substitute for the most recently added value - `double`

  returns: the value that has been replaced in the array. - `double`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if the array is empty"
  (^Double [^ResizableDoubleArray this ^Double value]
    (-> this (.substituteMostRecentElement value))))

