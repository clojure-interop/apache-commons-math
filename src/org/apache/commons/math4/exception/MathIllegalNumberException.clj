(ns org.apache.commons.math4.exception.MathIllegalNumberException
  "Base class for exceptions raised by a wrong number.
  This class is not intended to be instantiated directly: it should serve
  as a base class to create all the exceptions that are raised because some
  precondition is violated by a number argument."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception MathIllegalNumberException]))

(defn get-argument
  "returns: the requested value. - `java.lang.Number`"
  (^java.lang.Number [^MathIllegalNumberException this]
    (-> this (.getArgument))))

