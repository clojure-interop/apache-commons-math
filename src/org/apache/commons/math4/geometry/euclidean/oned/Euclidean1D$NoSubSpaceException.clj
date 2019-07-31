(ns org.apache.commons.math4.geometry.euclidean.oned.Euclidean1D$NoSubSpaceException
  "Specialized exception for inexistent sub-space.

  This exception is thrown when attempting to get the sub-space of a one-dimensional space"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.oned Euclidean1D$NoSubSpaceException]))

(defn ->no-sub-space-exception
  "Constructor.

  Simple constructor."
  (^Euclidean1D$NoSubSpaceException []
    (new Euclidean1D$NoSubSpaceException )))

