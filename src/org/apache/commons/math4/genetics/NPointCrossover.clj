(ns org.apache.commons.math4.genetics.NPointCrossover
  "N-point crossover policy. For each iteration a random crossover point is
  selected and the first part from each parent is copied to the corresponding
  child, and the second parts are copied crosswise.

  Example (2-point crossover):


  -C- denotes a crossover point
            -C-       -C-                         -C-        -C-
  p1 = (1 0  | 1 0 0 1 | 0 1 1)    X    p2 = (0 1  | 1 0 1 0  | 1 1 1)
       \\----/ \\-------/ \\-----/              \\----/ \\--------/ \\-----/
         ||      (*)       ||                  ||      (**)       ||
         VV      (**)      VV                  VV      (*)        VV
       /----\\ /--------\\ /-----\\             /----\\ /--------\\ /-----\\
  c1 = (1 0  | 1 0 1 0  | 0 1 1)    X   c2 = (0 1  | 1 0 0 1  | 0 1 1)

  This policy works only on AbstractListChromosome, and therefore it
  is parameterized by T. Moreover, the chromosomes must have same lengths."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics NPointCrossover]))

(defn ->n-point-crossover
  "Constructor.

  Creates a new NPointCrossover policy using the given number of points.

   Note: the number of crossover points must be < chromosome length - 1.
   This condition can only be checked at runtime, as the chromosome length is not known in advance.

  crossover-points - the number of crossover points - `int`

  throws: org.apache.commons.math4.exception.NotStrictlyPositiveException - if the number of crossoverPoints is not strictly positive"
  (^NPointCrossover [^Integer crossover-points]
    (new NPointCrossover crossover-points)))

(defn get-crossover-points
  "Returns the number of crossover points used by this CrossoverPolicy.

  returns: the number of crossover points - `int`"
  (^Integer [^NPointCrossover this]
    (-> this (.getCrossoverPoints))))

(defn crossover
  "Performs a N-point crossover. N random crossover points are selected and are used
   to divide the parent chromosomes into segments. The segments are copied in alternate
   order from the two parents to the corresponding child chromosomes.

   Example (2-point crossover):


   -C- denotes a crossover point
             -C-       -C-                         -C-        -C-
   p1 = (1 0  | 1 0 0 1 | 0 1 1)    X    p2 = (0 1  | 1 0 1 0  | 1 1 1)
        \\----/ \\-------/ \\-----/              \\----/ \\--------/ \\-----/
          ||      (*)       ||                  ||      (**)       ||
          VV      (**)      VV                  VV      (*)        VV
        /----\\ /--------\\ /-----\\             /----\\ /--------\\ /-----\\
   c1 = (1 0  | 1 0 1 0  | 0 1 1)    X   c2 = (0 1  | 1 0 0 1  | 0 1 1)

  first - first parent (p1) - `org.apache.commons.math4.genetics.Chromosome`
  second - second parent (p2) - `org.apache.commons.math4.genetics.Chromosome`

  returns: pair of two children (c1,c2) - `org.apache.commons.math4.genetics.ChromosomePair`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - iff one of the chromosomes is not an instance of AbstractListChromosome"
  (^org.apache.commons.math4.genetics.ChromosomePair [^NPointCrossover this ^org.apache.commons.math4.genetics.Chromosome first ^org.apache.commons.math4.genetics.Chromosome second]
    (-> this (.crossover first second))))

