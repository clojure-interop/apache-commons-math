(ns org.apache.commons.math4.util.CombinatoricsUtils$FactorialLog
  "Class for computing the natural logarithm of the factorial of n.
  It allows to allocate a cache of precomputed values.
  In case of cache miss, computation is preformed by a call to
  Gamma.logGamma(double)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util CombinatoricsUtils$FactorialLog]))

(defn *create
  "Creates an instance with no precomputed values.

  returns: instance with no precomputed values - `org.apache.commons.math4.util.CombinatoricsUtils$FactorialLog`"
  (^org.apache.commons.math4.util.CombinatoricsUtils$FactorialLog []
    (CombinatoricsUtils$FactorialLog/create )))

(defn with-cache
  "Creates an instance with the specified cache size.

  cache-size - Number of precomputed values of the function. - `int`

  returns: a new instance where cacheSize values have been
   precomputed. - `org.apache.commons.math4.util.CombinatoricsUtils$FactorialLog`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n < 0."
  (^org.apache.commons.math4.util.CombinatoricsUtils$FactorialLog [^CombinatoricsUtils$FactorialLog this ^Integer cache-size]
    (-> this (.withCache cache-size))))

(defn value
  "Computes log(n!).

  n - Argument. - `int`

  returns: log(n!). - `double`

  throws: org.apache.commons.math4.exception.NotPositiveException - if n < 0."
  (^Double [^CombinatoricsUtils$FactorialLog this ^Integer n]
    (-> this (.value n))))

