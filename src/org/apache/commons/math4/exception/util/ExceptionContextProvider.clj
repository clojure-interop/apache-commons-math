(ns org.apache.commons.math4.exception.util.ExceptionContextProvider
  "Interface for accessing the context data structure stored in Commons Math
  exceptions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception.util ExceptionContextProvider]))

(defn get-context
  "Gets a reference to the \"rich context\" data structure that allows to
   customize error messages and store key, value pairs in exceptions.

  returns: a reference to the exception context. - `org.apache.commons.math4.exception.util.ExceptionContext`"
  (^org.apache.commons.math4.exception.util.ExceptionContext [^ExceptionContextProvider this]
    (-> this (.getContext))))

