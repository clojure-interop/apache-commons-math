(ns org.apache.commons.math4.ode.sampling.StepNormalizerBounds
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling StepNormalizerBounds]))

(def NEITHER
  "Enum Constant.

  Do not include the first and last points.

  type: org.apache.commons.math4.ode.sampling.StepNormalizerBounds"
  StepNormalizerBounds/NEITHER)

(def FIRST
  "Enum Constant.

  Include the first point, but not the last point.

  type: org.apache.commons.math4.ode.sampling.StepNormalizerBounds"
  StepNormalizerBounds/FIRST)

(def LAST
  "Enum Constant.

  Include the last point, but not the first point.

  type: org.apache.commons.math4.ode.sampling.StepNormalizerBounds"
  StepNormalizerBounds/LAST)

(def BOTH
  "Enum Constant.

  Include both the first and last points.

  type: org.apache.commons.math4.ode.sampling.StepNormalizerBounds"
  StepNormalizerBounds/BOTH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StepNormalizerBounds c : StepNormalizerBounds.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.ode.sampling.StepNormalizerBounds[]`"
  ([]
    (StepNormalizerBounds/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.ode.sampling.StepNormalizerBounds`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.ode.sampling.StepNormalizerBounds [^java.lang.String name]
    (StepNormalizerBounds/valueOf name)))

(defn first-included
  "Returns a value indicating whether the first point should be passed
   to the underlying fixed step size step handler.

  returns: value indicating whether the first point should be passed
   to the underlying fixed step size step handler. - `boolean`"
  (^Boolean [^StepNormalizerBounds this]
    (-> this (.firstIncluded))))

(defn last-included
  "Returns a value indicating whether the last point should be passed
   to the underlying fixed step size step handler.

  returns: value indicating whether the last point should be passed
   to the underlying fixed step size step handler. - `boolean`"
  (^Boolean [^StepNormalizerBounds this]
    (-> this (.lastIncluded))))

