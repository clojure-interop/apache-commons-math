(ns org.apache.commons.math4.ode.nonstiff.AdamsBashforthFieldIntegrator
  "This class implements explicit Adams-Bashforth integrators for Ordinary
  Differential Equations.

  Adams-Bashforth methods (in fact due to Adams alone) are explicit
  multistep ODE solvers. This implementation is a variation of the classical
  one: it uses adaptive stepsize to implement error control, whereas
  classical implementations are fixed step size. The value of state vector
  at step n+1 is a simple combination of the value at step n and of the
  derivatives at steps n, n-1, n-2 ... Depending on the number k of previous
  steps one wants to use for computing the next value, different formulas
  are available:

    k = 1: yn+1 = yn  h y'n
    k = 2: yn+1 = yn  h (3y'n-y'n-1)/2
    k = 3: yn+1 = yn  h (23y'n-16y'n-1+5y'n-2)/12
    k = 4: yn+1 = yn  h (55y'n-59y'n-1+37y'n-2-9y'n-3)/24
    ...


  A k-steps Adams-Bashforth method is of order k.

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
  Adams-Bashforth methods can be written:

    k = 1: yn+1 = yn  s1(n)
    k = 2: yn+1 = yn  3/2 s1(n)  [ -1/2 ] qn
    k = 3: yn+1 = yn  23/12 s1(n)  [ -16/12 5/12 ] qn
    k = 4: yn+1 = yn  55/24 s1(n)  [ -59/24 37/24 -9/24 ] qn
    ...


  Instead of using the classical representation with first derivatives only (yn,
  s1(n) and qn), our implementation uses the Nordsieck vector with
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


  The Nordsieck vector at step n+1 is computed from the Nordsieck vector at step n as follows:

    yn+1 = yn  s1(n)  uT rn
    s1(n+1) = h f(tn+1, yn+1)
    rn+1 = (s1(n) - s1(n+1)) P-1 u  P-1 A P rn

  where A is a rows shifting matrix (the lower left part is an identity matrix):


         [ 0 0   ...  0 0 | 0 ]
         [ ---------------+---]
         [ 1 0   ...  0 0 | 0 ]
     A = [ 0 1   ...  0 0 | 0 ]
         [       ...      | 0 ]
         [ 0 0   ...  1 0 | 0 ]
         [ 0 0   ...  0 1 | 0 ]

  The P-1u vector and the P-1 A P matrix do not depend on the state,
  they only depend on k and therefore are precomputed once for all."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff AdamsBashforthFieldIntegrator]))

(defn ->adams-bashforth-field-integrator
  "Constructor.

  Build an Adams-Bashforth integrator with the given order and step control parameters.

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  n-steps - number of steps of the method excluding the one being computed - `int`
  min-step - minimal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  max-step - maximal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  scal-absolute-tolerance - allowed absolute error - `double`
  scal-relative-tolerance - allowed relative error - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if order is 1 or less"
  (^AdamsBashforthFieldIntegrator [^org.apache.commons.math4.Field field ^Integer n-steps ^Double min-step ^Double max-step ^Double scal-absolute-tolerance ^Double scal-relative-tolerance]
    (new AdamsBashforthFieldIntegrator field n-steps min-step max-step scal-absolute-tolerance scal-relative-tolerance)))

(defn integrate
  "Integrate the differential equations up to the given time.
   This method solves an Initial Value Problem (IVP).
   Since this method stores some internal state variables made
   available in its public interface during integration (FirstOrderFieldIntegrator.getCurrentSignedStepsize()), it is not thread-safe.

  equations - differential equations to integrate - `org.apache.commons.math4.ode.FieldExpandableODE`
  initial-state - initial state (time, primary and secondary state vectors) - `org.apache.commons.math4.ode.FieldODEState`
  final-time - target time for the integration (can be set to a value smaller than t0 for backward integration) - `T`

  returns: final state, its time will be the same as finalTime if
   integration reached its target, but may be different if some FieldEventHandler stops it at some point. - `org.apache.commons.math4.ode.FieldODEStateAndDerivative<T>`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if integration step is too small"
  (^org.apache.commons.math4.ode.FieldODEStateAndDerivative [^AdamsBashforthFieldIntegrator this ^org.apache.commons.math4.ode.FieldExpandableODE equations ^org.apache.commons.math4.ode.FieldODEState initial-state final-time]
    (-> this (.integrate equations initial-state final-time))))

