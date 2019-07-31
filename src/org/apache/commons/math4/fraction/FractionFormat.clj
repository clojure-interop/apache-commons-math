(ns org.apache.commons.math4.fraction.FractionFormat
  "Formats a Fraction number in proper format or improper format.  The number
  format for each of the whole number, numerator and, denominator can be
  configured."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fraction FractionFormat]))

(defn ->fraction-format
  "Constructor.

  Create an improper formatting instance with a custom number format for
   the numerator and a custom number format for the denominator.

  numerator-format - the custom format for the numerator. - `java.text.NumberFormat`
  denominator-format - the custom format for the denominator. - `java.text.NumberFormat`"
  (^FractionFormat [^java.text.NumberFormat numerator-format ^java.text.NumberFormat denominator-format]
    (new FractionFormat numerator-format denominator-format))
  (^FractionFormat [^java.text.NumberFormat format]
    (new FractionFormat format))
  (^FractionFormat []
    (new FractionFormat )))

(defn *get-available-locales
  "Get the set of locales for which complex formats are available.  This
   is the same set as the NumberFormat set.

  returns: available complex format locales. - `java.util.Locale[]`"
  ([]
    (FractionFormat/getAvailableLocales )))

(defn *format-fraction
  "This static method calls formatFraction() on a default instance of
   FractionFormat.

  f - Fraction object to format - `org.apache.commons.math4.fraction.Fraction`

  returns: a formatted fraction in proper form. - `java.lang.String`"
  (^java.lang.String [^org.apache.commons.math4.fraction.Fraction f]
    (FractionFormat/formatFraction f)))

(defn *get-improper-instance
  "Returns the default complex format for the given locale.

  locale - the specific locale used by the format. - `java.util.Locale`

  returns: the complex format specific to the given locale. - `org.apache.commons.math4.fraction.FractionFormat`"
  (^org.apache.commons.math4.fraction.FractionFormat [^java.util.Locale locale]
    (FractionFormat/getImproperInstance locale))
  (^org.apache.commons.math4.fraction.FractionFormat []
    (FractionFormat/getImproperInstance )))

(defn *get-proper-instance
  "Returns the default complex format for the given locale.

  locale - the specific locale used by the format. - `java.util.Locale`

  returns: the complex format specific to the given locale. - `org.apache.commons.math4.fraction.FractionFormat`"
  (^org.apache.commons.math4.fraction.FractionFormat [^java.util.Locale locale]
    (FractionFormat/getProperInstance locale))
  (^org.apache.commons.math4.fraction.FractionFormat []
    (FractionFormat/getProperInstance )))

(defn format
  "Formats a Fraction object to produce a string.  The fraction is
   output in improper format.

  fraction - the object to format. - `org.apache.commons.math4.fraction.Fraction`
  to-append-to - where the text is to be appended - `java.lang.StringBuffer`
  pos - On input: an alignment field, if desired. On output: the offsets of the alignment field - `java.text.FieldPosition`

  returns: the value passed in as toAppendTo. - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^FractionFormat this ^org.apache.commons.math4.fraction.Fraction fraction ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format fraction to-append-to pos))))

(defn parse
  "Parses a string to produce a Fraction object.  This method
   expects the string to be formatted as an improper fraction.

  source - the string to parse - `java.lang.String`
  pos - input/output parsing parameter. - `java.text.ParsePosition`

  returns: the parsed Fraction object. - `org.apache.commons.math4.fraction.Fraction`"
  (^org.apache.commons.math4.fraction.Fraction [^FractionFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos)))
  (^org.apache.commons.math4.fraction.Fraction [^FractionFormat this ^java.lang.String source]
    (-> this (.parse source))))

