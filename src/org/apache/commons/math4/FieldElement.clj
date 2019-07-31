(ns org.apache.commons.math4.FieldElement
  "Interface representing field elements."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4 FieldElement]))

(defn add
  "Compute this  a.

  a - element to add - `T`

  returns: a new element representing this  a - `T`

  throws: org.apache.commons.math4.exception.NullArgumentException - if a is null."
  ([^FieldElement this a]
    (-> this (.add a))))

(defn subtract
  "Compute this - a.

  a - element to subtract - `T`

  returns: a new element representing this - a - `T`

  throws: org.apache.commons.math4.exception.NullArgumentException - if a is null."
  ([^FieldElement this a]
    (-> this (.subtract a))))

(defn negate
  "Returns the additive inverse of this element.

  returns: the opposite of this. - `T`"
  ([^FieldElement this]
    (-> this (.negate))))

(defn multiply
  "Compute n × this. Multiplication by an integer number is defined
   as the following sum

   n × this = ∑i=1n this.

  n - Number of times this must be added to itself. - `int`

  returns: A new element representing n × this. - `T`"
  ([^FieldElement this ^Integer n]
    (-> this (.multiply n))))

(defn divide
  "Compute this ÷ a.

  a - element to divide by - `T`

  returns: a new element representing this ÷ a - `T`

  throws: org.apache.commons.math4.exception.NullArgumentException - if a is null."
  ([^FieldElement this a]
    (-> this (.divide a))))

(defn reciprocal
  "Returns the multiplicative inverse of this element.

  returns: the inverse of this. - `T`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if this is zero"
  ([^FieldElement this]
    (-> this (.reciprocal))))

(defn get-field
  "Get the Field to which the instance belongs.

  returns: Field to which the instance belongs - `org.apache.commons.math4.Field<T>`"
  (^org.apache.commons.math4.Field [^FieldElement this]
    (-> this (.getField))))

