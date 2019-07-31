(ns org.apache.commons.math4.optim.linear.LinearConstraint
  "A linear constraint for a linear optimization problem.

  A linear constraint has one of the forms:

    c1x1  ... cnxn = v
    c1x1  ... cnxn <= v
    c1x1  ... cnxn >= v
    l1x1  ... lnxn  lcst =
        r1x1  ... rnxn  rcst
    l1x1  ... lnxn  lcst <=
        r1x1  ... rnxn  rcst
    l1x1  ... lnxn  lcst >=
        r1x1  ... rnxn  rcst

  The ci, li or ri are the coefficients of the constraints, the xi
  are the coordinates of the current point and v is the value of the constraint."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear LinearConstraint]))

(defn ->linear-constraint
  "Constructor.

  Build a constraint involving two linear equations.

   A linear constraint with two linear equation has one of the forms:

     l1x1  ... lnxn  lcst =
         r1x1  ... rnxn  rcst
     l1x1  ... lnxn  lcst <=
         r1x1  ... rnxn  rcst
     l1x1  ... lnxn  lcst >=
         r1x1  ... rnxn  rcst

  lhs-coefficients - The coefficients of the linear expression on the left hand side of the constraint - `double[]`
  lhs-constant - The constant term of the linear expression on the left hand side of the constraint - `double`
  relationship - The type of (in)equality used in the constraint - `org.apache.commons.math4.optim.linear.Relationship`
  rhs-coefficients - The coefficients of the linear expression on the right hand side of the constraint - `double[]`
  rhs-constant - The constant term of the linear expression on the right hand side of the constraint - `double`"
  (^LinearConstraint [lhs-coefficients ^Double lhs-constant ^org.apache.commons.math4.optim.linear.Relationship relationship rhs-coefficients ^Double rhs-constant]
    (new LinearConstraint lhs-coefficients lhs-constant relationship rhs-coefficients rhs-constant))
  (^LinearConstraint [coefficients ^org.apache.commons.math4.optim.linear.Relationship relationship ^Double value]
    (new LinearConstraint coefficients relationship value)))

(defn get-coefficients
  "Gets the coefficients of the constraint (left hand side).

  returns: the coefficients of the constraint (left hand side). - `org.apache.commons.math4.linear.RealVector`"
  (^org.apache.commons.math4.linear.RealVector [^LinearConstraint this]
    (-> this (.getCoefficients))))

(defn get-relationship
  "Gets the relationship between left and right hand sides.

  returns: the relationship between left and right hand sides. - `org.apache.commons.math4.optim.linear.Relationship`"
  (^org.apache.commons.math4.optim.linear.Relationship [^LinearConstraint this]
    (-> this (.getRelationship))))

(defn get-value
  "Gets the value of the constraint (right hand side).

  returns: the value of the constraint (right hand side). - `double`"
  (^Double [^LinearConstraint this]
    (-> this (.getValue))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LinearConstraint this ^java.lang.Object other]
    (-> this (.equals other))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LinearConstraint this]
    (-> this (.hashCode))))

