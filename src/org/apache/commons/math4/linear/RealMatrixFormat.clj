(ns org.apache.commons.math4.linear.RealMatrixFormat
  "Formats a nxm matrix in components list format
  \"{{a00,a01, ...,
  a0m-1},{a10,
  a11, ..., a1m-1},{...},{
  an-10, an-11, ...,
  an-1m-1}}\".
  The prefix and suffix \"{\" and \"}\", the row prefix and suffix \"{\" and \"}\",
  the row separator \",\" and the column separator \",\" can be replaced by any
  user-defined strings. The number format for components can be configured.

  White space is ignored at parse time, even if it is in the prefix, suffix
  or separator specifications. So even if the default separator does include a space
  character that is used at format time, both input string \"{{1,1,1}}\" and
  \" { { 1 , 1 , 1 } } \" will be parsed without error and the same matrix will be
  returned. In the second case, however, the parse position after parsing will be
  just after the closing curly brace, i.e. just before the trailing space.

  Note: the grouping functionality of the used NumberFormat is
  disabled to prevent problems when parsing (e.g. 1,345.34 would be a valid number
  but conflicts with the default column separator)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear RealMatrixFormat]))

(defn ->real-matrix-format
  "Constructor.

  Create an instance with custom prefix, suffix, separator and format
   for components.

  prefix - prefix to use instead of the default \"{\" - `java.lang.String`
  suffix - suffix to use instead of the default \"}\" - `java.lang.String`
  row-prefix - row prefix to use instead of the default \"{\" - `java.lang.String`
  row-suffix - row suffix to use instead of the default \"}\" - `java.lang.String`
  row-separator - tow separator to use instead of the default \";\" - `java.lang.String`
  column-separator - column separator to use instead of the default \", \" - `java.lang.String`
  format - the custom format for components. - `java.text.NumberFormat`"
  (^RealMatrixFormat [^java.lang.String prefix ^java.lang.String suffix ^java.lang.String row-prefix ^java.lang.String row-suffix ^java.lang.String row-separator ^java.lang.String column-separator ^java.text.NumberFormat format]
    (new RealMatrixFormat prefix suffix row-prefix row-suffix row-separator column-separator format))
  (^RealMatrixFormat [^java.lang.String prefix ^java.lang.String suffix ^java.lang.String row-prefix ^java.lang.String row-suffix ^java.lang.String row-separator ^java.lang.String column-separator]
    (new RealMatrixFormat prefix suffix row-prefix row-suffix row-separator column-separator))
  (^RealMatrixFormat [^java.text.NumberFormat format]
    (new RealMatrixFormat format))
  (^RealMatrixFormat []
    (new RealMatrixFormat )))

(defn *get-available-locales
  "Get the set of locales for which real vectors formats are available.
   This is the same set as the NumberFormat set.

  returns: available real vector format locales. - `java.util.Locale[]`"
  ([]
    (RealMatrixFormat/getAvailableLocales )))

(defn *get-instance
  "Returns the default real vector format for the given locale.

  locale - the specific locale used by the format. - `java.util.Locale`

  returns: the real vector format specific to the given locale. - `org.apache.commons.math4.linear.RealMatrixFormat`"
  (^org.apache.commons.math4.linear.RealMatrixFormat [^java.util.Locale locale]
    (RealMatrixFormat/getInstance locale))
  (^org.apache.commons.math4.linear.RealMatrixFormat []
    (RealMatrixFormat/getInstance )))

(defn get-suffix
  "Get the format suffix.

  returns: format suffix. - `java.lang.String`"
  (^java.lang.String [^RealMatrixFormat this]
    (-> this (.getSuffix))))

(defn get-row-separator
  "Get the format separator between rows of the matrix.

  returns: format separator for rows. - `java.lang.String`"
  (^java.lang.String [^RealMatrixFormat this]
    (-> this (.getRowSeparator))))

(defn get-row-suffix
  "Get the format suffix.

  returns: format suffix. - `java.lang.String`"
  (^java.lang.String [^RealMatrixFormat this]
    (-> this (.getRowSuffix))))

(defn get-format
  "Get the components format.

  returns: components format. - `java.text.NumberFormat`"
  (^java.text.NumberFormat [^RealMatrixFormat this]
    (-> this (.getFormat))))

(defn get-column-separator
  "Get the format separator between components.

  returns: format separator between components. - `java.lang.String`"
  (^java.lang.String [^RealMatrixFormat this]
    (-> this (.getColumnSeparator))))

(defn parse
  "Parse a string to produce a RealMatrix object.

  source - String to parse. - `java.lang.String`
  pos - input/ouput parsing parameter. - `java.text.ParsePosition`

  returns: the parsed RealMatrix object. - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrixFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos)))
  (^org.apache.commons.math4.linear.RealMatrix [^RealMatrixFormat this ^java.lang.String source]
    (-> this (.parse source))))

(defn get-prefix
  "Get the format prefix.

  returns: format prefix. - `java.lang.String`"
  (^java.lang.String [^RealMatrixFormat this]
    (-> this (.getPrefix))))

(defn format
  "Formats a RealMatrix object to produce a string.

  matrix - the object to format. - `org.apache.commons.math4.linear.RealMatrix`
  to-append-to - where the text is to be appended - `java.lang.StringBuffer`
  pos - On input: an alignment field, if desired. On output: the offsets of the alignment field - `java.text.FieldPosition`

  returns: the value passed in as toAppendTo. - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^RealMatrixFormat this ^org.apache.commons.math4.linear.RealMatrix matrix ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format matrix to-append-to pos)))
  (^java.lang.String [^RealMatrixFormat this ^org.apache.commons.math4.linear.RealMatrix m]
    (-> this (.format m))))

(defn get-row-prefix
  "Get the format prefix.

  returns: format prefix. - `java.lang.String`"
  (^java.lang.String [^RealMatrixFormat this]
    (-> this (.getRowPrefix))))

