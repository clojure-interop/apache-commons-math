(ns org.apache.commons.math4.ode.EquationsMapper
  "Class mapping the part of a complete state or derivative that pertains
  to a specific differential equation.

  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode EquationsMapper]))

(defn ->equations-mapper
  "Constructor.

  simple constructor.

  first-index - index of the first equation element in complete state arrays - `int`
  dimension - dimension of the secondary state parameters - `int`"
  (^EquationsMapper [^Integer first-index ^Integer dimension]
    (new EquationsMapper first-index dimension)))

(defn get-first-index
  "Get the index of the first equation element in complete state arrays.

  returns: index of the first equation element in complete state arrays - `int`"
  (^Integer [^EquationsMapper this]
    (-> this (.getFirstIndex))))

(defn get-dimension
  "Get the dimension of the secondary state parameters.

  returns: dimension of the secondary state parameters - `int`"
  (^Integer [^EquationsMapper this]
    (-> this (.getDimension))))

(defn extract-equation-data
  "Extract equation data from a complete state or derivative array.

  complete - complete state or derivative array from which equation data should be retrieved - `double[]`
  equation-data - placeholder where to put equation data - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimension of the equation data does not match the mapper dimension"
  ([^EquationsMapper this complete equation-data]
    (-> this (.extractEquationData complete equation-data))))

(defn insert-equation-data
  "Insert equation data into a complete state or derivative array.

  equation-data - equation data to be inserted into the complete array - `double[]`
  complete - placeholder where to put equation data (only the part corresponding to the equation will be overwritten) - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimension of the equation data does not match the mapper dimension"
  ([^EquationsMapper this equation-data complete]
    (-> this (.insertEquationData equation-data complete))))

