(ns org.apache.commons.math4.distribution.fitting.MultivariateNormalMixtureExpectationMaximization
  "Expectation-Maximization algorithm for fitting the parameters of
  multivariate normal mixture model distributions.

  This implementation is pure original code based on
  EM Demystified: An Expectation-Maximization Tutorial by Yihua Chen and Maya R. Gupta,
  Department of Electrical Engineering, University of Washington, Seattle, WA 98195.
  It was verified using external tools like CRAN Mixtools
  (see the JUnit test cases) but it is not based on Mixtools code at all.
  The discussion of the origin of this class can be seen in the comments of the MATH-817 JIRA issue."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.distribution.fitting MultivariateNormalMixtureExpectationMaximization]))

(defn ->multivariate-normal-mixture-expectation-maximization
  "Constructor.

  Creates an object to fit a multivariate normal mixture model to data.

  data - Data to use in fitting procedure - `double[][]`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if data has no rows"
  (^MultivariateNormalMixtureExpectationMaximization [data]
    (new MultivariateNormalMixtureExpectationMaximization data)))

(defn *estimate
  "Helper method to create a multivariate normal mixture model which can be
   used to initialize fit(MixtureMultivariateNormalDistribution).

   This method uses the data supplied to the constructor to try to determine
   a good mixture model at which to start the fit, but it is not guaranteed
   to supply a model which will find the optimal solution or even converge.

  data - Data to estimate distribution - `double[][]`
  num-components - Number of components for estimated mixture - `int`

  returns: Multivariate normal mixture model estimated from the data - `org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if numComponents is greater than the number of data rows."
  (^org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution [data ^Integer num-components]
    (MultivariateNormalMixtureExpectationMaximization/estimate data num-components)))

(defn fit
  "Fit a mixture model to the data supplied to the constructor.

   The quality of the fit depends on the concavity of the data provided to
   the constructor and the initial mixture provided to this function. If the
   data has many local optima, multiple runs of the fitting function with
   different initial mixtures may be required to find the optimal solution.
   If a SingularMatrixException is encountered, it is possible that another
   initialization would work.

  initial-mixture - Model containing initial values of weights and multivariate normals - `org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution`
  max-iterations - Maximum iterations allowed for fit - `int`
  threshold - Convergence threshold computed as difference in logLikelihoods between successive iterations - `double`

  throws: org.apache.commons.math4.linear.SingularMatrixException - if any component's covariance matrix is singular during fitting"
  ([^MultivariateNormalMixtureExpectationMaximization this ^org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution initial-mixture ^Integer max-iterations ^Double threshold]
    (-> this (.fit initial-mixture max-iterations threshold)))
  ([^MultivariateNormalMixtureExpectationMaximization this ^org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution initial-mixture]
    (-> this (.fit initial-mixture))))

(defn get-log-likelihood
  "Gets the log likelihood of the data under the fitted model.

  returns: Log likelihood of data or zero of no data has been fit - `double`"
  (^Double [^MultivariateNormalMixtureExpectationMaximization this]
    (-> this (.getLogLikelihood))))

(defn get-fitted-model
  "Gets the fitted model.

  returns: fitted model or null if no fit has been performed yet. - `org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution`"
  (^org.apache.commons.math4.distribution.MixtureMultivariateNormalDistribution [^MultivariateNormalMixtureExpectationMaximization this]
    (-> this (.getFittedModel))))

