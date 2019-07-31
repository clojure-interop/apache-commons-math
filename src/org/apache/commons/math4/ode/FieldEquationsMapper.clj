(ns org.apache.commons.math4.ode.FieldEquationsMapper
  "Class mapping the part of a complete state or derivative that pertains
  to a set of differential equations.

  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode FieldEquationsMapper]))

(defn get-number-of-equations
  "Get the number of equations mapped.

  returns: number of equations mapped - `int`"
  (^Integer [^FieldEquationsMapper this]
    (-> this (.getNumberOfEquations))))

(defn get-total-dimension
  "Return the dimension of the complete set of equations.

   The complete set of equations correspond to the primary set plus all secondary sets.

  returns: dimension of the complete set of equations - `int`"
  (^Integer [^FieldEquationsMapper this]
    (-> this (.getTotalDimension))))

(defn map-state
  "Map a state to a complete flat array.

  state - state to map - `org.apache.commons.math4.ode.FieldODEState`

  returns: flat array containing the mapped state, including primary and secondary components - `T[]`"
  ([^FieldEquationsMapper this ^org.apache.commons.math4.ode.FieldODEState state]
    (-> this (.mapState state))))

(defn map-derivative
  "Map a state derivative to a complete flat array.

  state - state to map - `org.apache.commons.math4.ode.FieldODEStateAndDerivative`

  returns: flat array containing the mapped state derivative, including primary and secondary components - `T[]`"
  ([^FieldEquationsMapper this ^org.apache.commons.math4.ode.FieldODEStateAndDerivative state]
    (-> this (.mapDerivative state))))

(defn map-state-and-derivative
  "Map flat arrays to a state and derivative.

  t - time - `T`
  y - state array to map, including primary and secondary components - `T[]`
  y-dot - state derivative array to map, including primary and secondary components - `T[]`

  returns: mapped state - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if an array does not match total dimension"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^FieldEquationsMapper this t y y-dot]
    (-> this (.mapStateAndDerivative t y y-dot))))

(defn extract-equation-data
  "Extract equation data from a complete state or derivative array.

  index - index of the equation, must be between 0 included and getNumberOfEquations() (excluded) - `int`
  complete - complete state or derivative array from which equation data should be retrieved - `T[]`

  returns: equation data - `T[]`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if index is out of range"
  ([^FieldEquationsMapper this ^Integer index complete]
    (-> this (.extractEquationData index complete))))

(defn insert-equation-data
  "Insert equation data into a complete state or derivative array.

  index - index of the equation, must be between 0 included and getNumberOfEquations() (excluded) - `int`
  equation-data - equation data to be inserted into the complete array - `T[]`
  complete - placeholder where to put equation data (only the part corresponding to the equation will be overwritten) - `T[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if either array has not enough elements"
  ([^FieldEquationsMapper this ^Integer index equation-data complete]
    (-> this (.insertEquationData index equation-data complete))))

