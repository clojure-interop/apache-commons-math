(ns org.apache.commons.math4.util.IterationManager
  "This abstract class provides a general framework for managing iterative
  algorithms. The maximum number of iterations can be set, and methods are
  provided to monitor the current iteration count. A lightweight event
  framework is also provided."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util IterationManager]))

(defn ->iteration-manager
  "Constructor.

  Creates a new instance of this class.

  max-iterations - the maximum number of iterations - `int`
  call-back - the function to be called when the maximum number of iterations has been reached - `org.apache.commons.math4.util.Incrementor$MaxCountExceededCallback`

  throws: org.apache.commons.math4.exception.NullArgumentException - if callBack is null"
  (^IterationManager [^Integer max-iterations ^org.apache.commons.math4.util.Incrementor$MaxCountExceededCallback call-back]
    (new IterationManager max-iterations call-back))
  (^IterationManager [^Integer max-iterations]
    (new IterationManager max-iterations)))

(defn fire-initialization-event
  "Informs all registered listeners that the initial phase (prior to the
   main iteration loop) has been completed.

  e - The IterationEvent object. - `org.apache.commons.math4.util.IterationEvent`"
  ([^IterationManager this ^org.apache.commons.math4.util.IterationEvent e]
    (-> this (.fireInitializationEvent e))))

(defn fire-termination-event
  "Informs all registered listeners that the final phase (post-iterations)
   has been completed.

  e - The IterationEvent object. - `org.apache.commons.math4.util.IterationEvent`"
  ([^IterationManager this ^org.apache.commons.math4.util.IterationEvent e]
    (-> this (.fireTerminationEvent e))))

(defn fire-iteration-started-event
  "Informs all registered listeners that a new iteration (in the main
   iteration loop) has been started.

  e - The IterationEvent object. - `org.apache.commons.math4.util.IterationEvent`"
  ([^IterationManager this ^org.apache.commons.math4.util.IterationEvent e]
    (-> this (.fireIterationStartedEvent e))))

(defn fire-iteration-performed-event
  "Informs all registered listeners that a new iteration (in the main
   iteration loop) has been performed.

  e - The IterationEvent object. - `org.apache.commons.math4.util.IterationEvent`"
  ([^IterationManager this ^org.apache.commons.math4.util.IterationEvent e]
    (-> this (.fireIterationPerformedEvent e))))

(defn get-iterations
  "Returns the number of iterations of this solver, 0 if no iterations has
   been performed yet.

  returns: the number of iterations. - `int`"
  (^Integer [^IterationManager this]
    (-> this (.getIterations))))

(defn get-max-iterations
  "Returns the maximum number of iterations.

  returns: the maximum number of iterations. - `int`"
  (^Integer [^IterationManager this]
    (-> this (.getMaxIterations))))

(defn reset-iteration-count
  "Sets the iteration count to 0. This method must be called during the
   initial phase."
  ([^IterationManager this]
    (-> this (.resetIterationCount))))

(defn increment-iteration-count
  "Increments the iteration count by one, and throws an exception if the
   maximum number of iterations is reached. This method should be called at
   the beginning of a new iteration.

  throws: org.apache.commons.math4.exception.MaxCountExceededException - if the maximum number of iterations is reached."
  ([^IterationManager this]
    (-> this (.incrementIterationCount))))

(defn remove-iteration-listener
  "Removes the specified iteration listener from the list of listeners
   currently attached to this object. Attempting to remove a
   listener which was not previously registered does not cause any
   error.

  listener - The IterationListener to be removed. - `org.apache.commons.math4.util.IterationListener`"
  ([^IterationManager this ^org.apache.commons.math4.util.IterationListener listener]
    (-> this (.removeIterationListener listener))))

(defn add-iteration-listener
  "Attaches a listener to this manager.

  listener - A IterationListener object. - `org.apache.commons.math4.util.IterationListener`"
  ([^IterationManager this ^org.apache.commons.math4.util.IterationListener listener]
    (-> this (.addIterationListener listener))))

