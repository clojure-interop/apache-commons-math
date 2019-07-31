(ns org.apache.commons.math4.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex
  "This class implements the multi-directional direct search method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.noderiv MultiDirectionalSimplex]))

(defn ->multi-directional-simplex
  "Constructor.

  Build a multi-directional simplex with specified coefficients.

  n - Dimension of the simplex. See AbstractSimplex.AbstractSimplex(int,double). - `int`
  side-length - Length of the sides of the default (hypercube) simplex. See AbstractSimplex.AbstractSimplex(int,double). - `double`
  khi - Expansion coefficient. - `double`
  gamma - Contraction coefficient. - `double`"
  (^MultiDirectionalSimplex [^Integer n ^Double side-length ^Double khi ^Double gamma]
    (new MultiDirectionalSimplex n side-length khi gamma))
  (^MultiDirectionalSimplex [^Integer n ^Double khi ^Double gamma]
    (new MultiDirectionalSimplex n khi gamma))
  (^MultiDirectionalSimplex [^Integer n ^Double side-length]
    (new MultiDirectionalSimplex n side-length))
  (^MultiDirectionalSimplex [^Integer n]
    (new MultiDirectionalSimplex n)))

(defn iterate
  "Compute the next simplex of the algorithm.

  evaluation-function - Evaluation function. - `org.apache.commons.math4.analysis.MultivariateFunction`
  comparator - Comparator to use to sort simplex vertices from best to worst. - `java.util.Comparator`"
  ([^MultiDirectionalSimplex this ^org.apache.commons.math4.analysis.MultivariateFunction evaluation-function ^java.util.Comparator comparator]
    (-> this (.iterate evaluation-function comparator))))

