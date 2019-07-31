(ns org.apache.commons.math4.ml.neuralnet.sofm.util.ExponentialDecayFunction
  "Exponential decay function: a e-x / b,
  where x is the (integer) independent variable.

  Class is immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.sofm.util ExponentialDecayFunction]))

(defn ->exponential-decay-function
  "Constructor.

  Creates an instance. It will be such that

    a = initValue
    b = -numCall / ln(valueAtNumCall / initValue)

  init-value - Initial value, i.e. value(0). - `double`
  value-at-num-call - Value of the function at numCall. - `double`
  num-call - Argument for which the function returns valueAtNumCall. - `long`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if numCall <= 0."
  (^ExponentialDecayFunction [^Double init-value ^Double value-at-num-call ^Long num-call]
    (new ExponentialDecayFunction init-value value-at-num-call num-call)))

(defn value
  "Computes a e-numCall / b.

  num-call - Current step of the training task. - `long`

  returns: the value of the function at numCall. - `double`"
  (^Double [^ExponentialDecayFunction this ^Long num-call]
    (-> this (.value num-call))))

