(ns org.apache.commons.math4.util.DoubleArray
  "Provides a standard interface for double arrays.  Allows different
  array implementations to support various storage mechanisms
  such as automatic expansion, contraction, and array \"rolling\"."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util DoubleArray]))

(defn get-num-elements
  "Returns the number of elements currently in the array.  Please note
   that this may be different from the length of the internal storage array.

  returns: number of elements - `int`"
  (^Integer [^DoubleArray this]
    (-> this (.getNumElements))))

(defn get-element
  "Returns the element at the specified index.  Note that if an
   out of bounds index is supplied a ArrayIndexOutOfBoundsException
   will be thrown.

  index - index to fetch a value from - `int`

  returns: value stored at the specified index - `double`

  throws: java.lang.ArrayIndexOutOfBoundsException - if index is less than zero or is greater than getNumElements() - 1."
  (^Double [^DoubleArray this ^Integer index]
    (-> this (.getElement index))))

(defn set-element
  "Sets the element at the specified index.  If the specified index is greater than
   getNumElements() - 1, the numElements property
   is increased to index 1 and additional storage is allocated
   (if necessary) for the new element and all  (uninitialized) elements
   between the new element and the previous end of the array).

  index - index to store a value in - `int`
  value - value to store at the specified index - `double`

  throws: java.lang.ArrayIndexOutOfBoundsException - if index is less than zero."
  ([^DoubleArray this ^Integer index ^Double value]
    (-> this (.setElement index value))))

(defn add-element
  "Adds an element to the end of this expandable array

  value - to be added to end of array - `double`"
  ([^DoubleArray this ^Double value]
    (-> this (.addElement value))))

(defn add-elements
  "Adds elements to the end of this expandable array

  values - to be added to end of array - `double[]`"
  ([^DoubleArray this values]
    (-> this (.addElements values))))

(defn add-element-rolling
  "Adds an element to the end of the array and removes the first
   element in the array.  Returns the discarded first element.
   The effect is similar to a push operation in a FIFO queue.


   Example: If the array contains the elements 1, 2, 3, 4 (in that order)
   and addElementRolling(5) is invoked, the result is an array containing
   the entries 2, 3, 4, 5 and the value returned is 1.

  value - the value to be added to the array - `double`

  returns: the value which has been discarded or \"pushed\" out of the array
           by this rolling insert - `double`"
  (^Double [^DoubleArray this ^Double value]
    (-> this (.addElementRolling value))))

(defn get-elements
  "Returns a double[] array containing the elements of this
   DoubleArray.  If the underlying implementation is
   array-based, this method should always return a copy, rather than a
   reference to the underlying array so that changes made to the returned
    array have no effect on the DoubleArray.

  returns: all elements added to the array - `double[]`"
  ([^DoubleArray this]
    (-> this (.getElements))))

(defn clear
  "Clear the double array"
  ([^DoubleArray this]
    (-> this (.clear))))

