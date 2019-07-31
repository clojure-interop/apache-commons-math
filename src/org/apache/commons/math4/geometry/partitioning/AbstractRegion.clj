(ns org.apache.commons.math4.geometry.partitioning.AbstractRegion
  "Abstract class for all regions, independently of geometry type or dimension."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning AbstractRegion]))

(defn ->abstract-region
  "Constructor.

  Build a convex region from an array of bounding hyperplanes.

  hyperplanes - array of bounding hyperplanes (if null, an empty region will be built) - `org.apache.commons.math4.geometry.partitioning.Hyperplane[]`
  tolerance - tolerance below which points are considered identical. - `double`"
  (^AbstractRegion [hyperplanes ^Double tolerance]
    (new AbstractRegion hyperplanes tolerance)))

(defn copy-self
  "Copy the instance.
   The instance created is completely independant of the original
   one. A deep copy is used, none of the underlying objects are
   shared (except for the underlying tree Boolean
   attributes and immutable objects).

  returns: a new region, copy of the instance - `org.apache.commons.math4.geometry.partitioning.AbstractRegion<S,T>`"
  (^org.apache.commons.math4.geometry.partitioning.AbstractRegion [^AbstractRegion this]
    (-> this (.copySelf))))

(defn get-tree
  "Get the underlying BSP tree.

   Regions are represented by an underlying inside/outside BSP
   tree whose leaf attributes are Boolean instances
   representing inside leaf cells if the attribute value is
   true and outside leaf cells if the attribute is
   false. These leaf attributes are always present and
   guaranteed to be non null.

   In addition to the leaf attributes, the internal nodes which
   correspond to cells split by cut sub-hyperplanes may contain
   BoundaryAttribute objects representing
   the parts of the corresponding cut sub-hyperplane that belong to
   the boundary. When the boundary attributes have been computed,
   all internal nodes are guaranteed to have non-null
   attributes, however some BoundaryAttribute instances may have their getPlusInside and getPlusOutside methods both
   returning null if the corresponding cut sub-hyperplane does not
   have any parts belonging to the boundary.

   Since computing the boundary is not always required and can be
   time-consuming for large trees, these internal nodes attributes
   are computed using lazy evaluation only when required by setting
   the includeBoundaryAttributes argument to
   true. Once computed, these attributes remain in the
   tree, which implies that in this case, further calls to the
   method for the same region will always include these attributes
   regardless of the value of the
   includeBoundaryAttributes argument.

  include-boundary-attributes - if true, the boundary attributes at internal nodes are guaranteed to be included (they may be included even if the argument is false, if they have already been computed due to a previous call) - `boolean`

  returns: underlying BSP tree - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^AbstractRegion this ^Boolean include-boundary-attributes]
    (-> this (.getTree include-boundary-attributes))))

(defn contains
  "Check if the instance entirely contains another region.

  region - region to check against the instance - `org.apache.commons.math4.geometry.partitioning.Region`

  returns: true if the instance contains the specified tree - `boolean`"
  (^Boolean [^AbstractRegion this ^org.apache.commons.math4.geometry.partitioning.Region region]
    (-> this (.contains region))))

(defn get-boundary-size
  "Get the size of the boundary.

  returns: the size of the boundary (this is 0 in 1D, a length in
   2D, an area in 3D ...) - `double`"
  (^Double [^AbstractRegion this]
    (-> this (.getBoundarySize))))

(defn get-tolerance
  "Get the tolerance below which points are considered to belong to hyperplanes.

  returns: tolerance below which points are considered to belong to hyperplanes - `double`"
  (^Double [^AbstractRegion this]
    (-> this (.getTolerance))))

