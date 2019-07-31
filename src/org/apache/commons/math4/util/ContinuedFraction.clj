(ns org.apache.commons.math4.util.ContinuedFraction
  "Provides a generic means to evaluate continued fractions.  Subclasses simply
  provided the a and b coefficients to evaluate the continued fraction.


  References:


  Continued Fraction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util ContinuedFraction]))

(defn evaluate
  "Evaluates the continued fraction at the value x.

   The implementation of this method is based on the modified Lentz algorithm as described
   on page 18 ff. in:


     I. J. Thompson,  A. R. Barnett. \"Coulomb and Bessel Functions of Complex Arguments and Order.\"

     http://www.fresco.org.uk/papers/Thompson-JCP64p490.pdf


   Note: the implementation uses the terms ai and bi as defined in
   Continued Fraction @ MathWorld.

  x - the evaluation point. - `double`
  epsilon - maximum error allowed. - `double`
  max-iterations - maximum number of convergents - `int`

  returns: the value of the continued fraction evaluated at x. - `double`

  throws: org.apache.commons.math4.exception.ConvergenceException - if the algorithm fails to converge."
  (^Double [^ContinuedFraction this ^Double x ^Double epsilon ^Integer max-iterations]
    (-> this (.evaluate x epsilon max-iterations)))
  (^Double [^ContinuedFraction this ^Double x ^Double epsilon]
    (-> this (.evaluate x epsilon)))
  (^Double [^ContinuedFraction this ^Double x]
    (-> this (.evaluate x))))

