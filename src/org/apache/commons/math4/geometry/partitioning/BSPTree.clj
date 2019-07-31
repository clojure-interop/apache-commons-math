(ns org.apache.commons.math4.geometry.partitioning.BSPTree
  "This class represent a Binary Space Partition tree.

  BSP trees are an efficient way to represent space partitions and
  to associate attributes with each cell. Each node in a BSP tree
  represents a convex region which is partitioned in two convex
  sub-regions at each side of a cut hyperplane. The root tree
  contains the complete space.

  The main use of such partitions is to use a boolean attribute to
  define an inside/outside property, hence representing arbitrary
  polytopes (line segments in 1D, polygons in 2D and polyhedrons in
  3D) and to operate on them.

  Another example would be to represent Voronoi tesselations, the
  attribute of each cell holding the defining point of the cell.

  The application-defined attributes are shared among copied
  instances and propagated to split parts. These attributes are not
  used by the BSP-tree algorithms themselves, so the application can
  use them for any purpose. Since the tree visiting method holds
  internal and leaf nodes differently, it is possible to use
  different classes for internal nodes attributes and leaf nodes
  attributes. This should be used with care, though, because if the
  tree is modified in any way after attributes have been set, some
  internal nodes may become leaf nodes and some leaf nodes may become
  internal nodes.

  One of the main sources for the development of this package was
  Bruce Naylor, John Amanatides and William Thibault paper Merging
  BSP Trees Yields Polyhedral Set Operations Proc. Siggraph '90,
  Computer Graphics 24(4), August 1990, pp 115-124, published by the
  Association for Computing Machinery (ACM)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning BSPTree]))

(defn ->bsp-tree
  "Constructor.

  Build a BSPTree from its underlying elements.
   This method does not perform any verification on
   consistency of its arguments, it should therefore be used only
   when then caller knows what it is doing.
   This method is mainly useful to build trees
   bottom-up. Building trees top-down is realized with the help of
   method insertCut.

  cut - cut sub-hyperplane for the tree - `org.apache.commons.math4.geometry.partitioning.SubHyperplane`
  plus - plus side sub-tree - `org.apache.commons.math4.geometry.partitioning.BSPTree`
  minus - minus side sub-tree - `org.apache.commons.math4.geometry.partitioning.BSPTree`
  attribute - attribute associated with the node (may be null) - `java.lang.Object`"
  (^BSPTree [^org.apache.commons.math4.geometry.partitioning.SubHyperplane cut ^org.apache.commons.math4.geometry.partitioning.BSPTree plus ^org.apache.commons.math4.geometry.partitioning.BSPTree minus ^java.lang.Object attribute]
    (new BSPTree cut plus minus attribute))
  (^BSPTree [^java.lang.Object attribute]
    (new BSPTree attribute))
  (^BSPTree []
    (new BSPTree )))

(defn get-cell
  "Get the cell to which a point belongs.
   If the returned cell is a leaf node the points belongs to the
   interior of the node, if the cell is an internal node the points
   belongs to the node cut sub-hyperplane.

  point - point to check - `org.apache.commons.math4.geometry.Point`
  tolerance - tolerance below which points close to a cut hyperplane are considered to belong to the hyperplane itself - `double`

  returns: the tree cell to which the point belongs - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^BSPTree this ^org.apache.commons.math4.geometry.Point point ^Double tolerance]
    (-> this (.getCell point tolerance))))

(defn get-plus
  "Get the tree on the plus side of the cut hyperplane.

  returns: tree on the plus side of the cut hyperplane, null if this
   is a leaf tree - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^BSPTree this]
    (-> this (.getPlus))))

(defn copy-self
  "Copy the instance.
   The instance created is completely independent of the original
   one. A deep copy is used, none of the underlying objects are
   shared (except for the nodes attributes and immutable
   objects).

  returns: a new tree, copy of the instance - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^BSPTree this]
    (-> this (.copySelf))))

(defn get-minus
  "Get the tree on the minus side of the cut hyperplane.

  returns: tree on the minus side of the cut hyperplane, null if this
   is a leaf tree - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^BSPTree this]
    (-> this (.getMinus))))

(defn visit
  "Visit the BSP tree nodes.

  visitor - object visiting the tree nodes - `org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor`"
  ([^BSPTree this ^org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor visitor]
    (-> this (.visit visitor))))

(defn insert-cut
  "Insert a cut sub-hyperplane in a node.
   The sub-tree starting at this node will be completely
   overwritten. The new cut sub-hyperplane will be built from the
   intersection of the provided hyperplane with the cell. If the
   hyperplane does intersect the cell, the cell will have two
   children cells with null attributes on each side of
   the inserted cut sub-hyperplane. If the hyperplane does not
   intersect the cell then no cut hyperplane will be
   inserted and the cell will be changed to a leaf cell. The
   attribute of the node is never changed.
   This method is mainly useful when called on leaf nodes
   (i.e. nodes for which getCut returns
   null), in this case it provides a way to build a
   tree top-down (whereas the 4 arguments constructor is devoted to
   build trees bottom-up).

  hyperplane - hyperplane to insert, it will be chopped in order to fit in the cell defined by the parent nodes of the instance - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: true if a cut sub-hyperplane has been inserted (i.e. if
   the cell now has two leaf child nodes) - `boolean`"
  (^Boolean [^BSPTree this ^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplane]
    (-> this (.insertCut hyperplane))))

