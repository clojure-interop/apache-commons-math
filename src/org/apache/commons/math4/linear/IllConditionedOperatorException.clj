(ns org.apache.commons.math4.linear.IllConditionedOperatorException
  "An exception to be thrown when the condition number of a
  RealLinearOperator is too high."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear IllConditionedOperatorException]))

(defn ->ill-conditioned-operator-exception
  "Constructor.

  Creates a new instance of this class.

  cond - An estimate of the condition number of the offending linear operator. - `double`"
  (^IllConditionedOperatorException [^Double cond]
    (new IllConditionedOperatorException cond)))

