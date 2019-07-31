(ns org.apache.commons.math4.ode.sampling.StepNormalizerMode
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.sampling StepNormalizerMode]))

(def INCREMENT
  "Enum Constant.

  Steps are fixed increments of the start value. In other words, they
   are relative to the start value.

   If the integration start time is t0, then the points handled by
   the underlying fixed step size step handler are t0 (depending on
   the bounds settings), t0+h, t0+2h, ...

   If the integration range is an integer multiple of the step size
   (h), then the last point handled will be the end point of the
   integration (tend). If not, the last point may be the end point
   tend, or it may be a point belonging to the interval [tend - h ;
   tend], depending on the bounds settings.

  type: org.apache.commons.math4.ode.sampling.StepNormalizerMode"
  StepNormalizerMode/INCREMENT)

(def MULTIPLES
  "Enum Constant.

  Steps are multiples of a fixed value. In other words, they are
   relative to the first multiple of the step size that is encountered
   after the start value.

   If the integration start time is t0, and the first multiple of
   the fixed step size that is encountered is t1, then the points
   handled by the underlying fixed step size step handler are t0
   (depending on the bounds settings), t1,
   t1+h, t1+2h, ...

   If the end point of the integration range (tend) is an integer
   multiple of the step size (h) added to t1, then the last point
   handled will be the end point of the integration (tend). If not,
   the last point may be the end point tend, or it may be a point
   belonging to the interval [tend - h ; tend], depending on the
   bounds settings.

  type: org.apache.commons.math4.ode.sampling.StepNormalizerMode"
  StepNormalizerMode/MULTIPLES)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StepNormalizerMode c : StepNormalizerMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.ode.sampling.StepNormalizerMode[]`"
  ([]
    (StepNormalizerMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.ode.sampling.StepNormalizerMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.ode.sampling.StepNormalizerMode [^java.lang.String name]
    (StepNormalizerMode/valueOf name)))

