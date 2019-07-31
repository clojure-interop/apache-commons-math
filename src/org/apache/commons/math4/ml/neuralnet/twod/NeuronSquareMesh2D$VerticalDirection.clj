(ns org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$VerticalDirection
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod NeuronSquareMesh2D$VerticalDirection]))

(def UP
  "Enum Constant.

  Row above the current row.

  type: org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$VerticalDirection"
  NeuronSquareMesh2D$VerticalDirection/UP)

(def CENTER
  "Enum Constant.

  Current row.

  type: org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$VerticalDirection"
  NeuronSquareMesh2D$VerticalDirection/CENTER)

(def DOWN
  "Enum Constant.

  Row below the current row.

  type: org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$VerticalDirection"
  NeuronSquareMesh2D$VerticalDirection/DOWN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (NeuronSquareMesh2D.VerticalDirection c : NeuronSquareMesh2D.VerticalDirection.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$VerticalDirection[]`"
  ([]
    (NeuronSquareMesh2D$VerticalDirection/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$VerticalDirection`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.ml.neuralnet.twod.NeuronSquareMesh2D$VerticalDirection [^java.lang.String name]
    (NeuronSquareMesh2D$VerticalDirection/valueOf name)))

