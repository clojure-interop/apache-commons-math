(ns org.apache.commons.math4.genetics.GeneticAlgorithm
  "Implementation of a genetic algorithm. All factors that govern the operation
  of the algorithm can be configured for a specific problem."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics GeneticAlgorithm]))

(defn ->genetic-algorithm
  "Constructor.

  Create a new genetic algorithm.

  crossover-policy - The CrossoverPolicy - `org.apache.commons.math4.genetics.CrossoverPolicy`
  crossover-rate - The crossover rate as a percentage (0-1 inclusive) - `double`
  mutation-policy - The MutationPolicy - `org.apache.commons.math4.genetics.MutationPolicy`
  mutation-rate - The mutation rate as a percentage (0-1 inclusive) - `double`
  selection-policy - The SelectionPolicy - `org.apache.commons.math4.genetics.SelectionPolicy`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the crossover or mutation rate is outside the [0, 1] range"
  (^GeneticAlgorithm [^org.apache.commons.math4.genetics.CrossoverPolicy crossover-policy ^Double crossover-rate ^org.apache.commons.math4.genetics.MutationPolicy mutation-policy ^Double mutation-rate ^org.apache.commons.math4.genetics.SelectionPolicy selection-policy]
    (new GeneticAlgorithm crossover-policy crossover-rate mutation-policy mutation-rate selection-policy)))

(defn *set-random-generator
  "Set the (static) random generator.

  random - random generator - `org.apache.commons.rng.UniformRandomProvider`"
  ([^org.apache.commons.rng.UniformRandomProvider random]
    (GeneticAlgorithm/setRandomGenerator random)))

(defn *get-random-generator
  "Returns the (static) random generator.

  returns: the static random generator shared by GA implementation classes - `org.apache.commons.rng.UniformRandomProvider`"
  (^org.apache.commons.rng.UniformRandomProvider []
    (GeneticAlgorithm/getRandomGenerator )))

(defn evolve
  "Evolve the given population. Evolution stops when the stopping condition
   is satisfied. Updates the generationsEvolved
   property with the number of generations evolved before the StoppingCondition
   is satisfied.

  initial - the initial, seed population. - `org.apache.commons.math4.genetics.Population`
  condition - the stopping condition used to stop evolution. - `org.apache.commons.math4.genetics.StoppingCondition`

  returns: the population that satisfies the stopping condition. - `org.apache.commons.math4.genetics.Population`"
  (^org.apache.commons.math4.genetics.Population [^GeneticAlgorithm this ^org.apache.commons.math4.genetics.Population initial ^org.apache.commons.math4.genetics.StoppingCondition condition]
    (-> this (.evolve initial condition))))

(defn next-generation
  "Evolve the given population into the next generation.


    Get nextGeneration population to fill from current
        generation, using its nextGeneration method
    Loop until new generation is filled:
    Apply configured SelectionPolicy to select a pair of parents
            from current
        With probability = getCrossoverRate(), apply
            configured CrossoverPolicy to parents
        With probability = getMutationRate(), apply
            configured MutationPolicy to each of the offspring
        Add offspring individually to nextGeneration,
            space permitting

    Return nextGeneration

  current - the current population. - `org.apache.commons.math4.genetics.Population`

  returns: the population for the next generation. - `org.apache.commons.math4.genetics.Population`"
  (^org.apache.commons.math4.genetics.Population [^GeneticAlgorithm this ^org.apache.commons.math4.genetics.Population current]
    (-> this (.nextGeneration current))))

(defn get-crossover-policy
  "Returns the crossover policy.

  returns: crossover policy - `org.apache.commons.math4.genetics.CrossoverPolicy`"
  (^org.apache.commons.math4.genetics.CrossoverPolicy [^GeneticAlgorithm this]
    (-> this (.getCrossoverPolicy))))

(defn get-crossover-rate
  "Returns the crossover rate.

  returns: crossover rate - `double`"
  (^Double [^GeneticAlgorithm this]
    (-> this (.getCrossoverRate))))

(defn get-mutation-policy
  "Returns the mutation policy.

  returns: mutation policy - `org.apache.commons.math4.genetics.MutationPolicy`"
  (^org.apache.commons.math4.genetics.MutationPolicy [^GeneticAlgorithm this]
    (-> this (.getMutationPolicy))))

(defn get-mutation-rate
  "Returns the mutation rate.

  returns: mutation rate - `double`"
  (^Double [^GeneticAlgorithm this]
    (-> this (.getMutationRate))))

(defn get-selection-policy
  "Returns the selection policy.

  returns: selection policy - `org.apache.commons.math4.genetics.SelectionPolicy`"
  (^org.apache.commons.math4.genetics.SelectionPolicy [^GeneticAlgorithm this]
    (-> this (.getSelectionPolicy))))

(defn get-generations-evolved
  "Returns the number of generations evolved to reach StoppingCondition in the last run.

  returns: number of generations evolved - `int`"
  (^Integer [^GeneticAlgorithm this]
    (-> this (.getGenerationsEvolved))))

