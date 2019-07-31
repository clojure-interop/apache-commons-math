(ns org.apache.commons.math4.geometry.partitioning.NodesSet
  "Set of BSP tree nodes."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning NodesSet]))

(defn ->nodes-set
  "Constructor.

  Simple constructor."
  (^NodesSet []
    (new NodesSet )))

(defn add
  "Add a node if not already known.

  node - node to add - `org.apache.commons.math4.geometry.partitioning.BSPTree`"
  ([^NodesSet this ^org.apache.commons.math4.geometry.partitioning.BSPTree node]
    (-> this (.add node))))

(defn add-all
  "Add nodes if they are not already known.

  iterator - nodes iterator - `java.lang.Iterable`"
  ([^NodesSet this ^java.lang.Iterable iterator]
    (-> this (.addAll iterator))))

(defn iterator
  "returns: `java.util.Iterator<org.apache.commons.math4.geometry.partitioning.BSPTree<S>>`"
  (^java.util.Iterator [^NodesSet this]
    (-> this (.iterator))))

