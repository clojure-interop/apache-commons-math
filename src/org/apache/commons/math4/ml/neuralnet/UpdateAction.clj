(ns org.apache.commons.math4.ml.neuralnet.UpdateAction
  "Describes how to update the network in response to a training
  sample."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet UpdateAction]))

(defn update
  "Updates the network in response to the sample features.

  net - Network. - `org.apache.commons.math4.ml.neuralnet.Network`
  features - Training data. - `double[]`"
  ([^UpdateAction this ^org.apache.commons.math4.ml.neuralnet.Network net features]
    (-> this (.update net features))))

