(ns org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.descriptive.rank Percentile$EstimationType]))

(def LEGACY
  "Enum Constant.

  This is the default type used in the Percentile.This method
   has the following formulae for index and estimates
   \\( \\begin{align}
   &index    = (N+1)p\\ \\\\
   &estimate = x_{\\lceil h\\,-\\,1/2 \\rceil} \\\\
   &minLimit = 0 \\\\
   &maxLimit = 1 \\\\
   \\end{align}\\)

  type: org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType"
  Percentile$EstimationType/LEGACY)

(def R_1
  "Enum Constant.

  The method R_1 has the following formulae for index and estimates
   \\( \\begin{align}
   &index= Np  1/2\\,  \\\\
   &estimate= x_{\\lceil h\\,-\\,1/2 \\rceil} \\\\
   &minLimit = 0 \\\\
   \\end{align}\\)

  type: org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType"
  Percentile$EstimationType/R_1)

(def R_2
  "Enum Constant.

  The method R_2 has the following formulae for index and estimates
   \\( \\begin{align}
   &index= Np  1/2\\, \\\\
   &estimate=\\frac{x_{\\lceil h\\,-\\,1/2 \\rceil}
   x_{\\lfloor h\\,+\\,1/2 \\rfloor}}{2} \\\\
   &minLimit = 0 \\\\
   &maxLimit = 1 \\\\
   \\end{align}\\)

  type: org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType"
  Percentile$EstimationType/R_2)

(def R_3
  "Enum Constant.

  The method R_3 has the following formulae for index and estimates
   \\( \\begin{align}
   &index= Np \\\\
   &estimate= x_{\\lfloor h \\rceil}\\, \\\\
   &minLimit = 0.5/N \\\\
   \\end{align}\\)

  type: org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType"
  Percentile$EstimationType/R_3)

(def R_4
  "Enum Constant.

  The method R_4 has the following formulae for index and estimates
   \\( \\begin{align}
   &index= Np\\, \\\\
   &estimate= x_{\\lfloor h \\rfloor}  (h -
   \\lfloor h \\rfloor) (x_{\\lfloor h \\rfloor  1} - x_{\\lfloor h
   \\rfloor}) \\\\
   &minLimit = 1/N \\\\
   &maxLimit = 1 \\\\
   \\end{align}\\)

  type: org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType"
  Percentile$EstimationType/R_4)

(def R_5
  "Enum Constant.

  The method R_5 has the following formulae for index and estimates
   \\( \\begin{align}
   &index= Np  1/2\\\\
   &estimate= x_{\\lfloor h \\rfloor}  (h -
   \\lfloor h \\rfloor) (x_{\\lfloor h \\rfloor  1} - x_{\\lfloor h
   \\rfloor}) \\\\
   &minLimit = 0.5/N \\\\
   &maxLimit = (N-0.5)/N
   \\end{align}\\)

  type: org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType"
  Percentile$EstimationType/R_5)

(def R_6
  "Enum Constant.

  The method R_6 has the following formulae for index and estimates
   \\( \\begin{align}
   &index= (N  1)p \\\\
   &estimate= x_{\\lfloor h \\rfloor}  (h -
   \\lfloor h \\rfloor) (x_{\\lfloor h \\rfloor  1} - x_{\\lfloor h
   \\rfloor}) \\\\
   &minLimit = 1/(N+1) \\\\
   &maxLimit = N/(N+1) \\\\
   \\end{align}\\)

   Note: This method computes the index in a manner very close to
   the default Commons Math Percentile existing implementation. However
   the difference to be noted is in picking up the limits with which
   first element (p<1(N+1)) and last elements (p>N/(N+1))are done.
   While in default case; these are done with p=0 and p=1 respectively.

  type: org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType"
  Percentile$EstimationType/R_6)

(def R_7
  "Enum Constant.

  The method R_7 implements Microsoft Excel style computation has the
   following formulae for index and estimates.
   \\( \\begin{align}
   &index = (N-1)p  1 \\\\
   &estimate = x_{\\lfloor h \\rfloor}  (h -
   \\lfloor h \\rfloor) (x_{\\lfloor h \\rfloor  1} - x_{\\lfloor h
   \\rfloor}) \\\\
   &minLimit = 0 \\\\
   &maxLimit = 1 \\\\
   \\end{align}\\)

  type: org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType"
  Percentile$EstimationType/R_7)

(def R_8
  "Enum Constant.

  The method R_8 has the following formulae for index and estimates
   \\( \\begin{align}
   &index = (N  1/3)p  1/3  \\\\
   &estimate = x_{\\lfloor h \\rfloor}  (h -
             \\lfloor h \\rfloor) (x_{\\lfloor h \\rfloor  1} - x_{\\lfloor h
   \\rfloor}) \\\\
   &minLimit = (2/3)/(N+1/3) \\\\
   &maxLimit = (N-1/3)/(N+1/3) \\\\
   \\end{align}\\)

   As per Ref [2,3] this approach is most recommended as it provides
   an approximate median-unbiased estimate regardless of distribution.

  type: org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType"
  Percentile$EstimationType/R_8)

(def R_9
  "Enum Constant.

  The method R_9 has the following formulae for index and estimates
   \\( \\begin{align}
   &index = (N  1/4)p  3/8\\\\
   &estimate = x_{\\lfloor h \\rfloor}  (h -
             \\lfloor h \\rfloor) (x_{\\lfloor h \\rfloor  1} - x_{\\lfloor h
   \\rfloor}) \\\\
   &minLimit = (5/8)/(N+1/4) \\\\
   &maxLimit = (N-3/8)/(N+1/4) \\\\
   \\end{align}\\)

  type: org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType"
  Percentile$EstimationType/R_9)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Percentile.EstimationType c : Percentile.EstimationType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType[]`"
  ([]
    (Percentile$EstimationType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.stat.descriptive.rank.Percentile$EstimationType [^java.lang.String name]
    (Percentile$EstimationType/valueOf name)))

(defn evaluate
  "Evaluate method to compute the percentile for a given bounded array.
   This basically calls the index and then
   estimate
   functions to return the estimated percentile value. Please
   note that this method does not make use of cached pivots.

  work - array of numbers to be used for finding the percentile - `double[]`
  p - the pth quantile to be computed - `double`
  selector - a KthSelector used for pivoting during search - `org.apache.commons.math4.util.KthSelector`

  returns: estimated percentile - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if length or p is out of range"
  (^Double [^Percentile$EstimationType this work ^Double p ^org.apache.commons.math4.util.KthSelector selector]
    (-> this (.evaluate work p selector))))

