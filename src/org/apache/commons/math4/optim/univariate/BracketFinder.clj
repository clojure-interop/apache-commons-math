(ns org.apache.commons.math4.optim.univariate.BracketFinder
  "Provide an interval that brackets a local optimum of a function.
  This code is based on a Python implementation (from SciPy,
  module optimize.py v0.5)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.univariate BracketFinder]))

(defn ->bracket-finder
  "Constructor.

  Create a bracketing interval finder.

  grow-limit - Expanding factor. - `double`
  max-evaluations - Maximum number of evaluations allowed for finding a bracketing interval. - `int`"
  (^BracketFinder [^Double grow-limit ^Integer max-evaluations]
    (new BracketFinder grow-limit max-evaluations))
  (^BracketFinder []
    (new BracketFinder )))

(defn get-lo
  "returns: the lower bound of the bracket. - `double`"
  (^Double [^BracketFinder this]
    (-> this (.getLo))))

(defn get-evaluations
  "returns: the number of evalutations. - `int`"
  (^Integer [^BracketFinder this]
    (-> this (.getEvaluations))))

(defn get-max-evaluations
  "returns: the number of evalutations. - `int`"
  (^Integer [^BracketFinder this]
    (-> this (.getMaxEvaluations))))

(defn get-hi
  "returns: the higher bound of the bracket. - `double`"
  (^Double [^BracketFinder this]
    (-> this (.getHi))))

(defn get-f-mid
  "Get function value at getMid().

  returns: function value at getMid() - `double`"
  (^Double [^BracketFinder this]
    (-> this (.getFMid))))

(defn get-mid
  "returns: a point in the middle of the bracket. - `double`"
  (^Double [^BracketFinder this]
    (-> this (.getMid))))

(defn get-f-lo
  "Get function value at getLo().

  returns: function value at getLo() - `double`"
  (^Double [^BracketFinder this]
    (-> this (.getFLo))))

(defn get-f-hi
  "Get function value at getHi().

  returns: function value at getHi() - `double`"
  (^Double [^BracketFinder this]
    (-> this (.getFHi))))

(defn search
  "Search new points that bracket a local optimum of the function.

  func - Function whose optimum should be bracketed. - `org.apache.commons.math4.analysis.UnivariateFunction`
  goal - Goal type. - `org.apache.commons.math4.optim.nonlinear.scalar.GoalType`
  x-a - Initial point. - `double`
  x-b - Initial point. - `double`

  throws: org.apache.commons.math4.exception.TooManyEvaluationsException - if the maximum number of evaluations is exceeded."
  ([^BracketFinder this ^org.apache.commons.math4.analysis.UnivariateFunction func ^org.apache.commons.math4.optim.nonlinear.scalar.GoalType goal ^Double x-a ^Double x-b]
    (-> this (.search func goal x-a x-b))))

