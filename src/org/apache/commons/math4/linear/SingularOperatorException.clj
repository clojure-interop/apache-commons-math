(ns org.apache.commons.math4.linear.SingularOperatorException
  "Exception to be thrown when trying to invert a singular operator."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear SingularOperatorException]))

(defn ->singular-operator-exception
  "Constructor.

  Creates a new instance of this class."
  (^SingularOperatorException []
    (new SingularOperatorException )))

