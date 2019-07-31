(ns org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor
  "This interface is used to visit BSP tree nodes.

  Navigation through BSP trees can be done using
  two different point of views:


      the first one is in a node-oriented way using the BSPTree.getPlus(), BSPTree.getMinus() and BSPTree.getParent() methods. Terminal nodes without associated
      sub-hyperplanes can be visited this way,
      there is no constraint in the visit order, and it is possible
      to visit either all nodes or only a subset of the nodes


      the second one is in a sub-hyperplane-oriented way using
      classes implementing this interface which obeys the visitor
      design pattern. The visit order is provided by the visitor as
      each node is first encountered. Each node is visited exactly
      once."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning BSPTreeVisitor]))

(defn visit-order
  "Determine the visit order for this node.
   Before attempting to visit an internal node, this method is
   called to determine the desired ordering of the visit. It is
   guaranteed that this method will be called before visitInternalNode for a given node, it will be
   called exactly once for each internal node.

  node - BSP node guaranteed to have a non null cut sub-hyperplane - `org.apache.commons.math4.geometry.partitioning.BSPTree`

  returns: desired visit order, must be one of
   BSPTreeVisitor.Order.PLUS_MINUS_SUB, BSPTreeVisitor.Order.PLUS_SUB_MINUS,
   BSPTreeVisitor.Order.MINUS_PLUS_SUB, BSPTreeVisitor.Order.MINUS_SUB_PLUS,
   BSPTreeVisitor.Order.SUB_PLUS_MINUS, BSPTreeVisitor.Order.SUB_MINUS_PLUS - `org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTreeVisitor$Order [^BSPTreeVisitor this ^org.apache.commons.math4.geometry.partitioning.BSPTree node]
    (-> this (.visitOrder node))))

(defn visit-internal-node
  "Visit a BSP tree node node having a non-null sub-hyperplane.
   It is guaranteed that this method will be called after visitOrder has been called for a given node,
   it wil be called exactly once for each internal node.

  node - BSP node guaranteed to have a non null cut sub-hyperplane - `org.apache.commons.math4.geometry.partitioning.BSPTree`"
  ([^BSPTreeVisitor this ^org.apache.commons.math4.geometry.partitioning.BSPTree node]
    (-> this (.visitInternalNode node))))

(defn visit-leaf-node
  "Visit a leaf BSP tree node node having a null sub-hyperplane.

  node - leaf BSP node having a null sub-hyperplane - `org.apache.commons.math4.geometry.partitioning.BSPTree`"
  ([^BSPTreeVisitor this ^org.apache.commons.math4.geometry.partitioning.BSPTree node]
    (-> this (.visitLeafNode node))))

