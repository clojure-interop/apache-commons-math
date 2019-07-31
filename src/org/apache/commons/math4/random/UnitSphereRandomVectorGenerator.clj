(ns org.apache.commons.math4.random.UnitSphereRandomVectorGenerator
  "Generate random vectors isotropically located on the surface of a sphere."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.random UnitSphereRandomVectorGenerator]))

(defn ->unit-sphere-random-vector-generator
  "Constructor.

  Create an object that will use a default RNG,
   in order to generate the individual components.

  dimension - Space dimension. - `int`"
  (^UnitSphereRandomVectorGenerator [^Integer dimension]
    (new UnitSphereRandomVectorGenerator dimension))
  (^UnitSphereRandomVectorGenerator [^Integer dimension ^org.apache.commons.rng.UniformRandomProvider rng]
    (new UnitSphereRandomVectorGenerator dimension rng)))

(defn next-vector
  "Generate a random vector.

  returns: a random vector as an array of double. - `double[]`"
  ([^UnitSphereRandomVectorGenerator this]
    (-> this (.nextVector))))

