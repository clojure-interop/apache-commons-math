(ns org.apache.commons.math4.ml.neuralnet.sofm.KohonenTrainingTask
  "Trainer for Kohonen's Self-Organizing Map."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.sofm KohonenTrainingTask]))

(defn ->kohonen-training-task
  "Constructor.

  Creates a (sequential) trainer for the given network.

  net - Network to be trained with the SOFM algorithm. - `org.apache.commons.math4.ml.neuralnet.Network`
  features-iterator - Training data iterator. - `java.util.Iterator`
  update-action - SOFM update procedure. - `org.apache.commons.math4.ml.neuralnet.sofm.KohonenUpdateAction`"
  (^KohonenTrainingTask [^org.apache.commons.math4.ml.neuralnet.Network net ^java.util.Iterator features-iterator ^org.apache.commons.math4.ml.neuralnet.sofm.KohonenUpdateAction update-action]
    (new KohonenTrainingTask net features-iterator update-action)))

(defn run
  ""
  ([^KohonenTrainingTask this]
    (-> this (.run))))

