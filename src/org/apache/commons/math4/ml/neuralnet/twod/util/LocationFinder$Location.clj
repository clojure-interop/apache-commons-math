(ns org.apache.commons.math4.ml.neuralnet.twod.util.LocationFinder$Location
  "Container holding a (row, column) pair."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.twod.util LocationFinder$Location]))

(defn ->location
  "Constructor.

  row - Row index. - `int`
  column - Column index. - `int`"
  (^LocationFinder$Location [^Integer row ^Integer column]
    (new LocationFinder$Location row column)))

(defn get-row
  "returns: the row index. - `int`"
  (^Integer [^LocationFinder$Location this]
    (-> this (.getRow))))

(defn get-column
  "returns: the column index. - `int`"
  (^Integer [^LocationFinder$Location this]
    (-> this (.getColumn))))

