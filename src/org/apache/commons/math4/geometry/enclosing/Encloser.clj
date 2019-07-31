(ns org.apache.commons.math4.geometry.enclosing.Encloser
  "Interface for algorithms computing enclosing balls."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.enclosing Encloser]))

(defn enclose
  "Find a ball enclosing a list of points.

  points - points to enclose - `java.lang.Iterable`

  returns: enclosing ball - `org.apache.commons.math4.geometry.enclosing.EnclosingBall<S,P>`"
  (^org.apache.commons.math4.geometry.enclosing.EnclosingBall [^Encloser this ^java.lang.Iterable points]
    (-> this (.enclose points))))

