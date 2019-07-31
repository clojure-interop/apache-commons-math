(ns org.apache.commons.math4.optim.univariate.SearchInterval
  "Search interval and (optional) start value.

  Immutable class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.univariate SearchInterval]))

(defn ->search-interval
  "Constructor.

  lo - Lower bound. - `double`
  hi - Upper bound. - `double`
  init - Start value. - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if lo >= hi."
  (^SearchInterval [^Double lo ^Double hi ^Double init]
    (new SearchInterval lo hi init))
  (^SearchInterval [^Double lo ^Double hi]
    (new SearchInterval lo hi)))

(defn get-min
  "Gets the lower bound.

  returns: the lower bound. - `double`"
  (^Double [^SearchInterval this]
    (-> this (.getMin))))

(defn get-max
  "Gets the upper bound.

  returns: the upper bound. - `double`"
  (^Double [^SearchInterval this]
    (-> this (.getMax))))

(defn get-start-value
  "Gets the start value.

  returns: the start value. - `double`"
  (^Double [^SearchInterval this]
    (-> this (.getStartValue))))

