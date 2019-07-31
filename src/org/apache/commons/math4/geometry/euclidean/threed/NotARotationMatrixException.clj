(ns org.apache.commons.math4.geometry.euclidean.threed.NotARotationMatrixException
  "This class represents exceptions thrown while building rotations
  from matrices."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed NotARotationMatrixException]))

(defn ->not-a-rotation-matrix-exception
  "Constructor.

  Simple constructor.
   Build an exception by translating and formating a message

  specifier - format specifier (to be translated) - `org.apache.commons.math4.exception.util.Localizable`
  parts - to insert in the format (no translation) - `java.lang.Object`"
  (^NotARotationMatrixException [^org.apache.commons.math4.exception.util.Localizable specifier ^java.lang.Object parts]
    (new NotARotationMatrixException specifier parts)))

