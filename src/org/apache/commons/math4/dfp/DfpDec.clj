(ns org.apache.commons.math4.dfp.DfpDec
  "Subclass of Dfp which hides the radix-10000 artifacts of the superclass.
  This should give outward appearances of being a decimal number with DIGITS*4-3
  decimal digits. This class can be subclassed to appear to be an arbitrary number
  of decimal digits less than DIGITS*4-3."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.dfp DfpDec]))

(defn ->dfp-dec
  "Constructor.

  Copy constructor.

  d - instance to copy - `org.apache.commons.math4.dfp.Dfp`"
  (^DfpDec [^org.apache.commons.math4.dfp.Dfp d]
    (new DfpDec d)))

(defn new-instance
  "Creates an instance with a non-finite value.

  sign - sign of the Dfp to create - `byte`
  nans - code of the value, must be one of Dfp.INFINITE, Dfp.SNAN, Dfp.QNAN - `byte`

  returns: a new instance with a non-finite value - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpDec this ^Byte sign ^Byte nans]
    (-> this (.newInstance sign nans)))
  (^org.apache.commons.math4.dfp.Dfp [^DfpDec this ^Byte x]
    (-> this (.newInstance x)))
  (^org.apache.commons.math4.dfp.Dfp [^DfpDec this]
    (-> this (.newInstance))))

(defn next-after
  "Returns the next number greater than this one in the direction of x.
   If this==x then simply returns this.

  x - direction where to look at - `org.apache.commons.math4.dfp.Dfp`

  returns: closest number next to instance in the direction of x - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpDec this ^org.apache.commons.math4.dfp.Dfp x]
    (-> this (.nextAfter x))))

