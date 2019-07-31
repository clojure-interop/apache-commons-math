(ns org.apache.commons.math4.ode.nonstiff.LutherFieldIntegrator
  "This class implements the Luther sixth order Runge-Kutta
  integrator for Ordinary Differential Equations.


  This method is described in H. A. Luther 1968 paper
  An explicit Sixth-Order Runge-Kutta Formula.


  This method is an explicit Runge-Kutta method, its Butcher-array
  is the following one :


         0   |               0                     0                     0                     0                     0                     0
         1   |               1                     0                     0                     0                     0                     0
        1/2  |              3/8                   1/8                    0                     0                     0                     0
        2/3  |              8/27                  2/27                  8/27                   0                     0                     0
    (7-q)/14 | (  -21    9q)/392    (  -56    8q)/392    (  336 -  48q)/392    (  -63    3q)/392                  0                     0
    (7+q)/14 | (-1155 - 255q)/1960   ( -280 -  40q)/1960   (    0 - 320q)/1960   (   63  363q)/1960   ( 2352  392q)/1960                 0
         1   | (  330  105q)/180    (  120    0q)/180    ( -200  280q)/180    (  126 - 189q)/180    ( -686 - 126q)/180     ( 490 -  70q)/180
             |--------------------------------------------------------------------------------------------------------------------------------------------------
             |              1/20                   0                   16/45                  0                   49/180                 49/180         1/20
  where q = √21"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff LutherFieldIntegrator]))

(defn ->luther-field-integrator
  "Constructor.

  Simple constructor.
   Build a fourth-order Luther integrator with the given step.

  field - field to which the time and state vector elements belong - `org.apache.commons.math4.Field`
  step - integration step - `T`"
  (^LutherFieldIntegrator [^org.apache.commons.math4.Field field step]
    (new LutherFieldIntegrator field step)))

(defn get-c
  "Get the time steps from Butcher array (without the first zero).

  returns: time steps from Butcher array (without the first zero - `T[]`"
  ([^LutherFieldIntegrator this]
    (-> this (.getC))))

(defn get-a
  "Get the internal weights from Butcher array (without the first empty row).

  returns: internal weights from Butcher array (without the first empty row) - `T[][]`"
  ([^LutherFieldIntegrator this]
    (-> this (.getA))))

(defn get-b
  "Get the external weights for the high order method from Butcher array.

  returns: external weights for the high order method from Butcher array - `T[]`"
  ([^LutherFieldIntegrator this]
    (-> this (.getB))))

