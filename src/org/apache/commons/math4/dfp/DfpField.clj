(ns org.apache.commons.math4.dfp.DfpField
  "Field for Decimal floating point instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.dfp DfpField]))

(defn ->dfp-field
  "Constructor.

  Create a factory for the specified number of radix digits.

   Note that since the Dfp class uses 10000 as its radix, each radix
   digit is equivalent to 4 decimal digits. This implies that asking for
   13, 14, 15 or 16 decimal digits will really lead to a 4 radix 10000 digits in
   all cases.

  decimal-digits - minimal number of decimal digits. - `int`"
  (^DfpField [^Integer decimal-digits]
    (new DfpField decimal-digits)))

(def *-flag-invalid
  "Static Constant.

  IEEE 854-1987 flag for invalid operation.

  type: int"
  DfpField/FLAG_INVALID)

(def *-flag-div-zero
  "Static Constant.

  IEEE 854-1987 flag for division by zero.

  type: int"
  DfpField/FLAG_DIV_ZERO)

(def *-flag-overflow
  "Static Constant.

  IEEE 854-1987 flag for overflow.

  type: int"
  DfpField/FLAG_OVERFLOW)

(def *-flag-underflow
  "Static Constant.

  IEEE 854-1987 flag for underflow.

  type: int"
  DfpField/FLAG_UNDERFLOW)

(def *-flag-inexact
  "Static Constant.

  IEEE 854-1987 flag for inexact result.

  type: int"
  DfpField/FLAG_INEXACT)

(defn *compute-exp
  "Compute exp(a).

  a - number for which we want the exponential - `org.apache.commons.math4.dfp.Dfp`
  one - constant with value 1 at desired precision - `org.apache.commons.math4.dfp.Dfp`

  returns: exp(a) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp a ^org.apache.commons.math4.dfp.Dfp one]
    (DfpField/computeExp a one)))

(defn *compute-ln
  "Compute ln(a).

    Let f(x) = ln(x),

    We know that f'(x) = 1/x, thus from Taylor's theorem we have:

             -----          n+1         n
    f(x) =   \\           (-1)    (x - 1)
             /          ----------------    for 1 <= n <= infinity
             -----             n

    or
                         2        3       4
                     (x-1)   (x-1)    (x-1)
    ln(x) =  (x-1) - -----  ------ - ------  ...
                       2       3        4

    alternatively,

                    2    3   4
                   x    x   x
    ln(x+1) =  x - -   - - -  ...
                   2    3   4

    This series can be used to compute ln(x), but it converges too slowly.

    If we substitute -x for x above, we get

                     2    3    4
                    x    x    x
    ln(1-x) =  -x - -  - -  - -  ...
                    2    3    4

    Note that all terms are now negative.  Because the even powered ones
    absorbed the sign.  Now, subtract the series above from the previous
    one to get ln(x+1) - ln(1-x).  Note the even terms cancel out leaving
    only the odd ones

                               3     5      7
                             2x    2x     2x
    ln(x+1) - ln(x-1) = 2x  ---  ---  ----  ...
                              3     5      7

    By the property of logarithms that ln(a) - ln(b) = ln (a/b) we have:

                                  3        5        7
        x+1           /          x        x        x          \\
    ln ----- =   2 *  |  x     ----    ----    ----  ...  |
        x-1           \\          3        5        7          /

    But now we want to find ln(a), so we need to find the value of x
    such that a = (x+1)/(x-1).   This is easily solved to find that
    x = (a-1)/(a+1).

  a - number for which we want the exponential - `org.apache.commons.math4.dfp.Dfp`
  one - constant with value 1 at desired precision - `org.apache.commons.math4.dfp.Dfp`
  two - constant with value 2 at desired precision - `org.apache.commons.math4.dfp.Dfp`

  returns: ln(a) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^org.apache.commons.math4.dfp.Dfp a ^org.apache.commons.math4.dfp.Dfp one ^org.apache.commons.math4.dfp.Dfp two]
    (DfpField/computeLn a one two)))

(defn set-rounding-mode
  "Set the rounding mode.
    If not set, the default value is DfpField.RoundingMode.ROUND_HALF_EVEN.

  mode - desired rounding mode Note that the rounding mode is common to all Dfp instances belonging to the current DfpField in the system and will affect all future calculations. - `org.apache.commons.math4.dfp.DfpField$RoundingMode`"
  ([^DfpField this ^org.apache.commons.math4.dfp.DfpField$RoundingMode mode]
    (-> this (.setRoundingMode mode))))

(defn set-ieee-flags-bits
  "Sets some bits in the IEEE 854 status flags, without changing the already set bits.

   Calling this method is equivalent to call setIEEEFlags(getIEEEFlags() | bits)

  bits - bits to set - `int`"
  ([^DfpField this ^Integer bits]
    (-> this (.setIEEEFlagsBits bits))))

