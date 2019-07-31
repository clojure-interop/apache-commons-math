(ns org.apache.commons.math4.ml.neuralnet.sofm.util.QuasiSigmoidDecayFunction
  "Decay function whose shape is similar to a sigmoid.

  Class is immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.sofm.util QuasiSigmoidDecayFunction]))

(defn ->quasi-sigmoid-decay-function
  "Constructor.

  Creates an instance.
   The function f will have the following properties:

    f(0) = initValue
    numCall is the inflexion point
    slope = f'(numCall)

  init-value - Initial value, i.e. value(0). - `double`
  slope - Value of the function derivative at numCall. - `double`
  num-call - Inflexion point. - `long`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if numCall <= 0."
  (^QuasiSigmoidDecayFunction [^Double init-value ^Double slope ^Long num-call]
    (new QuasiSigmoidDecayFunction init-value slope num-call)))

(defn value
  "Computes the value of the learning factor.

  num-call - Current step of the training task. - `long`

  returns: the value of the function at numCall. - `double`"
  (^Double [^QuasiSigmoidDecayFunction this ^Long num-call]
    (-> this (.value num-call))))

