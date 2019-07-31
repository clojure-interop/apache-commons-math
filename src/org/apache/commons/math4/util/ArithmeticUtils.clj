(ns org.apache.commons.math4.util.ArithmeticUtils
  "Some useful, arithmetics related, additions to the built-in functions in
  Math."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util ArithmeticUtils]))

(defn *remainder-unsigned
  "Returns the unsigned remainder from dividing the first argument
   by the second where each argument and the result is interpreted
   as an unsigned value.
   This method does not use the long datatype.

  dividend - the value to be divided - `int`
  divisor - the value doing the dividing - `int`

  returns: the unsigned remainder of the first argument divided by
   the second argument. - `int`"
  (^Integer [^Integer dividend ^Integer divisor]
    (ArithmeticUtils/remainderUnsigned dividend divisor)))

(defn *divide-unsigned
  "Returns the unsigned quotient of dividing the first argument by
   the second where each argument and the result is interpreted as
   an unsigned value.
   Note that in two's complement arithmetic, the three other
   basic arithmetic operations of add, subtract, and multiply are
   bit-wise identical if the two operands are regarded as both
   being signed or both being unsigned. Therefore separate addUnsigned, etc. methods are not provided.
   This method does not use the long datatype.

  dividend - the value to be divided - `int`
  divisor - the value doing the dividing - `int`

  returns: the unsigned quotient of the first argument divided by
   the second argument - `int`"
  (^Integer [^Integer dividend ^Integer divisor]
    (ArithmeticUtils/divideUnsigned dividend divisor)))

(defn *lcm
  "Returns the least common multiple of the absolute value of two numbers,
   using the formula lcm(a,b) = (a / gcd(a,b)) * b.

   Special cases:

   The invocations lcm(Integer.MIN_VALUE, n) and
   lcm(n, Integer.MIN_VALUE), where abs(n) is a
   power of 2, throw an ArithmeticException, because the result
   would be 2^31, which is too large for an int value.
   The result of lcm(0, x) and lcm(x, 0) is
   0 for any x.

  a - Number. - `int`
  b - Number. - `int`

  returns: the least common multiple, never negative. - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the result cannot be represented as a non-negative int value."
  (^Integer [^Integer a ^Integer b]
    (ArithmeticUtils/lcm a b)))

(defn *mul-and-check
  "Multiply two integers, checking for overflow.

  x - Factor. - `int`
  y - Factor. - `int`

  returns: the product x * y. - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the result can not be represented as an int."
  (^Integer [^Integer x ^Integer y]
    (ArithmeticUtils/mulAndCheck x y)))

(defn *pow
  "Raise an int to an int power.

  k - Number to raise. - `int`
  e - Exponent (must be positive or zero). - `int`

  returns: \\( k^e \\) - `int`

  throws: org.apache.commons.math4.exception.NotPositiveException - if e < 0."
  (^Integer [^Integer k ^Integer e]
    (ArithmeticUtils/pow k e)))

(defn *gcd
  "Computes the greatest common divisor of the absolute value of two
   numbers, using a modified version of the \"binary gcd\" method.
   See Knuth 4.5.2 algorithm B.
   The algorithm is due to Josef Stein (1961).

   Special cases:

    The invocations
     gcd(Integer.MIN_VALUE, Integer.MIN_VALUE),
     gcd(Integer.MIN_VALUE, 0) and
     gcd(0, Integer.MIN_VALUE) throw an
     ArithmeticException, because the result would be 2^31, which
     is too large for an int value.
    The result of gcd(x, x), gcd(0, x) and
     gcd(x, 0) is the absolute value of x, except
     for the special cases above.
    The invocation gcd(0, 0) is the only one which returns
     0.

  p - Number. - `int`
  q - Number. - `int`

  returns: the greatest common divisor (never negative). - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the result cannot be represented as a non-negative int value."
  (^Integer [^Integer p ^Integer q]
    (ArithmeticUtils/gcd p q)))

(defn *add-and-check
  "Add two integers, checking for overflow.

  x - an addend - `int`
  y - an addend - `int`

  returns: the sum x+y - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the result can not be represented as an int."
  (^Integer [^Integer x ^Integer y]
    (ArithmeticUtils/addAndCheck x y)))

(defn *power-of-two?
  "Returns true if the argument is a power of two.

  n - the number to test - `long`

  returns: true if the argument is a power of two - `boolean`"
  (^Boolean [^Long n]
    (ArithmeticUtils/isPowerOfTwo n)))

(defn *sub-and-check
  "Subtract two integers, checking for overflow.

  x - Minuend. - `int`
  y - Subtrahend. - `int`

  returns: the difference x - y. - `int`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if the result can not be represented as an int."
  (^Integer [^Integer x ^Integer y]
    (ArithmeticUtils/subAndCheck x y)))

