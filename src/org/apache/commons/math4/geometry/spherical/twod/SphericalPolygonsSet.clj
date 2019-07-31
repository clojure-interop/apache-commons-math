(ns org.apache.commons.math4.geometry.spherical.twod.SphericalPolygonsSet
  "This class represents a region on the 2-sphere: a set of spherical polygons."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.twod SphericalPolygonsSet]))

(defn ->spherical-polygons-set
  "Constructor.

  Build a polygons set representing a regular polygon.

  center - center of the polygon (the center is in the inside half) - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  meridian - point defining the reference meridian for first polygon vertex - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  outside-radius - distance of the vertices to the center - `double`
  n - number of sides of the polygon - `int`
  tolerance - below which points are consider to be identical - `double`"
  (^SphericalPolygonsSet [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D center ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D meridian ^Double outside-radius ^Integer n ^Double tolerance]
    (new SphericalPolygonsSet center meridian outside-radius n tolerance))
  (^SphericalPolygonsSet [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D pole ^Double tolerance]
    (new SphericalPolygonsSet pole tolerance))
  (^SphericalPolygonsSet [^Double tolerance]
    (new SphericalPolygonsSet tolerance)))

(defn build-new
  "Build a region using the instance as a prototype.
   This method allow to create new instances without knowing
   exactly the type of the region. It is an application of the
   prototype design pattern.
   The leaf nodes of the BSP tree must have a
   Boolean attribute representing the inside status of
   the corresponding cell (true for inside cells, false for outside
   cells). In order to avoid building too many small objects, it is
   recommended to use the predefined constants
   Boolean.TRUE and Boolean.FALSE. The
   tree also must have either null internal nodes or
   internal nodes representing the boundary as specified in the
   getTree method).

  tree - inside/outside BSP tree representing the new region - `org.apache.commons.math4.geometry.partitioning.BSPTree`

  returns: the built region - `org.apache.commons.math4.geometry.spherical.twod.SphericalPolygonsSet`"
  (^org.apache.commons.math4.geometry.spherical.twod.SphericalPolygonsSet [^SphericalPolygonsSet this ^org.apache.commons.math4.geometry.partitioning.BSPTree tree]
    (-> this (.buildNew tree))))

(defn get-boundary-loops
  "Get the boundary loops of the polygon.
   The polygon boundary can be represented as a list of closed loops,
   each loop being given by exactly one of its vertices. From each loop
   start vertex, one can follow the loop by finding the outgoing edge,
   then the end vertex, then the next outgoing edge ... until the start
   vertex of the loop (exactly the same instance) is found again once
   the full loop has been visited.
   If the polygon has no boundary at all, a zero length loop
   array will be returned.
   If the polygon is a simple one-piece polygon, then the returned
   array will contain a single vertex.

   All edges in the various loops have the inside of the region on
   their left side (i.e. toward their pole) and the outside on their
   right side (i.e. away from their pole) when moving in the underlying
   circle direction. This means that the closed loops obey the direct
   trigonometric orientation.

  returns: boundary of the polygon, organized as an unmodifiable list of loops start vertices. - `java.util.List<org.apache.commons.math4.geometry.spherical.twod.Vertex>`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if the tolerance setting does not allow to build a clean non-ambiguous boundary"
  (^java.util.List [^SphericalPolygonsSet this]
    (-> this (.getBoundaryLoops))))

(defn get-enclosing-cap
  "Get a spherical cap enclosing the polygon.

   This method is intended as a first test to quickly identify points
   that are guaranteed to be outside of the region, hence performing a full
   checkPoint
   only if the point status remains undecided after the quick check. It is
   is therefore mostly useful to speed up computation for small polygons with
   complex shapes (say a country boundary on Earth), as the spherical cap will
   be small and hence will reliably identify a large part of the sphere as outside,
   whereas the full check can be more computing intensive. A typical use case is
   therefore:



     // compute region, plus an enclosing spherical cap
     SphericalPolygonsSet complexShape = ...;
     EnclosingBall cap = complexShape.getEnclosingCap();

     // check lots of points
     for (Vector3D p : points) {

       final Location l;
       if (cap.contains(p)) {
         // we cannot be sure where the point is
         // we need to perform the full computation
         l = complexShape.checkPoint(v);
       } else {
         // no need to do further computation,
         // we already know the point is outside
         l = Location.OUTSIDE;
       }

       // use l ...

     }

   In the special cases of empty or whole sphere polygons, special
   spherical caps are returned, with angular radius set to negative
   or positive infinity so the ball.contains(point)
   method return always false or true.


   This method is not guaranteed to return the smallest enclosing cap.

  returns: a spherical cap enclosing the polygon - `org.apache.commons.math4.geometry.enclosing.EnclosingBall<org.apache.commons.math4.geometry.spherical.twod.Sphere2D,org.apache.commons.math4.geometry.spherical.twod.S2Point>`"
  (^org.apache.commons.math4.geometry.enclosing.EnclosingBall [^SphericalPolygonsSet this]
    (-> this (.getEnclosingCap))))

