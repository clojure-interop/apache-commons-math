(ns org.apache.commons.math4.geometry.euclidean.threed.SubPlane
  "This class represents a sub-hyperplane for Plane."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed SubPlane]))

(defn ->sub-plane
  "Constructor.

  Simple constructor.

  hyperplane - underlying hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane`
  remaining-region - remaining region of the hyperplane - `org.apache.commons.math4.geometry.partitioning.Region`"
  (^SubPlane [^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplane ^org.apache.commons.math4.geometry.partitioning.Region remaining-region]
    (new SubPlane hyperplane remaining-region)))

(defn split
  "Split the instance in two parts by an hyperplane.

  hyperplane - splitting hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: an object containing both the part of the instance
   on the plus side of the instance and the part of the
   instance on the minus side of the instance - `org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane<org.apache.commons.math4.geometry.euclidean.threed.Euclidean3D>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane [^SubPlane this ^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplane]
    (-> this (.split hyperplane))))

