(ns org.apache.commons.math4.optim.linear.LinearObjectiveFunction
  "An objective function for a linear optimization problem.

  A linear objective function has one the form:


  c1x1  ... cnxn  d
  The ci and d are the coefficients of the equation,
  the xi are the coordinates of the current point."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear LinearObjectiveFunction]))

(defn ->linear-objective-function
  "Constructor.

  coefficients - Coefficients for the linear equation being optimized. - `double[]`
  constant-term - Constant term of the linear equation. - `double`"
  (^LinearObjectiveFunction [coefficients ^Double constant-term]
    (new LinearObjectiveFunction coefficients constant-term)))

(defn get-coefficients
  "Gets the coefficients of the linear equation being optimized.

  returns: coefficients of the linear equation being optimized. - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^LinearObjectiveFunction this]
    (-> this (.getCoefficients))))

(defn get-constant-term
  "Gets the constant of the linear equation being optimized.

  returns: constant of the linear equation being optimized. - `double`"
  (^Double [^LinearObjectiveFunction this]
    (-> this (.getConstantTerm))))

(defn value
  "Computes the value of the linear equation at the current point.

  point - Point at which linear equation must be evaluated. - `double[]`

  returns: the value of the linear equation at the current point. - `double`"
  (^Double [^LinearObjectiveFunction this point]
    (-> this (.value point))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LinearObjectiveFunction this ^java.lang.Object other]
    (-> this (.equals other))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LinearObjectiveFunction this]
    (-> this (.hashCode))))

