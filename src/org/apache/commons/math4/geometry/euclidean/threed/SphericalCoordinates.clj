(ns org.apache.commons.math4.geometry.euclidean.threed.SphericalCoordinates
  "This class provides conversions related to spherical coordinates.

  The conventions used here are the mathematical ones, i.e. spherical coordinates are
  related to Cartesian coordinates as follows:


    x = r cos(θ) sin(Φ)
    y = r sin(θ) sin(Φ)
    z = r cos(Φ)


    r       = √(x2+y2+z2)
    θ = atan2(y, x)
    Φ   = acos(z/r)


  r is the radius, θ is the azimuthal angle in the x-y plane and Φ is the polar
  (co-latitude) angle. These conventions are different from the conventions used
  in physics (and in particular in spherical harmonics) where the meanings of θ and
  Φ are reversed.


  This class provides conversion of coordinates and also of gradient and Hessian
  between spherical and Cartesian coordinates."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.euclidean.threed SphericalCoordinates]))

(defn ->spherical-coordinates
  "Constructor.

  Build a spherical coordinates transformer from spherical coordinates.

  r - radius - `double`
  theta - azimuthal angle in x-y plane - `double`
  phi - polar (co-latitude) angle - `double`"
  (^SphericalCoordinates [^Double r ^Double theta ^Double phi]
    (new SphericalCoordinates r theta phi))
  (^SphericalCoordinates [^org.apache.commons.math4.geometry.euclidean.threed.Vector3D v]
    (new SphericalCoordinates v)))

(defn get-cartesian
  "Get the Cartesian coordinates.

  returns: Cartesian coordinates - `org.apache.commons.math4.geometry.euclidean.threed.Vector3D`"
  (^org.apache.commons.math4.geometry.euclidean.threed.Vector3D [^SphericalCoordinates this]
    (-> this (.getCartesian))))

(defn get-r
  "Get the radius.

  returns: radius r - `double`"
  (^Double [^SphericalCoordinates this]
    (-> this (.getR))))

(defn get-theta
  "Get the azimuthal angle in x-y plane.

  returns: azimuthal angle in x-y plane θ - `double`"
  (^Double [^SphericalCoordinates this]
    (-> this (.getTheta))))

(defn get-phi
  "Get the polar (co-latitude) angle.

  returns: polar (co-latitude) angle Φ - `double`"
  (^Double [^SphericalCoordinates this]
    (-> this (.getPhi))))

(defn to-cartesian-gradient
  "Convert a gradient with respect to spherical coordinates into a gradient
   with respect to Cartesian coordinates.

  s-gradient - gradient with respect to spherical coordinates {df/dr, df/dθ, df/dΦ} - `double[]`

  returns: gradient with respect to Cartesian coordinates
   {df/dx, df/dy, df/dz} - `double[]`"
  ([^SphericalCoordinates this s-gradient]
    (-> this (.toCartesianGradient s-gradient))))

(defn to-cartesian-hessian
  "Convert a Hessian with respect to spherical coordinates into a Hessian
   with respect to Cartesian coordinates.

   As Hessian are always symmetric, we use only the lower left part of the provided
   spherical Hessian, so the upper part may not be initialized. However, we still
   do fill up the complete array we create, with guaranteed symmetry.

  s-hessian - Hessian with respect to spherical coordinates {{d2f/dr2, d2f/drdθ, d2f/drdΦ}, {d2f/drdθ, d2f/dθ2, d2f/dθdΦ}, {d2f/drdΦ, d2f/dθdΦ, d2f/dΦ2} - `double[][]`
  s-gradient - gradient with respect to spherical coordinates {df/dr, df/dθ, df/dΦ} - `double[]`

  returns: Hessian with respect to Cartesian coordinates
   {{d2f/dx2, d2f/dxdy, d2f/dxdz},
    {d2f/dxdy, d2f/dy2, d2f/dydz},
    {d2f/dxdz, d2f/dydz, d2f/dz2}} - `double[][]`"
  ([^SphericalCoordinates this s-hessian s-gradient]
    (-> this (.toCartesianHessian s-hessian s-gradient))))

