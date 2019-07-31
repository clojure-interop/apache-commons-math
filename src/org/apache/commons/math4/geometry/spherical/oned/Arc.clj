(ns org.apache.commons.math4.geometry.spherical.oned.Arc
  "This class represents an arc on a circle."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.spherical.oned Arc]))

(defn ->arc
  "Constructor.

  Simple constructor.

   If either lower is equals to upper or
   the interval exceeds \\( 2 \\pi \\), the arc is considered
   to be the full circle and its initial defining boundaries
   will be forgotten. lower is not allowed to be
   greater than upper (an exception is thrown in this case).
   lower will be canonicalized between 0 and \\( 2 \\pi \\), and
   upper shifted accordingly, so the getInf() and getSup()
   may not return the value used at instance construction.

  lower - lower angular bound of the arc - `double`
  upper - upper angular bound of the arc - `double`
  tolerance - tolerance below which angles are considered identical - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if lower is greater than upper"
  (^Arc [^Double lower ^Double upper ^Double tolerance]
    (new Arc lower upper tolerance)))

(defn get-inf
  "Get the lower angular bound of the arc.

  returns: lower angular bound of the arc,
   always between 0 and \\( 2 \\pi \\) - `double`"
  (^Double [^Arc this]
    (-> this (.getInf))))

(defn get-sup
  "Get the upper angular bound of the arc.

  returns: upper angular bound of the arc,
   always between getInf() and getInf() \\(  2 \\pi \\) - `double`"
  (^Double [^Arc this]
    (-> this (.getSup))))

(defn get-size
  "Get the angular size of the arc.

  returns: angular size of the arc - `double`"
  (^Double [^Arc this]
    (-> this (.getSize))))

(defn get-barycenter
  "Get the barycenter of the arc.

  returns: barycenter of the arc - `double`"
  (^Double [^Arc this]
    (-> this (.getBarycenter))))

(defn get-tolerance
  "Get the tolerance below which angles are considered identical.

  returns: tolerance below which angles are considered identical - `double`"
  (^Double [^Arc this]
    (-> this (.getTolerance))))

(defn check-point
  "Check a point with respect to the arc.

  point - point to check - `double`

  returns: a code representing the point status: either Region.Location.INSIDE, Region.Location.OUTSIDE or Region.Location.BOUNDARY - `org.apache.commons.math4.geometry.partitioning.Region$Location`"
  (^org.apache.commons.math4.geometry.partitioning.Region$Location [^Arc this ^Double point]
    (-> this (.checkPoint point))))

