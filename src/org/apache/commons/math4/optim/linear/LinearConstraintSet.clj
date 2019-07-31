(ns org.apache.commons.math4.optim.linear.LinearConstraintSet
  "Class that represents a set of linear constraints."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear LinearConstraintSet]))

(defn ->linear-constraint-set
  "Constructor.

  Creates a set containing the given constraints.

  constraints - Constraints. - `org.apache.commons.math4.optim.linear.LinearConstraint`"
  (^LinearConstraintSet [^org.apache.commons.math4.optim.linear.LinearConstraint constraints]
    (new LinearConstraintSet constraints)))

(defn get-constraints
  "Gets the set of linear constraints.

  returns: the constraints. - `java.util.Collection<org.apache.commons.math4.optim.linear.LinearConstraint>`"
  (^java.util.Collection [^LinearConstraintSet this]
    (-> this (.getConstraints))))

