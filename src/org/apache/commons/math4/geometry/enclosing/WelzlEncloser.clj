(ns org.apache.commons.math4.geometry.enclosing.WelzlEncloser
  "Class implementing Emo Welzl algorithm to find the smallest enclosing ball in linear time.

  The class implements the algorithm described in paper Smallest
  Enclosing Disks (Balls and Ellipsoids) by Emo Welzl, Lecture Notes in Computer Science
  555 (1991) 359-370. The pivoting improvement published in the paper Fast and
  Robust Smallest Enclosing Balls, by Bernd Gärtner and further modified in
  paper
  Efficient Computation of Smallest Enclosing Balls in Three Dimensions by Linus Källberg
  to avoid performing local copies of data have been included."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.enclosing WelzlEncloser]))

(defn ->welzl-encloser
  "Constructor.

  Simple constructor.

  tolerance - below which points are consider to be identical - `double`
  generator - generator for balls on support - `org.apache.commons.math4.geometry.enclosing.SupportBallGenerator`"
  (^WelzlEncloser [^Double tolerance ^org.apache.commons.math4.geometry.enclosing.SupportBallGenerator generator]
    (new WelzlEncloser tolerance generator)))

(defn enclose
  "Find a ball enclosing a list of points.

  points - points to enclose - `java.lang.Iterable`

  returns: enclosing ball - `org.apache.commons.math4.geometry.enclosing.EnclosingBall<S,P>`"
  (^org.apache.commons.math4.geometry.enclosing.EnclosingBall [^WelzlEncloser this ^java.lang.Iterable points]
    (-> this (.enclose points))))

(defn select-farthest
  "Select the point farthest to the current ball.

  points - points to be enclosed - `java.lang.Iterable`
  ball - current ball - `org.apache.commons.math4.geometry.enclosing.EnclosingBall`

  returns: farthest point - `P`"
  ([^WelzlEncloser this ^java.lang.Iterable points ^org.apache.commons.math4.geometry.enclosing.EnclosingBall ball]
    (-> this (.selectFarthest points ball))))

