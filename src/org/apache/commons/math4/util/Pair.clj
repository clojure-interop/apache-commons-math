(ns org.apache.commons.math4.util.Pair
  "Generic pair.

  Although the instances of this class are immutable, it is impossible
  to ensure that the references passed to the constructor will not be
  modified by the caller."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util Pair]))

(defn ->pair
  "Constructor.

  Create an entry representing a mapping from the specified key to the
   specified value.

  k - Key (first element of the pair). - `K`
  v - Value (second element of the pair). - `V`"
  (^Pair [k v]
    (new Pair k v))
  (^Pair [^org.apache.commons.math4.util.Pair entry]
    (new Pair entry)))

(defn *create
  "Convenience factory method that calls the
   constructor.

  k - First element of the pair. - `K`
  v - Second element of the pair. - `V`

  returns: a new Pair containing k and v. - `<K,V> org.apache.commons.math4.util.Pair<K,V>`"
  ([k v]
    (Pair/create k v)))

(defn get-key
  "Get the key.

  returns: the key (first element of the pair). - `K`"
  ([^Pair this]
    (-> this (.getKey))))

(defn get-value
  "Get the value.

  returns: the value (second element of the pair). - `V`"
  ([^Pair this]
    (-> this (.getValue))))

(defn get-first
  "Get the first element of the pair.

  returns: the first element of the pair. - `K`"
  ([^Pair this]
    (-> this (.getFirst))))

(defn get-second
  "Get the second element of the pair.

  returns: the second element of the pair. - `V`"
  ([^Pair this]
    (-> this (.getSecond))))

(defn equals
  "Compare the specified object with this entry for equality.

  o - Object. - `java.lang.Object`

  returns: true if the given object is also a map entry and
   the two entries represent the same mapping. - `boolean`"
  (^Boolean [^Pair this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "Compute a hash code.

  returns: the hash code value. - `int`"
  (^Integer [^Pair this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Pair this]
    (-> this (.toString))))

