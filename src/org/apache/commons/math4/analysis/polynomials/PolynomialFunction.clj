(ns org.apache.commons.math4.analysis.polynomials.PolynomialFunction
  "Immutable representation of a real polynomial function with real coefficients.

  Horner's Method
  is used to evaluate the function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.polynomials PolynomialFunction]))

(defn ->polynomial-function
  "Constructor.

  Construct a polynomial with the given coefficients.  The first element
   of the coefficients array is the constant term.  Higher degree
   coefficients follow in sequence.  The degree of the resulting polynomial
   is the index of the last non-null element of the array, or 0 if all elements
   are null.

   The constructor makes a copy of the input array and assigns the copy to
   the coefficients property.

  c - Polynomial coefficients. - `double[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if c is null."
  (^PolynomialFunction [c]
    (new PolynomialFunction c)))

(defn degree
  "Returns the degree of the polynomial.

  returns: the degree of the polynomial. - `int`"
  (^Integer [^PolynomialFunction this]
    (-> this (.degree))))

(defn get-coefficients
  "Returns a copy of the coefficients array.

   Changes made to the returned copy will not affect the coefficients of
   the polynomial.

  returns: a fresh copy of the coefficients array. - `double[]`"
  ([^PolynomialFunction this]
    (-> this (.getCoefficients))))

(defn multiply
  "Multiply the instance by a polynomial.

  p - Polynomial to multiply by. - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`

  returns: a new polynomial equal to this times p - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunction [^PolynomialFunction this ^org.apache.commons.math4.analysis.polynomials.PolynomialFunction p]
    (-> this (.multiply p))))

(defn negate
  "Negate the instance.

  returns: a new polynomial with all coefficients negated - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunction [^PolynomialFunction this]
    (-> this (.negate))))

(defn to-string
  "Returns a string representation of the polynomial.

   The representation is user oriented. Terms are displayed lowest
   degrees first. The multiplications signs, coefficients equals to
   one and null terms are not displayed (except if the polynomial is 0,
   in which case the 0 constant term is displayed). Addition of terms
   with negative coefficients are replaced by subtraction of terms
   with positive coefficients except for the first displayed term
   (i.e. we display -3 for a constant negative polynomial,
   but 1 - 3 x  x^2 if the negative coefficient is not
   the first one displayed).

  returns: a string representation of the polynomial. - `java.lang.String`"
  (^java.lang.String [^PolynomialFunction this]
    (-> this (.toString))))

(defn polynomial-derivative
  "Returns the derivative as a PolynomialFunction.

  returns: the derivative polynomial. - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunction [^PolynomialFunction this]
    (-> this (.polynomialDerivative))))

(defn value
  "Compute the value of the function for the given argument.

    The value returned is
    coefficients[n] * x^n  ...  coefficients[1] * x   coefficients[0]

  x - Argument for which the function value should be computed. - `double`

  returns: the value of the polynomial at the given point. - `double`"
  (^Double [^PolynomialFunction this ^Double x]
    (-> this (.value x))))

(defn subtract
  "Subtract a polynomial from the instance.

  p - Polynomial to subtract. - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`

  returns: a new polynomial which is the instance minus p. - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunction [^PolynomialFunction this ^org.apache.commons.math4.analysis.polynomials.PolynomialFunction p]
    (-> this (.subtract p))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PolynomialFunction this]
    (-> this (.hashCode))))

(defn add
  "Add a polynomial to the instance.

  p - Polynomial to add. - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`

  returns: a new polynomial which is the sum of the instance and p. - `org.apache.commons.math4.analysis.polynomials.PolynomialFunction`"
  (^org.apache.commons.math4.analysis.polynomials.PolynomialFunction [^PolynomialFunction this ^org.apache.commons.math4.analysis.polynomials.PolynomialFunction p]
    (-> this (.add p))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PolynomialFunction this ^java.lang.Object obj]
    (-> this (.equals obj))))

