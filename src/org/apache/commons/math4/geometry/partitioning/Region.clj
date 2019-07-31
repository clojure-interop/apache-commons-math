(ns org.apache.commons.math4.geometry.partitioning.Region
  "This interface represents a region of a space as a partition.

  Region are subsets of a space, they can be infinite (whole
  space, half space, infinite stripe ...) or finite (polygons in 2D,
  polyhedrons in 3D ...). Their main characteristic is to separate
  points that are considered to be inside the region from
  points considered to be outside of it. In between, there
  may be points on the boundary of the region.

  This implementation is limited to regions for which the boundary
  is composed of several sub-hyperplanes,
  including regions with no boundary at all: the whole space and the
  empty region. They are not necessarily finite and not necessarily
  path-connected. They can contain holes.

  Regions can be combined using the traditional sets operations :
  union, intersection, difference and symetric difference (exclusive
  or) for the binary operations, complement for the unary
  operation.


  Note that this interface is not intended to be implemented
  by Apache Commons Math users, it is only intended to be implemented
  within the library itself. New methods may be added even for minor
  versions, which breaks compatibility for external implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning Region]))

(defn copy-self
  "Copy the instance.
   The instance created is completely independant of the original
   one. A deep copy is used, none of the underlying objects are
   shared (except for the underlying tree Boolean
   attributes and immutable objects).

  returns: a new region, copy of the instance - `org.apache.commons.math4.geometry.partitioning.Region<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Region [^Region this]
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
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^Region this ^Boolean include-boundary-attributes]
    (-> this (.getTree include-boundary-attributes))))

(defn contains
  "Check if the instance entirely contains another region.

  region - region to check against the instance - `org.apache.commons.math4.geometry.partitioning.Region`

  returns: true if the instance contains the specified tree - `boolean`"
  (^Boolean [^Region this ^org.apache.commons.math4.geometry.partitioning.Region region]
    (-> this (.contains region))))

(defn get-boundary-size
  "Get the size of the boundary.

  returns: the size of the boundary (this is 0 in 1D, a length in
   2D, an area in 3D ...) - `double`"
  (^Double [^Region this]
    (-> this (.getBoundarySize))))

(defn project-to-boundary
  "Project a point on the boundary of the region.

  point - point to check - `org.apache.commons.math4.geometry.Point`

  returns: projection of the point on the boundary - `org.apache.commons.math4.geometry.partitioning.BoundaryProjection<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BoundaryProjection [^Region this ^org.apache.commons.math4.geometry.Point point]
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

  returns: the built region - `org.apache.commons.math4.geometry.partitioning.Region<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Region [^Region this ^org.apache.commons.math4.geometry.partitioning.BSPTree new-tree]
    (-> this (.buildNew new-tree))))

(defn intersection
  "Get the parts of a sub-hyperplane that are contained in the region.
   The parts of the sub-hyperplane that belong to the boundary are
   not included in the resulting parts.

  sub - sub-hyperplane traversing the region - `org.apache.commons.math4.geometry.partitioning.SubHyperplane`

  returns: filtered sub-hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^Region this ^org.apache.commons.math4.geometry.partitioning.SubHyperplane sub]
    (-> this (.intersection sub))))

(defn get-barycenter
  "Get the barycenter of the instance.

  returns: an object representing the barycenter - `org.apache.commons.math4.geometry.Point<S>`"
  (^org.apache.commons.math4.geometry.Point [^Region this]
    (-> this (.getBarycenter))))

(defn full?
  "Check if the sub-tree starting at a given node covers the full space.

  node - root node of the sub-tree (must have Region tree semantics, i.e. the leaf nodes must have Boolean attributes representing an inside/outside property) - `org.apache.commons.math4.geometry.partitioning.BSPTree`

  returns: true if the sub-tree starting at the given node covers the full space - `boolean`"
  (^Boolean [^Region this ^org.apache.commons.math4.geometry.partitioning.BSPTree node]
    (-> this (.isFull node)))
  (^Boolean [^Region this]
    (-> this (.isFull))))

(defn empty?
  "Check if the sub-tree starting at a given node is empty.

  node - root node of the sub-tree (must have Region tree semantics, i.e. the leaf nodes must have Boolean attributes representing an inside/outside property) - `org.apache.commons.math4.geometry.partitioning.BSPTree`

  returns: true if the sub-tree starting at the given node is empty - `boolean`"
  (^Boolean [^Region this ^org.apache.commons.math4.geometry.partitioning.BSPTree node]
    (-> this (.isEmpty node)))
  (^Boolean [^Region this]
    (-> this (.isEmpty))))

(defn check-point
  "Check a point with respect to the region.

  point - point to check - `org.apache.commons.math4.geometry.Point`

  returns: a code representing the point status: either Region.Location.INSIDE, Region.Location.OUTSIDE or Region.Location.BOUNDARY - `org.apache.commons.math4.geometry.partitioning.Region$Location`"
  (^org.apache.commons.math4.geometry.partitioning.Region$Location [^Region this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.checkPoint point))))

(defn get-size
  "Get the size of the instance.

  returns: the size of the instance (this is a length in 1D, an area
   in 2D, a volume in 3D ...) - `double`"
  (^Double [^Region this]
    (-> this (.getSize))))