(defn get-pi
  "Get the constant π.

  returns: a Dfp with value π - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getPi))))

(defn get-ln-10
  "Get the constant ln(10).

  returns: a Dfp with value ln(10) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getLn10))))

(defn get-pi-split
  "Get the constant π split in two pieces.

  returns: a Dfp with value π split in two pieces - `org.apache.commons.math4.dfp.Dfp[]`"
  ([^DfpField this]
    (-> this (.getPiSplit))))

(defn get-runtime-class
  "Returns the runtime class of the FieldElement.

  returns: The Class object that represents the runtime
           class of this object. - `java.lang.Class<? extends org.apache.commons.math4.FieldElement<org.apache.commons.math4.dfp.Dfp>>`"
  ([^DfpField this]
    (-> this (.getRuntimeClass))))

(defn set-ieee-flags
  "Sets the IEEE 854 status flags.

  flags - desired value for the flags - `int`"
  ([^DfpField this ^Integer flags]
    (-> this (.setIEEEFlags flags))))

(defn get-ln-5
  "Get the constant ln(5).

  returns: a Dfp with value ln(5) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getLn5))))

(defn clear-ieee-flags
  "Clears the IEEE 854 status flags."
  ([^DfpField this]
    (-> this (.clearIEEEFlags))))

(defn get-sqr-3-reciprocal
  "Get the constant √3 / 3.

  returns: a Dfp with value √3 / 3 - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getSqr3Reciprocal))))

(defn get-ln-2
  "Get the constant ln(2).

  returns: a Dfp with value ln(2) - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getLn2))))

(defn get-radix-digits
  "Get the number of radix digits of the Dfp instances built by this factory.

  returns: number of radix digits - `int`"
  (^Integer [^DfpField this]
    (-> this (.getRadixDigits))))

(defn get-sqr-2-split
  "Get the constant √2 split in two pieces.

  returns: a Dfp with value √2 split in two pieces - `org.apache.commons.math4.dfp.Dfp[]`"
  ([^DfpField this]
    (-> this (.getSqr2Split))))

(defn get-sqr-2
  "Get the constant √2.

  returns: a Dfp with value √2 - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getSqr2))))

(defn get-e
  "Get the constant e.

  returns: a Dfp with value e - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getE))))

(defn get-sqr-2-reciprocal
  "Get the constant √2 / 2.

  returns: a Dfp with value √2 / 2 - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getSqr2Reciprocal))))

(defn get-sqr-3
  "Get the constant √3.

  returns: a Dfp with value √3 - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getSqr3))))

(defn get-one
  "Get the constant 1.

  returns: a Dfp with value 1 - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getOne))))

(defn get-ln-5-split
  "Get the constant ln(5) split in two pieces.

  returns: a Dfp with value ln(5) split in two pieces - `org.apache.commons.math4.dfp.Dfp[]`"
  ([^DfpField this]
    (-> this (.getLn5Split))))

(defn get-ieee-flags
  "Get the IEEE 854 status flags.

  returns: IEEE 854 status flags - `int`"
  (^Integer [^DfpField this]
    (-> this (.getIEEEFlags))))

(defn get-two
  "Get the constant 2.

  returns: a Dfp with value 2 - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getTwo))))

(defn get-ln-2-split
  "Get the constant ln(2) split in two pieces.

  returns: a Dfp with value ln(2) split in two pieces - `org.apache.commons.math4.dfp.Dfp[]`"
  ([^DfpField this]
    (-> this (.getLn2Split))))

(defn get-rounding-mode
  "Get the current rounding mode.

  returns: current rounding mode - `org.apache.commons.math4.dfp.DfpField$RoundingMode`"
  (^org.apache.commons.math4.dfp.DfpField$RoundingMode [^DfpField this]
    (-> this (.getRoundingMode))))

(defn new-dfp
  "Creates a Dfp with a non-finite value.

  sign - sign of the Dfp to create - `byte`
  nans - code of the value, must be one of Dfp.INFINITE, Dfp.SNAN, Dfp.QNAN - `byte`

  returns: a new Dfp with a non-finite value - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this ^Byte sign ^Byte nans]
    (-> this (.newDfp sign nans)))
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this ^Byte x]
    (-> this (.newDfp x)))
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.newDfp))))

(defn get-e-split
  "Get the constant e split in two pieces.

  returns: a Dfp with value e split in two pieces - `org.apache.commons.math4.dfp.Dfp[]`"
  ([^DfpField this]
    (-> this (.getESplit))))

(defn get-zero
  "Get the constant 0.

  returns: a Dfp with value 0 - `org.apache.commons.math4.dfp.Dfp`"
  (^org.apache.commons.math4.dfp.Dfp [^DfpField this]
    (-> this (.getZero))))

