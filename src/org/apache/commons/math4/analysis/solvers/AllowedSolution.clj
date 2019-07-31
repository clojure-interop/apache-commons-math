(ns org.apache.commons.math4.analysis.solvers.AllowedSolution
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers AllowedSolution]))

(def ANY_SIDE
  "Enum Constant.

  There are no additional side restriction on the solutions for
   root-finding. That is, both under-approximations and over-approximations
   are allowed. So, if a function f(x) has a root at x = x0, then the
   root-finding result s may be smaller than x0, equal to x0, or greater
   than x0.

  type: org.apache.commons.math4.analysis.solvers.AllowedSolution"
  AllowedSolution/ANY_SIDE)

(def LEFT_SIDE
  "Enum Constant.

  Only solutions that are less than or equal to the actual root are
   acceptable as solutions for root-finding. In other words,
   over-approximations are not allowed. So, if a function f(x) has a root
   at x = x0, then the root-finding result s must satisfy s <= x0.

  type: org.apache.commons.math4.analysis.solvers.AllowedSolution"
  AllowedSolution/LEFT_SIDE)

(def RIGHT_SIDE
  "Enum Constant.

  Only solutions that are greater than or equal to the actual root are
   acceptable as solutions for root-finding. In other words,
   under-approximations are not allowed. So, if a function f(x) has a root
   at x = x0, then the root-finding result s must satisfy s >= x0.

  type: org.apache.commons.math4.analysis.solvers.AllowedSolution"
  AllowedSolution/RIGHT_SIDE)

(def BELOW_SIDE
  "Enum Constant.

  Only solutions for which values are less than or equal to zero are
   acceptable as solutions for root-finding. So, if a function f(x) has
   a root at x = x0, then the root-finding result s must satisfy f(s) <= 0.

  type: org.apache.commons.math4.analysis.solvers.AllowedSolution"
  AllowedSolution/BELOW_SIDE)

(def ABOVE_SIDE
  "Enum Constant.

  Only solutions for which values are greater than or equal to zero are
   acceptable as solutions for root-finding. So, if a function f(x) has
   a root at x = x0, then the root-finding result s must satisfy f(s) >= 0.

  type: org.apache.commons.math4.analysis.solvers.AllowedSolution"
  AllowedSolution/ABOVE_SIDE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AllowedSolution c : AllowedSolution.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.analysis.solvers.AllowedSolution[]`"
  ([]
    (AllowedSolution/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.analysis.solvers.AllowedSolution`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.analysis.solvers.AllowedSolution [^java.lang.String name]
    (AllowedSolution/valueOf name)))

