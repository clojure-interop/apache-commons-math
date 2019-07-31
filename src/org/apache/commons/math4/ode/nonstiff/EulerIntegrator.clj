(ns org.apache.commons.math4.ode.nonstiff.EulerIntegrator
  "This class implements a simple Euler integrator for Ordinary
  Differential Equations.

  The Euler algorithm is the simplest one that can be used to
  integrate ordinary differential equations. It is a simple inversion
  of the forward difference expression :
  f'=(f(t+h)-f(t))/h which leads to
  f(t+h)=f(t)+hf'. The interpolation scheme used for
  dense output is the linear scheme already used for integration.

  This algorithm looks cheap because it needs only one function
  evaluation per step. However, as it uses linear estimates, it needs
  very small steps to achieve high accuracy, and small steps lead to
  numerical errors and instabilities.

  This algorithm is almost never used and has been included in
  this package only as a comparison reference for more useful
  integrators."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff EulerIntegrator]))

(defn ->euler-integrator
  "Constructor.

  Simple constructor.
   Build an Euler integrator with the given step.

  step - integration step - `double`"
  (^EulerIntegrator [^Double step]
    (new EulerIntegrator step)))

