(ns org.apache.commons.math4.analysis.interpolation.InterpolatingMicrosphere
  "Utility class for the MicrosphereProjectionInterpolator algorithm."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation InterpolatingMicrosphere]))

(defn ->interpolating-microsphere
  "Constructor.

  Create a sphere from randomly sampled vectors.

  dimension - Dimension of the data space. - `int`
  size - Number of surface elements of the sphere. - `int`
  max-dark-fraction - Maximum fraction of the facets that can be dark. If the fraction of \"non-illuminated\" facets is larger, no estimation of the value will be performed, and the background value will be returned instead. - `double`
  dark-threshold - Value of the illumination below which a facet is considered dark. - `double`
  background - Value returned when the maxDarkFraction threshold is exceeded. - `double`
  rand - Unit vector generator for creating the microsphere. - `org.apache.commons.math4.random.UnitSphereRandomVectorGenerator`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the size of the generated vectors does not match the dimension set in the constructor."
  (^InterpolatingMicrosphere [^Integer dimension ^Integer size ^Double max-dark-fraction ^Double dark-threshold ^Double background ^org.apache.commons.math4.random.UnitSphereRandomVectorGenerator rand]
    (new InterpolatingMicrosphere dimension size max-dark-fraction dark-threshold background rand)))

(defn copy
  "Perform a copy.

  returns: a copy of this instance. - `org.apache.commons.math4.analysis.interpolation.InterpolatingMicrosphere`"
  (^org.apache.commons.math4.analysis.interpolation.InterpolatingMicrosphere [^InterpolatingMicrosphere this]
    (-> this (.copy))))

(defn get-dimension
  "Get the space dimensionality.

  returns: the number of space dimensions. - `int`"
  (^Integer [^InterpolatingMicrosphere this]
    (-> this (.getDimension))))

(defn get-size
  "Get the size of the sphere.

  returns: the number of surface elements of the microspshere. - `int`"
  (^Integer [^InterpolatingMicrosphere this]
    (-> this (.getSize))))

(defn value
  "Estimate the value at the requested location.
   This microsphere is placed at the given point, contribution
   of the given samplePoints to each sphere facet is computed
   (illumination) and the interpolation is performed (integration of
   the illumination).

  point - Interpolation point. - `double[]`
  sample-points - Sampling data points. - `double[][]`
  sample-values - Sampling data values at the corresponding samplePoints. - `double[]`
  exponent - Exponent used in the power law that computes the weights (distance dimming factor) of the sample data. - `double`
  no-interpolation-tolerance - When the distance between the point and one of the samplePoints is less than this value, no interpolation will be performed, and the value of the sample will just be returned. - `double`

  returns: the estimated value at the given point. - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if exponent < 0."
  (^Double [^InterpolatingMicrosphere this point sample-points sample-values ^Double exponent ^Double no-interpolation-tolerance]
    (-> this (.value point sample-points sample-values exponent no-interpolation-tolerance))))

