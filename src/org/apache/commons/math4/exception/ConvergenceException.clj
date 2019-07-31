(ns org.apache.commons.math4.exception.ConvergenceException
  "Error thrown when a numerical computation can not be performed because the
  numerical result failed to converge to a finite value."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.exception ConvergenceException]))

(defn ->convergence-exception
  "Constructor.

  Construct the exception with a specific context and arguments.

  pattern - Message pattern providing the specific context of the error. - `org.apache.commons.math4.exception.util.Localizable`
  args - Arguments. - `java.lang.Object`"
  (^ConvergenceException [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new ConvergenceException pattern args))
  (^ConvergenceException []
    (new ConvergenceException )))

