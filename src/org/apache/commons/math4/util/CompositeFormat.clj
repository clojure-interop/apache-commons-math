(ns org.apache.commons.math4.util.CompositeFormat
  "Base class for formatters of composite objects (complex numbers, vectors ...)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util CompositeFormat]))

(defn *get-default-number-format
  "Create a default number format.  The default number format is based on
   NumberFormat.getInstance(java.util.Locale) with the only
   customizing that the maximum number of fraction digits is set to 10.

  locale - the specific locale used by the format. - `java.util.Locale`

  returns: the default number format specific to the given locale. - `java.text.NumberFormat`"
  (^java.text.NumberFormat [^java.util.Locale locale]
    (CompositeFormat/getDefaultNumberFormat locale))
  (^java.text.NumberFormat []
    (CompositeFormat/getDefaultNumberFormat )))

(defn *parse-and-ignore-whitespace
  "Parses source until a non-whitespace character is found.

  source - the string to parse - `java.lang.String`
  pos - input/output parsing parameter. On output, pos holds the index of the next non-whitespace character. - `java.text.ParsePosition`"
  ([^java.lang.String source ^java.text.ParsePosition pos]
    (CompositeFormat/parseAndIgnoreWhitespace source pos)))

(defn *parse-next-character
  "Parses source until a non-whitespace character is found.

  source - the string to parse - `java.lang.String`
  pos - input/output parsing parameter. - `java.text.ParsePosition`

  returns: the first non-whitespace character. - `char`"
  (^Character [^java.lang.String source ^java.text.ParsePosition pos]
    (CompositeFormat/parseNextCharacter source pos)))

(defn *parse-number
  "Parses source for a number.  This method can parse normal,
   numeric values as well as special values.  These special values include
   Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY.

  source - the string to parse - `java.lang.String`
  format - the number format used to parse normal, numeric values. - `java.text.NumberFormat`
  pos - input/output parsing parameter. - `java.text.ParsePosition`

  returns: the parsed number. - `java.lang.Number`"
  (^java.lang.Number [^java.lang.String source ^java.text.NumberFormat format ^java.text.ParsePosition pos]
    (CompositeFormat/parseNumber source format pos)))

(defn *parse-fixedstring
  "Parse source for an expected fixed string.

  source - the string to parse - `java.lang.String`
  expected - expected string - `java.lang.String`
  pos - input/output parsing parameter. - `java.text.ParsePosition`

  returns: true if the expected string was there - `boolean`"
  (^Boolean [^java.lang.String source ^java.lang.String expected ^java.text.ParsePosition pos]
    (CompositeFormat/parseFixedstring source expected pos)))

(defn *format-double
  "Formats a double value to produce a string.  In general, the value is
   formatted using the formatting rules of format.  There are
   three exceptions to this:

   NaN is formatted as '(NaN)'
   Positive infinity is formatted as '(Infinity)'
   Negative infinity is formatted as '(-Infinity)'

  value - the double to format. - `double`
  format - the format used. - `java.text.NumberFormat`
  to-append-to - where the text is to be appended - `java.lang.StringBuffer`
  pos - On input: an alignment field, if desired. On output: the offsets of the alignment field - `java.text.FieldPosition`

  returns: the value passed in as toAppendTo. - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^Double value ^java.text.NumberFormat format ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (CompositeFormat/formatDouble value format to-append-to pos)))

