(ns org.apache.commons.math4.optim.nonlinear.scalar.noderiv.NelderMeadSimplex
  "This class implements the Nelder-Mead simplex algorithm."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.nonlinear.scalar.noderiv NelderMeadSimplex]))

(defn ->nelder-mead-simplex
  "Constructor.

  Build a Nelder-Mead simplex with specified coefficients.

  n - Dimension of the simplex. See AbstractSimplex.AbstractSimplex(int,double). - `int`
  side-length - Length of the sides of the default (hypercube) simplex. See AbstractSimplex.AbstractSimplex(int,double). - `double`
  rho - Reflection coefficient. - `double`
  khi - Expansion coefficient. - `double`
  gamma - Contraction coefficient. - `double`
  sigma - Shrinkage coefficient. - `double`"
  (^NelderMeadSimplex [^Integer n ^Double side-length ^Double rho ^Double khi ^Double gamma ^Double sigma]
    (new NelderMeadSimplex n side-length rho khi gamma sigma))
  (^NelderMeadSimplex [^Integer n ^Double rho ^Double khi ^Double gamma ^Double sigma]
    (new NelderMeadSimplex n rho khi gamma sigma))
  (^NelderMeadSimplex [^Integer n ^Double side-length]
    (new NelderMeadSimplex n side-length))
  (^NelderMeadSimplex [^Integer n]
    (new NelderMeadSimplex n)))

(defn iterate
  "Compute the next simplex of the algorithm.

  evaluation-function - Evaluation function. - `org.apache.commons.math4.analysis.MultivariateFunction`
  comparator - Comparator to use to sort simplex vertices from best to worst. - `java.util.Comparator`"
  ([^NelderMeadSimplex this ^org.apache.commons.math4.analysis.MultivariateFunction evaluation-function ^java.util.Comparator comparator]
    (-> this (.iterate evaluation-function comparator))))

