(ns org.apache.commons.math4.geometry.VectorFormat
  "Formats a vector in components list format \"{x; y; ...}\".
  The prefix and suffix \"{\" and \"}\" and the separator \"; \" can be replaced by
  any user-defined strings. The number format for components can be configured.
  White space is ignored at parse time, even if it is in the prefix, suffix
  or separator specifications. So even if the default separator does include a space
  character that is used at format time, both input string \"{1;1;1}\" and
  \" { 1 ; 1 ; 1 } \" will be parsed without error and the same vector will be
  returned. In the second case, however, the parse position after parsing will be
  just after the closing curly brace, i.e. just before the trailing space.
  Note: using \",\" as a separator may interfere with the grouping separator
  of the default NumberFormat for the current locale. Thus it is advised
  to use a NumberFormat instance with disabled grouping in such a case."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry VectorFormat]))

(def *-default-prefix
  "Static Constant.

  The default prefix: \"{\".

  type: java.lang.String"
  VectorFormat/DEFAULT_PREFIX)

(def *-default-suffix
  "Static Constant.

  The default suffix: \"}\".

  type: java.lang.String"
  VectorFormat/DEFAULT_SUFFIX)

(def *-default-separator
  "Static Constant.

  The default separator: \", \".

  type: java.lang.String"
  VectorFormat/DEFAULT_SEPARATOR)

(defn *get-available-locales
  "Get the set of locales for which point/vector formats are available.
   This is the same set as the NumberFormat set.

  returns: available point/vector format locales. - `java.util.Locale[]`"
  ([]
    (VectorFormat/getAvailableLocales )))

(defn get-prefix
  "Get the format prefix.

  returns: format prefix. - `java.lang.String`"
  (^java.lang.String [^VectorFormat this]
    (-> this (.getPrefix))))

(defn get-suffix
  "Get the format suffix.

  returns: format suffix. - `java.lang.String`"
  (^java.lang.String [^VectorFormat this]
    (-> this (.getSuffix))))

(defn get-separator
  "Get the format separator between components.

  returns: format separator. - `java.lang.String`"
  (^java.lang.String [^VectorFormat this]
    (-> this (.getSeparator))))

(defn get-format
  "Get the components format.

  returns: components format. - `java.text.NumberFormat`"
  (^java.text.NumberFormat [^VectorFormat this]
    (-> this (.getFormat))))

(defn format
  "Formats a Vector object to produce a string.

  vector - the object to format. - `org.apache.commons.math4.geometry.Vector`
  to-append-to - where the text is to be appended - `java.lang.StringBuffer`
  pos - On input: an alignment field, if desired. On output: the offsets of the alignment field - `java.text.FieldPosition`

  returns: the value passed in as toAppendTo. - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^VectorFormat this ^org.apache.commons.math4.geometry.Vector vector ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format vector to-append-to pos)))
  (^java.lang.String [^VectorFormat this ^org.apache.commons.math4.geometry.Vector vector]
    (-> this (.format vector))))

(defn parse
  "Parses a string to produce a Vector object.

  source - the string to parse - `java.lang.String`
  pos - input/output parsing parameter. - `java.text.ParsePosition`

  returns: the parsed Vector object. - `org.apache.commons.math4.geometry.Vector<S>`"
  (^org.apache.commons.math4.geometry.Vector [^VectorFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos)))
  (^org.apache.commons.math4.geometry.Vector [^VectorFormat this ^java.lang.String source]
    (-> this (.parse source))))

