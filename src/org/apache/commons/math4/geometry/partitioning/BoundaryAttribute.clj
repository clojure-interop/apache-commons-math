(ns org.apache.commons.math4.geometry.partitioning.BoundaryAttribute
  "Class holding boundary attributes.
  This class is used for the attributes associated with the
  nodes of region boundary shell trees returned by the Region.getTree(includeBoundaryAttributes)
  when the boolean includeBoundaryAttributes parameter is
  set to true. It contains the parts of the node cut
  sub-hyperplane that belong to the boundary.
  This class is a simple placeholder, it does not provide any
  processing methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning BoundaryAttribute]))

(defn get-plus-outside
  "Get the part of the node cut sub-hyperplane that belongs to the
   boundary and has the outside of the region on the plus side of
   its underlying hyperplane.

  returns: part of the node cut sub-hyperplane that belongs to the
   boundary and has the outside of the region on the plus side of
   its underlying hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^BoundaryAttribute this]
    (-> this (.getPlusOutside))))

(defn get-plus-inside
  "Get the part of the node cut sub-hyperplane that belongs to the
   boundary and has the inside of the region on the plus side of
   its underlying hyperplane.

  returns: part of the node cut sub-hyperplane that belongs to the
   boundary and has the inside of the region on the plus side of
   its underlying hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<S>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^BoundaryAttribute this]
    (-> this (.getPlusInside))))

(defn get-splitters
  "Get the sub-hyperplanes that were used to split the boundary part.

  returns: sub-hyperplanes that were used to split the boundary part - `org.apache.commons.math4.geometry.partitioning.NodesSet<S>`"
  (^org.apache.commons.math4.geometry.partitioning.NodesSet [^BoundaryAttribute this]
    (-> this (.getSplitters))))

