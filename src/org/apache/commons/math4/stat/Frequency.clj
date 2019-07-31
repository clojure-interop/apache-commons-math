(ns org.apache.commons.math4.stat.Frequency
  "Maintains a frequency distribution.

  Accepts int, long, char or Comparable values.  New values added must be
  comparable to those that have been added, otherwise the add method will
  throw an IllegalArgumentException.

  Integer values (int, long, Integer, Long) are not distinguished by type --
  i.e. addValue(Long.valueOf(2)), addValue(2), addValue(2l) all have
  the same effect (similarly for arguments to getCount, etc.).
  NOTE: byte and short values will be implicitly converted to int values
  by the compiler, thus there are no explicit overloaded methods for these
  primitive types.

  char values are converted by addValue to Character instances.
  As such, these values are not comparable to integral values, so attempts
  to combine integral types with chars in a frequency distribution will fail.


  Float is not coerced to Double.
  Since they are not Comparable with each other the user must do any necessary coercion.
  Float.NaN and Double.NaN are not treated specially; they may occur in input and will
  occur in output if appropriate.


  The values are ordered using the default (natural order), unless a
  Comparator is supplied in the constructor."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat Frequency]))

(defn ->frequency
  "Constructor.

  Constructor allowing values Comparator to be specified.

  comparator - Comparator used to order values - `java.util.Comparator`"
  (^Frequency [^java.util.Comparator comparator]
    (new Frequency comparator))
  (^Frequency []
    (new Frequency )))

(defn get-mode
  "Returns the mode value(s) in comparator order.

  returns: a list containing the value(s) which appear most often. - `java.util.List<java.lang.Comparable<?>>`"
  (^java.util.List [^Frequency this]
    (-> this (.getMode))))

(defn get-sum-freq
  "Returns the sum of all frequencies.

  returns: the total frequency count. - `long`"
  (^Long [^Frequency this]
    (-> this (.getSumFreq))))

(defn get-count
  "Returns the number of values equal to v.
   Returns 0 if the value is not comparable.

  v - the value to lookup. - `java.lang.Comparable`

  returns: the frequency of v. - `long`"
  (^Long [^Frequency this ^java.lang.Comparable v]
    (-> this (.getCount v))))

(defn get-cum-pct
  "Returns the cumulative percentage of values less than or equal to v
   (as a proportion between 0 and 1).

   Returns Double.NaN if no values have been added.
   Returns 0 if at least one value has been added, but v is not comparable
   to the values set.

  v - the value to lookup - `java.lang.Comparable`

  returns: the proportion of values less than or equal to v - `double`"
  (^Double [^Frequency this ^java.lang.Comparable v]
    (-> this (.getCumPct v))))

(defn get-pct
  "Returns the percentage of values that are equal to v
   (as a proportion between 0 and 1).

   Returns Double.NaN if no values have been added.
   Returns 0 if at least one value has been added, but v is not comparable
   to the values set.

  v - the value to lookup - `java.lang.Comparable`

  returns: the proportion of values equal to v - `double`"
  (^Double [^Frequency this ^java.lang.Comparable v]
    (-> this (.getPct v))))

(defn to-string
  "Return a string representation of this frequency distribution.

  returns: a string representation. - `java.lang.String`"
  (^java.lang.String [^Frequency this]
    (-> this (.toString))))

(defn entry-set-iterator
  "Return an Iterator over the set of keys and values that have been added.
   Using the entry set to iterate is more efficient in the case where you
   need to access respective counts as well as values, since it doesn't
   require a \"get\" for every key...the value is provided in the Map.Entry.

   If added values are integral (i.e., integers, longs, Integers, or Longs),
   they are converted to Longs when they are added, so the values of the
   map entries returned by the Iterator will in this case be Longs.

  returns: entry set Iterator - `java.util.Iterator<java.util.Map$Entry<java.lang.Comparable<?>,java.lang.Long>>`"
  (^java.util.Iterator [^Frequency this]
    (-> this (.entrySetIterator))))

(defn increment-value
  "Increments the frequency count for v.

   If other objects have already been added to this Frequency, v must
   be comparable to those that have already been added.

  v - the value to add. - `java.lang.Comparable`
  increment - the amount by which the value should be incremented - `long`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if v is not comparable with previous entries"
  ([^Frequency this ^java.lang.Comparable v ^Long increment]
    (-> this (.incrementValue v increment))))

(defn get-cum-freq
  "Returns the cumulative frequency of values less than or equal to v.

   Returns 0 if v is not comparable to the values set.

  v - the value to lookup. - `java.lang.Comparable`

  returns: the proportion of values equal to v - `long`"
  (^Long [^Frequency this ^java.lang.Comparable v]
    (-> this (.getCumFreq v))))

(defn values-iterator
  "Returns an Iterator over the set of values that have been added.

   If added values are integral (i.e., integers, longs, Integers, or Longs),
   they are converted to Longs when they are added, so the objects returned
   by the Iterator will in this case be Longs.

  returns: values Iterator - `java.util.Iterator<java.lang.Comparable<?>>`"
  (^java.util.Iterator [^Frequency this]
    (-> this (.valuesIterator))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Frequency this]
    (-> this (.hashCode))))

(defn clear
  "Clears the frequency table"
  ([^Frequency this]
    (-> this (.clear))))

(defn add-value
  "Adds 1 to the frequency count for v.

   If other objects have already been added to this Frequency, v must
   be comparable to those that have already been added.

  v - the value to add. - `java.lang.Comparable`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if v is not comparable with previous entries"
  ([^Frequency this ^java.lang.Comparable v]
    (-> this (.addValue v))))

(defn merge
  "Merge another Frequency object's counts into this instance.
   This Frequency's counts will be incremented (or set when not already set)
   by the counts represented by other.

  other - the other Frequency object to be merged - `org.apache.commons.math4.stat.Frequency`

  throws: org.apache.commons.math4.exception.NullArgumentException - if other is null"
  ([^Frequency this ^org.apache.commons.math4.stat.Frequency other]
    (-> this (.merge other))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Frequency this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-unique-count
  "Returns the number of values in the frequency table.

  returns: the number of unique values that have been added to the frequency table. - `int`"
  (^Integer [^Frequency this]
    (-> this (.getUniqueCount))))

