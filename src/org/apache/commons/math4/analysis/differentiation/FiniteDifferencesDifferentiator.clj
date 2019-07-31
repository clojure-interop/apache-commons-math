(ns org.apache.commons.math4.analysis.differentiation.FiniteDifferencesDifferentiator
  "Univariate functions differentiator using finite differences.

  This class creates some wrapper objects around regular
  univariate functions (or univariate vector functions or univariate matrix functions). These
  wrapper objects compute derivatives in addition to function
  values.


  The wrapper objects work by calling the underlying function on
  a sampling grid around the current point and performing polynomial
  interpolation. A finite differences scheme with n points is
  theoretically able to compute derivatives up to order n-1, but
  it is generally better to have a slight margin. The step size must
  also be small enough in order for the polynomial approximation to
  be good in the current point neighborhood, but it should not be too
  small because numerical instability appears quickly (there are several
  differences of close points). Choosing the number of points and
  the step size is highly problem dependent.


  As an example of good and bad settings, lets consider the quintic
  polynomial function f(x) = (x-1)*(x-0.5)*x*(x+0.5)*(x+1).
  Since it is a polynomial, finite differences with at least 6 points
  should theoretically recover the exact same polynomial and hence
  compute accurate derivatives for any order. However, due to numerical
  errors, we get the following results for a 7 points finite differences
  for abscissae in the [-10, 10] range:

    step size = 0.25, second order derivative error about 9.97e-10
    step size = 0.25, fourth order derivative error about 5.43e-8
    step size = 1.0e-6, second order derivative error about 148
    step size = 1.0e-6, fourth order derivative error about 6.35e+14


  This example shows that the small step size is really bad, even simply
  for second order derivative!"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation FiniteDifferencesDifferentiator]))

(defn ->finite-differences-differentiator
  "Constructor.

  Build a differentiator with number of points and step size when independent variable is bounded.

   When the independent variable is bounded (tLower < t < tUpper), the sampling
   points used for differentiation will be adapted to ensure the constraint holds
   even near the boundaries. This means the sample will not be centered anymore in
   these cases. At an extreme case, computing derivatives exactly at the lower bound
   will lead the sample to be entirely on the right side of the derivation point.


   Note that the boundaries are considered to be excluded for function evaluation.


   Beware that wrong settings for the finite differences differentiator
   can lead to highly unstable and inaccurate results, especially for
   high derivation orders. Using very small step sizes is often a
   bad idea.

  nb-points - number of points to use - `int`
  step-size - step size (gap between each point) - `double`
  t-lower - lower bound for independent variable (may be Double.NEGATIVE_INFINITY if there are no lower bounds) - `double`
  t-upper - upper bound for independent variable (may be Double.POSITIVE_INFINITY if there are no upper bounds) - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if stepsize <= 0 (note that NotPositiveException extends NumberIsTooSmallException)"
  (^FiniteDifferencesDifferentiator [^Integer nb-points ^Double step-size ^Double t-lower ^Double t-upper]
    (new FiniteDifferencesDifferentiator nb-points step-size t-lower t-upper))
  (^FiniteDifferencesDifferentiator [^Integer nb-points ^Double step-size]
    (new FiniteDifferencesDifferentiator nb-points step-size)))

(defn get-nb-points
  "Get the number of points to use.

  returns: number of points to use - `int`"
  (^Integer [^FiniteDifferencesDifferentiator this]
    (-> this (.getNbPoints))))

(defn get-step-size
  "Get the step size.

  returns: step size - `double`"
  (^Double [^FiniteDifferencesDifferentiator this]
    (-> this (.getStepSize))))

(defn differentiate
  "Create an implementation of a differential from a regular function.
   The returned object cannot compute derivatives to arbitrary orders. The
   value function will throw a NumberIsTooLargeException if the requested
   derivation order is larger or equal to the number of points.

  function - function to differentiate - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: differential function - `org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction`"
  (^org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction [^FiniteDifferencesDifferentiator this ^org.apache.commons.math4.analysis.UnivariateFunction function]
    (-> this (.differentiate function))))

