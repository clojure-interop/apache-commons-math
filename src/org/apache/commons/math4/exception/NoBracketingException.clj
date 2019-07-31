(ns org.apache.commons.math4.exception.NoBracketingException
  "Exception to be thrown when function values have the same sign at both
  ends of an interval."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception NoBracketingException]))

(defn ->no-bracketing-exception
  "Constructor.

  Construct the exception with a specific context.

  specific - Contextual information on what caused the exception. - `org.apache.commons.math4.exception.util.Localizable`
  lo - Lower end of the interval. - `double`
  hi - Higher end of the interval. - `double`
  f-lo - Value at lower end of the interval. - `double`
  f-hi - Value at higher end of the interval. - `double`
  args - Additional arguments. - `java.lang.Object`"
  (^NoBracketingException [^org.apache.commons.math4.exception.util.Localizable specific ^Double lo ^Double hi ^Double f-lo ^Double f-hi ^java.lang.Object args]
    (new NoBracketingException specific lo hi f-lo f-hi args))
  (^NoBracketingException [^Double lo ^Double hi ^Double f-lo ^Double f-hi]
    (new NoBracketingException lo hi f-lo f-hi)))

(defn get-lo
  "Get the lower end of the interval.

  returns: the lower end. - `double`"
  (^Double [^NoBracketingException this]
    (-> this (.getLo))))

(defn get-hi
  "Get the higher end of the interval.

  returns: the higher end. - `double`"
  (^Double [^NoBracketingException this]
    (-> this (.getHi))))

(defn get-f-lo
  "Get the value at the lower end of the interval.

  returns: the value at the lower end. - `double`"
  (^Double [^NoBracketingException this]
    (-> this (.getFLo))))

(defn get-f-hi
  "Get the value at the higher end of the interval.

  returns: the value at the higher end. - `double`"
  (^Double [^NoBracketingException this]
    (-> this (.getFHi))))

