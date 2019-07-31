(ns org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$HorizontalDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod NeuronSquareMesh2D$HorizontalDirection]))

(def RIGHT
  "Enum Constant.

  Column at the right of the current column.

  type: org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$HorizontalDirection"
  NeuronSquareMesh2D$HorizontalDirection/RIGHT)

(def CENTER
  "Enum Constant.

  Current column.

  type: org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$HorizontalDirection"
  NeuronSquareMesh2D$HorizontalDirection/CENTER)

(def LEFT
  "Enum Constant.

  Column at the left of the current column.

  type: org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$HorizontalDirection"
  NeuronSquareMesh2D$HorizontalDirection/LEFT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (NeuronSquareMesh2D.HorizontalDirection c : NeuronSquareMesh2D.HorizontalDirection.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$HorizontalDirection[]`"
  ([]
    (NeuronSquareMesh2D$HorizontalDirection/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$HorizontalDirection`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$HorizontalDirection [^java.lang.String name]
    (NeuronSquareMesh2D$HorizontalDirection/valueOf name)))

