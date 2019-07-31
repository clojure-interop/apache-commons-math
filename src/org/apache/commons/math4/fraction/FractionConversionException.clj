(ns org.apache.commons.math4.fraction.FractionConversionException
  "Error thrown when a double value cannot be converted to a fraction
  in the allowed number of iterations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fraction FractionConversionException]))

(defn ->fraction-conversion-exception
  "Constructor.

  Constructs an exception with specified formatted detail message.
   Message formatting is delegated to MessageFormat.

  value - double value to convert - `double`
  p - current numerator - `long`
  q - current denominator - `long`"
  (^FractionConversionException [^Double value ^Long p ^Long q]
    (new FractionConversionException value p q))
  (^FractionConversionException [^Double value ^Integer max-iterations]
    (new FractionConversionException value max-iterations)))

