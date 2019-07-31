(ns org.apache.commons.math4.stat.inference.AlternativeHypothesis
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.inference AlternativeHypothesis]))

(def TWO_SIDED
  "Enum Constant.

  Represents a two-sided test. H0: p=p0, H1: p ≠ p0

  type: org.apache.commons.math4.stat.inference.AlternativeHypothesis"
  AlternativeHypothesis/TWO_SIDED)

(def GREATER_THAN
  "Enum Constant.

  Represents a right-sided test. H0: p ≤ p0, H1: p > p0.

  type: org.apache.commons.math4.stat.inference.AlternativeHypothesis"
  AlternativeHypothesis/GREATER_THAN)

(def LESS_THAN
  "Enum Constant.

  Represents a left-sided test. H0: p ≥ p0, H1: p < p0.

  type: org.apache.commons.math4.stat.inference.AlternativeHypothesis"
  AlternativeHypothesis/LESS_THAN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AlternativeHypothesis c : AlternativeHypothesis.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.stat.inference.AlternativeHypothesis[]`"
  ([]
    (AlternativeHypothesis/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.stat.inference.AlternativeHypothesis`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.stat.inference.AlternativeHypothesis [^java.lang.String name]
    (AlternativeHypothesis/valueOf name)))

