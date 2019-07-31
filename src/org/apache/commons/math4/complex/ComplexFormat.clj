(ns org.apache.commons.math4.complex.ComplexFormat
  "Formats a Complex number in cartesian format \"Re(c)  Im(c)i\".  'i' can
  be replaced with 'j' (or anything else), and the number format for both real
  and imaginary parts can be configured."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.complex ComplexFormat]))

(defn ->complex-format
  "Constructor.

  Create an instance with a custom imaginary character, a custom number
   format for the real part, and a custom number format for the imaginary
   part.

  imaginary-character - The custom imaginary character. - `java.lang.String`
  real-format - the custom format for the real part. - `java.text.NumberFormat`
  imaginary-format - the custom format for the imaginary part. - `java.text.NumberFormat`

  throws: org.apache.commons.math4.exception.NullArgumentException - if realFormat is null."
  (^ComplexFormat [^java.lang.String imaginary-character ^java.text.NumberFormat real-format ^java.text.NumberFormat imaginary-format]
    (new ComplexFormat imaginary-character real-format imaginary-format))
  (^ComplexFormat [^java.text.NumberFormat real-format ^java.text.NumberFormat imaginary-format]
    (new ComplexFormat real-format imaginary-format))
  (^ComplexFormat [^java.text.NumberFormat format]
    (new ComplexFormat format))
  (^ComplexFormat []
    (new ComplexFormat )))

(defn *get-available-locales
  "Get the set of locales for which complex formats are available.
   This is the same set as the NumberFormat set.

  returns: available complex format locales. - `java.util.Locale[]`"
  ([]
    (ComplexFormat/getAvailableLocales )))

(defn *get-instance
  "Returns the default complex format for the given locale.

  imaginary-character - Imaginary character. - `java.lang.String`
  locale - the specific locale used by the format. - `java.util.Locale`

  returns: the complex format specific to the given locale. - `org.apache.commons.math4.complex.ComplexFormat`

  throws: org.apache.commons.math4.exception.NullArgumentException - if imaginaryCharacter is null."
  (^org.apache.commons.math4.complex.ComplexFormat [^java.lang.String imaginary-character ^java.util.Locale locale]
    (ComplexFormat/getInstance imaginary-character locale))
  (^org.apache.commons.math4.complex.ComplexFormat [^java.util.Locale locale]
    (ComplexFormat/getInstance locale))
  (^org.apache.commons.math4.complex.ComplexFormat []
    (ComplexFormat/getInstance )))

(defn format
  "Formats a Complex object to produce a string.

  complex - the object to format. - `org.apache.commons.math4.complex.Complex`
  to-append-to - where the text is to be appended - `java.lang.StringBuffer`
  pos - On input: an alignment field, if desired. On output: the offsets of the alignment field - `java.text.FieldPosition`

  returns: the value passed in as toAppendTo. - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^ComplexFormat this ^org.apache.commons.math4.complex.Complex complex ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format complex to-append-to pos)))
  (^java.lang.String [^ComplexFormat this ^org.apache.commons.math4.complex.Complex c]
    (-> this (.format c))))

(defn get-imaginary-character
  "Access the imaginaryCharacter.

  returns: the imaginaryCharacter. - `java.lang.String`"
  (^java.lang.String [^ComplexFormat this]
    (-> this (.getImaginaryCharacter))))

(defn get-imaginary-format
  "Access the imaginaryFormat.

  returns: the imaginaryFormat. - `java.text.NumberFormat`"
  (^java.text.NumberFormat [^ComplexFormat this]
    (-> this (.getImaginaryFormat))))

(defn get-real-format
  "Access the realFormat.

  returns: the realFormat. - `java.text.NumberFormat`"
  (^java.text.NumberFormat [^ComplexFormat this]
    (-> this (.getRealFormat))))

(defn parse
  "Parses a string to produce a Complex object.

  source - the string to parse - `java.lang.String`
  pos - input/ouput parsing parameter. - `java.text.ParsePosition`

  returns: the parsed Complex object. - `org.apache.commons.math4.complex.Complex`"
  (^org.apache.commons.math4.complex.Complex [^ComplexFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos)))
  (^org.apache.commons.math4.complex.Complex [^ComplexFormat this ^java.lang.String source]
    (-> this (.parse source))))

