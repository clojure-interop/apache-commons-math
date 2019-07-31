(ns org.apache.commons.math4.stat.inference.WilcoxonSignedRankTest
  "An implementation of the Wilcoxon signed-rank test."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.inference WilcoxonSignedRankTest]))

(defn ->wilcoxon-signed-rank-test
  "Constructor.

  Create a test instance using the given strategies for NaN's and ties.
   Only use this if you are sure of what you are doing.

  nan-strategy - specifies the strategy that should be used for Double.NaN's - `org.apache.commons.math4.stat.ranking.NaNStrategy`
  ties-strategy - specifies the strategy that should be used for ties - `org.apache.commons.math4.stat.ranking.TiesStrategy`"
  (^WilcoxonSignedRankTest [^org.apache.commons.math4.stat.ranking.NaNStrategy nan-strategy ^org.apache.commons.math4.stat.ranking.TiesStrategy ties-strategy]
    (new WilcoxonSignedRankTest nan-strategy ties-strategy))
  (^WilcoxonSignedRankTest []
    (new WilcoxonSignedRankTest )))

(defn wilcoxon-signed-rank
  "Computes the
   Wilcoxon signed ranked statistic comparing mean for two related
   samples or repeated measurements on a single sample.

   This statistic can be used to perform a Wilcoxon signed ranked test
   evaluating the null hypothesis that the two related samples or repeated
   measurements on a single sample has equal mean.


   Let Xi denote the i'th individual of the first sample and
   Yi the related i'th individual in the second sample. Let
   Zi = Yi - Xi.


   Preconditions:

   The differences Zi must be independent.
   Each Zi comes from a continuous population (they must be
   identical) and is symmetric about a common median.
   The values that Xi and Yi represent are
   ordered, so the comparisons greater than, less than, and equal to are
   meaningful.

  x - the first sample - `double[]`
  y - the second sample - `double[]`

  returns: wilcoxonSignedRank statistic (the larger of W+ and W-) - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if x or y are null."
  (^Double [^WilcoxonSignedRankTest this x y]
    (-> this (.wilcoxonSignedRank x y))))

(defn wilcoxon-signed-rank-test
  "Returns the observed significance level, or
   p-value, associated with a
   Wilcoxon signed ranked statistic comparing mean for two related
   samples or repeated measurements on a single sample.

   Let Xi denote the i'th individual of the first sample and
   Yi the related i'th individual in the second sample. Let
   Zi = Yi - Xi.


   Preconditions:

   The differences Zi must be independent.
   Each Zi comes from a continuous population (they must be
   identical) and is symmetric about a common median.
   The values that Xi and Yi represent are
   ordered, so the comparisons greater than, less than, and equal to are
   meaningful.

  x - the first sample - `double[]`
  y - the second sample - `double[]`
  exact-p-value - if the exact p-value is wanted (only works for x.length <= 30, if true and x.length > 30, this is ignored because calculations may take too long) - `boolean`

  returns: p-value - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if x or y are null."
  (^Double [^WilcoxonSignedRankTest this x y ^Boolean exact-p-value]
    (-> this (.wilcoxonSignedRankTest x y exact-p-value))))

