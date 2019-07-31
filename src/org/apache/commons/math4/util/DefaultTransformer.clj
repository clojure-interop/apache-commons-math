(ns org.apache.commons.math4.util.DefaultTransformer
  "A Default NumberTransformer for java.lang.Numbers and Numeric Strings. This
  provides some simple conversion capabilities to turn any java.lang.Number
  into a primitive double or to turn a String representation of a Number into
  a double."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util DefaultTransformer]))

(defn ->default-transformer
  "Constructor."
  (^DefaultTransformer []
    (new DefaultTransformer )))

(defn transform
  "Description copied from interface: NumberTransformer

  o - the object that gets transformed. - `java.lang.Object`

  returns: a double primitive representation of the Object o. - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if Object o is null."
  (^Double [^DefaultTransformer this ^java.lang.Object o]
    (-> this (.transform o))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DefaultTransformer this ^java.lang.Object other]
    (-> this (.equals other))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DefaultTransformer this]
    (-> this (.hashCode))))

