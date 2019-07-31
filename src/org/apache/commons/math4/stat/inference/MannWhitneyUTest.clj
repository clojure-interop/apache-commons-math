(ns org.apache.commons.math4.stat.inference.MannWhitneyUTest
  "An implementation of the Mann-Whitney U test (also called Wilcoxon rank-sum test)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.inference MannWhitneyUTest]))

(defn ->mann-whitney-u-test
  "Constructor.

  Create a test instance using the given strategies for NaN's and ties.
   Only use this if you are sure of what you are doing.

  nan-strategy - specifies the strategy that should be used for Double.NaN's - `org.apache.commons.math4.stat.ranking.NaNStrategy`
  ties-strategy - specifies the strategy that should be used for ties - `org.apache.commons.math4.stat.ranking.TiesStrategy`"
  (^MannWhitneyUTest [^org.apache.commons.math4.stat.ranking.NaNStrategy nan-strategy ^org.apache.commons.math4.stat.ranking.TiesStrategy ties-strategy]
    (new MannWhitneyUTest nan-strategy ties-strategy))
  (^MannWhitneyUTest []
    (new MannWhitneyUTest )))

(defn mann-whitney-u
  "Computes the  Mann-Whitney
   U statistic comparing mean for two independent samples possibly of
   different length.

   This statistic can be used to perform a Mann-Whitney U test evaluating
   the null hypothesis that the two independent samples has equal mean.


   Let Xi denote the i'th individual of the first sample and
   Yj the j'th individual in the second sample. Note that the
   samples would often have different length.


   Preconditions:

   All observations in the two samples are independent.
   The observations are at least ordinal (continuous are also ordinal).

  x - the first sample - `double[]`
  y - the second sample - `double[]`

  returns: Mann-Whitney U statistic (maximum of Ux and Uy) - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if x or y are null."
  (^Double [^MannWhitneyUTest this x y]
    (-> this (.mannWhitneyU x y))))

(defn mann-whitney-u-test
  "Returns the asymptotic observed significance level, or
   p-value, associated with a  Mann-Whitney
   U statistic comparing mean for two independent samples.

   Let Xi denote the i'th individual of the first sample and
   Yj the j'th individual in the second sample. Note that the
   samples would often have different length.


   Preconditions:

   All observations in the two samples are independent.
   The observations are at least ordinal (continuous are also ordinal).


   Ties give rise to biased variance at the moment. See e.g. http://mlsc.lboro.ac.uk/resources/statistics/Mannwhitney.pdf.

  x - the first sample - `double[]`
  y - the second sample - `double[]`

  returns: asymptotic p-value - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if x or y are null."
  (^Double [^MannWhitneyUTest this x y]
    (-> this (.mannWhitneyUTest x y))))

