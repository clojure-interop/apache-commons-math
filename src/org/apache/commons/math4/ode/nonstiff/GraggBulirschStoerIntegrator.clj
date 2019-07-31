(ns org.apache.commons.math4.ode.nonstiff.GraggBulirschStoerIntegrator
  "This class implements a Gragg-Bulirsch-Stoer integrator for
  Ordinary Differential Equations.

  The Gragg-Bulirsch-Stoer algorithm is one of the most efficient
  ones currently available for smooth problems. It uses Richardson
  extrapolation to estimate what would be the solution if the step
  size could be decreased down to zero.


  This method changes both the step size and the order during
  integration, in order to minimize computation cost. It is
  particularly well suited when a very high precision is needed. The
  limit where this method becomes more efficient than high-order
  embedded Runge-Kutta methods like Dormand-Prince 8(5,3) depends on the problem. Results given in the
  Hairer, Norsett and Wanner book show for example that this limit
  occurs for accuracy around 1e-6 when integrating Saltzam-Lorenz
  equations (the authors note this problem is extremely sensitive
  to the errors in the first integration steps), and around 1e-11
  for a two dimensional celestial mechanics problems with seven
  bodies (pleiades problem, involving quasi-collisions for which
  automatic step size control is essential).



  This implementation is basically a reimplementation in Java of the
  odex
  fortran code by E. Hairer and G. Wanner. The redistribution policy
  for this code is available here, for
  convenience, it is reproduced below.



  Copyright (c) 2004, Ernst Hairer

  Redistribution and use in source and binary forms, with or
  without modification, are permitted provided that the following
  conditions are met:

   Redistributions of source code must retain the above copyright
       notice, this list of conditions and the following disclaimer.
   Redistributions in binary form must reproduce the above copyright
       notice, this list of conditions and the following disclaimer in the
       documentation and/or other materials provided with the distribution.


  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
  CONTRIBUTORS \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
  BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
  FOR A  PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE REGENTS OR
  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff GraggBulirschStoerIntegrator]))

(defn ->gragg-bulirsch-stoer-integrator
  "Constructor.

  Simple constructor.
   Build a Gragg-Bulirsch-Stoer integrator with the given step
   bounds. All tuning parameters are set to their default
   values. The default step handler does nothing.

  min-step - minimal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  max-step - maximal step (sign is irrelevant, regardless of integration direction, forward or backward), the last step can be smaller than this - `double`
  scal-absolute-tolerance - allowed absolute error - `double`
  scal-relative-tolerance - allowed relative error - `double`"
  (^GraggBulirschStoerIntegrator [^Double min-step ^Double max-step ^Double scal-absolute-tolerance ^Double scal-relative-tolerance]
    (new GraggBulirschStoerIntegrator min-step max-step scal-absolute-tolerance scal-relative-tolerance)))

(defn set-stability-check
  "Set the stability check controls.
   The stability check is performed on the first few iterations of
   the extrapolation scheme. If this test fails, the step is rejected
   and the stepsize is reduced.
   By default, the test is performed, at most during two
   iterations at each step, and at most once for each of these
   iterations. The default stepsize reduction factor is 0.5.

  perform-stability-check - if true, stability check will be performed, if false, the check will be skipped - `boolean`
  max-num-iter - maximal number of iterations for which checks are performed (the number of iterations is reset to default if negative or null) - `int`
  max-num-checks - maximal number of checks for each iteration (the number of checks is reset to default if negative or null) - `int`
  stepsize-reduction-factor - stepsize reduction factor in case of failure (the factor is reset to default if lower than 0.0001 or greater than 0.9999) - `double`"
  ([^GraggBulirschStoerIntegrator this ^Boolean perform-stability-check ^Integer max-num-iter ^Integer max-num-checks ^Double stepsize-reduction-factor]
    (-> this (.setStabilityCheck perform-stability-check max-num-iter max-num-checks stepsize-reduction-factor))))

(defn set-control-factors
  "Set the step size control factors.

   The new step size hNew is computed from the old one h by:


   hNew = h * stepControl2 / (err/stepControl1)^(1/(2k+1))
   where err is the scaled error and k the iteration number of the
   extrapolation scheme (counting from 0). The default values are
   0.65 for stepControl1 and 0.94 for stepControl2.
   The step size is subject to the restriction:


   stepControl3^(1/(2k+1))/stepControl4 <= hNew/h <= 1/stepControl3^(1/(2k+1))
   The default values are 0.02 for stepControl3 and 4.0 for
   stepControl4.

  control-1 - first stepsize control factor (the factor is reset to default if lower than 0.0001 or greater than 0.9999) - `double`
  control-2 - second stepsize control factor (the factor is reset to default if lower than 0.0001 or greater than 0.9999) - `double`
  control-3 - third stepsize control factor (the factor is reset to default if lower than 0.0001 or greater than 0.9999) - `double`
  control-4 - fourth stepsize control factor (the factor is reset to default if lower than 1.0001 or greater than 999.9) - `double`"
  ([^GraggBulirschStoerIntegrator this ^Double control-1 ^Double control-2 ^Double control-3 ^Double control-4]
    (-> this (.setControlFactors control-1 control-2 control-3 control-4))))

