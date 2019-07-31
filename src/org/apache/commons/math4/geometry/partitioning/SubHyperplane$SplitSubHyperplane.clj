(ns org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane
  "Class holding the results of the split method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning SubHyperplane$SplitSubHyperplane]))

(defn ->split-sub-hyperplane
  "Constructor.

  Build a SplitSubHyperplane from its parts.

  plus - part of the sub-hyperplane on the plus side of the splitting hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane`
  minus - part of the sub-hyperplane on the minus side of the splitting hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane`"
  (^SubHyperplane$SplitSubHyperplane [^org.apache.commons.math4.geometry.partitioning.SubHyperplane plus ^org.apache.commons.math4.geometry.partitioning.SubHyperplane minus]
    (new SubHyperplane$SplitSubHyperplane plus minus)))

(defn get-plus
  "Get the part of the sub-hyperplane on the plus side of the splitting hyperplane.

  returns: part of the sub-hyperplane on the plus side of the splitting hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<U>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^SubHyperplane$SplitSubHyperplane this]
    (-> this (.getPlus))))

(defn get-minus
  "Get the part of the sub-hyperplane on the minus side of the splitting hyperplane.

  returns: part of the sub-hyperplane on the minus side of the splitting hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<U>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^SubHyperplane$SplitSubHyperplane this]
    (-> this (.getMinus))))

(defn get-side
  "Get the side of the split sub-hyperplane with respect to its splitter.

  returns: Side.PLUS if only getPlus() is neither null nor empty,
   Side.MINUS if only getMinus() is neither null nor empty,
   Side.BOTH if both getPlus() and getMinus()
   are neither null nor empty or Side.HYPER if both getPlus() and
   getMinus() are either null or empty - `org.apache.commons.math4.geometry.partitioning.Side`"
  (^org.apache.commons.math4.geometry.partitioning.Side [^SubHyperplane$SplitSubHyperplane this]
    (-> this (.getSide))))

