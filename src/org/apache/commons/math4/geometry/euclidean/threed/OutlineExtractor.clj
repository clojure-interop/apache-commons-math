(ns org.apache.commons.math4.geometry.euclidean.threed.OutlineExtractor
  "Extractor for polyhedrons sets outlines.
  This class extracts the 2D outlines from {polyhedrons sets in a specified projection plane."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed OutlineExtractor]))

(defn ->outline-extractor
  "Constructor.

  Build an extractor for a specific projection plane.

  u - abscissa axis of the projection point - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`
  v - ordinate axis of the projection point - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^OutlineExtractor [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D u ^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v]
    (new OutlineExtractor u v)))

(defn get-outline
  "Extract the outline of a polyhedrons set.

  polyhedrons-set - polyhedrons set whose outline must be extracted - `org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet`

  returns: an outline, as an array of loops. - `org.apache.commons.math4.geometry.euclidean.twod.Vector2D[][]`"
  ([^OutlineExtractor this ^org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet polyhedrons-set]
    (-> this (.getOutline polyhedrons-set))))