(defn set-order-control
  "Set the order control parameters.
   The Gragg-Bulirsch-Stoer method changes both the step size and
   the order during integration, in order to minimize computation
   cost. Each extrapolation step increases the order by 2, so the
   maximal order that will be used is always even, it is twice the
   maximal number of columns in the extrapolation table.


   order is decreased if w(k-1) <= w(k)   * orderControl1
   order is increased if w(k)   <= w(k-1) * orderControl2
   where w is the table of work per unit step for each order
   (number of function calls divided by the step length), and k is
   the current order.
   The default maximal order after construction is 18 (i.e. the
   maximal number of columns is 9). The default values are 0.8 for
   orderControl1 and 0.9 for orderControl2.

  maximal-order - maximal order in the extrapolation table (the maximal order is reset to default if order <= 6 or odd) - `int`
  control-1 - first order control factor (the factor is reset to default if lower than 0.0001 or greater than 0.9999) - `double`
  control-2 - second order control factor (the factor is reset to default if lower than 0.0001 or greater than 0.9999) - `double`"
  ([^GraggBulirschStoerIntegrator this ^Integer maximal-order ^Double control-1 ^Double control-2]
    (-> this (.setOrderControl maximal-order control-1 control-2))))

(defn add-step-handler
  "Add a step handler to this integrator.
   The handler will be called by the integrator for each accepted
   step.

  handler - handler for the accepted steps - `org.apache.commons.math4.ode.sampling.StepHandler`"
  ([^GraggBulirschStoerIntegrator this ^org.apache.commons.math4.ode.sampling.StepHandler handler]
    (-> this (.addStepHandler handler))))

(defn add-event-handler
  "Add an event handler to the integrator.

  function - event handler - `org.apache.commons.math4.ode.events.EventHandler`
  max-check-interval - maximal time interval between switching function checks (this interval prevents missing sign changes in case the integration steps becomes very large) - `double`
  convergence - convergence threshold in the event time search - `double`
  max-iteration-count - upper limit of the iteration count in the event time search - `int`
  solver - The root-finding algorithm to use to detect the state events. - `org.apache.commons.math4.analysis.solvers.UnivariateSolver`"
  ([^GraggBulirschStoerIntegrator this ^org.apache.commons.math4.ode.events.EventHandler function ^Double max-check-interval ^Double convergence ^Integer max-iteration-count ^org.apache.commons.math4.analysis.solvers.UnivariateSolver solver]
    (-> this (.addEventHandler function max-check-interval convergence max-iteration-count solver))))

(defn set-interpolation-control
  "Set the interpolation order control parameter.
   The interpolation order for dense output is 2k - mudif  1. The
   default value for mudif is 4 and the interpolation error is used
   in stepsize control by default.

  use-interpolation-error-for-control - if true, interpolation error is used for stepsize control - `boolean`
  mudif-control-parameter - interpolation order control parameter (the parameter is reset to default if <= 0 or >= 7) - `int`"
  ([^GraggBulirschStoerIntegrator this ^Boolean use-interpolation-error-for-control ^Integer mudif-control-parameter]
    (-> this (.setInterpolationControl use-interpolation-error-for-control mudif-control-parameter))))

(defn integrate
  "Integrate a set of differential equations up to the given time.
   This method solves an Initial Value Problem (IVP).
   The set of differential equations is composed of a main set, which
   can be extended by some sets of secondary equations. The set of
   equations must be already set up with initial time and partial states.
   At integration completion, the final time and partial states will be
   available in the same object.
   Since this method stores some internal state variables made
   available in its public interface during integration (AbstractIntegrator.getCurrentSignedStepsize()), it is not thread-safe.

  equations - complete set of differential equations to integrate - `org.apache.commons.math4.ode.ExpandableStatefulODE`
  t - target time for the integration (can be set to a value smaller than t0 for backward integration) - `double`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if integration step is too small"
  ([^GraggBulirschStoerIntegrator this ^org.apache.commons.math4.ode.ExpandableStatefulODE equations ^Double t]
    (-> this (.integrate equations t))))

