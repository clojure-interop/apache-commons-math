(ns org.apache.commons.math4.optim.linear.NonNegativeConstraint
  "A constraint for a linear optimization problem indicating whether all
  variables must be restricted to non-negative values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim.linear NonNegativeConstraint]))

(defn ->non-negative-constraint
  "Constructor.

  restricted - If true, all the variables must be positive. - `boolean`"
  (^NonNegativeConstraint [^Boolean restricted]
    (new NonNegativeConstraint restricted)))

(defn restricted-to-non-negative?
  "Indicates whether all the variables must be restricted to non-negative
   values.

  returns: true if all the variables must be positive. - `boolean`"
  (^Boolean [^NonNegativeConstraint this]
    (-> this (.isRestrictedToNonNegative))))

