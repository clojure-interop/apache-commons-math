(ns org.apache.commons.math4.ml.neuralnet.sofm.NeighbourhoodSizeFunctionFactory
  "Factory for creating instances of NeighbourhoodSizeFunction."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.sofm NeighbourhoodSizeFunctionFactory]))

(defn *exponential-decay
  "Creates an exponential decay function.
   It will compute a e-x / b,
   where x is the (integer) independent variable and

    a = initValue
    b = -numCall / ln(valueAtNumCall / initValue)

  init-value - Initial value, i.e. value(0). - `double`
  value-at-num-call - Value of the function at numCall. - `double`
  num-call - Argument for which the function returns valueAtNumCall. - `long`

  returns: the neighbourhood size function. - `org.apache.commons.math4.ml.neuralnet.sofm.NeighbourhoodSizeFunction`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if numCall <= 0."
  (^org.apache.commons.math4.ml.neuralnet.sofm.NeighbourhoodSizeFunction [^Double init-value ^Double value-at-num-call ^Long num-call]
    (NeighbourhoodSizeFunctionFactory/exponentialDecay init-value value-at-num-call num-call)))

(defn *quasi-sigmoid-decay
  "Creates an sigmoid-like NeighbourhoodSizeFunction function.
   The function f will have the following properties:

    f(0) = initValue
    numCall is the inflexion point
    slope = f'(numCall)

  init-value - Initial value, i.e. value(0). - `double`
  slope - Value of the function derivative at numCall. - `double`
  num-call - Inflexion point. - `long`

  returns: the neighbourhood size function. - `org.apache.commons.math4.ml.neuralnet.sofm.NeighbourhoodSizeFunction`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if numCall <= 0."
  (^org.apache.commons.math4.ml.neuralnet.sofm.NeighbourhoodSizeFunction [^Double init-value ^Double slope ^Long num-call]
    (NeighbourhoodSizeFunctionFactory/quasiSigmoidDecay init-value slope num-call)))

