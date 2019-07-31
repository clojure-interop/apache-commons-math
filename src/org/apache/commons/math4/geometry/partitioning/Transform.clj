(ns org.apache.commons.math4.geometry.partitioning.Transform
  "This interface represents an inversible affine transform in a space.
  Inversible affine transform include for example scalings,
  translations, rotations.

  Transforms are dimension-specific. The consistency rules between
  the three apply methods are the following ones for a
  transformed defined for dimension D:


      the transform can be applied to a point in the
      D-dimension space using its apply(Point)
      method


      the transform can be applied to a (D-1)-dimension
      hyperplane in the D-dimension space using its
      apply(Hyperplane) method


      the transform can be applied to a (D-2)-dimension
      sub-hyperplane in a (D-1)-dimension hyperplane using
      its apply(SubHyperplane, Hyperplane, Hyperplane)
      method"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.partitioning Transform]))

(defn apply
  "Transform a sub-hyperplane embedded in an hyperplane.

  sub - sub-hyperplane to transform - `org.apache.commons.math4.geometry.partitioning.SubHyperplane`
  original - hyperplane in which the sub-hyperplane is defined (this is the original hyperplane, the transform has not been applied to it) - `org.apache.commons.math4.geometry.partitioning.Hyperplane`
  transformed - hyperplane in which the sub-hyperplane is defined (this is the transformed hyperplane, the transform has been applied to it) - `org.apache.commons.math4.geometry.partitioning.Hyperplane`

  returns: a new object representing the transformed sub-hyperplane - `org.apache.commons.math4.geometry.partitioning.SubHyperplane<T>`"
  (^org.apache.commons.math4.geometry.partitioning.SubHyperplane [^Transform this ^org.apache.commons.math4.geometry.partitioning.SubHyperplane sub ^org.apache.commons.math4.geometry.partitioning.Hyperplane original ^org.apache.commons.math4.geometry.partitioning.Hyperplane transformed]
    (-> this (.apply sub original transformed)))
  (^org.apache.commons.math4.geometry.Point [^Transform this ^org.apache.commons.math4.geometry.Point point]
    (-> this (.apply point))))

