(ns org.apache.commons.math4.optim.OptimizationData
  "Marker interface.
  Implementations will provide functionality (optional or required) needed
  by the optimizers, and those will need to check the actual type of the
  arguments and perform the appropriate cast in order to access the data
  they need."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.optim OptimizationData]))

