(ns org.apache.commons.math4.ode.JacobianMatrices
  "This class defines a set of secondary equations to
  compute the Jacobian matrices with respect to the initial state vector and, if
  any, to some parameters of the primary ODE set.

  It is intended to be packed into an ExpandableStatefulODE
  in conjunction with a primary set of ODE, which may be:

  a FirstOrderDifferentialEquations
  a MainStateJacobianProvider

  In order to compute Jacobian matrices with respect to some parameters of the
  primary ODE set, the following parameter Jacobian providers may be set:

  a ParameterJacobianProvider
  a ParameterizedODE"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode JacobianMatrices]))

(defn ->jacobian-matrices
  "Constructor.

  Simple constructor for a secondary equations set computing Jacobian matrices.

   Parameters must belong to the supported ones given by Parameterizable.getParametersNames(), so the primary set of differential
   equations must be Parameterizable.

   Note that each selection clears the previous selected parameters.

  fode - the primary first order differential equations set to extend - `org.apache.commons.math4.ode.FirstOrderDifferentialEquations`
  h-y - step used for finite difference computation with respect to state vector - `double[]`
  parameters - parameters to consider for Jacobian matrices processing (may be null if parameters Jacobians is not desired) - `java.lang.String`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if there is a dimension mismatch between the steps array hY and the equation dimension"
  (^JacobianMatrices [^org.apache.commons.math4.ode.FirstOrderDifferentialEquations fode h-y ^java.lang.String parameters]
    (new JacobianMatrices fode h-y parameters))
  (^JacobianMatrices [^org.apache.commons.math4.ode.MainStateJacobianProvider jode ^java.lang.String parameters]
    (new JacobianMatrices jode parameters)))

(defn register-variational-equations
  "Register the variational equations for the Jacobians matrices to the expandable set.

  expandable - expandable set into which variational equations should be registered - `org.apache.commons.math4.ode.ExpandableStatefulODE`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the dimension of the partial state does not match the selected equations set dimension"
  ([^JacobianMatrices this ^org.apache.commons.math4.ode.ExpandableStatefulODE expandable]
    (-> this (.registerVariationalEquations expandable))))

(defn add-parameter-jacobian-provider
  "Add a parameter Jacobian provider.

  provider - the parameter Jacobian provider to compute exactly the parameter Jacobian matrix - `org.apache.commons.math4.ode.ParameterJacobianProvider`"
  ([^JacobianMatrices this ^org.apache.commons.math4.ode.ParameterJacobianProvider provider]
    (-> this (.addParameterJacobianProvider provider))))

(defn set-parameterized-ode
  "Set a parameter Jacobian provider.

  parameterized-ode - the parameterized ODE to compute the parameter Jacobian matrix using finite differences - `org.apache.commons.math4.ode.ParameterizedODE`"
  ([^JacobianMatrices this ^org.apache.commons.math4.ode.ParameterizedODE parameterized-ode]
    (-> this (.setParameterizedODE parameterized-ode))))

(defn set-parameter-step
  "Set the step associated to a parameter in order to compute by finite
    difference the Jacobian matrix.

   Needed if and only if the primary ODE set is a ParameterizedODE.


   Given a non zero parameter value pval for the parameter, a reasonable value
   for such a step is pval * FastMath.sqrt(Precision.EPSILON).


   A zero value for such a step doesn't enable to compute the parameter Jacobian matrix.

  parameter - parameter to consider for Jacobian processing - `java.lang.String`
  h-p - step for Jacobian finite difference computation w.r.t. the specified parameter - `double`

  throws: org.apache.commons.math4.ode.UnknownParameterException - if the parameter is not supported"
  ([^JacobianMatrices this ^java.lang.String parameter ^Double h-p]
    (-> this (.setParameterStep parameter h-p))))

(defn set-initial-main-state-jacobian
  "Set the initial value of the Jacobian matrix with respect to state.

   If this method is not called, the initial value of the Jacobian
   matrix with respect to state is set to identity.

  d-yd-y-0 - initial Jacobian matrix w.r.t. state - `double[][]`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if matrix dimensions are incorrect"
  ([^JacobianMatrices this d-yd-y-0]
    (-> this (.setInitialMainStateJacobian d-yd-y-0))))

(defn set-initial-parameter-jacobian
  "Set the initial value of a column of the Jacobian matrix with respect to one parameter.

   If this method is not called for some parameter, the initial value of
   the column of the Jacobian matrix with respect to this parameter is set to zero.

  p-name - parameter name - `java.lang.String`
  d-yd-p - initial Jacobian column vector with respect to the parameter - `double[]`

  throws: org.apache.commons.math4.ode.UnknownParameterException - if a parameter is not supported"
  ([^JacobianMatrices this ^java.lang.String p-name d-yd-p]
    (-> this (.setInitialParameterJacobian p-name d-yd-p))))

(defn get-current-main-set-jacobian
  "Get the current value of the Jacobian matrix with respect to state.

  d-yd-y-0 - current Jacobian matrix with respect to state. - `double[][]`"
  ([^JacobianMatrices this d-yd-y-0]
    (-> this (.getCurrentMainSetJacobian d-yd-y-0))))

(defn get-current-parameter-jacobian
  "Get the current value of the Jacobian matrix with respect to one parameter.

  p-name - name of the parameter for the computed Jacobian matrix - `java.lang.String`
  d-yd-p - current Jacobian matrix with respect to the named parameter - `double[]`"
  ([^JacobianMatrices this ^java.lang.String p-name d-yd-p]
    (-> this (.getCurrentParameterJacobian p-name d-yd-p))))

