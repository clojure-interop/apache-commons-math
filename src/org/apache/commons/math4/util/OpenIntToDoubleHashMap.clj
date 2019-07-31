(ns org.apache.commons.math4.util.OpenIntToDoubleHashMap
  "Open addressed map from int to double.
  This class provides a dedicated map from integers to doubles with a
  much smaller memory overhead than standard java.util.Map.
  This class is not synchronized. The specialized iterators returned by
  iterator() are fail-fast: they throw a
  ConcurrentModificationException when they detect the map has been
  modified during iteration."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util OpenIntToDoubleHashMap]))

(defn ->open-int-to-double-hash-map
  "Constructor.

  Build an empty map with specified size.

  expected-size - expected number of elements in the map - `int`
  missing-entries - value to return when a missing entry is fetched - `double`"
  (^OpenIntToDoubleHashMap [^Integer expected-size ^Double missing-entries]
    (new OpenIntToDoubleHashMap expected-size missing-entries))
  (^OpenIntToDoubleHashMap [^Double missing-entries]
    (new OpenIntToDoubleHashMap missing-entries))
  (^OpenIntToDoubleHashMap []
    (new OpenIntToDoubleHashMap )))

(defn get
  "Get the stored value associated with the given key

  key - key associated with the data - `int`

  returns: data associated with the key - `double`"
  (^Double [^OpenIntToDoubleHashMap this ^Integer key]
    (-> this (.get key))))

(defn contains-key
  "Check if a value is associated with a key.

  key - key to check - `int`

  returns: true if a value is associated with key - `boolean`"
  (^Boolean [^OpenIntToDoubleHashMap this ^Integer key]
    (-> this (.containsKey key))))

(defn iterator
  "Get an iterator over map elements.
   The specialized iterators returned are fail-fast: they throw a
   ConcurrentModificationException when they detect the map
   has been modified during iteration.

  returns: iterator over the map elements - `org.apache.commons.math4.util.OpenIntToDoubleHashMap$Iterator`"
  (^org.apache.commons.math4.util.OpenIntToDoubleHashMap$Iterator [^OpenIntToDoubleHashMap this]
    (-> this (.iterator))))

(defn size
  "Get the number of elements stored in the map.

  returns: number of elements stored in the map - `int`"
  (^Integer [^OpenIntToDoubleHashMap this]
    (-> this (.size))))

(defn remove
  "Remove the value associated with a key.

  key - key to which the value is associated - `int`

  returns: removed value - `double`"
  (^Double [^OpenIntToDoubleHashMap this ^Integer key]
    (-> this (.remove key))))

(defn put
  "Put a value associated with a key in the map.

  key - key to which value is associated - `int`
  value - value to put in the map - `double`

  returns: previous value associated with the key - `double`"
  (^Double [^OpenIntToDoubleHashMap this ^Integer key ^Double value]
    (-> this (.put key value))))

