(ns org.apache.commons.math4.geometry.enclosing.SupportBallGenerator
  "Interface for generating balls based on support points.

  This generator is used in the Emo Welzl algorithm
  and its derivatives."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.enclosing SupportBallGenerator]))

(defn ball-on-support
  "Create a ball whose boundary lies on prescribed support points.

  support - support points (may be empty) - `java.util.List`

  returns: ball whose boundary lies on the prescribed support points - `org.apache.commons.math4.geometry.enclosing.EnclosingBall<S,P>`"
  (^org.apache.commons.math4.geometry.enclosing.EnclosingBall [^SupportBallGenerator this ^java.util.List support]
    (-> this (.ballOnSupport support))))

