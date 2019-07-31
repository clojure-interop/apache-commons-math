(ns org.apache.commons.math4.geometry.euclidean.threed.CardanEulerSingularityException
  "This class represents exceptions thrown while extractiong Cardan
  or Euler angles from a rotation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed CardanEulerSingularityException]))

(defn ->cardan-euler-singularity-exception
  "Constructor.

  Simple constructor.
   build an exception with a default message.

  is-cardan - if true, the rotation is related to Cardan angles, if false it is related to EulerAngles - `boolean`"
  (^CardanEulerSingularityException [^Boolean is-cardan]
    (new CardanEulerSingularityException is-cardan)))

