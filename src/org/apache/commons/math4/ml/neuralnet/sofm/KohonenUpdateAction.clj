(ns org.apache.commons.math4.ml.neuralnet.sofm.KohonenUpdateAction
  "Update formula for
  Kohonen's Self-Organizing Map.

  The update method modifies the
  features w of the \"winning\" neuron and its neighbours
  according to the following rule:

   wnew = wold  α e(-d / σ) * (sample - wold)

  where

   α is the current learning rate,
   σ is the current neighbourhood size, and
   d is the number of links to traverse in order to reach
    the neuron from the winning neuron.


  This class is thread-safe as long as the arguments passed to the
  constructor are instances of thread-safe
  classes.

  Each call to the update method
  will increment the internal counter used to compute the current
  values for

   the learning rate, and
   the neighbourhood size.

  Consequently, the function instances that compute those values (passed
  to the constructor of this class) must take into account whether this
  class's instance will be shared by multiple threads, as this will impact
  the training process."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet.sofm KohonenUpdateAction]))

(defn ->kohonen-update-action
  "Constructor.

  distance - Distance function. - `org.apache.commons.math4.ml.distance.DistanceMeasure`
  learning-factor - Learning factor update function. - `org.apache.commons.math4.ml.neuralnet.sofm.LearningFactorFunction`
  neighbourhood-size - Neighbourhood size update function. - `org.apache.commons.math4.ml.neuralnet.sofm.NeighbourhoodSizeFunction`"
  (^KohonenUpdateAction [^org.apache.commons.math4.ml.distance.DistanceMeasure distance ^org.apache.commons.math4.ml.neuralnet.sofm.LearningFactorFunction learning-factor ^org.apache.commons.math4.ml.neuralnet.sofm.NeighbourhoodSizeFunction neighbourhood-size]
    (new KohonenUpdateAction distance learning-factor neighbourhood-size)))

(defn update
  "Updates the network in response to the sample features.

  net - Network. - `org.apache.commons.math4.ml.neuralnet.Network`
  features - Training data. - `double[]`"
  ([^KohonenUpdateAction this ^org.apache.commons.math4.ml.neuralnet.Network net features]
    (-> this (.update net features))))

(defn get-number-of-calls
  "Retrieves the number of calls to the update
   method.

  returns: the current number of calls. - `long`"
  (^Long [^KohonenUpdateAction this]
    (-> this (.getNumberOfCalls))))

