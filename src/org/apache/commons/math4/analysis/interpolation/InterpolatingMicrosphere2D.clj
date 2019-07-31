(ns org.apache.commons.math4.analysis.interpolation.InterpolatingMicrosphere2D
  "Utility class for the MicrosphereProjectionInterpolator algorithm.
  For 2D interpolation, this class constructs the microsphere as a series of
  evenly spaced facets (rather than generating random normals as in the
  base implementation)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation InterpolatingMicrosphere2D]))

(defn ->interpolating-microsphere-2-d
  "Constructor.

  Create a sphere from vectors regularly sampled around a circle.

  size - Number of surface elements of the sphere. - `int`
  max-dark-fraction - Maximum fraction of the facets that can be dark. If the fraction of \"non-illuminated\" facets is larger, no estimation of the value will be performed, and the background value will be returned instead. - `double`
  dark-threshold - Value of the illumination below which a facet is considered dark. - `double`
  background - Value returned when the maxDarkFraction threshold is exceeded. - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if size <= 0."
  (^InterpolatingMicrosphere2D [^Integer size ^Double max-dark-fraction ^Double dark-threshold ^Double background]
    (new InterpolatingMicrosphere2D size max-dark-fraction dark-threshold background)))

(defn copy
  "Perform a copy.

  returns: a copy of this instance. - `org.apache.commons.math4.analysis.interpolation.InterpolatingMicrosphere2D`"
  (^org.apache.commons.math4.analysis.interpolation.InterpolatingMicrosphere2D [^InterpolatingMicrosphere2D this]
    (-> this (.copy))))

