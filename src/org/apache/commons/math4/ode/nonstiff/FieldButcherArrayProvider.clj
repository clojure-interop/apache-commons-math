(ns org.apache.commons.math4.ode.nonstiff.FieldButcherArrayProvider
  "This interface represents an integrator  based on Butcher arrays."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ode.nonstiff FieldButcherArrayProvider]))

(defn get-c
  "Get the time steps from Butcher array (without the first zero).

  returns: time steps from Butcher array (without the first zero - `T[]`"
  ([^FieldButcherArrayProvider this]
    (-> this (.getC))))

(defn get-a
  "Get the internal weights from Butcher array (without the first empty row).

  returns: internal weights from Butcher array (without the first empty row) - `T[][]`"
  ([^FieldButcherArrayProvider this]
    (-> this (.getA))))

(defn get-b
  "Get the external weights for the high order method from Butcher array.

  returns: external weights for the high order method from Butcher array - `T[]`"
  ([^FieldButcherArrayProvider this]
    (-> this (.getB))))

