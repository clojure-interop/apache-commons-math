(ns org.apache.commons.math4.ml.neuralnet.SquareNeighbourhood
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet SquareNeighbourhood]))

(def VON_NEUMANN
  "Enum Constant.

  : in two dimensions, each (internal)
   neuron has four neighbours.

  type: org.apache.commons.math4.ml.neuralnet.SquareNeighbourhood"
  SquareNeighbourhood/VON_NEUMANN)

(def MOORE
  "Enum Constant.

  : in two dimensions, each (internal)
   neuron has eight neighbours.

  type: org.apache.commons.math4.ml.neuralnet.SquareNeighbourhood"
  SquareNeighbourhood/MOORE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SquareNeighbourhood c : SquareNeighbourhood.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.ml.neuralnet.SquareNeighbourhood[]`"
  ([]
    (SquareNeighbourhood/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.ml.neuralnet.SquareNeighbourhood`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.ml.neuralnet.SquareNeighbourhood [^java.lang.String name]
    (SquareNeighbourhood/valueOf name)))

