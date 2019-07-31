(ns org.apache.commons.math4.genetics.CycleCrossover
  "Cycle Crossover [CX] builds offspring from ordered chromosomes by identifying cycles
  between two parent chromosomes. To form the children, the cycles are copied from the
  respective parents.

  To form a cycle the following procedure is applied:

    start with the first gene of parent 1
    look at the gene at the same position of parent 2
    go to the position with the same gene in parent 1
    add this gene index to the cycle
    repeat the steps 2-5 until we arrive at the starting gene of this cycle

  The indices that form a cycle are then used to form the children in alternating order, i.e.
  in cycle 1, the genes of parent 1 are copied to child 1, while in cycle 2 the genes of parent 1
  are copied to child 2, and so forth ...


  Example (zero-start cycle):


  p1 = (8 4 7 3 6 2 5 1 9 0)    X   c1 = (8 1 2 3 4 5 6 7 9 0)
  p2 = (0 1 2 3 4 5 6 7 8 9)    X   c2 = (0 4 7 3 6 2 5 1 8 9)

  cycle 1: 8 0 9
  cycle 2: 4 1 7 2 5 6
  cycle 3: 3

  This policy works only on AbstractListChromosome, and therefore it
  is parameterized by T. Moreover, the chromosomes must have same lengths."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics CycleCrossover]))

(defn ->cycle-crossover
  "Constructor.

  Creates a new CycleCrossover policy using the given randomStart behavior.

  random-start - whether the start index shall be chosen randomly or be set to 0 - `boolean`"
  (^CycleCrossover [^Boolean random-start]
    (new CycleCrossover random-start))
  (^CycleCrossover []
    (new CycleCrossover )))

(defn random-start?
  "Returns whether the starting index is chosen randomly or set to zero.

  returns: true if the starting index is chosen randomly, false otherwise - `boolean`"
  (^Boolean [^CycleCrossover this]
    (-> this (.isRandomStart))))

(defn crossover
  "Perform a crossover operation on the given chromosomes.

  first - the first chromosome. - `org.apache.commons.math4.genetics.Chromosome`
  second - the second chromosome. - `org.apache.commons.math4.genetics.Chromosome`

  returns: the pair of new chromosomes that resulted from the crossover. - `org.apache.commons.math4.genetics.ChromosomePair`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the chromosomes are not an instance of AbstractListChromosome"
  (^org.apache.commons.math4.genetics.ChromosomePair [^CycleCrossover this ^org.apache.commons.math4.genetics.Chromosome first ^org.apache.commons.math4.genetics.Chromosome second]
    (-> this (.crossover first second))))

