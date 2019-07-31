(ns org.apache.commons.math4.geometry.spherical.oned.ArcsSet
  "This class represents a region of a circle: a set of arcs.

  Note that due to the wrapping around \\(2 \\pi\\), barycenter is
  ill-defined here. It was defined only in order to fulfill
  the requirements of the Region
  interface, but its use is discouraged."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.oned ArcsSet]))

(defn ->arcs-set
  "Constructor.

  Build an arcs set corresponding to a single arc.

   If either lower is equals to upper or
   the interval exceeds \\( 2 \\pi \\), the arc is considered
   to be the full circle and its initial defining boundaries
   will be forgotten. lower is not allowed to be greater
   than upper (an exception is thrown in this case).

  lower - lower bound of the arc - `double`
  upper - upper bound of the arc - `double`
  tolerance - tolerance below which close sub-arcs are merged together - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if lower is greater than upper"
  (^ArcsSet [^Double lower ^Double upper ^Double tolerance]
    (new ArcsSet lower upper tolerance))
  (^ArcsSet [^org.apache.commons.math4.geometry.partitioning.BSPTree tree ^Double tolerance]
    (new ArcsSet tree tolerance))
  (^ArcsSet [^Double tolerance]
    (new ArcsSet tolerance)))

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

  returns: the built region - `org.apache.commons.math4.geometry.spherical.oned.ArcsSet`"
  (^org.apache.commons.math4.geometry.spherical.oned.ArcsSet [^ArcsSet this ^org.apache.commons.math4.geometry.partitioning.BSPTree tree]
    (-> this (.buildNew tree))))

(defn project-to-boundary
  "Project a point on the boundary of the region.

  point - point to check - `org.apache.commons.math4.geometry.Point`

  returns: projection of the point on the boundary - `org.apache.commons.math4.geometry.partitioning.BoundaryProjection<org.apache.commons.math4.geometry.spherical.oned.Sphere1D>`"
  (^org.apache.commons.math4.geometry.partitioning.BoundaryProjection [^ArcsSet this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.projectToBoundary point))))

(defn as-list
  "Build an ordered list of arcs representing the instance.
   This method builds this arcs set as an ordered list of
   Arc elements. An empty tree will build an empty list
   while a tree representing the whole circle will build a one
   element list with bounds set to \\( 0 and 2 \\pi \\).

  returns: a new ordered list containing Arc elements - `java.util.List<org.apache.commons.math4.geometry.spherical.oned.Arc>`"
  (^java.util.List [^ArcsSet this]
    (-> this (.asList))))

(defn iterator
  "The iterator returns the limit angles pairs of sub-arcs in trigonometric order.


   The iterator does not support the optional remove operation.

  returns: `java.util.Iterator<double[]>`"
  ([^ArcsSet this]
    (-> this (.iterator))))

(defn side
  "Deprecated. as of 3.6, replaced with split(Arc).ArcsSet.Split.getSide()

  arc - arc to check instance against - `org.apache.commons.math4.geometry.spherical.oned.Arc`

  returns: one of Side.PLUS, Side.MINUS, Side.BOTH
   or Side.HYPER - `org.apache.commons.math4.geometry.partitioning.Side`"
  (^org.apache.commons.math4.geometry.partitioning.Side [^ArcsSet this ^org.apache.commons.math4.geometry.spherical.oned.Arc arc]
    (-> this (.side arc))))

(defn split
  "Split the instance in two parts by an arc.

  arc - splitting arc - `org.apache.commons.math4.geometry.spherical.oned.Arc`

  returns: an object containing both the part of the instance
   on the plus side of the arc and the part of the
   instance on the minus side of the arc - `org.apache.commons.math4.geometry.spherical.oned.ArcsSet$Split`"
  (^org.apache.commons.math4.geometry.spherical.oned.ArcsSet$Split [^ArcsSet this ^org.apache.commons.math4.geometry.spherical.oned.Arc arc]
    (-> this (.split arc))))

