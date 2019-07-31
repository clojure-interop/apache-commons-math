(ns org.apache.commons.math4.analysis.FunctionUtils
  "Utilities for manipulating function objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis FunctionUtils]))

(defn *multiply
  "Multiplies functions.

  f - List of functions. - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: a function that computes the product of the functions. - `org.apache.commons.math4.analysis.UnivariateFunction`"
  (^org.apache.commons.math4.analysis.UnivariateFunction [^org.apache.commons.math4.analysis.UnivariateFunction f]
    (FunctionUtils/multiply f)))

(defn *derivative
  "Convert an UnivariateDifferentiableFunction to an
   UnivariateFunction computing nth order derivative.

   This converter is only a convenience method. Beware computing only one derivative does
   not save any computation as the original function will really be called under the hood.
   The derivative will be extracted from the full DerivativeStructure result.

  f - original function, with value and all its derivatives - `org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction`
  order - of the derivative to extract - `int`

  returns: function computing the derivative at required order - `org.apache.commons.math4.analysis.UnivariateFunction`"
  (^org.apache.commons.math4.analysis.UnivariateFunction [^org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction f ^Integer order]
    (FunctionUtils/derivative f order)))

(defn *to-differentiable
  "Convert regular functions to UnivariateDifferentiableFunction.

   This method handle the case with one free parameter and several derivatives.
   For the case with several free parameters and only first order derivatives,
   see toDifferentiable(MultivariateFunction, MultivariateVectorFunction).
   There are no direct support for intermediate cases, with several free parameters
   and order 2 or more derivatives, as is would be difficult to specify all the
   cross derivatives.


   Note that the derivatives are expected to be computed only with respect to the
   raw parameter x of the base function, i.e. they are df/dx, df2/dx2, ...
   Even if the built function is later used in a composition like f(sin(t)), the provided
   derivatives should not apply the composition with sine and its derivatives by
   themselves. The composition will be done automatically here and the result will properly
   contain f(sin(t)), df(sin(t))/dt, df2(sin(t))/dt2 despite the
   provided derivatives functions know nothing about the sine function.

  f - base function f(x) - `org.apache.commons.math4.analysis.UnivariateFunction`
  derivatives - derivatives of the base function, in increasing differentiation order - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: a differentiable function with value and all specified derivatives - `org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction`"
  (^org.apache.commons.math4.analysis.differentiation.UnivariateDifferentiableFunction [^org.apache.commons.math4.analysis.UnivariateFunction f ^org.apache.commons.math4.analysis.UnivariateFunction derivatives]
    (FunctionUtils/toDifferentiable f derivatives)))

(defn *fix-1st-argument
  "Creates a unary function by fixing the first argument of a binary function.

  f - Binary function. - `org.apache.commons.math4.analysis.BivariateFunction`
  fixed - value to which the first argument of f is set. - `double`

  returns: the unary function h(x) = f(fixed, x) - `org.apache.commons.math4.analysis.UnivariateFunction`"
  (^org.apache.commons.math4.analysis.UnivariateFunction [^org.apache.commons.math4.analysis.BivariateFunction f ^Double fixed]
    (FunctionUtils/fix1stArgument f fixed)))

(defn *compose
  "Composes functions.

   The functions in the argument list are composed sequentially, in the
   given order.  For example, compose(f1,f2,f3) acts like f1(f2(f3(x))).

  f - List of functions. - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: the composite function. - `org.apache.commons.math4.analysis.UnivariateFunction`"
  (^org.apache.commons.math4.analysis.UnivariateFunction [^org.apache.commons.math4.analysis.UnivariateFunction f]
    (FunctionUtils/compose f)))

(defn *add
  "Adds functions.

  f - List of functions. - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: a function that computes the sum of the functions. - `org.apache.commons.math4.analysis.UnivariateFunction`"
  (^org.apache.commons.math4.analysis.UnivariateFunction [^org.apache.commons.math4.analysis.UnivariateFunction f]
    (FunctionUtils/add f)))

(defn *combine
  "Returns the univariate function
   h(x) = combiner(f(x), g(x)).

  combiner - Combiner function. - `org.apache.commons.math4.analysis.BivariateFunction`
  f - Function. - `org.apache.commons.math4.analysis.UnivariateFunction`
  g - Function. - `org.apache.commons.math4.analysis.UnivariateFunction`

  returns: the composite function. - `org.apache.commons.math4.analysis.UnivariateFunction`"
  (^org.apache.commons.math4.analysis.UnivariateFunction [^org.apache.commons.math4.analysis.BivariateFunction combiner ^org.apache.commons.math4.analysis.UnivariateFunction f ^org.apache.commons.math4.analysis.UnivariateFunction g]
    (FunctionUtils/combine combiner f g)))

(defn *sample
  "Samples the specified univariate real function on the specified interval.

   The interval is divided equally into n sections and sample points
   are taken from min to max - (max - min) / n; therefore
   f is not sampled at the upper bound max.

  f - Function to be sampled - `org.apache.commons.math4.analysis.UnivariateFunction`
  min - Lower bound of the interval (included). - `double`
  max - Upper bound of the interval (excluded). - `double`
  n - Number of sample points. - `int`

  returns: the array of samples. - `double[]`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if the lower bound min is greater than, or equal to the upper bound max."
  ([^org.apache.commons.math4.analysis.UnivariateFunction f ^Double min ^Double max ^Integer n]
    (FunctionUtils/sample f min max n)))

(defn *fix-2nd-argument
  "Creates a unary function by fixing the second argument of a binary function.

  f - Binary function. - `org.apache.commons.math4.analysis.BivariateFunction`
  fixed - value to which the second argument of f is set. - `double`

  returns: the unary function h(x) = f(x, fixed) - `org.apache.commons.math4.analysis.UnivariateFunction`"
  (^org.apache.commons.math4.analysis.UnivariateFunction [^org.apache.commons.math4.analysis.BivariateFunction f ^Double fixed]
    (FunctionUtils/fix2ndArgument f fixed)))

(defn *collector
  "Returns a MultivariateFunction h(x[]) defined by

   h(x[]) = combiner(...combiner(combiner(initialValue,f(x[0])),f(x[1]))...),f(x[x.length-1]))

  combiner - Combiner function. - `org.apache.commons.math4.analysis.BivariateFunction`
  f - Function. - `org.apache.commons.math4.analysis.UnivariateFunction`
  initial-value - Initial value. - `double`

  returns: a collector function. - `org.apache.commons.math4.analysis.MultivariateFunction`"
  (^org.apache.commons.math4.analysis.MultivariateFunction [^org.apache.commons.math4.analysis.BivariateFunction combiner ^org.apache.commons.math4.analysis.UnivariateFunction f ^Double initial-value]
    (FunctionUtils/collector combiner f initial-value))
  (^org.apache.commons.math4.analysis.MultivariateFunction [^org.apache.commons.math4.analysis.BivariateFunction combiner ^Double initial-value]
    (FunctionUtils/collector combiner initial-value)))

