(ns org.apache.commons.math4.stat.ranking.RankingAlgorithm
  "Interface representing a rank transformation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.ranking RankingAlgorithm]))

(defn rank
  "Performs a rank transformation on the input data, returning an array
   of ranks.

   Ranks should be 1-based - that is, the smallest value
   returned in an array of ranks should be greater than or equal to one,
   rather than 0. Ranks should in general take integer values, though
   implementations may return averages or other floating point values
   to resolve ties in the input data.

  data - array of data to be ranked - `double[]`

  returns: an array of ranks corresponding to the elements of the input array - `double[]`"
  ([^RankingAlgorithm this data]
    (-> this (.rank data))))

