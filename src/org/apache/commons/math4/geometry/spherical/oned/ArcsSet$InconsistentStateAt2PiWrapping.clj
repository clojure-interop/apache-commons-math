(ns org.apache.commons.math4.geometry.spherical.oned.ArcsSet$InconsistentStateAt2PiWrapping
  "Specialized exception for inconsistent BSP tree state inconsistency.

  This exception is thrown at ArcsSet construction time when the
  inside/outside
  state is not consistent at the 0, \\(2 \\pi \\) crossing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.oned ArcsSet$InconsistentStateAt2PiWrapping]))

(defn ->inconsistent-state-at-2-pi-wrapping
  "Constructor.

  Simple constructor."
  (^ArcsSet$InconsistentStateAt2PiWrapping []
    (new ArcsSet$InconsistentStateAt2PiWrapping )))

