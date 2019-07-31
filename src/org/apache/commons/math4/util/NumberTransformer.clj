(ns org.apache.commons.math4.util.NumberTransformer
  "Subclasses implementing this interface can transform Objects to doubles.

  No longer extends Serializable since 2.0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util NumberTransformer]))

(defn transform
  "Implementing this interface provides a facility to transform
   from Object to Double.

  o - the Object to be transformed. - `java.lang.Object`

  returns: the double value of the Object. - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the Object can not be transformed into a Double."
  (^Double [^NumberTransformer this ^java.lang.Object o]
    (-> this (.transform o))))

