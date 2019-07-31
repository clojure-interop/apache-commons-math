(ns org.apache.commons.math4.fraction.ProperFractionFormat
  "Formats a Fraction number in proper format.  The number format for each of
  the whole number, numerator and, denominator can be configured.

  Minus signs are only allowed in the whole number part - i.e.,
  \"-3 1/2\" is legitimate and denotes -7/2, but \"-3 -1/2\" is invalid and
  will result in a ParseException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fraction ProperFractionFormat]))

(defn ->proper-fraction-format
  "Constructor.

  Create a proper formatting instance with a custom number format for each
   of the whole, numerator, and denominator.

  whole-format - the custom format for the whole. - `java.text.NumberFormat`
  numerator-format - the custom format for the numerator. - `java.text.NumberFormat`
  denominator-format - the custom format for the denominator. - `java.text.NumberFormat`"
  (^ProperFractionFormat [^java.text.NumberFormat whole-format ^java.text.NumberFormat numerator-format ^java.text.NumberFormat denominator-format]
    (new ProperFractionFormat whole-format numerator-format denominator-format))
  (^ProperFractionFormat [^java.text.NumberFormat format]
    (new ProperFractionFormat format))
  (^ProperFractionFormat []
    (new ProperFractionFormat )))

(defn format
  "Formats a Fraction object to produce a string.  The fraction
   is output in proper format.

  fraction - the object to format. - `org.apache.commons.math4.fraction.Fraction`
  to-append-to - where the text is to be appended - `java.lang.StringBuffer`
  pos - On input: an alignment field, if desired. On output: the offsets of the alignment field - `java.text.FieldPosition`

  returns: the value passed in as toAppendTo. - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^ProperFractionFormat this ^org.apache.commons.math4.fraction.Fraction fraction ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format fraction to-append-to pos))))

(defn get-whole-format
  "Access the whole format.

  returns: the whole format. - `java.text.NumberFormat`"
  (^java.text.NumberFormat [^ProperFractionFormat this]
    (-> this (.getWholeFormat))))

(defn parse
  "Parses a string to produce a Fraction object.  This method
   expects the string to be formatted as a proper fraction.

   Minus signs are only allowed in the whole number part - i.e.,
   \"-3 1/2\" is legitimate and denotes -7/2, but \"-3 -1/2\" is invalid and
   will result in a ParseException.

  source - the string to parse - `java.lang.String`
  pos - input/ouput parsing parameter. - `java.text.ParsePosition`

  returns: the parsed Fraction object. - `org.apache.commons.math4.fraction.Fraction`"
  (^org.apache.commons.math4.fraction.Fraction [^ProperFractionFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos))))

(defn set-whole-format
  "Modify the whole format.

  format - The new whole format value. - `java.text.NumberFormat`

  throws: org.apache.commons.math4.exception.NullArgumentException - if format is null."
  ([^ProperFractionFormat this ^java.text.NumberFormat format]
    (-> this (.setWholeFormat format))))

