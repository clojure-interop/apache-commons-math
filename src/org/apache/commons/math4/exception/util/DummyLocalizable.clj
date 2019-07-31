(ns org.apache.commons.math4.exception.util.DummyLocalizable
  "Dummy implementation of the Localizable interface, without localization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception.util DummyLocalizable]))

(defn ->dummy-localizable
  "Constructor.

  Simple constructor.

  source - source text - `java.lang.String`"
  (^DummyLocalizable [^java.lang.String source]
    (new DummyLocalizable source)))

(defn get-source-string
  "Gets the source (non-localized) string.

  returns: the source string. - `java.lang.String`"
  (^java.lang.String [^DummyLocalizable this]
    (-> this (.getSourceString))))

(defn get-localized-string
  "Gets the localized string.

  locale - locale into which to get the string. - `java.util.Locale`

  returns: the localized string or the source string if no
   localized version is available. - `java.lang.String`"
  (^java.lang.String [^DummyLocalizable this ^java.util.Locale locale]
    (-> this (.getLocalizedString locale))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DummyLocalizable this]
    (-> this (.toString))))

