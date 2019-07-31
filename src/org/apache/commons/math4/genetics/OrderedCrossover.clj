(ns org.apache.commons.math4.genetics.OrderedCrossover
  "Order 1 Crossover [OX1] builds offspring from ordered chromosomes by copying a
  consecutive slice from one parent, and filling up the remaining genes from the other
  parent as they appear.

  This policy works by applying the following rules:

    select a random slice of consecutive genes from parent 1
    copy the slice to child 1 and mark out the genes in parent 2
    starting from the right side of the slice, copy genes from parent 2 as they
        appear to child 1 if they are not yet marked out.


  Example (random sublist from index 3 to 7, underlined):


  p1 = (8 4 7 3 6 2 5 1 9 0)   X   c1 = (0 4 7 3 6 2 5 1 8 9)
              ---------                        ---------
  p2 = (0 1 2 3 4 5 6 7 8 9)   X   c2 = (8 1 2 3 4 5 6 7 9 0)

  This policy works only on AbstractListChromosome, and therefore it
  is parameterized by T. Moreover, the chromosomes must have same lengths."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics OrderedCrossover]))

(defn ->ordered-crossover
  "Constructor."
  (^OrderedCrossover []
    (new OrderedCrossover )))

(defn crossover
  "Perform a crossover operation on the given chromosomes.

  first - the first chromosome. - `org.apache.commons.math4.genetics.Chromosome`
  second - the second chromosome. - `org.apache.commons.math4.genetics.Chromosome`

  returns: the pair of new chromosomes that resulted from the crossover. - `org.apache.commons.math4.genetics.ChromosomePair`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - iff one of the chromosomes is not an instance of AbstractListChromosome"
  (^org.apache.commons.math4.genetics.ChromosomePair [^OrderedCrossover this ^org.apache.commons.math4.genetics.Chromosome first ^org.apache.commons.math4.genetics.Chromosome second]
    (-> this (.crossover first second))))

