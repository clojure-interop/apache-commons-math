(ns org.apache.commons.math4.ode.nonstiff.AdamsNordsieckFieldTransformer
  "Transformer to Nordsieck vectors for Adams integrators.
  This class is used by Adams-Bashforth and
  Adams-Moulton integrators to convert between
  classical representation with several previous first derivatives and Nordsieck
  representation with higher order scaled derivatives.

  We define scaled derivatives si(n) at step n as:


  s1(n) = h y'n for first derivative
  s2(n) = h2/2 y''n for second derivative
  s3(n) = h3/6 y'''n for third derivative
  ...
  sk(n) = hk/k! y(k)n for kth derivative

  With the previous definition, the classical representation of multistep methods
  uses first derivatives only, i.e. it handles yn, s1(n) and
  qn where qn is defined as:


    qn = [ s1(n-1) s1(n-2) ... s1(n-(k-1)) ]T
  (we omit the k index in the notation for clarity).

  Another possible representation uses the Nordsieck vector with
  higher degrees scaled derivatives all taken at the same step, i.e it handles yn,
  s1(n) and rn) where rn is defined as:


  rn = [ s2(n), s3(n) ... sk(n) ]T
  (here again we omit the k index in the notation for clarity)


  Taylor series formulas show that for any index offset i, s1(n-i) can be
  computed from s1(n), s2(n) ... sk(n), the formula being exact
  for degree k polynomials.


  s1(n-i) = s1(n)  ∑j>0 (j+1) (-i)j sj+1(n)
  The previous formula can be used with several values for i to compute the transform between
  classical representation and Nordsieck vector at step end. The transform between rn
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

  Changing -i into i in the formula above can be used to compute a similar transform between
  classical representation and Nordsieck vector at step start. The resulting matrix is simply
  the absolute value of matrix P.

  For Adams-Bashforth method, the Nordsieck vector
  at step n+1 is computed from the Nordsieck vector at step n as follows:

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

  For Adams-Moulton method, the predicted Nordsieck vector
  at step n+1 is computed from the Nordsieck vector at step n as follows:

    Yn+1 = yn  s1(n)  uT rn
    S1(n+1) = h f(tn+1, Yn+1)
    Rn+1 = (s1(n) - s1(n+1)) P-1 u  P-1 A P rn

  From this predicted vector, the corrected vector is computed as follows:

    yn+1 = yn  S1(n+1)  [ -1 1 -1 1 ... ±1 ] rn+1
    s1(n+1) = h f(tn+1, yn+1)
    rn+1 = Rn+1  (s1(n+1) - S1(n+1)) P-1 u

  where the upper case Yn+1, S1(n+1) and Rn+1 represent the
  predicted states whereas the lower case yn+1, sn+1 and rn+1
  represent the corrected states.

  We observe that both methods use similar update formulas. In both cases a P-1u
  vector and a P-1 A P matrix are used that do not depend on the state,
  they only depend on k. This class handles these transformations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff AdamsNordsieckFieldTransformer]))

(defn *get-instance
  "Get the Nordsieck transformer for a given field and number of steps.

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  n-steps - number of steps of the multistep method (excluding the one being computed) - `int`

  returns: Nordsieck transformer for the specified field and number of steps - `<T extends org.apache.commons.math4.RealFieldElement<T>> org.apache.commons.math4.ode.nonstiff.AdamsNordsieckFieldTransformer<T>`"
  ([^org.apache.commons.math4.Field field ^Integer n-steps]
    (AdamsNordsieckFieldTransformer/getInstance field n-steps)))

(defn initialize-high-order-derivatives
  "Initialize the high order scaled derivatives at step start.

  h - step size to use for scaling - `T`
  t - first steps times - `T[]`
  y - first steps states - `T[][]`
  y-dot - first steps derivatives - `T[][]`

  returns: Nordieck vector at start of first step (h2/2 y''n,
   h3/6 y'''n ... hk/k! y(k)n) - `org.apache.commons.math4.linear.Array2DRowFieldMatrix<T>`"
  (^org.apache.commons.math4.linear.Array2DRowFieldMatrix [^AdamsNordsieckFieldTransformer this h t y y-dot]
    (-> this (.initializeHighOrderDerivatives h t y y-dot))))

(defn update-high-order-derivatives-phase-1
  "Update the high order scaled derivatives for Adams integrators (phase 1).
   The complete update of high order derivatives has a form similar to:


   rn+1 = (s1(n) - s1(n+1)) P-1 u  P-1 A P rn
   this method computes the P-1 A P rn part.

  high-order - high order scaled derivatives (h2/2 y'', ... hk/k! y(k)) - `org.apache.commons.math4.linear.Array2DRowFieldMatrix`

  returns: updated high order derivatives - `org.apache.commons.math4.linear.Array2DRowFieldMatrix<T>`"
  (^org.apache.commons.math4.linear.Array2DRowFieldMatrix [^AdamsNordsieckFieldTransformer this ^org.apache.commons.math4.linear.Array2DRowFieldMatrix high-order]
    (-> this (.updateHighOrderDerivativesPhase1 high-order))))

(defn update-high-order-derivatives-phase-2
  "Update the high order scaled derivatives Adams integrators (phase 2).
   The complete update of high order derivatives has a form similar to:


   rn+1 = (s1(n) - s1(n+1)) P-1 u  P-1 A P rn
   this method computes the (s1(n) - s1(n+1)) P-1 u part.
   Phase 1 of the update must already have been performed.

  start - first order scaled derivatives at step start - `T[]`
  end - first order scaled derivatives at step end - `T[]`
  high-order - high order scaled derivatives, will be modified (h2/2 y'', ... hk/k! y(k)) - `org.apache.commons.math4.linear.Array2DRowFieldMatrix`"
  ([^AdamsNordsieckFieldTransformer this start end ^org.apache.commons.math4.linear.Array2DRowFieldMatrix high-order]
    (-> this (.updateHighOrderDerivativesPhase2 start end high-order))))

