(ns org.apache.commons.math4.ode.SecondOrderIntegrator
  "This interface represents a second order integrator for
  differential equations.

  The classes which are devoted to solve second order differential
  equations should implement this interface. The problems which can
  be handled should implement the SecondOrderDifferentialEquations interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode SecondOrderIntegrator]))

(defn integrate
  "Integrate the differential equations up to the given time

  equations - differential equations to integrate - `org.apache.commons.math4.ode.SecondOrderDifferentialEquations`
  t-0 - initial time - `double`
  y-0 - initial value of the state vector at t0 - `double[]`
  y-dot-0 - initial value of the first derivative of the state vector at t0 - `double[]`
  t - target time for the integration (can be set to a value smaller thant t0 for backward integration) - `double`
  y - placeholder where to put the state vector at each successful step (and hence at the end of integration), can be the same object as y0 - `double[]`
  y-dot - placeholder where to put the first derivative of the state vector at time t, can be the same object as yDot0 - `double[]`

  throws: org.apache.commons.math4.exception.MathIllegalStateException - if the integrator cannot perform integration"
  ([^SecondOrderIntegrator this ^org.apache.commons.math4.ode.SecondOrderDifferentialEquations equations ^Double t-0 y-0 y-dot-0 ^Double t y y-dot]
    (-> this (.integrate equations t-0 y-0 y-dot-0 t y y-dot))))

