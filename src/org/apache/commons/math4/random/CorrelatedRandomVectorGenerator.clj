(ns org.apache.commons.math4.random.CorrelatedRandomVectorGenerator
  "A RandomVectorGenerator that generates vectors with with
  correlated components.
  Random vectors with correlated components are built by combining
  the uncorrelated components of another random vector in such a way that
  the resulting correlations are the ones specified by a positive
  definite covariance matrix.
  The main use for correlated random vector generation is for Monte-Carlo
  simulation of physical problems with several variables, for example to
  generate error vectors to be added to a nominal vector. A particularly
  interesting case is when the generated vector should be drawn from a
  Multivariate Normal Distribution. The approach using a Cholesky
  decomposition is quite usual in this case. However, it can be extended
  to other cases as long as the underlying random generator provides
  normalized values like GaussianRandomGenerator or UniformRandomGenerator.
  Sometimes, the covariance matrix for a given simulation is not
  strictly positive definite. This means that the correlations are
  not all independent from each other. In this case, however, the non
  strictly positive elements found during the Cholesky decomposition
  of the covariance matrix should not be negative either, they
  should be null. Another non-conventional extension handling this case
  is used here. Rather than computing C = UT.U
  where C is the covariance matrix and U
  is an upper-triangular matrix, we compute C = B.BT
  where B is a rectangular matrix having
  more rows than columns. The number of columns of B is
  the rank of the covariance matrix, and it is the dimension of the
  uncorrelated random vector that is needed to compute the component
  of the correlated vector. This class handles this situation
  automatically."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random CorrelatedRandomVectorGenerator]))

(defn ->correlated-random-vector-generator
  "Constructor.

  Builds a correlated random vector generator from its mean
   vector and covariance matrix.

  mean - Expected mean values for all components. - `double[]`
  covariance - Covariance matrix. - `org.apache.commons.math4.linear.RealMatrix`
  small - Diagonal elements threshold under which column are considered to be dependent on previous ones and are discarded - `double`
  generator - underlying generator for uncorrelated normalized components. - `org.apache.commons.math4.random.NormalizedRandomGenerator`

  throws: org.apache.commons.math4.linear.NonPositiveDefiniteMatrixException - if the covariance matrix is not strictly positive definite."
  (^CorrelatedRandomVectorGenerator [mean ^org.apache.commons.math4.linear.RealMatrix covariance ^Double small ^org.apache.commons.math4.random.NormalizedRandomGenerator generator]
    (new CorrelatedRandomVectorGenerator mean covariance small generator))
  (^CorrelatedRandomVectorGenerator [^org.apache.commons.math4.linear.RealMatrix covariance ^Double small ^org.apache.commons.math4.random.NormalizedRandomGenerator generator]
    (new CorrelatedRandomVectorGenerator covariance small generator)))

(defn get-generator
  "Get the underlying normalized components generator.

  returns: underlying uncorrelated components generator - `org.apache.commons.math4.random.NormalizedRandomGenerator`"
  (^org.apache.commons.math4.random.NormalizedRandomGenerator [^CorrelatedRandomVectorGenerator this]
    (-> this (.getGenerator))))

(defn get-rank
  "Get the rank of the covariance matrix.
   The rank is the number of independent rows in the covariance
   matrix, it is also the number of columns of the root matrix.

  returns: rank of the square matrix. - `int`"
  (^Integer [^CorrelatedRandomVectorGenerator this]
    (-> this (.getRank))))

(defn get-root-matrix
  "Get the root of the covariance matrix.
   The root is the rectangular matrix B such that
   the covariance matrix is equal to B.BT

  returns: root of the square matrix - `org.apache.commons.math4.linear.RealMatrix`"
  (^org.apache.commons.math4.linear.RealMatrix [^CorrelatedRandomVectorGenerator this]
    (-> this (.getRootMatrix))))

(defn next-vector
  "Generate a correlated random vector.

  returns: a random vector as an array of double. The returned array
   is created at each call, the caller can do what it wants with it. - `double[]`"
  ([^CorrelatedRandomVectorGenerator this]
    (-> this (.nextVector))))

