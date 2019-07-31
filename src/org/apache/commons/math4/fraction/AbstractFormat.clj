(ns org.apache.commons.math4.fraction.AbstractFormat
  "Common part shared by both FractionFormat and BigFractionFormat."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fraction AbstractFormat]))

(defn get-denominator-format
  "Access the denominator format.

  returns: the denominator format. - `java.text.NumberFormat`"
  (^java.text.NumberFormat [^AbstractFormat this]
    (-> this (.getDenominatorFormat))))

(defn get-numerator-format
  "Access the numerator format.

  returns: the numerator format. - `java.text.NumberFormat`"
  (^java.text.NumberFormat [^AbstractFormat this]
    (-> this (.getNumeratorFormat))))

(defn set-denominator-format
  "Modify the denominator format.

  format - the new denominator format value. - `java.text.NumberFormat`

  throws: org.apache.commons.math4.exception.NullArgumentException - if format is null."
  ([^AbstractFormat this ^java.text.NumberFormat format]
    (-> this (.setDenominatorFormat format))))

(defn set-numerator-format
  "Modify the numerator format.

  format - the new numerator format value. - `java.text.NumberFormat`

  throws: org.apache.commons.math4.exception.NullArgumentException - if format is null."
  ([^AbstractFormat this ^java.text.NumberFormat format]
    (-> this (.setNumeratorFormat format))))

(defn format
  "Formats a double value as a fraction and appends the result to a StringBuffer.

  value - the double value to format - `double`
  buffer - StringBuffer to append to - `java.lang.StringBuffer`
  position - On input: an alignment field, if desired. On output: the offsets of the alignment field - `java.text.FieldPosition`

  returns: a reference to the appended buffer - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^AbstractFormat this ^Double value ^java.lang.StringBuffer buffer ^java.text.FieldPosition position]
    (-> this (.format value buffer position))))

