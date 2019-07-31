(ns org.apache.commons.math4.analysis.RealFieldUnivariateFunction
  "An interface representing a univariate real function.

  When a user-defined function encounters an error during
  evaluation, the value method should throw a
  user-defined unchecked exception.

  The following code excerpt shows the recommended way to do that using
  a root solver as an example, but the same construct is applicable to
  ODE integrators or optimizers.



  private static class LocalException extends RuntimeException {
      // The x value that caused the problem.
      private final SomeFieldType x;

      public LocalException(SomeFieldType x) {
          this.x = x;
      }

      public double getX() {
          return x;
      }
  }

  private static class MyFunction implements FieldUnivariateFunction<SomeFieldType> {
      public SomeFieldType value(SomeFieldType x) {
          SomeFieldType y = hugeFormula(x);
          if (somethingBadHappens) {
            throw new LocalException(x);
          }
          return y;
      }
  }

  public void compute() {
      try {
          solver.solve(maxEval, new MyFunction(a, b, c), min, max);
      } catch (LocalException le) {
          // Retrieve the x value.
      }
  }

  As shown, the exception is local to the user's code and it is guaranteed
  that Apache Commons Math will not catch it."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis RealFieldUnivariateFunction]))

(defn value
  "Compute the value of the function.

  x - Point at which the function value should be computed. - `T`

  returns: the value of the function. - `T`

  throws: java.lang.IllegalArgumentException - when the activated method itself can ascertain that a precondition, specified in the API expressed at the level of the activated method, has been violated. When Commons Math throws an IllegalArgumentException, it is usually the consequence of checking the actual parameters passed to the method."
  ([^RealFieldUnivariateFunction this x]
    (-> this (.value x))))

