(ns org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils
  "Utility routines for UnivariateSolver objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers UnivariateSolverUtils]))

(defn *solve
  "Convenience method to find a zero of a univariate real function.  A default
   solver is used.

  function - Function. - `org.apache.commons.math4.analysis.UnivariateFunction`
  x-0 - Lower bound for the interval. - `double`
  x-1 - Upper bound for the interval. - `double`
  absolute-accuracy - Accuracy to be used by the solver. - `double`

  returns: a value where the function is zero. - `double`

  throws: org.apache.commons.math4.exception.NoBracketingException - if the function has the same sign at the endpoints."
  (^Double [^org.apache.commons.math4.analysis.UnivariateFunction function ^Double x-0 ^Double x-1 ^Double absolute-accuracy]
    (UnivariateSolverUtils/solve function x-0 x-1 absolute-accuracy))
  (^Double [^org.apache.commons.math4.analysis.UnivariateFunction function ^Double x-0 ^Double x-1]
    (UnivariateSolverUtils/solve function x-0 x-1)))

(defn *force-side
  "Force a root found by a non-bracketing solver to lie on a specified side,
   as if the solver were a bracketing one.

  max-eval - maximal number of new evaluations of the function (evaluations already done for finding the root should have already been subtracted from this number) - `int`
  f - function to solve - `org.apache.commons.math4.analysis.UnivariateFunction`
  bracketing - bracketing solver to use for shifting the root - `org.apache.commons.math4.analysis.solvers.BracketedUnivariateSolver`
  base-root - original root found by a previous non-bracketing solver - `double`
  min - minimal bound of the search interval - `double`
  max - maximal bound of the search interval - `double`
  allowed-solution - the kind of solutions that the root-finding algorithm may accept as solutions. - `org.apache.commons.math4.analysis.solvers.AllowedSolution`

  returns: a root approximation, on the specified side of the exact root - `double`

  throws: org.apache.commons.math4.exception.NoBracketingException - if the function has the same sign at the endpoints."
  (^Double [^Integer max-eval ^org.apache.commons.math4.analysis.UnivariateFunction f ^org.apache.commons.math4.analysis.solvers.BracketedUnivariateSolver bracketing ^Double base-root ^Double min ^Double max ^org.apache.commons.math4.analysis.solvers.AllowedSolution allowed-solution]
    (UnivariateSolverUtils/forceSide max-eval f bracketing base-root min max allowed-solution)))

(defn *bracketing?
  "Check whether the interval bounds bracket a root. That is, if the
   values at the endpoints are not equal to zero, then the function takes
   opposite signs at the endpoints.

  function - Function. - `org.apache.commons.math4.analysis.UnivariateFunction`
  lower - Lower endpoint. - `double`
  upper - Upper endpoint. - `double`

  returns: true if the function values have opposite signs at the
   given points. - `boolean`

  throws: org.apache.commons.math4.exception.NullArgumentException - if function is null."
  (^Boolean [^org.apache.commons.math4.analysis.UnivariateFunction function ^Double lower ^Double upper]
    (UnivariateSolverUtils/isBracketing function lower upper)))

(defn *bracket
  "This method attempts to find two values a and b satisfying
    lowerBound <= a < initial < b <= upperBound
    f(a) * f(b) <= 0

   If f is continuous on [a,b], this means that a
   and b bracket a root of f.

   The algorithm checks the sign of \\( f(l_k) \\) and \\( f(u_k) \\) for increasing
   values of k, where \\( l_k = max(lower, initial - \\delta_k) \\),
   \\( u_k = min(upper, initial  \\delta_k) \\), using recurrence
   \\( \\delta_{k+1} = r \\delta_k  q, \\delta_0 = 0\\) and starting search with \\( k=1 \\).
   The algorithm stops when one of the following happens:
    at least one positive and one negative value have been found --  success!
    both endpoints have reached their respective limits -- NoBracketingException
    maximumIterations iterations elapse -- NoBracketingException

   If different signs are found at first iteration (k=1), then the returned
   interval will be \\( [a, b] = [l_1, u_1] \\). If different signs are found at a later
   iteration k>1, then the returned interval will be either
   \\( [a, b] = [l_{k+1}, l_{k}] \\) or \\( [a, b] = [u_{k}, u_{k+1}] \\). A root solver called
   with these parameters will therefore start with the smallest bracketing interval known
   at this step.


   Interval expansion rate is tuned by changing the recurrence parameters r and
   q. When the multiplicative factor r is set to 1, the sequence is a
   simple arithmetic sequence with linear increase. When the multiplicative factor r
   is larger than 1, the sequence has an asymptotically exponential rate. Note than the
   additive parameter q should never be set to zero, otherwise the interval would
   degenerate to the single initial point for all values of k.


   As a rule of thumb, when the location of the root is expected to be approximately known
   within some error margin, r should be set to 1 and q should be set to the
   order of magnitude of the error margin. When the location of the root is really a wild guess,
   then r should be set to a value larger than 1 (typically 2 to double the interval
   length at each iteration) and q should be set according to half the initial
   search interval length.


   As an example, if we consider the trivial function f(x) = 1 - x and use
   initial = 4, r = 1, q = 2, the algorithm will compute
   f(4-2) = f(2) = -1 and f(4+2) = f(6) = -5 for k = 1, then
   f(4-4) = f(0) = 1 and f(4+4) = f(8) = -7 for k = 2. Then it will
   return the interval [0, 2] as the smallest one known to be bracketing the root.
   As shown by this example, the initial value (here 4) may lie outside of the returned
   bracketing interval.

  function - function to check - `org.apache.commons.math4.analysis.UnivariateFunction`
  initial - Initial midpoint of interval being expanded to bracket a root. - `double`
  lower-bound - Lower bound (a is never lower than this value). - `double`
  upper-bound - Upper bound (b never is greater than this value). - `double`
  q - additive offset used to compute bounds sequence (must be strictly positive) - `double`
  r - multiplicative factor used to compute bounds sequence - `double`
  maximum-iterations - Maximum number of iterations to perform - `int`

  returns: a two element array holding the bracketing values. - `double[]`

  throws: org.apache.commons.math4.exception.NoBracketingException - if function cannot be bracketed in the search interval"
  ([^org.apache.commons.math4.analysis.UnivariateFunction function ^Double initial ^Double lower-bound ^Double upper-bound ^Double q ^Double r ^Integer maximum-iterations]
    (UnivariateSolverUtils/bracket function initial lower-bound upper-bound q r maximum-iterations))
  ([^org.apache.commons.math4.analysis.UnivariateFunction function ^Double initial ^Double lower-bound ^Double upper-bound ^Integer maximum-iterations]
    (UnivariateSolverUtils/bracket function initial lower-bound upper-bound maximum-iterations))
  ([^org.apache.commons.math4.analysis.UnivariateFunction function ^Double initial ^Double lower-bound ^Double upper-bound]
    (UnivariateSolverUtils/bracket function initial lower-bound upper-bound)))

(defn *sequence?
  "Check whether the arguments form a (strictly) increasing sequence.

  start - First number. - `double`
  mid - Second number. - `double`
  end - Third number. - `double`

  returns: true if the arguments form an increasing sequence. - `boolean`"
  (^Boolean [^Double start ^Double mid ^Double end]
    (UnivariateSolverUtils/isSequence start mid end)))

(defn *verify-bracketing
  "Check that the endpoints specify an interval and the end points
   bracket a root.

  function - Function. - `org.apache.commons.math4.analysis.UnivariateFunction`
  lower - Lower endpoint. - `double`
  upper - Upper endpoint. - `double`

  throws: org.apache.commons.math4.exception.NoBracketingException - if the function has the same sign at the endpoints."
  ([^org.apache.commons.math4.analysis.UnivariateFunction function ^Double lower ^Double upper]
    (UnivariateSolverUtils/verifyBracketing function lower upper)))

(defn *verify-sequence
  "Check that lower < initial < upper.

  lower - Lower endpoint. - `double`
  initial - Initial value. - `double`
  upper - Upper endpoint. - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if lower >= initial or initial >= upper."
  ([^Double lower ^Double initial ^Double upper]
    (UnivariateSolverUtils/verifySequence lower initial upper)))

(defn *verify-interval
  "Check that the endpoints specify an interval.

  lower - Lower endpoint. - `double`
  upper - Upper endpoint. - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if lower >= upper."
  ([^Double lower ^Double upper]
    (UnivariateSolverUtils/verifyInterval lower upper)))

(defn *midpoint
  "Compute the midpoint of two values.

  a - first value. - `double`
  b - second value. - `double`

  returns: the midpoint. - `double`"
  (^Double [^Double a ^Double b]
    (UnivariateSolverUtils/midpoint a b)))

