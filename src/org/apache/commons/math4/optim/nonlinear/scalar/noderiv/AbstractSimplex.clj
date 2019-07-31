(ns org.apache.commons.math4.optim.nonlinear.scalar.noderiv.AbstractSimplex
  "This class implements the simplex concept.
  It is intended to be used in conjunction with SimplexOptimizer.

  The initial configuration of the simplex is set by the constructors
  AbstractSimplex(double[]) or AbstractSimplex(double[][]).
  The other constructor will set all steps
  to 1, thus building a default configuration from a unit hypercube.

  Users must call the build method in order
  to create the data structure that will be acted on by the other methods of
  this class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.noderiv AbstractSimplex]))

(defn get-dimension
  "Get simplex dimension.

  returns: the dimension of the simplex. - `int`"
  (^Integer [^AbstractSimplex this]
    (-> this (.getDimension))))

(defn get-size
  "Get simplex size.
   After calling the build method, this method will
   will be equivalent to getDimension()  1.

  returns: the size of the simplex. - `int`"
  (^Integer [^AbstractSimplex this]
    (-> this (.getSize))))

(defn iterate
  "Compute the next simplex of the algorithm.

  evaluation-function - Evaluation function. - `org.apache.commons.math4.analysis.MultivariateFunction`
  comparator - Comparator to use to sort simplex vertices from best to worst. - `java.util.Comparator`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the algorithm fails to converge."
  ([^AbstractSimplex this ^org.apache.commons.math4.analysis.MultivariateFunction evaluation-function ^java.util.Comparator comparator]
    (-> this (.iterate evaluation-function comparator))))

(defn build
  "Build an initial simplex.

  start-point - First point of the simplex. - `double[]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the start point does not match simplex dimension."
  ([^AbstractSimplex this start-point]
    (-> this (.build start-point))))

(defn evaluate
  "Evaluate all the non-evaluated points of the simplex.

  evaluation-function - Evaluation function. - `org.apache.commons.math4.analysis.MultivariateFunction`
  comparator - Comparator to use to sort simplex vertices from best to worst. - `java.util.Comparator`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximal number of evaluations is exceeded."
  ([^AbstractSimplex this ^org.apache.commons.math4.analysis.MultivariateFunction evaluation-function ^java.util.Comparator comparator]
    (-> this (.evaluate evaluation-function comparator))))

(defn get-points
  "Get the points of the simplex.

  returns: all the simplex points. - `org.apache.commons.math4.optim.PointValuePair[]`"
  ([^AbstractSimplex this]
    (-> this (.getPoints))))

(defn get-point
  "Get the simplex point stored at the requested index.

  index - Location. - `int`

  returns: the point at location index. - `org.apache.commons.math4.optim.PointValuePair`"
  (^org.apache.commons.math4.optim.PointValuePair [^AbstractSimplex this ^Integer index]
    (-> this (.getPoint index))))

