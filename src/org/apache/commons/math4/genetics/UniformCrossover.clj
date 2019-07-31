(ns org.apache.commons.math4.genetics.UniformCrossover
  "Perform Uniform Crossover [UX] on the specified chromosomes. A fixed mixing
  ratio is used to combine genes from the first and second parents, e.g. using a
  ratio of 0.5 would result in approximately 50% of genes coming from each
  parent. This is typically a poor method of crossover, but empirical evidence
  suggests that it is more exploratory and results in a larger part of the
  problem space being searched.

  This crossover policy evaluates each gene of the parent chromosomes by chosing a
  uniform random number p in the range [0, 1]. If p < ratio,
  the parent genes are swapped. This means with a ratio of 0.7, 30% of the genes from the
  first parent and 70% from the second parent will be selected for the first offspring (and
  vice versa for the second offspring).

  This policy works only on AbstractListChromosome, and therefore it
  is parameterized by T. Moreover, the chromosomes must have same lengths."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics UniformCrossover]))

(defn ->uniform-crossover
  "Constructor.

  Creates a new UniformCrossover policy using the given mixing ratio.

  ratio - the mixing ratio - `double`

  throws: org.apache.commons.math4.exception.OutOfRangeException - if the mixing ratio is outside the [0, 1] range"
  (^UniformCrossover [^Double ratio]
    (new UniformCrossover ratio)))

(defn get-ratio
  "Returns the mixing ratio used by this CrossoverPolicy.

  returns: the mixing ratio - `double`"
  (^Double [^UniformCrossover this]
    (-> this (.getRatio))))

(defn crossover
  "Perform a crossover operation on the given chromosomes.

  first - the first chromosome. - `org.apache.commons.math4.genetics.Chromosome`
  second - the second chromosome. - `org.apache.commons.math4.genetics.Chromosome`

  returns: the pair of new chromosomes that resulted from the crossover. - `org.apache.commons.math4.genetics.ChromosomePair`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - iff one of the chromosomes is not an instance of AbstractListChromosome"
  (^org.apache.commons.math4.genetics.ChromosomePair [^UniformCrossover this ^org.apache.commons.math4.genetics.Chromosome first ^org.apache.commons.math4.genetics.Chromosome second]
    (-> this (.crossover first second))))