(defn project-to-boundary
  "Project a point on the boundary of the region.

  point - point to check - `org.apache.commons.math4.geometry.Point`

  returns: projection of the point on the boundary - `org.apache.commons.math4.geometry.partitioning.BoundaryProjection<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BoundaryProjection [^AbstractRegion this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.projectToBoundary point))))

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

  new-tree - inside/outside BSP tree representing the new region - `org.apache.commons.math4.geometry.partitioning.BSPTree`

  returns: the built region - `org.apache.commons.math4.geometry.partitioning.AbstractRegion<S,T>`"
  (^org.apache.commons.math4.geometry.partitioning.AbstractRegion [^AbstractRegion this ^org.apache.commons.math4.geometry.partitioning.BSPTree new-tree]
    (-> this (.buildNew new-tree))))

(defn intersection
  "Get the parts of a sub-hyperplane that are contained in the region.
   The parts of the sub-hyperplane that belong to the boundary are
   not included in the resulting parts.

  sub - sub-hyperplane traversing the region - `org.apache.commons.math4.geometry.partitioning.SubHyperplane`

  returns: filtered sub-hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^AbstractRegion this ^org.apache.commons.math4.geometry.partitioning.SubHyperplane sub]
    (-> this (.intersection sub))))

(defn get-barycenter
  "Get the barycenter of the instance.

  returns: an object representing the barycenter - `org.apache.commons.math4.geometry.Point<S>`"
  (^org.apache.commons.math4.geometry.Point [^AbstractRegion this]
    (-> this (.getBarycenter))))

(defn full?
  "Check if the sub-tree starting at a given node covers the full space.

  node - root node of the sub-tree (must have Region tree semantics, i.e. the leaf nodes must have Boolean attributes representing an inside/outside property) - `org.apache.commons.math4.geometry.partitioning.BSPTree`

  returns: true if the sub-tree starting at the given node covers the full space - `boolean`"
  (^Boolean [^AbstractRegion this ^org.apache.commons.math4.geometry.partitioning.BSPTree node]
    (-> this (.isFull node)))
  (^Boolean [^AbstractRegion this]
    (-> this (.isFull))))

(defn empty?
  "Check if the sub-tree starting at a given node is empty.

  node - root node of the sub-tree (must have Region tree semantics, i.e. the leaf nodes must have Boolean attributes representing an inside/outside property) - `org.apache.commons.math4.geometry.partitioning.BSPTree`

  returns: true if the sub-tree starting at the given node is empty - `boolean`"
  (^Boolean [^AbstractRegion this ^org.apache.commons.math4.geometry.partitioning.BSPTree node]
    (-> this (.isEmpty node)))
  (^Boolean [^AbstractRegion this]
    (-> this (.isEmpty))))

(defn apply-transform
  "Transform a region.
   Applying a transform to a region consist in applying the
   transform to all the hyperplanes of the underlying BSP tree and
   of the boundary (and also to the sub-hyperplanes embedded in
   these hyperplanes) and to the barycenter. The instance is not
   modified, a new instance is built.

  transform - transform to apply - `org.apache.commons.math4.geometry.partitioning.Transform`

  returns: a new region, resulting from the application of the
   transform to the instance - `org.apache.commons.math4.geometry.partitioning.AbstractRegion<S,T>`"
  (^org.apache.commons.math4.geometry.partitioning.AbstractRegion [^AbstractRegion this ^org.apache.commons.math4.geometry.partitioning.Transform transform]
    (-> this (.applyTransform transform))))

(defn check-point
  "Check a point with respect to the region.

  point - point to check - `org.apache.commons.math4.geometry.Vector`

  returns: a code representing the point status: either Region.Location.INSIDE, Region.Location.OUTSIDE or
   Region.Location.BOUNDARY - `org.apache.commons.math4.geometry.partitioning.Region$Location`"
  (^org.apache.commons.math4.geometry.partitioning.Region$Location [^AbstractRegion this ^org.apache.commons.math4.geometry.Vector point]
    (-> this (.checkPoint point))))

(defn get-size
  "Get the size of the instance.

  returns: the size of the instance (this is a length in 1D, an area
   in 2D, a volume in 3D ...) - `double`"
  (^Double [^AbstractRegion this]
    (-> this (.getSize))))

