(ns org.apache.commons.math4.exception.OutOfRangeException
  "Exception to be thrown when some argument is out of range."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception OutOfRangeException]))

(defn ->out-of-range-exception
  "Constructor.

  Construct an exception from the mismatched dimensions with a
   specific context information.

  specific - Context information. - `org.apache.commons.math4.exception.util.Localizable`
  wrong - Requested value. - `java.lang.Number`
  lo - Lower bound. - `java.lang.Number`
  hi - Higher bound. - `java.lang.Number`"
  (^OutOfRangeException [^org.apache.commons.math4.exception.util.Localizable specific ^java.lang.Number wrong ^java.lang.Number lo ^java.lang.Number hi]
    (new OutOfRangeException specific wrong lo hi))
  (^OutOfRangeException [^java.lang.Number wrong ^java.lang.Number lo ^java.lang.Number hi]
    (new OutOfRangeException wrong lo hi)))

(defn get-lo
  "returns: the lower bound. - `java.lang.Number`"
  (^java.lang.Number [^OutOfRangeException this]
    (-> this (.getLo))))

(defn get-hi
  "returns: the higher bound. - `java.lang.Number`"
  (^java.lang.Number [^OutOfRangeException this]
    (-> this (.getHi))))

