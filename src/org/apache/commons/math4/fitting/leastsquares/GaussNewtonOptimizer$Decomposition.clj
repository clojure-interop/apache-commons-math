(ns org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares GaussNewtonOptimizer$Decomposition]))

(def LU
  "Enum Constant.

  Solve by forming the normal equations (JTJx=JTr) and
   using the LUDecomposition.

    Theoretically this method takes mn2/2 operations to compute the
   normal matrix and n3/3 operations (m > n) to solve the system using
   the LU decomposition.

  type: org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition"
  GaussNewtonOptimizer$Decomposition/LU)

(def QR
  "Enum Constant.

  Solve the linear least squares problem (Jx=r) using the QRDecomposition.

    Theoretically this method takes mn2 - n3/3 operations
   (m > n) and has better numerical accuracy than any method that forms the normal
   equations.

  type: org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition"
  GaussNewtonOptimizer$Decomposition/QR)

(def CHOLESKY
  "Enum Constant.

  Solve by forming the normal equations (JTJx=JTr) and
   using the CholeskyDecomposition.

    Theoretically this method takes mn2/2 operations to compute the
   normal matrix and n3/6 operations (m > n) to solve the system using
   the Cholesky decomposition.

  type: org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition"
  GaussNewtonOptimizer$Decomposition/CHOLESKY)

(def SVD
  "Enum Constant.

  Solve the linear least squares problem using the SingularValueDecomposition.

    This method is slower, but can provide a solution for rank deficient and
   nearly singular systems.

  type: org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition"
  GaussNewtonOptimizer$Decomposition/SVD)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GaussNewtonOptimizer.Decomposition c : GaussNewtonOptimizer.Decomposition.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition[]`"
  ([]
    (GaussNewtonOptimizer$Decomposition/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.fitting.leastsquares.GaussNewtonOptimizer$Decomposition [^java.lang.String name]
    (GaussNewtonOptimizer$Decomposition/valueOf name)))

