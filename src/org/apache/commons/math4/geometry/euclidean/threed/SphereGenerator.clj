(ns org.apache.commons.math4.geometry.euclidean.threed.SphereGenerator
  "Class generating an enclosing ball from its support points."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed SphereGenerator]))

(defn ->sphere-generator
  "Constructor."
  (^SphereGenerator []
    (new SphereGenerator )))

(defn ball-on-support
  "Create a ball whose boundary lies on prescribed support points.

  support - support points (may be empty) - `java.util.List`

  returns: ball whose boundary lies on the prescribed support points - `org.apache.commons.math4.geometry.enclosing.EnclosingBall<org.apache.commons.math4.geometry.euclidean.threed.Euclidean3D,org.apache.commons.math4.geometry.euclidean.threed.Vector3D>`"
  (^org.apache.commons.math4.geometry.enclosing.EnclosingBall [^SphereGenerator this ^java.util.List support]
    (-> this (.ballOnSupport support))))

