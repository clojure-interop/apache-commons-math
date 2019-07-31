(ns org.apache.commons.math4.optim.linear.Relationship
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear Relationship]))

(def EQ
  "Enum Constant.

  Equality relationship.

  type: org.apache.commons.math4.optim.linear.Relationship"
  Relationship/EQ)

(def LEQ
  "Enum Constant.

  Lesser than or equal relationship.

  type: org.apache.commons.math4.optim.linear.Relationship"
  Relationship/LEQ)

(def GEQ
  "Enum Constant.

  Greater than or equal relationship.

  type: org.apache.commons.math4.optim.linear.Relationship"
  Relationship/GEQ)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Relationship c : Relationship.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.optim.linear.Relationship[]`"
  ([]
    (Relationship/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.optim.linear.Relationship`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.optim.linear.Relationship [^java.lang.String name]
    (Relationship/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Relationship this]
    (-> this (.toString))))

(defn opposite-relationship
  "Gets the relationship obtained when multiplying all coefficients by -1.

  returns: the opposite relationship. - `org.apache.commons.math4.optim.linear.Relationship`"
  (^org.apache.commons.math4.optim.linear.Relationship [^Relationship this]
    (-> this (.oppositeRelationship))))

