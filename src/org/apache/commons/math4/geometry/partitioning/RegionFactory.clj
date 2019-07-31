(ns org.apache.commons.math4.geometry.partitioning.RegionFactory
  "This class is a factory for Region."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning RegionFactory]))

(defn ->region-factory
  "Constructor.

  Simple constructor."
  (^RegionFactory []
    (new RegionFactory )))

(defn build-convex
  "Build a convex region from a collection of bounding hyperplanes.

  hyperplanes - collection of bounding hyperplanes - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: a new convex region, or null if the collection is empty - `org.apache.commons.math4.geometry.partitioning.Region<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Region [^RegionFactory this ^org.apache.commons.math4.geometry.partitioning.Hyperplane hyperplanes]
    (-> this (.buildConvex hyperplanes))))

(defn union
  "Compute the union of two regions.

  region-1 - first region (will be unusable after the operation as parts of it will be reused in the new region) - `org.apache.commons.math4.geometry.partitioning.Region`
  region-2 - second region (will be unusable after the operation as parts of it will be reused in the new region) - `org.apache.commons.math4.geometry.partitioning.Region`

  returns: a new region, result of region1 union region2 - `org.apache.commons.math4.geometry.partitioning.Region<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Region [^RegionFactory this ^org.apache.commons.math4.geometry.partitioning.Region region-1 ^org.apache.commons.math4.geometry.partitioning.Region region-2]
    (-> this (.union region-1 region-2))))

(defn intersection
  "Compute the intersection of two regions.

  region-1 - first region (will be unusable after the operation as parts of it will be reused in the new region) - `org.apache.commons.math4.geometry.partitioning.Region`
  region-2 - second region (will be unusable after the operation as parts of it will be reused in the new region) - `org.apache.commons.math4.geometry.partitioning.Region`

  returns: a new region, result of region1 intersection region2 - `org.apache.commons.math4.geometry.partitioning.Region<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Region [^RegionFactory this ^org.apache.commons.math4.geometry.partitioning.Region region-1 ^org.apache.commons.math4.geometry.partitioning.Region region-2]
    (-> this (.intersection region-1 region-2))))

(defn xor
  "Compute the symmetric difference (exclusive or) of two regions.

  region-1 - first region (will be unusable after the operation as parts of it will be reused in the new region) - `org.apache.commons.math4.geometry.partitioning.Region`
  region-2 - second region (will be unusable after the operation as parts of it will be reused in the new region) - `org.apache.commons.math4.geometry.partitioning.Region`

  returns: a new region, result of region1 xor region2 - `org.apache.commons.math4.geometry.partitioning.Region<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Region [^RegionFactory this ^org.apache.commons.math4.geometry.partitioning.Region region-1 ^org.apache.commons.math4.geometry.partitioning.Region region-2]
    (-> this (.xor region-1 region-2))))

(defn difference
  "Compute the difference of two regions.

  region-1 - first region (will be unusable after the operation as parts of it will be reused in the new region) - `org.apache.commons.math4.geometry.partitioning.Region`
  region-2 - second region (will be unusable after the operation as parts of it will be reused in the new region) - `org.apache.commons.math4.geometry.partitioning.Region`

  returns: a new region, result of region1 minus region2 - `org.apache.commons.math4.geometry.partitioning.Region<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Region [^RegionFactory this ^org.apache.commons.math4.geometry.partitioning.Region region-1 ^org.apache.commons.math4.geometry.partitioning.Region region-2]
    (-> this (.difference region-1 region-2))))

(defn get-complement
  "Get the complement of the region (exchanged interior/exterior).

  region - region to complement, it will not modified, a new region independent region will be built - `org.apache.commons.math4.geometry.partitioning.Region`

  returns: a new region, complement of the specified one - `org.apache.commons.math4.geometry.partitioning.Region<S>`"
  (^org.apache.commons.math4.geometry.partitioning.Region [^RegionFactory this ^org.apache.commons.math4.geometry.partitioning.Region region]
    (-> this (.getComplement region))))

