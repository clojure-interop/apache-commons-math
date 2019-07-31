(ns org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.moment SemiVariance$Direction]))

(def UPSIDE
  "Enum Constant.

  The UPSIDE Direction is used to specify that the observations above the
   cutoff point will be used to calculate SemiVariance

  type: org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction"
  SemiVariance$Direction/UPSIDE)

(def DOWNSIDE
  "Enum Constant.

  The DOWNSIDE Direction is used to specify that the observations below
   the cutoff point will be used to calculate SemiVariance

  type: org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction"
  SemiVariance$Direction/DOWNSIDE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SemiVariance.Direction c : SemiVariance.Direction.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction[]`"
  ([]
    (SemiVariance$Direction/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.stat.descriptive.moment.SemiVariance$Direction [^java.lang.String name]
    (SemiVariance$Direction/valueOf name)))

