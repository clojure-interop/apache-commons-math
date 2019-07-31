(ns org.apache.commons.math4.geometry.spherical.oned.Sphere1D$NoSubSpaceException
  "Specialized exception for inexistent sub-space.

  This exception is thrown when attempting to get the sub-space of a one-dimensional space"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.oned Sphere1D$NoSubSpaceException]))

(defn ->no-sub-space-exception
  "Constructor.

  Simple constructor."
  (^Sphere1D$NoSubSpaceException []
    (new Sphere1D$NoSubSpaceException )))

