(ns org.apache.commons.math4.geometry.partitioning.SubHyperplane
  "This interface represents the remaining parts of an hyperplane after
  other parts have been chopped off.

  sub-hyperplanes are obtained when parts of an hyperplane are chopped off by other hyperplanes that
  intersect it. The remaining part is a convex region. Such objects
  appear in BSP trees as the intersection of a cut
  hyperplane with the convex region which it splits, the chopping
  hyperplanes are the cut hyperplanes closer to the tree root.


  Note that this interface is not intended to be implemented
  by Apache Commons Math users, it is only intended to be implemented
  within the library itself. New methods may be added even for minor
  versions, which breaks compatibility for external implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning SubHyperplane]))

(defn copy-self
  "Copy the instance.
   The instance created is completely independent of the original
   one. A deep copy is used, none of the underlying objects are
   shared (except for the nodes attributes and immutable
   objects).

  returns: a new sub-hyperplane, copy of the instance - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^SubHyperplane this]
    (-> this (.copySelf))))

(defn get-hyperplane
  "Get the underlying hyperplane.

  returns: underlying hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Hyperplane [^SubHyperplane this]
    (-> this (.getHyperplane))))

(defn empty?
  "Check if the instance is empty.

  returns: true if the instance is empty - `boolean`"
  (^Boolean [^SubHyperplane this]
    (-> this (.isEmpty))))

(defn get-size
  "Get the size of the instance.

  returns: the size of the instance (this is a length in 1D, an area
   in 2D, a volume in 3D ...) - `double`"
  (^Double [^SubHyperplane this]
    (-> this (.getSize))))

(defn split
  "Split the instance in two parts by an hyperplane.

  hyperplane - splitting hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: an object containing both the part of the instance
   on the plus side of the hyperplane and the part of the
   instance on the minus side of the hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane [^SubHyperplane this ^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplane]
    (-> this (.split hyperplane))))

(defn reunite
  "Compute the union of the instance and another sub-hyperplane.

  other - other sub-hyperplane to union (must be in the same hyperplane as the instance) - `org.apache.commons.math4.geometry.partitioning.SubHyperplane`

  returns: a new sub-hyperplane, union of the instance and other - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^SubHyperplane this ^org.apache.commons.math4.geometry.partitioning.SubHyperplane other]
    (-> this (.reunite other))))

