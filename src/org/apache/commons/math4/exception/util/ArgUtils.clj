(ns org.apache.commons.math4.exception.util.ArgUtils
  "Utility class for transforming the list of arguments passed to
  constructors of exceptions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception.util ArgUtils]))

(defn *flatten
  "Transform a multidimensional array into a one-dimensional list.

  array - Array (possibly multidimensional). - `java.lang.Object[]`

  returns: a list of all the Object instances contained in
   array. - `java.lang.Object[]`"
  ([array]
    (ArgUtils/flatten array)))

