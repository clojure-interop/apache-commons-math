(ns org.apache.commons.math4.util.OpenIntToFieldHashMap
  "Open addressed map from int to FieldElement.
  This class provides a dedicated map from integers to FieldElements with a
  much smaller memory overhead than standard java.util.Map.
  This class is not synchronized. The specialized iterators returned by
  iterator() are fail-fast: they throw a
  ConcurrentModificationException when they detect the map has been
  modified during iteration."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util OpenIntToFieldHashMap]))

(defn ->open-int-to-field-hash-map
  "Constructor.

  Build an empty map with specified size.

  field - field to which the elements belong - `org.apache.commons.math4.Field`
  expected-size - expected number of elements in the map - `int`
  missing-entries - value to return when a missing entry is fetched - `T`"
  (^OpenIntToFieldHashMap [^org.apache.commons.math4.Field field ^Integer expected-size missing-entries]
    (new OpenIntToFieldHashMap field expected-size missing-entries))
  (^OpenIntToFieldHashMap [^org.apache.commons.math4.Field field missing-entries]
    (new OpenIntToFieldHashMap field missing-entries))
  (^OpenIntToFieldHashMap [^org.apache.commons.math4.Field field]
    (new OpenIntToFieldHashMap field)))

(defn get
  "Get the stored value associated with the given key

  key - key associated with the data - `int`

  returns: data associated with the key - `T`"
  ([^OpenIntToFieldHashMap this ^Integer key]
    (-> this (.get key))))

(defn contains-key
  "Check if a value is associated with a key.

  key - key to check - `int`

  returns: true if a value is associated with key - `boolean`"
  (^Boolean [^OpenIntToFieldHashMap this ^Integer key]
    (-> this (.containsKey key))))

(defn iterator
  "Get an iterator over map elements.
   The specialized iterators returned are fail-fast: they throw a
   ConcurrentModificationException when they detect the map
   has been modified during iteration.

  returns: iterator over the map elements - `org.apache.commons.math4.util.OpenIntToFieldHashMap$Iterator`"
  (^org.apache.commons.math4.util.OpenIntToFieldHashMap$Iterator [^OpenIntToFieldHashMap this]
    (-> this (.iterator))))

(defn size
  "Get the number of elements stored in the map.

  returns: number of elements stored in the map - `int`"
  (^Integer [^OpenIntToFieldHashMap this]
    (-> this (.size))))

(defn remove
  "Remove the value associated with a key.

  key - key to which the value is associated - `int`

  returns: removed value - `T`"
  ([^OpenIntToFieldHashMap this ^Integer key]
    (-> this (.remove key))))

(defn put
  "Put a value associated with a key in the map.

  key - key to which value is associated - `int`
  value - value to put in the map - `T`

  returns: previous value associated with the key - `T`"
  ([^OpenIntToFieldHashMap this ^Integer key value]
    (-> this (.put key value))))

