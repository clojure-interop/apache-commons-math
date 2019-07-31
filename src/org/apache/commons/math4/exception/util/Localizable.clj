(ns org.apache.commons.math4.exception.util.Localizable
  "Interface for localizable strings."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception.util Localizable]))

(defn get-source-string
  "Gets the source (non-localized) string.

  returns: the source string. - `java.lang.String`"
  (^java.lang.String [^Localizable this]
    (-> this (.getSourceString))))

(defn get-localized-string
  "Gets the localized string.

  locale - locale into which to get the string. - `java.util.Locale`

  returns: the localized string or the source string if no
   localized version is available. - `java.lang.String`"
  (^java.lang.String [^Localizable this ^java.util.Locale locale]
    (-> this (.getLocalizedString locale))))

