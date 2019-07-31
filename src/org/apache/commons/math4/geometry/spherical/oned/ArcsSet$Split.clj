(ns org.apache.commons.math4.geometry.spherical.oned.ArcsSet$Split
  "Class holding the results of the split method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.oned ArcsSet$Split]))

(defn get-plus
  "Get the part of the arcs set on the plus side of the splitting arc.

  returns: part of the arcs set on the plus side of the splitting arc - `org.apache.commons.math4.geometry.spherical.oned.ArcsSet`"
  (^org.apache.commons.math4.geometry.spherical.oned.ArcsSet [^ArcsSet$Split this]
    (-> this (.getPlus))))

(defn get-minus
  "Get the part of the arcs set on the minus side of the splitting arc.

  returns: part of the arcs set on the minus side of the splitting arc - `org.apache.commons.math4.geometry.spherical.oned.ArcsSet`"
  (^org.apache.commons.math4.geometry.spherical.oned.ArcsSet [^ArcsSet$Split this]
    (-> this (.getMinus))))

(defn get-side
  "Get the side of the split arc with respect to its splitter.

  returns: Side.PLUS if only getPlus() returns non-null,
   Side.MINUS if only getMinus() returns non-null,
   Side.BOTH if both getPlus() and getMinus()
   return non-null or Side.HYPER if both getPlus() and
   getMinus() return null - `org.apache.commons.math4.geometry.partitioning.Side`"
  (^org.apache.commons.math4.geometry.partitioning.Side [^ArcsSet$Split this]
    (-> this (.getSide))))

