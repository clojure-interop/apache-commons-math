(ns org.apache.commons.math4.geometry.partitioning.BSPTree$VanishingCutHandler
  "This interface handles the corner cases when an internal node cut sub-hyperplane vanishes.

  Such cases happens for example when a cut sub-hyperplane is inserted into
  another tree (during a merge operation), and is split in several parts,
  some of which becomes smaller than the tolerance. The corresponding node
  as then no cut sub-hyperplane anymore, but does have children. This interface
  specifies how to handle this situation.
  setting"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning BSPTree$VanishingCutHandler]))

(defn fix-node
  "Fix a node with both vanished cut and children.

  node - node to fix - `org.apache.commons.math4.geometry.partitioning.BSPTree`

  returns: fixed node - `org.apache.commons.math4.geometry.partitioning.BSPTree<S>`"
  (^org.apache.commons.math4.geometry.partitioning.BSPTree [^BSPTree$VanishingCutHandler this ^org.apache.commons.math4.geometry.partitioning.BSPTree node]
    (-> this (.fixNode node))))

