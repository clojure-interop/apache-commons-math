(ns org.apache.commons.math4.exception.util.ExceptionContext
  "Class that contains the actual implementation of the functionality mandated
  by the ExceptionContext interface.
  All Commons Math exceptions delegate the interface's methods to this class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception.util ExceptionContext]))

(defn ->exception-context
  "Constructor.

  Simple constructor.

  throwable - the exception this context refers too - `java.lang.Throwable`"
  (^ExceptionContext [^java.lang.Throwable throwable]
    (new ExceptionContext throwable)))

(defn get-throwable
  "Get a reference to the exception to which the context relates.

  returns: a reference to the exception to which the context relates - `java.lang.Throwable`"
  (^java.lang.Throwable [^ExceptionContext this]
    (-> this (.getThrowable))))

(defn add-message
  "Adds a message.

  pattern - Message pattern. - `org.apache.commons.math4.exception.util.Localizable`
  arguments - Values for replacing the placeholders in the message pattern. - `java.lang.Object`"
  ([^ExceptionContext this ^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object arguments]
    (-> this (.addMessage pattern arguments))))

(defn set-value
  "Sets the context (key, value) pair.
   Keys are assumed to be unique within an instance. If the same key is
   assigned a new value, the previous one will be lost.

  key - Context key (not null). - `java.lang.String`
  value - Context value. - `java.lang.Object`"
  ([^ExceptionContext this ^java.lang.String key ^java.lang.Object value]
    (-> this (.setValue key value))))

(defn get-value
  "Gets the value associated to the given context key.

  key - Context key. - `java.lang.String`

  returns: the context value or null if the key does not exist. - `java.lang.Object`"
  (^java.lang.Object [^ExceptionContext this ^java.lang.String key]
    (-> this (.getValue key))))

(defn get-keys
  "Gets all the keys stored in the exception

  returns: the set of keys. - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^ExceptionContext this]
    (-> this (.getKeys))))

(defn get-message
  "Gets the message in a specified locale.

  locale - Locale in which the message should be translated. - `java.util.Locale`
  separator - Separator inserted between the message parts. - `java.lang.String`

  returns: the localized message. - `java.lang.String`"
  (^java.lang.String [^ExceptionContext this ^java.util.Locale locale ^java.lang.String separator]
    (-> this (.getMessage locale separator)))
  (^java.lang.String [^ExceptionContext this ^java.util.Locale locale]
    (-> this (.getMessage locale)))
  (^java.lang.String [^ExceptionContext this]
    (-> this (.getMessage))))

(defn get-localized-message
  "Gets the message in the default locale.

  returns: the localized message. - `java.lang.String`"
  (^java.lang.String [^ExceptionContext this]
    (-> this (.getLocalizedMessage))))

