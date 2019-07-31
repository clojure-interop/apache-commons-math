(ns org.apache.commons.math4.ml.neuralnet.FeatureInitializerFactory
  "Creates functions that will select the initial values of a neuron's
  features."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.neuralnet FeatureInitializerFactory]))

(defn *uniform
  "Uniform sampling of the given range.

  rng - Random number generator used to draw samples from a uniform distribution. - `org.apache.commons.rng.UniformRandomProvider`
  min - Lower bound of the range. - `double`
  max - Upper bound of the range. - `double`

  returns: an initializer such that the features will be initialized with
   values within the given range. - `org.apache.commons.math4.ml.neuralnet.FeatureInitializer`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if min >= max."
  (^org.apache.commons.math4.ml.neuralnet.FeatureInitializer [^org.apache.commons.rng.UniformRandomProvider rng ^Double min ^Double max]
    (FeatureInitializerFactory/uniform rng min max))
  (^org.apache.commons.math4.ml.neuralnet.FeatureInitializer [^Double min ^Double max]
    (FeatureInitializerFactory/uniform min max)))

(defn *function
  "Creates an initializer from a univariate function f(x).
   The argument x is set to init at the first call
   and will be incremented at each call.

  f - Function. - `org.apache.commons.math4.analysis.UnivariateFunction`
  init - Initial value. - `double`
  inc - Increment - `double`

  returns: the initializer. - `org.apache.commons.math4.ml.neuralnet.FeatureInitializer`"
  (^org.apache.commons.math4.ml.neuralnet.FeatureInitializer [^org.apache.commons.math4.analysis.UnivariateFunction f ^Double init ^Double inc]
    (FeatureInitializerFactory/function f init inc)))

(defn *randomize
  "Adds some amount of random data to the given initializer.

  random - Random variable distribution sampler. - `org.apache.commons.math4.distribution.RealDistribution$Sampler`
  orig - Original initializer. - `org.apache.commons.math4.ml.neuralnet.FeatureInitializer`

  returns: an initializer whose value
   method will return orig.value()  random.sample(). - `org.apache.commons.math4.ml.neuralnet.FeatureInitializer`"
  (^org.apache.commons.math4.ml.neuralnet.FeatureInitializer [^org.apache.commons.math4.distribution.RealDistribution$Sampler random ^org.apache.commons.math4.ml.neuralnet.FeatureInitializer orig]
    (FeatureInitializerFactory/randomize random orig)))

