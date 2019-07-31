(ns org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning BSPTreeVisitor$Order]))

(def PLUS_MINUS_SUB
  "Enum Constant.

  Indicator for visit order plus sub-tree, then minus sub-tree,
   and last cut sub-hyperplane.

  type: org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order"
  BSPTreeVisitor$Order/PLUS_MINUS_SUB)

(def PLUS_SUB_MINUS
  "Enum Constant.

  Indicator for visit order plus sub-tree, then cut sub-hyperplane,
   and last minus sub-tree.

  type: org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order"
  BSPTreeVisitor$Order/PLUS_SUB_MINUS)

(def MINUS_PLUS_SUB
  "Enum Constant.

  Indicator for visit order minus sub-tree, then plus sub-tree,
   and last cut sub-hyperplane.

  type: org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order"
  BSPTreeVisitor$Order/MINUS_PLUS_SUB)

(def MINUS_SUB_PLUS
  "Enum Constant.

  Indicator for visit order minus sub-tree, then cut sub-hyperplane,
   and last plus sub-tree.

  type: org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order"
  BSPTreeVisitor$Order/MINUS_SUB_PLUS)

(def SUB_PLUS_MINUS
  "Enum Constant.

  Indicator for visit order cut sub-hyperplane, then plus sub-tree,
   and last minus sub-tree.

  type: org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order"
  BSPTreeVisitor$Order/SUB_PLUS_MINUS)

(def SUB_MINUS_PLUS
  "Enum Constant.

  Indicator for visit order cut sub-hyperplane, then minus sub-tree,
   and last plus sub-tree.

  type: org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order"
  BSPTreeVisitor$Order/SUB_MINUS_PLUS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BSPTreeVisitor.Order c : BSPTreeVisitor.Order.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order[]`"
  ([]
    (BSPTreeVisitor$Order/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order [^java.lang.String name]
    (BSPTreeVisitor$Order/valueOf name)))

