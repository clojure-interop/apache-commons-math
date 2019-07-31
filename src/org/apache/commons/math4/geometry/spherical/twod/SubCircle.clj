(ns org.apache.commons.math4.geometry.spherical.twod.SubCircle
  "This class represents a sub-hyperplane for Circle."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.twod SubCircle]))

(defn ->sub-circle
  "Constructor.

  Simple constructor.

  hyperplane - underlying hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane`
  remaining-region - remaining region of the hyperplane - `org.apache.commons.math4.geometry.partitioning.Region`"
  (^SubCircle [^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplane ^org.apache.commons.math4.geometry.partitioning.Region remaining-region]
    (new SubCircle hyperplane remaining-region)))

(defn split
  "Split the instance in two parts by an hyperplane.

  hyperplane - splitting hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: an object containing both the part of the instance
   on the plus side of the hyperplane and the part of the
   instance on the minus side of the hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane<org.apache.commons.math4.geometry.spherical.twod.Sphere2D>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane [^SubCircle this ^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplane]
    (-> this (.split hyperplane))))

