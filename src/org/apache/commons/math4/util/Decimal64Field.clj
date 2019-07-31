(ns org.apache.commons.math4.util.Decimal64Field
  "The field of double precision floating-point numbers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util Decimal64Field]))

(defn *get-instance
  "Returns the unique instance of this class.

  returns: the unique instance of this class - `org.apache.commons.math4.util.Decimal64Field`"
  (^org.apache.commons.math4.util.Decimal64Field []
    (Decimal64Field/getInstance )))

(defn get-zero
  "Get the additive identity of the field.

   The additive identity is the element e0 of the field such that
   for all elements a of the field, the equalities a  e0 =
   e0  a = a hold.

  returns: additive identity of the field - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64Field this]
    (-> this (.getZero))))

(defn get-one
  "Get the multiplicative identity of the field.

   The multiplicative identity is the element e1 of the field such that
   for all elements a of the field, the equalities a × e1 =
   e1 × a = a hold.

  returns: multiplicative identity of the field - `org.apache.commons.math4.util.Decimal64`"
  (^org.apache.commons.math4.util.Decimal64 [^Decimal64Field this]
    (-> this (.getOne))))

(defn get-runtime-class
  "Returns the runtime class of the FieldElement.

  returns: The Class object that represents the runtime
           class of this object. - `java.lang.Class<? extends org.apache.commons.math4.FieldElement<org.apache.commons.math4.util.Decimal64>>`"
  ([^Decimal64Field this]
    (-> this (.getRuntimeClass))))

