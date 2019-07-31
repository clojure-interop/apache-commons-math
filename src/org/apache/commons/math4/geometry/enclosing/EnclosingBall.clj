(ns org.apache.commons.math4.geometry.enclosing.EnclosingBall
  "This class represents a ball enclosing some points."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.geometry.enclosing EnclosingBall]))

(defn ->enclosing-ball
  "Constructor.

  Simple constructor.

  center - center of the ball - `P`
  radius - radius of the ball - `double`
  support - support points used to define the ball - `P`"
  (^EnclosingBall [center ^Double radius support]
    (new EnclosingBall center radius support)))

(defn get-center
  "Get the center of the ball.

  returns: center of the ball - `P`"
  ([^EnclosingBall this]
    (-> this (.getCenter))))

(defn get-radius
  "Get the radius of the ball.

  returns: radius of the ball (can be negative if the ball is empty) - `double`"
  (^Double [^EnclosingBall this]
    (-> this (.getRadius))))

(defn get-support
  "Get the support points used to define the ball.

  returns: support points used to define the ball - `P[]`"
  ([^EnclosingBall this]
    (-> this (.getSupport))))

(defn get-support-size
  "Get the number of support points used to define the ball.

  returns: number of support points used to define the ball - `int`"
  (^Integer [^EnclosingBall this]
    (-> this (.getSupportSize))))

(defn contains
  "Check if a point is within an enlarged ball or at boundary.

  point - point to test - `P`
  margin - margin to consider - `double`

  returns: true if the point is within the ball enlarged
   by the margin or at boundary - `boolean`"
  (^Boolean [^EnclosingBall this point ^Double margin]
    (-> this (.contains point margin)))
  (^Boolean [^EnclosingBall this point]
    (-> this (.contains point))))

