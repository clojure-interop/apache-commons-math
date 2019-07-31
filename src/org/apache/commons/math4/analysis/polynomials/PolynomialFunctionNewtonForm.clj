(ns org.apache.commons.math4.analysis.polynomials.PolynomialFunctionNewtonForm
  "Implements the representation of a real polynomial function in
  Newton Form. For reference, see Elementary Numerical Analysis,
  ISBN 0070124477, chapter 2.

  The formula of polynomial in Newton form is
      p(x) = a[0]  a[1](x-c[0])  a[2](x-c[0])(x-c[1])  ...
             a[n](x-c[0])(x-c[1])...(x-c[n-1])
  Note that the length of a[] is one more than the length of c[]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.polynomials PolynomialFunctionNewtonForm]))

(defn ->polynomial-function-newton-form
  "Constructor.

  Construct a Newton polynomial with the given a[] and c[]. The order of
   centers are important in that if c[] shuffle, then values of a[] would
   completely change, not just a permutation of old a[].

   The constructor makes copy of the input arrays and assigns them.

  a - Coefficients in Newton form formula. - `double[]`
  c - Centers. - `double[]`

  throws: org.apache.commons.math4.exception.NullArgumentException - if any argument is null."
  (^PolynomialFunctionNewtonForm [a c]
    (new PolynomialFunctionNewtonForm a c)))

(defn *evaluate
  "Evaluate the Newton polynomial using nested multiplication. It is
   also called
   Horner's Rule and takes O(N) time.

  a - Coefficients in Newton form formula. - `double[]`
  c - Centers. - `double[]`
  z - Point at which the function value is to be computed. - `double`

  returns: the function value. - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if any argument is null."
  (^Double [a c ^Double z]
    (PolynomialFunctionNewtonForm/evaluate a c z)))

(defn value
  "Calculate the function value at the given point.

  z - Point at which the function value is to be computed. - `double`

  returns: the function value. - `double`"
  (^Double [^PolynomialFunctionNewtonForm this ^Double z]
    (-> this (.value z))))

(defn degree
  "Returns the degree of the polynomial.

  returns: the degree of the polynomial - `int`"
  (^Integer [^PolynomialFunctionNewtonForm this]
    (-> this (.degree))))

(defn get-newton-coefficients
  "Returns a copy of coefficients in Newton form formula.

   Changes made to the returned copy will not affect the polynomial.

  returns: a fresh copy of coefficients in Newton form formula - `double[]`"
  ([^PolynomialFunctionNewtonForm this]
    (-> this (.getNewtonCoefficients))))

(defn get-centers
  "Returns a copy of the centers array.

   Changes made to the returned copy will not affect the polynomial.

  returns: a fresh copy of the centers array. - `double[]`"
  ([^PolynomialFunctionNewtonForm this]
    (-> this (.getCenters))))

(defn get-coefficients
  "Returns a copy of the coefficients array.

   Changes made to the returned copy will not affect the polynomial.

  returns: a fresh copy of the coefficients array. - `double[]`"
  ([^PolynomialFunctionNewtonForm this]
    (-> this (.getCoefficients))))

