(ns org.apache.commons.math4.exception.MaxCountExceededException
  "Exception to be thrown when some counter maximum value is exceeded."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception MaxCountExceededException]))

(defn ->max-count-exceeded-exception
  "Constructor.

  Construct the exception with a specific context.

  specific - Specific context pattern. - `org.apache.commons.math4.exception.util.Localizable`
  max - Maximum. - `java.lang.Number`
  args - Additional arguments. - `java.lang.Object`"
  (^MaxCountExceededException [^org.apache.commons.math4.exception.util.Localizable specific ^java.lang.Number max ^java.lang.Object args]
    (new MaxCountExceededException specific max args))
  (^MaxCountExceededException [^java.lang.Number max]
    (new MaxCountExceededException max)))

(defn get-max
  "returns: the maximum number of evaluations. - `java.lang.Number`"
  (^java.lang.Number [^MaxCountExceededException this]
    (-> this (.getMax))))

