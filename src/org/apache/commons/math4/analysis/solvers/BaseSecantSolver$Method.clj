(ns org.apache.commons.math4.analysis.solvers.BaseSecantSolver$Method
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.solvers BaseSecantSolver$Method]))

(def REGULA_FALSI
  "Enum Constant.

  The Regula Falsi or
   False Position method.

  type: org.apache.commons.math4.analysis.solvers.BaseSecantSolver$Method"
  BaseSecantSolver$Method/REGULA_FALSI)

(def ILLINOIS
  "Enum Constant.

  The Illinois method.

  type: org.apache.commons.math4.analysis.solvers.BaseSecantSolver$Method"
  BaseSecantSolver$Method/ILLINOIS)

(def PEGASUS
  "Enum Constant.

  The Pegasus method.

  type: org.apache.commons.math4.analysis.solvers.BaseSecantSolver$Method"
  BaseSecantSolver$Method/PEGASUS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (BaseSecantSolver.Method c : BaseSecantSolver.Method.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.analysis.solvers.BaseSecantSolver$Method[]`"
  ([]
    (BaseSecantSolver$Method/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.analysis.solvers.BaseSecantSolver$Method`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.analysis.solvers.BaseSecantSolver$Method [^java.lang.String name]
    (BaseSecantSolver$Method/valueOf name)))

