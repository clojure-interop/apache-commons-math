(ns org.apache.commons.math4.util.IterationEvent
  "The root class from which all events occurring while running an
  IterationManager should be derived."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util IterationEvent]))

(defn ->iteration-event
  "Constructor.

  Creates a new instance of this class.

  source - the iterative algorithm on which the event initially occurred - `java.lang.Object`
  iterations - the number of iterations performed at the time this event is created - `int`"
  (^IterationEvent [^java.lang.Object source ^Integer iterations]
    (new IterationEvent source iterations)))

(defn get-iterations
  "Returns the number of iterations performed at the time this event
   is created.

  returns: the number of iterations performed - `int`"
  (^Integer [^IterationEvent this]
    (-> this (.getIterations))))

