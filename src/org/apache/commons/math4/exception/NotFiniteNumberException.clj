(ns org.apache.commons.math4.exception.NotFiniteNumberException
  "Exception to be thrown when a number is not finite."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception NotFiniteNumberException]))

(defn ->not-finite-number-exception
  "Constructor.

  Construct the exception with a specific context.

  specific - Specific context pattern. - `org.apache.commons.math4.exception.util.Localizable`
  wrong - Value that is infinite or NaN. - `java.lang.Number`
  args - Optional arguments. - `java.lang.Object`"
  (^NotFiniteNumberException [^org.apache.commons.math4.exception.util.Localizable specific ^java.lang.Number wrong ^java.lang.Object args]
    (new NotFiniteNumberException specific wrong args))
  (^NotFiniteNumberException [^java.lang.Number wrong ^java.lang.Object args]
    (new NotFiniteNumberException wrong args)))

