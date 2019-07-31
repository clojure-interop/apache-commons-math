(ns org.apache.commons.math4.geometry.partitioning.Embedding
  "This interface defines mappers between a space and one of its sub-spaces.

  Sub-spaces are the lower dimensions subsets of a n-dimensions
  space. The (n-1)-dimension sub-spaces are specific sub-spaces known
  as hyperplanes. This interface can be used regardless
  of the dimensions differences. As an example, Line in 3D
  implements Embedding<Vector3D, {link
  org.apache.commons.math4.geometry.euclidean.oned.Vector1D Vector1D}, i.e. it
  maps directly dimensions 3 and 1.

  In the 3D euclidean space, hyperplanes are 2D planes, and the 1D
  sub-spaces are lines.


  Note that this interface is not intended to be implemented
  by Apache Commons Math users, it is only intended to be implemented
  within the library itself. New methods may be added even for minor
  versions, which breaks compatibility for external implementations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning Embedding]))

(defn to-sub-space
  "Transform a space point into a sub-space point.

  point - n-dimension point of the space - `org.apache.commons.math4.geometry.Point`

  returns: (n-1)-dimension point of the sub-space corresponding to
   the specified space point - `org.apache.commons.math4.geometry.Point<T>`"
  (^org.apache.commons.math4.geometry.Point [^Embedding this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.toSubSpace point))))

(defn to-space
  "Transform a sub-space point into a space point.

  point - (n-1)-dimension point of the sub-space - `org.apache.commons.math4.geometry.Point`

  returns: n-dimension point of the space corresponding to the
   specified sub-space point - `org.apache.commons.math4.geometry.Point<S>`"
  (^org.apache.commons.math4.geometry.Point [^Embedding this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.toSpace point))))

