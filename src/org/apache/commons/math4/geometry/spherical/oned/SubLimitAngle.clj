(ns org.apache.commons.math4.geometry.spherical.oned.SubLimitAngle
  "This class represents sub-hyperplane for LimitAngle.
  Instances of this class are guaranteed to be immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.oned SubLimitAngle]))

(defn ->sub-limit-angle
  "Constructor.

  Simple constructor.

  hyperplane - underlying hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane`
  remaining-region - remaining region of the hyperplane - `org.apache.commons.math4.geometry.partitioning.Region`"
  (^SubLimitAngle [^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplane ^org.apache.commons.math4.geometry.partitioning.Region remaining-region]
    (new SubLimitAngle hyperplane remaining-region)))

(defn get-size
  "Get the size of the instance.

  returns: the size of the instance (this is a length in 1D, an area
   in 2D, a volume in 3D ...) - `double`"
  (^Double [^SubLimitAngle this]
    (-> this (.getSize))))

(defn empty?
  "Check if the instance is empty.

  returns: true if the instance is empty - `boolean`"
  (^Boolean [^SubLimitAngle this]
    (-> this (.isEmpty))))

(defn split
  "Split the instance in two parts by an hyperplane.

  hyperplane - splitting hyperplane - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: an object containing both the part of the instance
   on the plus side of the hyperplane and the part of the
   instance on the minus side of the hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane<org.apache.commons.math4.geometry.spherical.oned.Sphere1D>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane$SplitSubHyperplane [^SubLimitAngle this ^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplane]
    (-> this (.split hyperplane))))

