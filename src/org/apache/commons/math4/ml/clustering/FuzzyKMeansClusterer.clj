(ns org.apache.commons.math4.ml.clustering.FuzzyKMeansClusterer
  "Fuzzy K-Means clustering algorithm.

  The Fuzzy K-Means algorithm is a variation of the classical K-Means algorithm, with the
  major difference that a single data point is not uniquely assigned to a single cluster.
  Instead, each point i has a set of weights uij which indicate the degree of membership
  to the cluster j.

  The algorithm then tries to minimize the objective function:


  J = ∑i=1..C∑k=1..N uikmdik2
  with dik being the distance between data point i and the cluster center k.

  The algorithm requires two parameters:

    k: the number of clusters
    fuzziness: determines the level of cluster fuzziness, larger values lead to fuzzier clusters

  Additional, optional parameters:

    maxIterations: the maximum number of iterations
    epsilon: the convergence criteria, default is 1e-3


  The fuzzy variant of the K-Means algorithm is more robust with regard to the selection
  of the initial cluster centers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering FuzzyKMeansClusterer]))

(defn ->fuzzy-k-means-clusterer
  "Constructor.

  Creates a new instance of a FuzzyKMeansClusterer.

  k - the number of clusters to split the data into - `int`
  fuzziness - the fuzziness factor, must be > 1.0 - `double`
  max-iterations - the maximum number of iterations to run the algorithm for. If negative, no maximum will be used. - `int`
  measure - the distance measure to use - `org.apache.commons.math4.ml.distance.DistanceMeasure`
  epsilon - the convergence criteria (default is 1e-3) - `double`
  random - random generator to use for choosing initial centers - `org.apache.commons.rng.UniformRandomProvider`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if fuzziness <= 1.0"
  (^FuzzyKMeansClusterer [^Integer k ^Double fuzziness ^Integer max-iterations ^org.apache.commons.math4.ml.distance.DistanceMeasure measure ^Double epsilon ^org.apache.commons.rng.UniformRandomProvider random]
    (new FuzzyKMeansClusterer k fuzziness max-iterations measure epsilon random))
  (^FuzzyKMeansClusterer [^Integer k ^Double fuzziness ^Integer max-iterations ^org.apache.commons.math4.ml.distance.DistanceMeasure measure]
    (new FuzzyKMeansClusterer k fuzziness max-iterations measure))
  (^FuzzyKMeansClusterer [^Integer k ^Double fuzziness]
    (new FuzzyKMeansClusterer k fuzziness)))

(defn get-data-points
  "Returns an unmodifiable list of the data points used in the last
   call to cluster(Collection).

  returns: the list of data points, or null if cluster(Collection) has
     not been called before. - `java.util.List<T>`"
  (^java.util.List [^FuzzyKMeansClusterer this]
    (-> this (.getDataPoints))))

(defn cluster
  "Performs Fuzzy K-Means cluster analysis.

  data-points - the points to cluster - `java.util.Collection`

  returns: the list of clusters - `java.util.List<org.apache.commons.math4.ml.clustering.CentroidCluster<T>>`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the data points are null or the number of clusters is larger than the number of data points"
  (^java.util.List [^FuzzyKMeansClusterer this ^java.util.Collection data-points]
    (-> this (.cluster data-points))))

(defn get-k
  "Return the number of clusters this instance will use.

  returns: the number of clusters - `int`"
  (^Integer [^FuzzyKMeansClusterer this]
    (-> this (.getK))))

(defn get-clusters
  "Returns the list of clusters resulting from the last call to cluster(Collection).

  returns: the list of clusters, or null if cluster(Collection) has
     not been called before. - `java.util.List<org.apache.commons.math4.ml.clustering.CentroidCluster<T>>`"
  (^java.util.List [^FuzzyKMeansClusterer this]
    (-> this (.getClusters))))

(defn get-max-iterations
  "Returns the maximum number of iterations this instance will use.

  returns: the maximum number of iterations, or -1 if no maximum is set - `int`"
  (^Integer [^FuzzyKMeansClusterer this]
    (-> this (.getMaxIterations))))

(defn get-objective-function-value
  "Get the value of the objective function.

  returns: the objective function evaluation as double value - `double`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if cluster(Collection) has not been called before"
  (^Double [^FuzzyKMeansClusterer this]
    (-> this (.getObjectiveFunctionValue))))

(defn get-membership-matrix
  "Returns the nxk membership matrix, where n is the number
   of data points and k the number of clusters.

   The element Ui,j represents the membership value for data point i
   to cluster j.

  returns: the membership matrix - `org.apache.commons.math4.linear.RealMatrix`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if cluster(Collection) has not been called before"
  (^org.apache.commons.math4.linear.RealMatrix [^FuzzyKMeansClusterer this]
    (-> this (.getMembershipMatrix))))

(defn get-random-generator
  "Returns the random generator this instance will use.

  returns: the random generator - `org.apache.commons.rng.UniformRandomProvider`"
  (^org.apache.commons.rng.UniformRandomProvider [^FuzzyKMeansClusterer this]
    (-> this (.getRandomGenerator))))

(defn get-epsilon
  "Returns the convergence criteria used by this instance.

  returns: the convergence criteria - `double`"
  (^Double [^FuzzyKMeansClusterer this]
    (-> this (.getEpsilon))))

(defn get-fuzziness
  "Returns the fuzziness factor used by this instance.

  returns: the fuzziness factor - `double`"
  (^Double [^FuzzyKMeansClusterer this]
    (-> this (.getFuzziness))))

