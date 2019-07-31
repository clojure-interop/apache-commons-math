(ns org.apache.commons.math4.util.RandomPivotingStrategy
  "A strategy of selecting random index between begin and end indices."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util RandomPivotingStrategy]))

(defn ->random-pivoting-strategy
  "Constructor.

  Simple constructor.

  random-source - RNG to use for selecting pivot. - `org.apache.commons.rng.RandomSource`
  seed - Seed for initializing the RNG. - `long`"
  (^RandomPivotingStrategy [^org.apache.commons.rng.RandomSource random-source ^Long seed]
    (new RandomPivotingStrategy random-source seed)))

(defn pivot-index
  "Find pivot index of the array so that partition and Kth
   element selection can be made

   A uniform random pivot selection between begin and end indices.

  work - data array - `double[]`
  begin - index of the first element of the slice - `int`
  end - index after the last element of the slice - `int`

  returns: The index corresponding to a random uniformly selected
   value between first and the last indices of the array slice - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - when indices exceeds range"
  (^Integer [^RandomPivotingStrategy this work ^Integer begin ^Integer end]
    (-> this (.pivotIndex work begin end))))

