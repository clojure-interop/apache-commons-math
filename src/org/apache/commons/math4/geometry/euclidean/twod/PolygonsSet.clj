(ns org.apache.commons.math4.geometry.euclidean.twod.PolygonsSet
  "This class represents a 2D region: a set of polygons."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.twod PolygonsSet]))

(defn ->polygons-set
  "Constructor.

  Build a parallellepipedic box.

  x-min - low bound along the x direction - `double`
  x-max - high bound along the x direction - `double`
  y-min - low bound along the y direction - `double`
  y-max - high bound along the y direction - `double`
  tolerance - tolerance below which points are considered identical - `double`"
  (^PolygonsSet [^Double x-min ^Double x-max ^Double y-min ^Double y-max ^Double tolerance]
    (new PolygonsSet x-min x-max y-min y-max tolerance))
  (^PolygonsSet [^org.apache.commons.math4.geometry.partitioning.BSPTree tree ^Double tolerance]
    (new PolygonsSet tree tolerance))
  (^PolygonsSet [^Double tolerance]
    (new PolygonsSet tolerance)))

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

  returns: the built region - `org.apache.commons.math4.geometry.euclidean.twod.PolygonsSet`"
  (^org.apache.commons.math4.geometry.euclidean.twod.PolygonsSet [^PolygonsSet this ^org.apache.commons.math4.geometry.partitioning.BSPTree tree]
    (-> this (.buildNew tree))))

(defn get-vertices
  "Get the vertices of the polygon.
   The polygon boundary can be represented as an array of loops,
   each loop being itself an array of vertices.
   In order to identify open loops which start and end by
   infinite edges, the open loops arrays start with a null point. In
   this case, the first non null point and the last point of the
   array do not represent real vertices, they are dummy points
   intended only to get the direction of the first and last edge. An
   open loop consisting of a single infinite line will therefore be
   represented by a three elements array with one null point
   followed by two dummy points. The open loops are always the first
   ones in the loops array.
   If the polygon has no boundary at all, a zero length loop
   array will be returned.
   All line segments in the various loops have the inside of the
   region on their left side and the outside on their right side
   when moving in the underlying line direction. This means that
   closed loops surrounding finite areas obey the direct
   trigonometric orientation.

  returns: vertices of the polygon, organized as oriented boundary
   loops with the open loops first (the returned value is guaranteed
   to be non-null) - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D[][]`"
  ([^PolygonsSet this]
    (-> this (.getVertices))))

