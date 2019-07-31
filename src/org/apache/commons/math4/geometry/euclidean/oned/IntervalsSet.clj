(ns org.apache.commons.math4.geometry.euclidean.oned.IntervalsSet
  "This class represents a 1D region: a set of intervals."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.oned IntervalsSet]))

(defn ->intervals-set
  "Constructor.

  Build an intervals set corresponding to a single interval.

  lower - lower bound of the interval, must be lesser or equal to upper (may be Double.NEGATIVE_INFINITY) - `double`
  upper - upper bound of the interval, must be greater or equal to lower (may be Double.POSITIVE_INFINITY) - `double`
  tolerance - tolerance below which points are considered identical. - `double`"
  (^IntervalsSet [^Double lower ^Double upper ^Double tolerance]
    (new IntervalsSet lower upper tolerance))
  (^IntervalsSet [^org.apache.commons.math4.geometry.partitioning.BSPTree tree ^Double tolerance]
    (new IntervalsSet tree tolerance))
  (^IntervalsSet [^Double tolerance]
    (new IntervalsSet tolerance)))

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

  returns: the built region - `org.apache.commons.math4.geometry.euclidean.oned.IntervalsSet`"
  (^org.apache.commons.math4.geometry.euclidean.oned.IntervalsSet [^IntervalsSet this ^org.apache.commons.math4.geometry.partitioning.BSPTree tree]
    (-> this (.buildNew tree))))

(defn get-inf
  "Get the lowest value belonging to the instance.

  returns: lowest value belonging to the instance
   (Double.NEGATIVE_INFINITY if the instance doesn't
   have any low bound, Double.POSITIVE_INFINITY if the
   instance is empty) - `double`"
  (^Double [^IntervalsSet this]
    (-> this (.getInf))))

(defn get-sup
  "Get the highest value belonging to the instance.

  returns: highest value belonging to the instance
   (Double.POSITIVE_INFINITY if the instance doesn't
   have any high bound, Double.NEGATIVE_INFINITY if the
   instance is empty) - `double`"
  (^Double [^IntervalsSet this]
    (-> this (.getSup))))

(defn project-to-boundary
  "Project a point on the boundary of the region.

  point - point to check - `org.apache.commons.math4.geometry.Point`

  returns: projection of the point on the boundary - `org.apache.commons.math4.geometry.partitioning.BoundaryProjection<org.apache.commons.math4.geometry.euclidean.oned.Euclidean1D>`"
  (^org.apache.commons.math4.geometry.partitioning.BoundaryProjection [^IntervalsSet this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.projectToBoundary point))))

(defn as-list
  "Build an ordered list of intervals representing the instance.
   This method builds this intervals set as an ordered list of
   Interval elements. If the intervals set has no
   lower limit, the first interval will have its low bound equal to
   Double.NEGATIVE_INFINITY. If the intervals set has
   no upper limit, the last interval will have its upper bound equal
   to Double.POSITIVE_INFINITY. An empty tree will
   build an empty list while a tree representing the whole real line
   will build a one element list with both bounds being
   infinite.

  returns: a new ordered list containing Interval
   elements - `java.util.List<org.apache.commons.math4.geometry.euclidean.oned.Interval>`"
  (^java.util.List [^IntervalsSet this]
    (-> this (.asList))))

(defn iterator
  "The iterator returns the limit values of sub-intervals in ascending order.


   The iterator does not support the optional remove operation.

  returns: `java.util.Iterator<double[]>`"
  ([^IntervalsSet this]
    (-> this (.iterator))))

