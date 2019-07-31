(ns org.apache.commons.math4.stat.ranking.TiesStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.ranking TiesStrategy]))

(def SEQUENTIAL
  "Enum Constant.

  Ties assigned sequential ranks in order of occurrence

  type: org.apache.commons.math4.stat.ranking.TiesStrategy"
  TiesStrategy/SEQUENTIAL)

(def MINIMUM
  "Enum Constant.

  Ties get the minimum applicable rank

  type: org.apache.commons.math4.stat.ranking.TiesStrategy"
  TiesStrategy/MINIMUM)

(def MAXIMUM
  "Enum Constant.

  Ties get the maximum applicable rank

  type: org.apache.commons.math4.stat.ranking.TiesStrategy"
  TiesStrategy/MAXIMUM)

(def AVERAGE
  "Enum Constant.

  Ties get the average of applicable ranks

  type: org.apache.commons.math4.stat.ranking.TiesStrategy"
  TiesStrategy/AVERAGE)

(def RANDOM
  "Enum Constant.

  Ties get a random integral value from among applicable ranks

  type: org.apache.commons.math4.stat.ranking.TiesStrategy"
  TiesStrategy/RANDOM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TiesStrategy c : TiesStrategy.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.stat.ranking.TiesStrategy[]`"
  ([]
    (TiesStrategy/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.stat.ranking.TiesStrategy`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.stat.ranking.TiesStrategy [^java.lang.String name]
    (TiesStrategy/valueOf name)))

