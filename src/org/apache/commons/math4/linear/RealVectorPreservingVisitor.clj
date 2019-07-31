(ns org.apache.commons.math4.linear.RealVectorPreservingVisitor
  "This interface defines a visitor for the entries of a vector. Visitors
  implementing this interface do not alter the entries of the vector being
  visited."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear RealVectorPreservingVisitor]))

(defn start
  "Start visiting a vector. This method is called once, before any entry
   of the vector is visited.

  dimension - the size of the vector - `int`
  start - the index of the first entry to be visited - `int`
  end - the index of the last entry to be visited (inclusive) - `int`"
  ([^RealVectorPreservingVisitor this ^Integer dimension ^Integer start ^Integer end]
    (-> this (.start dimension start end))))

(defn visit
  "Visit one entry of the vector.

  index - the index of the entry being visited - `int`
  value - the value of the entry being visited - `double`"
  ([^RealVectorPreservingVisitor this ^Integer index ^Double value]
    (-> this (.visit index value))))

(defn end
  "End visiting a vector. This method is called once, after all entries of
   the vector have been visited.

  returns: the value returned by
   RealVector.walkInDefaultOrder(RealVectorPreservingVisitor),
   RealVector.walkInDefaultOrder(RealVectorPreservingVisitor, int, int),
   RealVector.walkInOptimizedOrder(RealVectorPreservingVisitor)
   or
   RealVector.walkInOptimizedOrder(RealVectorPreservingVisitor, int, int) - `double`"
  (^Double [^RealVectorPreservingVisitor this]
    (-> this (.end))))

