(ns org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.ml.clustering KMeansPlusPlusClusterer$EmptyClusterStrategy]))

(def LARGEST_VARIANCE
  "Enum Constant.

  Split the cluster with largest distance variance.

  type: org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy"
  KMeansPlusPlusClusterer$EmptyClusterStrategy/LARGEST_VARIANCE)

(def LARGEST_POINTS_NUMBER
  "Enum Constant.

  Split the cluster with largest number of points.

  type: org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy"
  KMeansPlusPlusClusterer$EmptyClusterStrategy/LARGEST_POINTS_NUMBER)

(def FARTHEST_POINT
  "Enum Constant.

  Create a cluster around the point farthest from its centroid.

  type: org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy"
  KMeansPlusPlusClusterer$EmptyClusterStrategy/FARTHEST_POINT)

(def ERROR
  "Enum Constant.

  Generate an error.

  type: org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy"
  KMeansPlusPlusClusterer$EmptyClusterStrategy/ERROR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (KMeansPlusPlusClusterer.EmptyClusterStrategy c : KMeansPlusPlusClusterer.EmptyClusterStrategy.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy[]`"
  ([]
    (KMeansPlusPlusClusterer$EmptyClusterStrategy/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.math4.ml.clustering.KMeansPlusPlusClusterer$EmptyClusterStrategy [^java.lang.String name]
    (KMeansPlusPlusClusterer$EmptyClusterStrategy/valueOf name)))

