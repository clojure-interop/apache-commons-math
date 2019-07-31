(ns org.apache.commons.math4.analysis.interpolation.MicrosphereProjectionInterpolator
  "Interpolator that implements the algorithm described in
  William Dudziak's
  MS thesis."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.interpolation MicrosphereProjectionInterpolator]))

(defn ->microsphere-projection-interpolator
  "Constructor.

  Create a microsphere interpolator.

  dimension - Space dimension. - `int`
  elements - Number of surface elements of the microsphere. - `int`
  max-dark-fraction - Maximum fraction of the facets that can be dark. If the fraction of \"non-illuminated\" facets is larger, no estimation of the value will be performed, and the background value will be returned instead. - `double`
  dark-threshold - Value of the illumination below which a facet is considered dark. - `double`
  background - Value returned when the maxDarkFraction threshold is exceeded. - `double`
  exponent - Exponent used in the power law that computes the - `double`
  shared-sphere - Whether the sphere can be shared among the interpolating function instances. If true, the instances will share the same data, and thus will not be thread-safe. - `boolean`
  no-interpolation-tolerance - When the distance between an interpolated point and one of the sample points is less than this value, no interpolation will be performed (the value of the sample will be returned). - `double`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if dimension <= 0 or elements <= 0."
  (^MicrosphereProjectionInterpolator [^Integer dimension ^Integer elements ^Double max-dark-fraction ^Double dark-threshold ^Double background ^Double exponent ^Boolean shared-sphere ^Double no-interpolation-tolerance]
    (new MicrosphereProjectionInterpolator dimension elements max-dark-fraction dark-threshold background exponent shared-sphere no-interpolation-tolerance))
  (^MicrosphereProjectionInterpolator [^org.apache.commons.math4.analysis.interpolation.InterpolatingMicrosphere microsphere ^Double exponent ^Boolean shared-sphere ^Double no-interpolation-tolerance]
    (new MicrosphereProjectionInterpolator microsphere exponent shared-sphere no-interpolation-tolerance)))

(defn interpolate
  "Computes an interpolating function for the data set.

  xval - the arguments for the interpolation points. xval[i][0] is the first component of interpolation point i, xval[i][1] is the second component, and so on until xval[i][d-1], the last component of that interpolation point (where d is thus the dimension of the space). - `double[][]`
  yval - the values for the interpolation points - `double[]`

  returns: a function which interpolates the data set - `org.apache.commons.math4.analysis.MultivariateFunction`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the space dimension of the given samples does not match the space dimension of the microsphere."
  (^org.apache.commons.math4.analysis.MultivariateFunction [^MicrosphereProjectionInterpolator this xval yval]
    (-> this (.interpolate xval yval))))

