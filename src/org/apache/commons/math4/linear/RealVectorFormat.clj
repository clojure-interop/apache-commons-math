(ns org.apache.commons.math4.linear.RealVectorFormat
  "Formats a vector in components list format \"{v0; v1; ...; vk-1}\".
  The prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by
  any user-defined strings. The number format for components can be configured.
  White space is ignored at parse time, even if it is in the prefix, suffix
  or separator specifications. So even if the default separator does include a space
  character that is used at format time, both input string \"{1;1;1}\" and
  \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be
  returned. In the second case, however, the parse position after parsing will be
  just after the closing curly brace, i.e. just before the trailing space."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear RealVectorFormat]))

(defn ->real-vector-format
  "Constructor.

  Create an instance with custom prefix, suffix, separator and format
   for components.

  prefix - prefix to use instead of the default \"{\" - `java.lang.String`
  suffix - suffix to use instead of the default \"}\" - `java.lang.String`
  separator - separator to use instead of the default \"; \" - `java.lang.String`
  format - the custom format for components. - `java.text.NumberFormat`"
  (^RealVectorFormat [^java.lang.String prefix ^java.lang.String suffix ^java.lang.String separator ^java.text.NumberFormat format]
    (new RealVectorFormat prefix suffix separator format))
  (^RealVectorFormat [^java.lang.String prefix ^java.lang.String suffix ^java.lang.String separator]
    (new RealVectorFormat prefix suffix separator))
  (^RealVectorFormat [^java.text.NumberFormat format]
    (new RealVectorFormat format))
  (^RealVectorFormat []
    (new RealVectorFormat )))

(defn *get-available-locales
  "Get the set of locales for which real vectors formats are available.
   This is the same set as the NumberFormat set.

  returns: available real vector format locales. - `java.util.Locale[]`"
  ([]
    (RealVectorFormat/getAvailableLocales )))

(defn *get-instance
  "Returns the default real vector format for the given locale.

  locale - the specific locale used by the format. - `java.util.Locale`

  returns: the real vector format specific to the given locale. - `org.apache.commons.math4.linear.RealVectorFormat`"
  (^org.apache.commons.math4.linear.RealVectorFormat [^java.util.Locale locale]
    (RealVectorFormat/getInstance locale))
  (^org.apache.commons.math4.linear.RealVectorFormat []
    (RealVectorFormat/getInstance )))

(defn get-prefix
  "Get the format prefix.

  returns: format prefix. - `java.lang.String`"
  (^java.lang.String [^RealVectorFormat this]
    (-> this (.getPrefix))))

(defn get-suffix
  "Get the format suffix.

  returns: format suffix. - `java.lang.String`"
  (^java.lang.String [^RealVectorFormat this]
    (-> this (.getSuffix))))

(defn get-separator
  "Get the format separator between components.

  returns: format separator. - `java.lang.String`"
  (^java.lang.String [^RealVectorFormat this]
    (-> this (.getSeparator))))

(defn get-format
  "Get the components format.

  returns: components format. - `java.text.NumberFormat`"
  (^java.text.NumberFormat [^RealVectorFormat this]
    (-> this (.getFormat))))

(defn format
  "Formats a RealVector object to produce a string.

  vector - the object to format. - `org.apache.commons.math4.linear.RealVector`
  to-append-to - where the text is to be appended - `java.lang.StringBuffer`
  pos - On input: an alignment field, if desired. On output: the offsets of the alignment field - `java.text.FieldPosition`

  returns: the value passed in as toAppendTo. - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^RealVectorFormat this ^org.apache.commons.math4.linear.RealVector vector ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format vector to-append-to pos)))
  (^java.lang.String [^RealVectorFormat this ^org.apache.commons.math4.linear.RealVector v]
    (-> this (.format v))))

(defn parse
  "Parse a string to produce a RealVector object.

  source - String to parse. - `java.lang.String`
  pos - input/ouput parsing parameter. - `java.text.ParsePosition`

  returns: the parsed RealVector object. - `org.apache.commons.math4.linear.ArrayRealVector`"
  (^org.apache.commons.math4.linear.ArrayRealVector [^RealVectorFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos)))
  (^org.apache.commons.math4.linear.ArrayRealVector [^RealVectorFormat this ^java.lang.String source]
    (-> this (.parse source))))

