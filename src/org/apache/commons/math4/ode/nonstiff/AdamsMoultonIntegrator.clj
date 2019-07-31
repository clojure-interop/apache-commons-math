(ns org.apache.commons.math4.ode.nonstiff.AdamsMoultonIntegrator
  "This class implements implicit Adams-Moulton integrators for Ordinary
  Differential Equations.

  Adams-Moulton methods (in fact due to Adams alone) are implicit
  multistep ODE solvers. This implementation is a variation of the classical
  one: it uses adaptive stepsize to implement error control, whereas
  classical implementations are fixed step size. The value of state vector
  at step n+1 is a simple combination of the value at step n and of the
  derivatives at steps n+1, n, n-1 ... Since y'n+1 is needed to
  compute yn+1, another method must be used to compute a first
  estimate of yn+1, then compute y'n+1, then compute
  a final estimate of yn+1 using the following formulas. Depending
  on the number k of previous steps one wants to use for computing the next
  value, different formulas are available for the final estimate:

    k = 1: yn+1 = yn  h y'n+1
    k = 2: yn+1 = yn  h (y'n+1+y'n)/2
    k = 3: yn+1 = yn  h (5y'n+1+8y'n-y'n-1)/12
    k = 4: yn+1 = yn  h (9y'n+1+19y'n-5y'n-1+y'n-2)/24
    ...


  A k-steps Adams-Moulton method is of order k+1.

  Implementation details

  We define scaled derivatives si(n) at step n as:


  s1(n) = h y'n for first derivative
  s2(n) = h2/2 y''n for second derivative
  s3(n) = h3/6 y'''n for third derivative
  ...
  sk(n) = hk/k! y(k)n for kth derivative

  The definitions above use the classical representation with several previous first
  derivatives. Lets define


    qn = [ s1(n-1) s1(n-2) ... s1(n-(k-1)) ]T
  (we omit the k index in the notation for clarity). With these definitions,
  Adams-Moulton methods can be written:

    k = 1: yn+1 = yn  s1(n+1)
    k = 2: yn+1 = yn  1/2 s1(n+1)  [ 1/2 ] qn+1
    k = 3: yn+1 = yn  5/12 s1(n+1)  [ 8/12 -1/12 ] qn+1
    k = 4: yn+1 = yn  9/24 s1(n+1)  [ 19/24 -5/24 1/24 ] qn+1
    ...


  Instead of using the classical representation with first derivatives only (yn,
  s1(n+1) and qn+1), our implementation uses the Nordsieck vector with
  higher degrees scaled derivatives all taken at the same step (yn, s1(n)
  and rn) where rn is defined as:


  rn = [ s2(n), s3(n) ... sk(n) ]T
  (here again we omit the k index in the notation for clarity)


  Taylor series formulas show that for any index offset i, s1(n-i) can be
  computed from s1(n), s2(n) ... sk(n), the formula being exact
  for degree k polynomials.


  s1(n-i) = s1(n)  ∑j>0 (j+1) (-i)j sj+1(n)
  The previous formula can be used with several values for i to compute the transform between
  classical representation and Nordsieck vector. The transform between rn
  and qn resulting from the Taylor series formulas above is:


  qn = s1(n) u  P rn
  where u is the [ 1 1 ... 1 ]T vector and P is the (k-1)×(k-1) matrix built
  with the (j+1) (-i)j terms with i being the row number starting from 1 and j being
  the column number starting from 1:


         [  -2   3   -4    5  ... ]
         [  -4  12  -32   80  ... ]
    P =  [  -6  27 -108  405  ... ]
         [  -8  48 -256 1280  ... ]
         [          ...           ]

  Using the Nordsieck vector has several advantages:

    it greatly simplifies step interpolation as the interpolator mainly applies
    Taylor series formulas,
    it simplifies step changes that occur when discrete events that truncate
    the step are triggered,
    it allows to extend the methods in order to support adaptive stepsize.


  The predicted Nordsieck vector at step n+1 is computed from the Nordsieck vector at step
  n as follows:

    Yn+1 = yn  s1(n)  uT rn
    S1(n+1) = h f(tn+1, Yn+1)
    Rn+1 = (s1(n) - S1(n+1)) P-1 u  P-1 A P rn

  where A is a rows shifting matrix (the lower left part is an identity matrix):


         [ 0 0   ...  0 0 | 0 ]
         [ ---------------+---]
         [ 1 0   ...  0 0 | 0 ]
     A = [ 0 1   ...  0 0 | 0 ]
         [       ...      | 0 ]
         [ 0 0   ...  1 0 | 0 ]
         [ 0 0   ...  0 1 | 0 ]
  From this predicted vector, the corrected vector is computed as follows:

    yn+1 = yn  S1(n+1)  [ -1 1 -1 1 ... ±1 ] rn+1
    s1(n+1) = h f(tn+1, yn+1)
    rn+1 = Rn+1  (s1(n+1) - S1(n+1)) P-1 u

  where the upper case Yn+1, S1(n+1) and Rn+1 represent the
  predicted states whereas the lower case yn+1, sn+1 and rn+1
  represent the corrected states.

  The P-1u vector and the P-1 A P matrix do not depend on the state,
  they only depend on k and therefore are precomputed once for all."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff AdamsMoultonIntegrator]))

(defn ->adams-moulton-integrator
  "Constructor.

  Build an Adams-Moulton integrator with the given order and error control parameters.

  n-steps - number of steps of the method excluding the one being computed - `int`
  min-step - minimal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  max-step - maximal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  scal-absolute-tolerance - allowed absolute error - `double`
  scal-relative-tolerance - allowed relative error - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if order is 1 or less"
  (^AdamsMoultonIntegrator [^Integer n-steps ^Double min-step ^Double max-step ^Double scal-absolute-tolerance ^Double scal-relative-tolerance]
    (new AdamsMoultonIntegrator n-steps min-step max-step scal-absolute-tolerance scal-relative-tolerance)))

(defn integrate
  "Integrate a set of differential equations up to the given time.
   This method solves an Initial Value Problem (IVP).
   The set of differential equations is composed of a main set, which
   can be extended by some sets of secondary equations. The set of
   equations must be already set up with initial time and partial states.
   At integration completion, the final time and partial states will be
   available in the same object.
   Since this method stores some internal state variables made
   available in its public interface during integration (AbstractIntegrator.getCurrentSignedStepsize()), it is not thread-safe.

  equations - complete set of differential equations to integrate - `org.apache.commons.math4.ode.ExpandableStatefulODE`
  t - target time for the integration (can be set to a value smaller than t0 for backward integration) - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if integration step is too small"
  ([^AdamsMoultonIntegrator this ^org.apache.commons.math4.ode.ExpandableStatefulODE equations ^Double t]
    (-> this (.integrate equations t))))

