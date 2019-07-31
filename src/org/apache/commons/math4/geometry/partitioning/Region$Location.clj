(ns org.apache.commons.math4.geometry.partitioning.Region$Location
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning Region$Location]))

(def INSIDE
  "Enum Constant.

  Code for points inside the partition.

  type: org.apache.commons.math4.geometry.partitioning.Region$Location"
  Region$Location/INSIDE)

(def OUTSIDE
  "Enum Constant.

  Code for points outside of the partition.

  type: org.apache.commons.math4.geometry.partitioning.Region$Location"
  Region$Location/OUTSIDE)

(def BOUNDARY
  "Enum Constant.

  Code for points on the partition boundary.

  type: org.apache.commons.math4.geometry.partitioning.Region$Location"
  Region$Location/BOUNDARY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Region.Location c : Region.Location.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.geometry.partitioning.Region$Location[]`"
  ([]
    (Region$Location/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.geometry.partitioning.Region$Location`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.geometry.partitioning.Region$Location [^java.lang.String name]
    (Region$Location/valueOf name)))

