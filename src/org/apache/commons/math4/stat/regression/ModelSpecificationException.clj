(ns org.apache.commons.math4.stat.regression.ModelSpecificationException
  "Exception thrown when a regression model is not correctly specified."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.regression ModelSpecificationException]))

(defn ->model-specification-exception
  "Constructor.

  pattern - message pattern describing the specification error. - `org.apache.commons.math4.exception.util.Localizable`
  args - arguments. - `java.lang.Object`"
  (^ModelSpecificationException [^org.apache.commons.math4.exception.util.Localizable pattern ^java.lang.Object args]
    (new ModelSpecificationException pattern args)))

