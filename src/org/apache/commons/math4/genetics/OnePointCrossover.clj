(ns org.apache.commons.math4.genetics.OnePointCrossover
  "One point crossover policy. A random crossover point is selected and the
  first part from each parent is copied to the corresponding child, and the
  second parts are copied crosswise.

  Example:


  -C- denotes a crossover point
                    -C-                                 -C-
  p1 = (1 0 1 0 0 1  | 0 1 1)    X    p2 = (0 1 1 0 1 0  | 1 1 1)
       \\------------/ \\-----/              \\------------/ \\-----/
             ||         (*)                       ||        (**)
             VV         (**)                      VV        (*)
       /------------\\ /-----\\              /------------\\ /-----\\
  c1 = (1 0 1 0 0 1  | 1 1 1)    X    c2 = (0 1 1 0 1 0  | 0 1 1)

  This policy works only on AbstractListChromosome, and therefore it
  is parameterized by T. Moreover, the chromosomes must have same lengths."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics OnePointCrossover]))

(defn ->one-point-crossover
  "Constructor."
  (^OnePointCrossover []
    (new OnePointCrossover )))

(defn crossover
  "Performs one point crossover. A random crossover point is selected and the
   first part from each parent is copied to the corresponding child, and the
   second parts are copied crosswise.

   Example:


   -C- denotes a crossover point
                     -C-                                 -C-
   p1 = (1 0 1 0 0 1  | 0 1 1)    X    p2 = (0 1 1 0 1 0  | 1 1 1)
        \\------------/ \\-----/              \\------------/ \\-----/
              ||         (*)                       ||        (**)
              VV         (**)                      VV        (*)
        /------------\\ /-----\\              /------------\\ /-----\\
   c1 = (1 0 1 0 0 1  | 1 1 1)    X    c2 = (0 1 1 0 1 0  | 0 1 1)

  first - first parent (p1) - `org.apache.commons.math4.genetics.Chromosome`
  second - second parent (p2) - `org.apache.commons.math4.genetics.Chromosome`

  returns: pair of two children (c1,c2) - `org.apache.commons.math4.genetics.ChromosomePair`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - iff one of the chromosomes is not an instance of AbstractListChromosome"
  (^org.apache.commons.math4.genetics.ChromosomePair [^OnePointCrossover this ^org.apache.commons.math4.genetics.Chromosome first ^org.apache.commons.math4.genetics.Chromosome second]
    (-> this (.crossover first second))))

