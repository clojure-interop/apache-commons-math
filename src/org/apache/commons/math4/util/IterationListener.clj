(ns org.apache.commons.math4.util.IterationListener
  "The listener interface for receiving events occurring in an iterative
  algorithm."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util IterationListener]))

(defn initialization-performed
  "Invoked after completion of the initial phase of the iterative algorithm
   (prior to the main iteration loop).

  e - The IterationEvent object. - `org.apache.commons.math4.util.IterationEvent`"
  ([^IterationListener this ^org.apache.commons.math4.util.IterationEvent e]
    (-> this (.initializationPerformed e))))

(defn iteration-performed
  "Invoked each time an iteration is completed (in the main iteration loop).

  e - The IterationEvent object. - `org.apache.commons.math4.util.IterationEvent`"
  ([^IterationListener this ^org.apache.commons.math4.util.IterationEvent e]
    (-> this (.iterationPerformed e))))

(defn iteration-started
  "Invoked each time a new iteration is completed (in the main iteration
   loop).

  e - The IterationEvent object. - `org.apache.commons.math4.util.IterationEvent`"
  ([^IterationListener this ^org.apache.commons.math4.util.IterationEvent e]
    (-> this (.iterationStarted e))))

(defn termination-performed
  "Invoked after completion of the operations which occur after breaking out
   of the main iteration loop.

  e - The IterationEvent object. - `org.apache.commons.math4.util.IterationEvent`"
  ([^IterationListener this ^org.apache.commons.math4.util.IterationEvent e]
    (-> this (.terminationPerformed e))))

