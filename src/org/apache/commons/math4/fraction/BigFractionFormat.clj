(ns org.apache.commons.math4.fraction.BigFractionFormat
  "Formats a BigFraction number in proper format or improper format.

  The number format for each of the whole number, numerator and,
  denominator can be configured."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fraction BigFractionFormat]))

(defn ->big-fraction-format
  "Constructor.

  Create an improper formatting instance with a custom number format for
   the numerator and a custom number format for the denominator.

  numerator-format - the custom format for the numerator. - `java.text.NumberFormat`
  denominator-format - the custom format for the denominator. - `java.text.NumberFormat`"
  (^BigFractionFormat [^java.text.NumberFormat numerator-format ^java.text.NumberFormat denominator-format]
    (new BigFractionFormat numerator-format denominator-format))
  (^BigFractionFormat [^java.text.NumberFormat format]
    (new BigFractionFormat format))
  (^BigFractionFormat []
    (new BigFractionFormat )))

(defn *get-available-locales
  "Get the set of locales for which complex formats are available.  This
   is the same set as the NumberFormat set.

  returns: available complex format locales. - `java.util.Locale[]`"
  ([]
    (BigFractionFormat/getAvailableLocales )))

(defn *format-big-fraction
  "This static method calls formatBigFraction() on a default instance of
   BigFractionFormat.

  f - BigFraction object to format - `org.apache.commons.math4.fraction.BigFraction`

  returns: A formatted BigFraction in proper form. - `java.lang.String`"
  (^java.lang.String [^org.apache.commons.math4.fraction.BigFraction f]
    (BigFractionFormat/formatBigFraction f)))

(defn *get-improper-instance
  "Returns the default complex format for the given locale.

  locale - the specific locale used by the format. - `java.util.Locale`

  returns: the complex format specific to the given locale. - `org.apache.commons.math4.fraction.BigFractionFormat`"
  (^org.apache.commons.math4.fraction.BigFractionFormat [^java.util.Locale locale]
    (BigFractionFormat/getImproperInstance locale))
  (^org.apache.commons.math4.fraction.BigFractionFormat []
    (BigFractionFormat/getImproperInstance )))

(defn *get-proper-instance
  "Returns the default complex format for the given locale.

  locale - the specific locale used by the format. - `java.util.Locale`

  returns: the complex format specific to the given locale. - `org.apache.commons.math4.fraction.BigFractionFormat`"
  (^org.apache.commons.math4.fraction.BigFractionFormat [^java.util.Locale locale]
    (BigFractionFormat/getProperInstance locale))
  (^org.apache.commons.math4.fraction.BigFractionFormat []
    (BigFractionFormat/getProperInstance )))

(defn format
  "Formats a BigFraction object to produce a string.  The BigFraction is
   output in improper format.

  big-fraction - the object to format. - `org.apache.commons.math4.fraction.BigFraction`
  to-append-to - where the text is to be appended - `java.lang.StringBuffer`
  pos - On input: an alignment field, if desired. On output: the offsets of the alignment field - `java.text.FieldPosition`

  returns: the value passed in as toAppendTo. - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^BigFractionFormat this ^org.apache.commons.math4.fraction.BigFraction big-fraction ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format big-fraction to-append-to pos))))

(defn parse
  "Parses a string to produce a BigFraction object.
   This method expects the string to be formatted as an improper BigFraction.

  source - the string to parse - `java.lang.String`
  pos - input/output parsing parameter. - `java.text.ParsePosition`

  returns: the parsed BigFraction object. - `org.apache.commons.math4.fraction.BigFraction`"
  (^org.apache.commons.math4.fraction.BigFraction [^BigFractionFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos)))
  (^org.apache.commons.math4.fraction.BigFraction [^BigFractionFormat this ^java.lang.String source]
    (-> this (.parse source))))

