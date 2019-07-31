(ns org.apache.commons.math4.exception.TooManyIterationsException
  "Exception to be thrown when the maximal number of iterations is exceeded."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception TooManyIterationsException]))

(defn ->too-many-iterations-exception
  "Constructor.

  Construct the exception.

  max - Maximum number of evaluations. - `java.lang.Number`"
  (^TooManyIterationsException [^java.lang.Number max]
    (new TooManyIterationsException max)))

