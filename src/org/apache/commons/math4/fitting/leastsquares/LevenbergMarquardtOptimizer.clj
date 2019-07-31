(ns org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer
  "This class solves a least-squares problem using the Levenberg-Marquardt
  algorithm.

  This implementation should work even for over-determined systems
  (i.e. systems having more point than equations). Over-determined systems
  are solved by ignoring the point which have the smallest impact according
  to their jacobian column norm. Only the rank of the matrix and some loop bounds
  are changed to implement this.

  The resolution engine is a simple translation of the MINPACK lmder routine with minor
  changes. The changes include the over-determined resolution, the use of
  inherited convergence checker and the Q.R. decomposition which has been
  rewritten following the algorithm described in the
  P. Lascaux and R. Theodor book Analyse numérique matricielle
  appliquée à l'art de l'ingénieur, Masson 1986.
  The authors of the original fortran version are:

  Argonne National Laboratory. MINPACK project. March 1980
  Burton S. Garbow
  Kenneth E. Hillstrom
  Jorge J. More

  The redistribution policy for MINPACK is available here, for convenience, it
  is reproduced below.



     Minpack Copyright Notice (1999) University of Chicago.
     All rights reserved


  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions
  are met:

   Redistributions of source code must retain the above copyright
       notice, this list of conditions and the following disclaimer.
  Redistributions in binary form must reproduce the above
      copyright notice, this list of conditions and the following
      disclaimer in the documentation and/or other materials provided
      with the distribution.
  The end-user documentation included with the redistribution, if any,
      must include the following acknowledgment:
      This product includes software developed by the University of
            Chicago, as Operator of Argonne National Laboratory.
      Alternately, this acknowledgment may appear in the software itself,
      if and wherever such third-party acknowledgments normally appear.
  WARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"
      WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE
      UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND
      THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR
      IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES
      OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE
      OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY
      OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR
      USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF
      THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)
      DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION
      UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL
      BE CORRECTED.
  LIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT
      HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF
      ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,
      INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF
      ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF
      PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER
      SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT
      (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,
      EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE
      POSSIBILITY OF SUCH LOSS OR DAMAGES."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.fitting.leastsquares LevenbergMarquardtOptimizer]))

(defn ->levenberg-marquardt-optimizer
  "Constructor.

  Construct an instance with all parameters specified.

  initial-step-bound-factor - initial step bound factor - `double`
  cost-relative-tolerance - cost relative tolerance - `double`
  par-relative-tolerance - parameters relative tolerance - `double`
  ortho-tolerance - orthogonality tolerance - `double`
  qr-ranking-threshold - threshold in the QR decomposition. Columns with a 2 norm less than this threshold are considered to be all 0s. - `double`"
  (^LevenbergMarquardtOptimizer [^Double initial-step-bound-factor ^Double cost-relative-tolerance ^Double par-relative-tolerance ^Double ortho-tolerance ^Double qr-ranking-threshold]
    (new LevenbergMarquardtOptimizer initial-step-bound-factor cost-relative-tolerance par-relative-tolerance ortho-tolerance qr-ranking-threshold))
  (^LevenbergMarquardtOptimizer []
    (new LevenbergMarquardtOptimizer )))

(defn with-initial-step-bound-factor
  "new-initial-step-bound-factor - Positive input variable used in determining the initial step bound. This bound is set to the product of initialStepBoundFactor and the euclidean norm of diag * x if non-zero, or else to newInitialStepBoundFactor itself. In most cases factor should lie in the interval (0.1, 100.0). 100 is a generally recommended value. of the matrix is reduced. - `double`

  returns: a new instance. - `org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer`"
  (^org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer [^LevenbergMarquardtOptimizer this ^Double new-initial-step-bound-factor]
    (-> this (.withInitialStepBoundFactor new-initial-step-bound-factor))))

(defn get-ortho-tolerance
  "Gets the value of a tuning parameter.

  returns: the parameter's value. - `double`"
  (^Double [^LevenbergMarquardtOptimizer this]
    (-> this (.getOrthoTolerance))))

(defn with-cost-relative-tolerance
  "new-cost-relative-tolerance - Desired relative error in the sum of squares. - `double`

  returns: a new instance. - `org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer`"
  (^org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer [^LevenbergMarquardtOptimizer this ^Double new-cost-relative-tolerance]
    (-> this (.withCostRelativeTolerance new-cost-relative-tolerance))))

(defn with-ortho-tolerance
  "Modifies the given parameter.

  new-ortho-tolerance - Desired max cosine on the orthogonality between the function vector and the columns of the Jacobian. - `double`

  returns: a new instance. - `org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer`"
  (^org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer [^LevenbergMarquardtOptimizer this ^Double new-ortho-tolerance]
    (-> this (.withOrthoTolerance new-ortho-tolerance))))

(defn get-initial-step-bound-factor
  "Gets the value of a tuning parameter.

  returns: the parameter's value. - `double`"
  (^Double [^LevenbergMarquardtOptimizer this]
    (-> this (.getInitialStepBoundFactor))))

(defn get-ranking-threshold
  "Gets the value of a tuning parameter.

  returns: the parameter's value. - `double`"
  (^Double [^LevenbergMarquardtOptimizer this]
    (-> this (.getRankingThreshold))))

(defn optimize
  "Solve the non-linear least squares problem.

  problem - the problem definition, including model function and convergence criteria. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem`

  returns: The optimum. - `org.apache.commons.math4.fitting.leastsquares.LeastSquaresOptimizer$Optimum`"
  (^org.apache.commons.math4.fitting.leastsquares.LeastSquaresOptimizer$Optimum [^LevenbergMarquardtOptimizer this ^org.apache.commons.math4.fitting.leastsquares.LeastSquaresProblem problem]
    (-> this (.optimize problem))))

(defn with-ranking-threshold
  "new-qr-ranking-threshold - Desired threshold for QR ranking. If the squared norm of a column vector is smaller or equal to this threshold during QR decomposition, it is considered to be a zero vector and hence the rank of the matrix is reduced. - `double`

  returns: a new instance. - `org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer`"
  (^org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer [^LevenbergMarquardtOptimizer this ^Double new-qr-ranking-threshold]
    (-> this (.withRankingThreshold new-qr-ranking-threshold))))

(defn get-cost-relative-tolerance
  "Gets the value of a tuning parameter.

  returns: the parameter's value. - `double`"
  (^Double [^LevenbergMarquardtOptimizer this]
    (-> this (.getCostRelativeTolerance))))

(defn get-parameter-relative-tolerance
  "Gets the value of a tuning parameter.

  returns: the parameter's value. - `double`"
  (^Double [^LevenbergMarquardtOptimizer this]
    (-> this (.getParameterRelativeTolerance))))

(defn with-parameter-relative-tolerance
  "new-par-relative-tolerance - Desired relative error in the approximate solution parameters. - `double`

  returns: a new instance. - `org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer`"
  (^org.apache.commons.math4.fitting.leastsquares.LevenbergMarquardtOptimizer [^LevenbergMarquardtOptimizer this ^Double new-par-relative-tolerance]
    (-> this (.withParameterRelativeTolerance new-par-relative-tolerance))))