(defn prune-around-convex-cell
  "Prune a tree around a cell.

   This method can be used to extract a convex cell from a tree.
   The original cell may either be a leaf node or an internal node.
   If it is an internal node, it's subtree will be ignored (i.e. the
   extracted cell will be a leaf node in all cases). The original
   tree to which the original cell belongs is not touched at all,
   a new independent tree will be built.

  cell-attribute - attribute to set for the leaf node corresponding to the initial instance cell - `java.lang.Object`
  other-leafs-attributes - attribute to set for the other leaf nodes - `java.lang.Object`
  internal-attributes - attribute to set for the internal nodes - `java.lang.Object`

  returns: a new tree (the original tree is left untouched) containing
   a single branch with the cell as a leaf node, and other leaf nodes
   as the remnants of the pruned branches - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^BSPTree this ^java.lang.Object cell-attribute ^java.lang.Object other-leafs-attributes ^java.lang.Object internal-attributes]
    (-> this (.pruneAroundConvexCell cell-attribute other-leafs-attributes internal-attributes))))

(defn insert-in-tree
  "Insert the instance into another tree.
   The instance itself is modified so its former parent should
   not be used anymore.

  parent-tree - parent tree to connect to (may be null) - `org.apache.commons.math4.geometry.partitioning.BSPTree`
  is-plus-child - if true and if parentTree is not null, the resulting tree should be the plus child of its parent, ignored if parentTree is null - `boolean`
  vanishing-handler - handler to use for handling very rare corner cases of vanishing cut sub-hyperplanes in internal nodes during merging - `org.apache.commons.math4.geometry.partitioning.BSPTree$VanishingCutHandler`"
  ([^BSPTree this ^org.apache.commons.math4.geometry.partitioning.BSPTree parent-tree ^Boolean is-plus-child ^org.apache.commons.math4.geometry.partitioning.BSPTree$VanishingCutHandler vanishing-handler]
    (-> this (.insertInTree parent-tree is-plus-child vanishing-handler))))

(defn get-attribute
  "Get the attribute associated with the instance.

  returns: attribute associated with the node or null if no
   attribute has been explicitly set using the setAttribute method - `java.lang.Object`"
  (^java.lang.Object [^BSPTree this]
    (-> this (.getAttribute))))

(defn get-cut
  "Get the cut sub-hyperplane.

  returns: cut sub-hyperplane, null if this is a leaf tree - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^BSPTree this]
    (-> this (.getCut))))

(defn get-parent
  "Get the parent node.

  returns: parent node, null if the node has no parents - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^BSPTree this]
    (-> this (.getParent))))

(defn split
  "Split a BSP tree by an external sub-hyperplane.
   Split a tree in two halves, on each side of the
   sub-hyperplane. The instance is not modified.
   The tree returned is not upward-consistent: despite all of its
   sub-trees cut sub-hyperplanes (including its own cut
   sub-hyperplane) are bounded to the current cell, it is not
   attached to any parent tree yet. This tree is intended to be
   later inserted into an higher level tree.
   The algorithm used here is the one given in Naylor, Amanatides
   and Thibault paper (section III, Binary Partitioning of a BSP
   Tree).

  sub - partitioning sub-hyperplane, must be already clipped to the convex region represented by the instance, will be used as the cut sub-hyperplane of the returned tree - `org.apache.commons.math4.geometry.partitioning.SubHyperplane`

  returns: a tree having the specified sub-hyperplane as its cut
   sub-hyperplane, the two parts of the split instance as its two
   sub-trees and a null parent - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^BSPTree this ^org.apache.commons.math4.geometry.partitioning.SubHyperplane sub]
    (-> this (.split sub))))

(defn set-attribute
  "Associate an attribute with the instance.

  attribute - attribute to associate with the node - `java.lang.Object`"
  ([^BSPTree this ^java.lang.Object attribute]
    (-> this (.setAttribute attribute))))

(defn get-close-cuts
  "Get the cells whose cut sub-hyperplanes are close to the point.

  point - point to check - `org.apache.commons.math4.geometry.Point`
  max-offset - offset below which a cut sub-hyperplane is considered close to the point (in absolute value) - `double`

  returns: close cells (may be empty if all cut sub-hyperplanes are farther
   than maxOffset from the point) - `java.util.List<org.apache.commons.math4.geometry.partitioning.BSPTree<S>>`"
  (^java.util.List [^BSPTree this ^org.apache.commons.math4.geometry.Point point ^Double max-offset]
    (-> this (.getCloseCuts point max-offset))))

(defn merge
  "Merge a BSP tree with the instance.
   All trees are modified (parts of them are reused in the new
   tree), it is the responsibility of the caller to ensure a copy
   has been done before if any of the former tree should be
   preserved, no such copy is done here!
   The algorithm used here is directly derived from the one
   described in the Naylor, Amanatides and Thibault paper (section
   III, Binary Partitioning of a BSP Tree).

  tree - other tree to merge with the instance (will be unusable after the operation, as well as the instance itself) - `org.apache.commons.math4.geometry.partitioning.BSPTree`
  leaf-merger - object implementing the final merging phase (this is where the semantic of the operation occurs, generally depending on the attribute of the leaf node) - `org.apache.commons.math4.geometry.partitioning.BSPTree$LeafMerger`

  returns: a new tree, result of instance <op>
   tree, this value can be ignored if parentTree is not null
   since all connections have already been established - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^BSPTree this ^org.apache.commons.math4.geometry.partitioning.BSPTree tree ^org.apache.commons.math4.geometry.partitioning.BSPTree$LeafMerger leaf-merger]
    (-> this (.merge tree leaf-merger))))

