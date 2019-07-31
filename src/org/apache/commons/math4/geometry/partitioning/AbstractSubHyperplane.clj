(ns org.apache.commons.math4.geometry.partitioning.AbstractSubHyperplane
  "This class implements the dimension-independent parts of SubHyperplane.

  sub-hyperplanes are obtained when parts of an hyperplane are chopped off by other hyperplanes that
  intersect it. The remaining part is a convex region. Such objects
  appear in BSP trees as the intersection of a cut
  hyperplane with the convex region which it splits, the chopping
  hyperplanes are the cut hyperplanes closer to the tree root."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning AbstractSubHyperplane]))

(defn copy-self
  "Copy the instance.
   The instance created is completely independent of the original
   one. A deep copy is used, none of the underlying objects are
   shared (except for the nodes attributes and immutable
   objects).

  returns: a new sub-hyperplane, copy of the instance - `org.apache.commons.math4.geometry.partitioning.AbstractSubHyperplane<S,T>`"
  (^org.apache.commons.math4.geometry.partitioning.AbstractSubHyperplane [^AbstractSubHyperplane this]
    (-> this (.copySelf))))

(defn get-hyperplane
  "Get the underlying hyperplane.

  returns: underlying hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Hyperplane [^AbstractSubHyperplane this]
    (-> this (.getHyperplane))))

(defn get-remaining-region
  "Get the remaining region of the hyperplane.
   The returned region is expressed in the canonical hyperplane
   frame and has the hyperplane dimension. For example a chopped
   hyperplane in the 3D euclidean is a 2D plane and the
   corresponding region is a convex 2D polygon.

  returns: remaining region of the hyperplane - `org.apache.commons.math4.geometry.partitioning.Region<T>`"
  (^org.apache.commons.math4.geometry.partitioning.Region [^AbstractSubHyperplane this]
    (-> this (.getRemainingRegion))))

(defn get-size
  "Get the size of the instance.

  returns: the size of the instance (this is a length in 1D, an area
   in 2D, a volume in 3D ...) - `double`"
  (^Double [^AbstractSubHyperplane this]
    (-> this (.getSize))))

(defn reunite
  "Compute the union of the instance and another sub-hyperplane.

  other - other sub-hyperplane to union (must be in the same hyperplane as the instance) - `org.apache.commons.math4.geometry.partitioning.SubHyperplane`

  returns: a new sub-hyperplane, union of the instance and other - `org.apache.commons.math4.geometry.partitioning.AbstractSubHyperplane<S,T>`"
  (^org.apache.commons.math4.geometry.partitioning.AbstractSubHyperplane [^AbstractSubHyperplane this ^org.apache.commons.math4.geometry.partitioning.SubHyperplane other]
    (-> this (.reunite other))))

(defn apply-transform
  "Apply a transform to the instance.
   The instance must be a (D-1)-dimension sub-hyperplane with
   respect to the transform not a (D-2)-dimension
   sub-hyperplane the transform knows how to transform by
   itself. The transform will consist in transforming first the
   hyperplane and then the all region using the various methods
   provided by the transform.

  transform - D-dimension transform to apply - `org.apache.commons.math4.geometry.partitioning.Transform`

  returns: the transformed instance - `org.apache.commons.math4.geometry.partitioning.AbstractSubHyperplane<S,T>`"
  (^org.apache.commons.math4.geometry.partitioning.AbstractSubHyperplane [^AbstractSubHyperplane this ^org.apache.commons.math4.geometry.partitioning.Transform transform]
    (-> this (.applyTransform transform))))

(defn split
  "Split the instance in two parts by an hyperplane.

  hyper - splitting hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: an object containing both the part of the instance
   on the plus side of the hyperplane and the part of the
   instance on the minus side of the hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane [^AbstractSubHyperplane this ^org.apache.commons.math4.geometry.partitioning.Hyperplane hyper]
    (-> this (.split hyper))))

(defn empty?
  "Check if the instance is empty.

  returns: true if the instance is empty - `boolean`"
  (^Boolean [^AbstractSubHyperplane this]
    (-> this (.isEmpty))))

