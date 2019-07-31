(ns org.apache.commons.math4.genetics.ChromosomePair
  "A pair of Chromosome objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics ChromosomePair]))

(defn ->chromosome-pair
  "Constructor.

  Create a chromosome pair.

  c-1 - the first chromosome. - `org.apache.commons.math4.genetics.Chromosome`
  c-2 - the second chromosome. - `org.apache.commons.math4.genetics.Chromosome`"
  (^ChromosomePair [^org.apache.commons.math4.genetics.Chromosome c-1 ^org.apache.commons.math4.genetics.Chromosome c-2]
    (new ChromosomePair c-1 c-2)))

(defn get-first
  "Access the first chromosome.

  returns: the first chromosome. - `org.apache.commons.math4.genetics.Chromosome`"
  (^org.apache.commons.math4.genetics.Chromosome [^ChromosomePair this]
    (-> this (.getFirst))))

(defn get-second
  "Access the second chromosome.

  returns: the second chromosome. - `org.apache.commons.math4.genetics.Chromosome`"
  (^org.apache.commons.math4.genetics.Chromosome [^ChromosomePair this]
    (-> this (.getSecond))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ChromosomePair this]
    (-> this (.toString))))

