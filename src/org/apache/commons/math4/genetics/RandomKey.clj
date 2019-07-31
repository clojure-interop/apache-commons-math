(ns org.apache.commons.math4.genetics.RandomKey
  "Random Key chromosome is used for permutation representation. It is a vector
  of a fixed length of real numbers in [0,1] interval. The index of the i-th
  smallest value in the vector represents an i-th member of the permutation.

  For example, the random key [0.2, 0.3, 0.8, 0.1] corresponds to the
  permutation of indices (3,0,1,2). If the original (unpermuted) sequence would
  be (a,b,c,d), this would mean the sequence (d,a,b,c).

  With this representation, common operators like n-point crossover can be
  used, because any such chromosome represents a valid permutation.

  Since the chromosome (and thus its arrayRepresentation) is immutable, the
  array representation is sorted only once in the constructor.

  For details, see:

    Bean, J.C.: Genetic algorithms and random keys for sequencing and
        optimization. ORSA Journal on Computing 6 (1994) 154-160
    Rothlauf, F.: Representations for Genetic and Evolutionary Algorithms.
        Volume 104 of Studies in Fuzziness and Soft Computing. Physica-Verlag,
        Heidelberg (2002)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.genetics RandomKey]))

(defn ->random-key
  "Constructor.

  Constructor.

  representation - list of [0,1] values representing the permutation - `java.util.List`

  throws: org.apache.commons.math4.genetics.InvalidRepresentationException - iff the representation can not represent a valid chromosome"
  (^RandomKey [^java.util.List representation]
    (new RandomKey representation)))

(defn *random-permutation
  "Generates a representation corresponding to a random permutation of
   length l which can be passed to the RandomKey constructor.

  l - length of the permutation - `int`

  returns: representation of a random permutation - `java.util.List<java.lang.Double>`"
  (^java.util.List [^Integer l]
    (RandomKey/randomPermutation l)))

(defn *identity-permutation
  "Generates a representation corresponding to an identity permutation of
   length l which can be passed to the RandomKey constructor.

  l - length of the permutation - `int`

  returns: representation of an identity permutation - `java.util.List<java.lang.Double>`"
  (^java.util.List [^Integer l]
    (RandomKey/identityPermutation l)))

(defn *comparator-permutation
  "Generates a representation of a permutation corresponding to the
   data sorted by comparator. The
   data is not modified during the process.

   This is useful if you want to inject some permutations to the initial
   population.

  data - list of data determining the order - `java.util.List`
  comparator - how the data will be compared - `java.util.Comparator`

  returns: list representation of the permutation corresponding to the parameters - `<S> java.util.List<java.lang.Double>`"
  ([^java.util.List data ^java.util.Comparator comparator]
    (RandomKey/comparatorPermutation data comparator)))

(defn *induced-permutation
  "Generates a representation of a permutation corresponding to a
   permutation which yields permutedData when applied to
   originalData.

   This method can be viewed as an inverse to decode(List).

  original-data - the original, unpermuted data - `java.util.List`
  permuted-data - the data, somehow permuted - `java.util.List`

  returns: representation of a permutation corresponding to the permutation
     originalData -> permutedData - `<S> java.util.List<java.lang.Double>`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - iff the length of originalData and permutedData lists are not equal"
  ([^java.util.List original-data ^java.util.List permuted-data]
    (RandomKey/inducedPermutation original-data permuted-data)))

(defn decode
  "Permutes the sequence of objects of type T according to the
   permutation this chromosome represents. For example, if this chromosome
   represents a permutation (3,0,1,2), and the unpermuted sequence is
   (a,b,c,d), this yields (d,a,b,c).

  sequence - the unpermuted (original) sequence of objects - `java.util.List`

  returns: permutation of sequence represented by this permutation - `java.util.List<T>`"
  (^java.util.List [^RandomKey this ^java.util.List sequence]
    (-> this (.decode sequence))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RandomKey this]
    (-> this (.toString))))

