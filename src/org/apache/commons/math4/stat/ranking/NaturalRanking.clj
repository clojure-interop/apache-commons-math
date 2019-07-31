(ns org.apache.commons.math4.stat.ranking.NaturalRanking
  "Ranking based on the natural ordering on doubles.

  NaNs are treated according to the configured NaNStrategy and ties
  are handled using the selected TiesStrategy.
  Configuration settings are supplied in optional constructor arguments.
  Defaults are NaNStrategy.FAILED and TiesStrategy.AVERAGE,
  respectively. When using TiesStrategy.RANDOM, a
  random generator may be supplied as a
  constructor argument.
  Examples:


  Input data: (20, 17, 30, 42.3, 17, 50, Double.NaN, Double.NEGATIVE_INFINITY, 17)

  NaNStrategyTiesStrategy
  rank(data)

  default (NaNs maximal)
  default (ties averaged)
  (5, 3, 6, 7, 3, 8, 9, 1, 3)

  default (NaNs maximal)
  MINIMUM
  (5, 2, 6, 7, 2, 8, 9, 1, 2)

  MINIMAL
  default (ties averaged)
  (6, 4, 7, 8, 4, 9, 1.5, 1.5, 4)

  REMOVED
  SEQUENTIAL
  (5, 2, 6, 7, 3, 8, 1, 4)

  MINIMAL
  MAXIMUM
  (6, 5, 7, 8, 5, 9, 2, 2, 5)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.ranking NaturalRanking]))

(defn ->natural-ranking
  "Constructor.

  Create a NaturalRanking with the given NaNStrategy and TiesStrategy.

  nan-strategy - NaNStrategy to use - `org.apache.commons.math4.stat.ranking.NaNStrategy`
  ties-strategy - TiesStrategy to use - `org.apache.commons.math4.stat.ranking.TiesStrategy`"
  (^NaturalRanking [^org.apache.commons.math4.stat.ranking.NaNStrategy nan-strategy ^org.apache.commons.math4.stat.ranking.TiesStrategy ties-strategy]
    (new NaturalRanking nan-strategy ties-strategy))
  (^NaturalRanking [^org.apache.commons.math4.stat.ranking.TiesStrategy ties-strategy]
    (new NaturalRanking ties-strategy))
  (^NaturalRanking []
    (new NaturalRanking )))

(def *-default-nan-strategy
  "Static Constant.

  default NaN strategy

  type: org.apache.commons.math4.stat.ranking.NaNStrategy"
  NaturalRanking/DEFAULT_NAN_STRATEGY)

(def *-default-ties-strategy
  "Static Constant.

  default ties strategy

  type: org.apache.commons.math4.stat.ranking.TiesStrategy"
  NaturalRanking/DEFAULT_TIES_STRATEGY)

(defn get-nan-strategy
  "Return the NaNStrategy

  returns: returns the NaNStrategy - `org.apache.commons.math4.stat.ranking.NaNStrategy`"
  (^org.apache.commons.math4.stat.ranking.NaNStrategy [^NaturalRanking this]
    (-> this (.getNanStrategy))))

(defn get-ties-strategy
  "Return the TiesStrategy

  returns: the TiesStrategy - `org.apache.commons.math4.stat.ranking.TiesStrategy`"
  (^org.apache.commons.math4.stat.ranking.TiesStrategy [^NaturalRanking this]
    (-> this (.getTiesStrategy))))

(defn rank
  "Rank data using the natural ordering on Doubles, with
   NaN values handled according to nanStrategy and ties
   resolved using tiesStrategy.

  data - array to be ranked - `double[]`

  returns: array of ranks - `double[]`

  throws: org.apache.commons.math4.exception.NotANumberException - if the selected NaNStrategy is FAILED and a Double.NaN is encountered in the input data"
  ([^NaturalRanking this data]
    (-> this (.rank data))))

