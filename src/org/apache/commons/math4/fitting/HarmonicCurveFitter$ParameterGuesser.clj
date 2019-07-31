(ns org.apache.commons.math4.fitting.HarmonicCurveFitter$ParameterGuesser
  "This class guesses harmonic coefficients from a sample.
  The algorithm used to guess the coefficients is as follows:

  We know \\( f(t) \\) at some sampling points \\( t_i \\) and want
  to find \\( a \\), \\( \\omega \\) and \\( \\phi \\) such that
  \\( f(t) = a \\cos (\\omega t  \\phi) \\).


  From the analytical expression, we can compute two primitives :
  \\[
      If2(t) = \\int f^2 dt  = a^2 (t  S(t)) / 2
  \\]
  \\[
      If'2(t) = \\int f'^2 dt = a^2 \\omega^2 (t - S(t)) / 2
  \\]
  where \\(S(t) = \\frac{\\sin(2 (\\omega t  \\phi))}{2\\omega}\\)


  We can remove \\(S\\) between these expressions :
  \\[
      If'2(t) = a^2 \\omega^2 t - \\omega^2 If2(t)
  \\]


  The preceding expression shows that \\(If'2 (t)\\) is a linear
  combination of both \\(t\\) and \\(If2(t)\\):
  \\[
    If'2(t) = A t  B If2(t)
  \\]


  From the primitive, we can deduce the same form for definite
  integrals between \\(t_1\\) and \\(t_i\\) for each \\(t_i\\) :
  \\[
    If2(t_i) - If2(t_1) = A (t_i - t_1)  B (If2 (t_i) - If2(t_1))
  \\]


  We can find the coefficients \\(A\\) and \\(B\\) that best fit the sample
  to this linear expression by computing the definite integrals for
  each sample points.


  For a bilinear expression \\(z(x_i, y_i) = A x_i  B y_i\\), the
  coefficients \\(A\\) and \\(B\\) that minimize a least-squares criterion
  \\(\\sum (z_i - z(x_i, y_i))^2\\) are given by these expressions:
  \\[
    A = \\frac{\\sum y_i y_i \\sum x_i z_i - \\sum x_i y_i \\sum y_i z_i}
             {\\sum x_i x_i \\sum y_i y_i - \\sum x_i y_i \\sum x_i y_i}
  \\]
  \\[
    B = \\frac{\\sum x_i x_i \\sum y_i z_i - \\sum x_i y_i \\sum x_i z_i}
             {\\sum x_i x_i \\sum y_i y_i - \\sum x_i y_i \\sum x_i y_i}

  \\]

  In fact, we can assume that both \\(a\\) and \\(\\omega\\) are positive and
  compute them directly, knowing that \\(A = a^2 \\omega^2\\) and that
  \\(B = -\\omega^2\\). The complete algorithm is therefore:

  For each \\(t_i\\) from \\(t_1\\) to \\(t_{n-1}\\), compute:
  \\[ f(t_i) \\]
  \\[ f'(t_i) = \\frac{f (t_{i+1}) - f(t_{i-1})}{t_{i+1} - t_{i-1}} \\]
  \\[ x_i = t_i  - t_1 \\]
  \\[ y_i = \\int_{t_1}^{t_i} f^2(t) dt \\]
  \\[ z_i = \\int_{t_1}^{t_i} f'^2(t) dt \\]
  and update the sums:
  \\[ \\sum x_i x_i, \\sum y_i y_i, \\sum x_i y_i, \\sum x_i z_i, \\sum y_i z_i \\]

  Then:
  \\[
   a = \\sqrt{\\frac{\\sum y_i y_i  \\sum x_i z_i - \\sum x_i y_i \\sum y_i z_i }
                  {\\sum x_i y_i  \\sum x_i z_i - \\sum x_i x_i \\sum y_i z_i }}
  \\]
  \\[
   \\omega = \\sqrt{\\frac{\\sum x_i y_i \\sum x_i z_i - \\sum x_i x_i \\sum y_i z_i}
                       {\\sum x_i x_i \\sum y_i y_i - \\sum x_i y_i \\sum x_i y_i}}
  \\]

  Once we know \\(\\omega\\) we can compute:
  \\[
     fc = \\omega f(t) \\cos(\\omega t) - f'(t) \\sin(\\omega t)
  \\]
  \\[
     fs = \\omega f(t) \\sin(\\omega t)  f'(t) \\cos(\\omega t)
  \\]


  It appears that \\(fc = a \\omega \\cos(\\phi)\\) and
  \\(fs = -a \\omega \\sin(\\phi)\\), so we can use these
  expressions to compute \\(\\phi\\). The best estimate over the sample is
  given by averaging these expressions.


  Since integrals and means are involved in the preceding
  estimations, these operations run in \\(O(n)\\) time, where \\(n\\) is the
  number of measurements."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting HarmonicCurveFitter$ParameterGuesser]))

(defn ->parameter-guesser
  "Constructor.

  Simple constructor.

  observations - Sampled observations. - `java.util.Collection`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if the sample is too short."
  (^HarmonicCurveFitter$ParameterGuesser [^java.util.Collection observations]
    (new HarmonicCurveFitter$ParameterGuesser observations)))

(defn guess
  "Gets an estimation of the parameters.

  returns: the guessed parameters, in the following order:

    Amplitude
    Angular frequency
    Phase - `double[]`"
  ([^HarmonicCurveFitter$ParameterGuesser this]
    (-> this (.guess))))

