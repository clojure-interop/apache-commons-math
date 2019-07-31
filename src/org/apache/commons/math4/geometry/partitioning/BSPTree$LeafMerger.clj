(ns org.apache.commons.math4.geometry.partitioning.BSPTree$LeafMerger
  "This interface gather the merging operations between a BSP tree
  leaf and another BSP tree.
  As explained in Bruce Naylor, John Amanatides and William
  Thibault paper Merging
  BSP Trees Yields Polyhedral Set Operations,
  the operations on BSP trees can be expressed as a
  generic recursive merging operation where only the final part,
  when one of the operand is a leaf, is specific to the real
  operation semantics. For example, a tree representing a region
  using a boolean attribute to identify inside cells and outside
  cells would use four different objects to implement the final
  merging phase of the four set operations union, intersection,
  difference and symmetric difference (exclusive or)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning BSPTree$LeafMerger]))

(defn merge
  "Merge a leaf node and a tree node.
   This method is called at the end of a recursive merging
   resulting from a tree1.merge(tree2, leafMerger)
   call, when one of the sub-trees involved is a leaf (i.e. when
   its cut-hyperplane is null). This is the only place where the
   precise semantics of the operation are required. For all upper
   level nodes in the tree, the merging operation is only a
   generic partitioning algorithm.
   Since the final operation may be non-commutative, it is
   important to know if the leaf node comes from the instance tree
   (tree1) or the argument tree
   (tree2). The third argument of the method is
   devoted to this. It can be ignored for commutative
   operations.
   The BSPTree.insertInTree method
   may be useful to implement this method.

  leaf - leaf node (its cut hyperplane is guaranteed to be null) - `org.apache.commons.math4.geometry.partitioning.BSPTree`
  tree - tree node (its cut hyperplane may be null or not) - `org.apache.commons.math4.geometry.partitioning.BSPTree`
  parent-tree - parent tree to connect to (may be null) - `org.apache.commons.math4.geometry.partitioning.BSPTree`
  is-plus-child - if true and if parentTree is not null, the resulting tree should be the plus child of its parent, ignored if parentTree is null - `boolean`
  leaf-from-instance - if true, the leaf node comes from the instance tree (tree1) and the tree node comes from the argument tree (tree2) - `boolean`

  returns: the BSP tree resulting from the merging (may be one of
   the arguments) - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^BSPTree$LeafMerger this ^org.apache.commons.math4.geometry.partitioning.BSPTree leaf ^org.apache.commons.math4.geometry.partitioning.BSPTree tree ^org.apache.commons.math4.geometry.partitioning.BSPTree parent-tree ^Boolean is-plus-child ^Boolean leaf-from-instance]
    (-> this (.merge leaf tree parent-tree is-plus-child leaf-from-instance))))

