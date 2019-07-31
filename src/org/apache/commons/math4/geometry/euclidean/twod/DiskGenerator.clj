(ns org.apache.commons.math4.geometry.euclidean.twod.DiskGenerator
  "Class generating an enclosing ball from its support points."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod DiskGenerator]))

(defn ->disk-generator
  "Constructor."
  (^DiskGenerator []
    (new DiskGenerator )))

(defn ball-on-support
  "Create a ball whose boundary lies on prescribed support points.

  support - support points (may be empty) - `java.util.List`

  returns: ball whose boundary lies on the prescribed support points - `org.apache.commons.math4.geometry.enclosing.EnclosingBall<org.apache.commons.math4.geometry.euclidean.twod.Euclidean2D,org.apache.commons.math4.geometry.euclidean.twod.Vector2D>`"
  (^org.apache.commons.math4.geometry.enclosing.EnclosingBall [^DiskGenerator this ^java.util.List support]
    (-> this (.ballOnSupport support))))

