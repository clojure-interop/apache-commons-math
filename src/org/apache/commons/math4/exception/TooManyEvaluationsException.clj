(ns org.apache.commons.math4.exception.TooManyEvaluationsException
  "Exception to be thrown when the maximal number of evaluations is exceeded."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception TooManyEvaluationsException]))

(defn ->too-many-evaluations-exception
  "Constructor.

  Construct the exception.

  max - Maximum number of evaluations. - `java.lang.Number`"
  (^TooManyEvaluationsException [^java.lang.Number max]
    (new TooManyEvaluationsException max)))

