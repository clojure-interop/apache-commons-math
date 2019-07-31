(ns org.apache.commons.math4.geometry.euclidean.twod.hull.MonotoneChain
  "Implements Andrew's monotone chain method to generate the convex hull of a finite set of
  points in the two-dimensional euclidean space.

  The runtime complexity is O(n log n), with n being the number of input points. If the
  point set is already sorted (by x-coordinate), the runtime complexity is O(n).

  The implementation is not sensitive to collinear points on the hull. The parameter
  includeCollinearPoints allows to control the behavior with regard to collinear points.
  If true, all points on the boundary of the hull will be added to the hull vertices,
  otherwise only the extreme points will be present. By default, collinear points are not added
  as hull vertices.

  The tolerance parameter (default: 1e-10) is used as epsilon criteria to determine
  identical and collinear points."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod.hull MonotoneChain]))

(defn ->monotone-chain
  "Constructor.

  Create a new MonotoneChain instance.

  include-collinear-points - whether collinear points shall be added as hull vertices - `boolean`
  tolerance - tolerance below which points are considered identical - `double`"
  (^MonotoneChain [^Boolean include-collinear-points ^Double tolerance]
    (new MonotoneChain include-collinear-points tolerance))
  (^MonotoneChain [^Boolean include-collinear-points]
    (new MonotoneChain include-collinear-points))
  (^MonotoneChain []
    (new MonotoneChain )))

(defn find-hull-vertices
  "Find the convex hull vertices from the set of input points.

  points - the set of input points - `java.util.Collection`

  returns: the convex hull vertices in CCW winding - `java.util.Collection<org.apache.commons.math4.geometry.euclidean.twod.Vector2D>`"
  (^java.util.Collection [^MonotoneChain this ^java.util.Collection points]
    (-> this (.findHullVertices points))))

(defn get-tolerance
  "Get the tolerance below which points are considered identical.

  returns: the tolerance below which points are considered identical - `double`"
  (^Double [^MonotoneChain this]
    (-> this (.getTolerance))))

(defn include-collinear-points?
  "Returns if collinear points on the hull will be added as hull vertices.

  returns: true if collinear points are added as hull vertices, or false
   if only extreme points are present. - `boolean`"
  (^Boolean [^MonotoneChain this]
    (-> this (.isIncludeCollinearPoints))))

(defn generate
  "Builds the convex hull from the set of input points.

  points - the set of input points - `java.util.Collection`

  returns: the convex hull - `org.apache.commons.math4.geometry.euclidean.twod.hull.ConvexHull2D`

  throws: org.apache.commons.math4.exception.NullArgumentException - if the input collection is null"
  (^org.apache.commons.math4.geometry.euclidean.twod.hull.ConvexHull2D [^MonotoneChain this ^java.util.Collection points]
    (-> this (.generate points))))

