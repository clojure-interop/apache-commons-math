(ns org.apache.commons.math4.geometry.euclidean.oned.Vector1DFormat
  "Formats a 1D vector in components list format \"{x}\".
  The prefix and suffix \"{\" and \"}\" can be replaced by
  any user-defined strings. The number format for components can be configured.
  White space is ignored at parse time, even if it is in the prefix, suffix
  or separator specifications. So even if the default separator does include a space
  character that is used at format time, both input string \"{1}\" and
  \" { 1 } \" will be parsed without error and the same vector will be
  returned. In the second case, however, the parse position after parsing will be
  just after the closing curly brace, i.e. just before the trailing space.
  Note: using \",\" as a separator may interfere with the grouping separator
  of the default NumberFormat for the current locale. Thus it is advised
  to use a NumberFormat instance with disabled grouping in such a case."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.oned Vector1DFormat]))

(defn ->vector-1-d-format
  "Constructor.

  Create an instance with custom prefix, suffix, separator and format
   for components.

  prefix - prefix to use instead of the default \"{\" - `java.lang.String`
  suffix - suffix to use instead of the default \"}\" - `java.lang.String`
  format - the custom format for components. - `java.text.NumberFormat`"
  (^Vector1DFormat [^java.lang.String prefix ^java.lang.String suffix ^java.text.NumberFormat format]
    (new Vector1DFormat prefix suffix format))
  (^Vector1DFormat [^java.lang.String prefix ^java.lang.String suffix]
    (new Vector1DFormat prefix suffix))
  (^Vector1DFormat [^java.text.NumberFormat format]
    (new Vector1DFormat format))
  (^Vector1DFormat []
    (new Vector1DFormat )))

(defn *get-instance
  "Returns the default 1D vector format for the given locale.

  locale - the specific locale used by the format. - `java.util.Locale`

  returns: the 1D vector format specific to the given locale. - `org.apache.commons.math4.geometry.euclidean.oned.Vector1DFormat`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1DFormat [^java.util.Locale locale]
    (Vector1DFormat/getInstance locale))
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1DFormat []
    (Vector1DFormat/getInstance )))

(defn format
  "Formats a Vector object to produce a string.

  vector - the object to format. - `org.apache.commons.math4.geometry.Vector`
  to-append-to - where the text is to be appended - `java.lang.StringBuffer`
  pos - On input: an alignment field, if desired. On output: the offsets of the alignment field - `java.text.FieldPosition`

  returns: the value passed in as toAppendTo. - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^Vector1DFormat this ^org.apache.commons.math4.geometry.Vector vector ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format vector to-append-to pos))))

(defn parse
  "Parses a string to produce a Vector object.

  source - the string to parse - `java.lang.String`
  pos - input/output parsing parameter. - `java.text.ParsePosition`

  returns: the parsed Vector object. - `org.apache.commons.math4.geometry.euclidean.oned.Vector1D`"
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Vector1DFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos)))
  (^org.apache.commons.math4.geometry.euclidean.oned.Vector1D [^Vector1DFormat this ^java.lang.String source]
    (-> this (.parse source))))

