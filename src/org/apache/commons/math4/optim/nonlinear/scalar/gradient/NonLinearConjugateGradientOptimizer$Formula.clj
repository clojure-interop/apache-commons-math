(ns org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.gradient NonLinearConjugateGradientOptimizer$Formula]))

(def FLETCHER_REEVES
  "Enum Constant.

  Fletcher-Reeves formula.

  type: org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula"
  NonLinearConjugateGradientOptimizer$Formula/FLETCHER_REEVES)

(def POLAK_RIBIERE
  "Enum Constant.

  Polak-Ribière formula.

  type: org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula"
  NonLinearConjugateGradientOptimizer$Formula/POLAK_RIBIERE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (NonLinearConjugateGradientOptimizer.Formula c : NonLinearConjugateGradientOptimizer.Formula.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula[]`"
  ([]
    (NonLinearConjugateGradientOptimizer$Formula/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer$Formula [^java.lang.String name]
    (NonLinearConjugateGradientOptimizer$Formula/valueOf name)))

