(ns org.apache.commons.math4.fraction.FractionField
  "Representation of the fractional numbers field.

  This class is a singleton."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fraction FractionField]))

(defn *get-instance
  "Get the unique instance.

  returns: the unique instance - `org.apache.commons.math4.fraction.FractionField`"
  (^org.apache.commons.math4.fraction.FractionField []
    (FractionField/getInstance )))

(defn get-one
  "Get the multiplicative identity of the field.

   The multiplicative identity is the element e1 of the field such that
   for all elements a of the field, the equalities a × e1 =
   e1 × a = a hold.

  returns: multiplicative identity of the field - `org.apache.commons.math4.fraction.Fraction`"
  (^org.apache.commons.math4.fraction.Fraction [^FractionField this]
    (-> this (.getOne))))

(defn get-zero
  "Get the additive identity of the field.

   The additive identity is the element e0 of the field such that
   for all elements a of the field, the equalities a  e0 =
   e0  a = a hold.

  returns: additive identity of the field - `org.apache.commons.math4.fraction.Fraction`"
  (^org.apache.commons.math4.fraction.Fraction [^FractionField this]
    (-> this (.getZero))))

(defn get-runtime-class
  "Returns the runtime class of the FieldElement.

  returns: The Class object that represents the runtime
           class of this object. - `java.lang.Class<? extends org.apache.commons.math4.FieldElement<org.apache.commons.math4.fraction.Fraction>>`"
  ([^FractionField this]
    (-> this (.getRuntimeClass))))

