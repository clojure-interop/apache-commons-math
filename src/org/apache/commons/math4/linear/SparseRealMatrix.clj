(ns org.apache.commons.math4.linear.SparseRealMatrix
  "Marker interface for RealMatrix implementations that require sparse backing storage


   Caveat: Implementation are allowed to assume that, for any x,
   the equality x * 0d == 0d holds. But it is is not true for
   NaN. Moreover, zero entries will lose their sign.
   Some operations (that involve NaN and/or infinities) may
   thus give incorrect results."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.linear SparseRealMatrix]))

