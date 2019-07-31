(ns org.apache.commons.math4.geometry.euclidean.twod.hull.AklToussaintHeuristic
  "A simple heuristic to improve the performance of convex hull algorithms.

  The heuristic is based on the idea of a convex quadrilateral, which is formed by
  four points with the lowest and highest x / y coordinates. Any point that lies inside
  this quadrilateral can not be part of the convex hull and can thus be safely discarded
  before generating the convex hull itself.

  The complexity of the operation is O(n), and may greatly improve the time it takes to
  construct the convex hull afterwards, depending on the point distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod.hull AklToussaintHeuristic]))

(defn *reduce-points
  "Returns a point set that is reduced by all points for which it is safe to assume
   that they are not part of the convex hull.

  points - the original point set - `java.util.Collection`

  returns: a reduced point set, useful as input for convex hull algorithms - `java.util.Collection<org.apache.commons.math4.geometry.euclidean.twod.Vector2D>`"
  (^java.util.Collection [^java.util.Collection points]
    (AklToussaintHeuristic/reducePoints points)))

