(ns org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet
  "This class represents a 3D region: a set of polyhedrons."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed PolyhedronsSet]))

(defn ->polyhedrons-set
  "Constructor.

  Build a parallellepipedic box.

  x-min - low bound along the x direction - `double`
  x-max - high bound along the x direction - `double`
  y-min - low bound along the y direction - `double`
  y-max - high bound along the y direction - `double`
  z-min - low bound along the z direction - `double`
  z-max - high bound along the z direction - `double`
  tolerance - tolerance below which points are considered identical - `double`"
  (^PolyhedronsSet [^Double x-min ^Double x-max ^Double y-min ^Double y-max ^Double z-min ^Double z-max ^Double tolerance]
    (new PolyhedronsSet x-min x-max y-min y-max z-min z-max tolerance))
  (^PolyhedronsSet [^java.util.List vertices ^java.util.List facets ^Double tolerance]
    (new PolyhedronsSet vertices facets tolerance))
  (^PolyhedronsSet [^org.apache.commons.math4.geometry.partitioning.BSPTree tree ^Double tolerance]
    (new PolyhedronsSet tree tolerance))
  (^PolyhedronsSet [^Double tolerance]
    (new PolyhedronsSet tolerance)))

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

  returns: the built region - `org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet`"
  (^org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet [^PolyhedronsSet this ^org.apache.commons.math4.geometry.partitioning.BSPTree tree]
    (-> this (.buildNew tree))))

(defn first-intersection
  "Get the first sub-hyperplane crossed by a semi-infinite line.

  point - start point of the part of the line considered - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  line - line to consider (contains point) - `org.apache.commons.math4.geometry.euclidean.threed.Line`

  returns: the first sub-hyperplane crossed by the line after the
   given point, or null if the line does not intersect any
   sub-hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<org.apache.commons.math4.geometry.euclidean.threed.Euclidean3D>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^PolyhedronsSet this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D point ^org.apache.commons.math4.geometry.euclidean.threed.Line line]
    (-> this (.firstIntersection point line))))

(defn rotate
  "Rotate the region around the specified point.
   The instance is not modified, a new instance is created.

  center - rotation center - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  rotation - vectorial rotation operator - `org.apache.commons.math4.geometry.euclidean.threed.Rotation`

  returns: a new instance representing the rotated region - `org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet`"
  (^org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet [^PolyhedronsSet this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D center ^org.apache.commons.math4.geometry.euclidean.threed.Rotation rotation]
    (-> this (.rotate center rotation))))

(defn translate
  "Translate the region by the specified amount.
   The instance is not modified, a new instance is created.

  translation - translation to apply - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`

  returns: a new instance representing the translated region - `org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet`"
  (^org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet [^PolyhedronsSet this ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D translation]
    (-> this (.translate translation))))

