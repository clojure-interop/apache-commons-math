(ns org.apache.commons.math4.genetics.FixedElapsedTime
  "Stops after a fixed amount of time has elapsed.

  The first time isSatisfied(Population) is invoked, the end time of
  the evolution is determined based on the provided maxTime value.
  Once the elapsed time reaches the configured maxTime value,
  isSatisfied(Population) returns true."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics FixedElapsedTime]))

(defn ->fixed-elapsed-time
  "Constructor.

  Create a new FixedElapsedTime instance.

  max-time - maximum time generations are allowed to evolve - `long`
  unit - TimeUnit of the maxTime argument - `java.util.concurrent.TimeUnit`

  throws: org.apache.commons.math4.exception.NumberIsTooSmallException - if the provided time is < 0"
  (^FixedElapsedTime [^Long max-time ^java.util.concurrent.TimeUnit unit]
    (new FixedElapsedTime max-time unit))
  (^FixedElapsedTime [^Long max-time]
    (new FixedElapsedTime max-time)))

(defn satisfied?
  "Determine whether or not the maximum allowed time has passed.
   The termination time is determined after the first generation.

  population - ignored (no impact on result) - `org.apache.commons.math4.genetics.Population`

  returns: true IFF the maximum allowed time period has elapsed - `boolean`"
  (^Boolean [^FixedElapsedTime this ^org.apache.commons.math4.genetics.Population population]
    (-> this (.isSatisfied population))))

