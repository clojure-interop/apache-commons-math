(ns org.apache.commons.math4.linear.FieldVectorPreservingVisitor
  "This interface defines a visitor for the entries of a vector. Visitors
  implementing this interface do not alter the entries of the vector being
  visited."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear FieldVectorPreservingVisitor]))

(defn start
  "Start visiting a vector. This method is called once, before any entry
   of the vector is visited.

  dimension - the size of the vector - `int`
  start - the index of the first entry to be visited - `int`
  end - the index of the last entry to be visited (inclusive) - `int`"
  ([^FieldVectorPreservingVisitor this ^Integer dimension ^Integer start ^Integer end]
    (-> this (.start dimension start end))))

(defn visit
  "Visit one entry of the vector.

  index - the index of the entry being visited - `int`
  value - the value of the entry being visited - `T`"
  ([^FieldVectorPreservingVisitor this ^Integer index value]
    (-> this (.visit index value))))

(defn end
  "End visiting a vector. This method is called once, after all entries of
   the vector have been visited.

  returns: the value returned after visiting all entries - `T`"
  ([^FieldVectorPreservingVisitor this]
    (-> this (.end))))

