(ns org.apache.commons.math4.analysis.solvers.PegasusSolver
  "Implements the Pegasus method for root-finding (approximating
  a zero of a univariate real function). It is a modified
  Regula Falsi method.

  Like the Regula Falsi method, convergence is guaranteed by
  maintaining a bracketed solution. The Pegasus method however,
  should converge much faster than the original Regula Falsi
  method. Furthermore, this implementation of the Pegasus method
  should not suffer from the same implementation issues as the Regula
  Falsi method, which may fail to convergence in certain cases. Also,
  the Pegasus method should converge faster than the
  Illinois method, another Regula
  Falsi-based method.

  The Pegasus method assumes that the function is continuous,
  but not necessarily smooth.

  Implementation based on the following article: M. Dowell and P. Jarratt,
  The \"Pegasus\" method for computing the root of an equation,
  BIT Numerical Mathematics, volume 12, number 4, pages 503-508, Springer,
  1972."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers PegasusSolver]))

(defn ->pegasus-solver
  "Constructor.

  Construct a solver.

  relative-accuracy - Relative accuracy. - `double`
  absolute-accuracy - Absolute accuracy. - `double`
  function-value-accuracy - Maximum function value error. - `double`"
  (^PegasusSolver [^Double relative-accuracy ^Double absolute-accuracy ^Double function-value-accuracy]
    (new PegasusSolver relative-accuracy absolute-accuracy function-value-accuracy))
  (^PegasusSolver [^Double relative-accuracy ^Double absolute-accuracy]
    (new PegasusSolver relative-accuracy absolute-accuracy))
  (^PegasusSolver [^Double absolute-accuracy]
    (new PegasusSolver absolute-accuracy))
  (^PegasusSolver []
    (new PegasusSolver )))

