(ns org.apache.commons.math4.analysis.differentiation.DSCompiler
  "Class holding \"compiled\" computation rules for derivative structures.
  This class implements the computation rules described in Dan Kalman's paper Doubly
  Recursive Multivariate Automatic Differentiation, Mathematics Magazine, vol. 75,
  no. 3, June 2002. However, in order to avoid performances bottlenecks, the recursive
  rules are \"compiled\" once in an unfold form. This class does this recursion unrolling
  and stores the computation rules as simple loops with pre-computed indirection arrays.

  This class maps all derivative computation into single dimension arrays that hold the
  value and partial derivatives. The class does not hold these arrays, which remains under
  the responsibility of the caller. For each combination of number of free parameters and
  derivation order, only one compiler is necessary, and this compiler will be used to
  perform computations on all arrays provided to it, which can represent hundreds or
  thousands of different parameters kept together with all their partial derivatives.


  The arrays on which compilers operate contain only the partial derivatives together
  with the 0th derivative, i.e. the value. The partial derivatives are stored in
  a compiler-specific order, which can be retrieved using methods getPartialDerivativeIndex and getPartialDerivativeOrders(int). The value is guaranteed to be stored as the first element
  (i.e. the getPartialDerivativeIndex method returns
  0 when called with 0 for all derivation orders and getPartialDerivativeOrders returns an array filled with 0 when called with 0 as the index).


  Note that the ordering changes with number of parameters and derivation order. For example
  given 2 parameters x and y, df/dy is stored at index 2 when derivation order is set to 1 (in
  this case the array has three elements: f, df/dx and df/dy). If derivation order is set to
  2, then df/dy will be stored at index 3 (in this case the array has six elements: f, df/dx,
  df/dxdx, df/dy, df/dxdy and df/dydy).


  Given this structure, users can perform some simple operations like adding, subtracting
  or multiplying constants and negating the elements by themselves, knowing if they want to
  mutate their array or create a new array. These simple operations are not provided by
  the compiler. The compiler provides only the more complex operations between several arrays.

  This class is mainly used as the engine for scalar variable DerivativeStructure.
  It can also be used directly to hold several variables in arrays for more complex data
  structures. User can for example store a vector of n variables depending on three x, y
  and z free parameters in one array as follows:

    // parameter 0 is x, parameter 1 is y, parameter 2 is z
    int parameters = 3;
    DSCompiler compiler = DSCompiler.getCompiler(parameters, order);
    int size = compiler.getSize();

    // pack all elements in a single array
    double[] array = new double[n * size];
    for (int i = 0; i < n; +i) {

      // we know value is guaranteed to be the first element
      array[i * size] = v[i];

      // we don't know where first derivatives are stored, so we ask the compiler
      array[i * size  compiler.getPartialDerivativeIndex(1, 0, 0) = dvOnDx[i][0];
      array[i * size  compiler.getPartialDerivativeIndex(0, 1, 0) = dvOnDy[i][0];
      array[i * size  compiler.getPartialDerivativeIndex(0, 0, 1) = dvOnDz[i][0];

      // we let all higher order derivatives set to 0

    }
  Then in another function, user can perform some operations on all elements stored
  in the single array, such as a simple product of all variables:

    // compute the product of all elements
    double[] product = new double[size];
    prod[0] = 1.0;
    for (int i = 0; i < n; +i) {
      double[] tmp = product.clone();
      compiler.multiply(tmp, 0, array, i * size, product, 0);
    }

    // value
    double p = product[0];

    // first derivatives
    double dPdX = product[compiler.getPartialDerivativeIndex(1, 0, 0)];
    double dPdY = product[compiler.getPartialDerivativeIndex(0, 1, 0)];
    double dPdZ = product[compiler.getPartialDerivativeIndex(0, 0, 1)];

    // cross derivatives (assuming order was at least 2)
    double dPdXdX = product[compiler.getPartialDerivativeIndex(2, 0, 0)];
    double dPdXdY = product[compiler.getPartialDerivativeIndex(1, 1, 0)];
    double dPdXdZ = product[compiler.getPartialDerivativeIndex(1, 0, 1)];
    double dPdYdY = product[compiler.getPartialDerivativeIndex(0, 2, 0)];
    double dPdYdZ = product[compiler.getPartialDerivativeIndex(0, 1, 1)];
    double dPdZdZ = product[compiler.getPartialDerivativeIndex(0, 0, 2)];"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.analysis.differentiation DSCompiler]))

(defn *get-compiler
  "Get the compiler for number of free parameters and order.

  parameters - number of free parameters - `int`
  order - derivation order - `int`

  returns: cached rules set - `org.apache.commons.math4.analysis.differentiation.DSCompiler`

  throws: org.apache.commons.math4.exception.NumberIsTooLargeException - if order is too large"
  (^org.apache.commons.math4.analysis.differentiation.DSCompiler [^Integer parameters ^Integer order]
    (DSCompiler/getCompiler parameters order)))

(defn log-1p
  "Computes shifted logarithm of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for shifted logarithm the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.log1p operand operand-offset result result-offset))))

(defn cosh
  "Compute hyperbolic cosine of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for hyperbolic cosine the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.cosh operand operand-offset result result-offset))))

(defn multiply
  "Perform multiplication of two derivative structures.

  lhs - array holding left hand side of multiplication - `double[]`
  lhs-offset - offset of the left hand side in its array - `int`
  rhs - array right hand side of multiplication - `double[]`
  rhs-offset - offset of the right hand side in its array - `int`
  result - array where result must be stored (for multiplication the result array cannot be one of the input arrays) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this lhs ^Integer lhs-offset rhs ^Integer rhs-offset result ^Integer result-offset]
    (-> this (.multiply lhs lhs-offset rhs rhs-offset result result-offset))))

(defn root-n
  "Compute nth root of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  n - order of the root - `int`
  result - array where result must be stored (for nth root the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset ^Integer n result ^Integer result-offset]
    (-> this (.rootN operand operand-offset n result result-offset))))

(defn atan-2
  "Compute two arguments arc tangent of a derivative structure.

  y - array holding the first operand - `double[]`
  y-offset - offset of the first operand in its array - `int`
  x - array holding the second operand - `double[]`
  x-offset - offset of the second operand in its array - `int`
  result - array where result must be stored (for two arguments arc tangent the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this y ^Integer y-offset x ^Integer x-offset result ^Integer result-offset]
    (-> this (.atan2 y y-offset x x-offset result result-offset))))

(defn taylor
  "Evaluate Taylor expansion of a derivative structure.

  ds - array holding the derivative structure - `double[]`
  ds-offset - offset of the derivative structure in its array - `int`
  delta - parameters offsets (Δx, Δy, ...) - `double`

  returns: value of the Taylor expansion at x  Δx, y  Δy, ... - `double`

  throws: org.apache.commons.math4.exception.MathArithmeticException - if factorials becomes too large"
  (^Double [^DSCompiler this ds ^Integer ds-offset ^Double delta]
    (-> this (.taylor ds ds-offset delta))))

(defn get-free-parameters
  "Get the number of free parameters.

  returns: number of free parameters - `int`"
  (^Integer [^DSCompiler this]
    (-> this (.getFreeParameters))))

(defn check-compatibility
  "Check rules set compatibility.

  compiler - other compiler to check against instance - `org.apache.commons.math4.analysis.differentiation.DSCompiler`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if number of free parameters or orders are inconsistent"
  ([^DSCompiler this ^org.apache.commons.math4.analysis.differentiation.DSCompiler compiler]
    (-> this (.checkCompatibility compiler))))

(defn pow
  "Compute power of a derivative structure.

  x - array holding the base - `double[]`
  x-offset - offset of the base in its array - `int`
  y - array holding the exponent - `double[]`
  y-offset - offset of the exponent in its array - `int`
  result - array where result must be stored (for power the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this x ^Integer x-offset y ^Integer y-offset result ^Integer result-offset]
    (-> this (.pow x x-offset y y-offset result result-offset)))
  ([^DSCompiler this ^Double a operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.pow a operand operand-offset result result-offset))))

(defn get-order
  "Get the derivation order.

  returns: derivation order - `int`"
  (^Integer [^DSCompiler this]
    (-> this (.getOrder))))

(defn atan
  "Compute arc tangent of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for arc tangent the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.atan operand operand-offset result result-offset))))

(defn log
  "Compute natural logarithm of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for logarithm the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.log operand operand-offset result result-offset))))

(defn acosh
  "Compute inverse hyperbolic cosine of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for inverse hyperbolic cosine the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.acosh operand operand-offset result result-offset))))

(defn sin
  "Compute sine of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for sine the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.sin operand operand-offset result result-offset))))

(defn remainder
  "Perform remainder of two derivative structures.

  lhs - array holding left hand side of remainder - `double[]`
  lhs-offset - offset of the left hand side in its array - `int`
  rhs - array right hand side of remainder - `double[]`
  rhs-offset - offset of the right hand side in its array - `int`
  result - array where result must be stored (it may be one of the input arrays) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this lhs ^Integer lhs-offset rhs ^Integer rhs-offset result ^Integer result-offset]
    (-> this (.remainder lhs lhs-offset rhs rhs-offset result result-offset))))

(defn exp
  "Compute exponential of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for exponential the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.exp operand operand-offset result result-offset))))

(defn subtract
  "Perform subtraction of two derivative structures.

  lhs - array holding left hand side of subtraction - `double[]`
  lhs-offset - offset of the left hand side in its array - `int`
  rhs - array right hand side of subtraction - `double[]`
  rhs-offset - offset of the right hand side in its array - `int`
  result - array where result must be stored (it may be one of the input arrays) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this lhs ^Integer lhs-offset rhs ^Integer rhs-offset result ^Integer result-offset]
    (-> this (.subtract lhs lhs-offset rhs rhs-offset result result-offset))))

(defn log-10
  "Computes base 10 logarithm of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for base 10 logarithm the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.log10 operand operand-offset result result-offset))))

(defn get-partial-derivative-orders
  "Get the derivation orders for a specific index in the array.

   This method is the inverse of getPartialDerivativeIndex(int...).

  index - of the partial derivative - `int`

  returns: orders derivation orders with respect to each parameter - `int[]`"
  ([^DSCompiler this ^Integer index]
    (-> this (.getPartialDerivativeOrders index))))

(defn tan
  "Compute tangent of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for tangent the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.tan operand operand-offset result result-offset))))

(defn cos
  "Compute cosine of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for cosine the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.cos operand operand-offset result result-offset))))

(defn compose
  "Compute composition of a derivative structure by a function.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  f - array of value and derivatives of the function at the current point (i.e. at operand[operandOffset]). - `double[]`
  result - array where result must be stored (for composition the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset f result ^Integer result-offset]
    (-> this (.compose operand operand-offset f result result-offset))))

(defn expm-1
  "Compute exp(x) - 1 of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for exponential the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.expm1 operand operand-offset result result-offset))))

(defn divide
  "Perform division of two derivative structures.

  lhs - array holding left hand side of division - `double[]`
  lhs-offset - offset of the left hand side in its array - `int`
  rhs - array right hand side of division - `double[]`
  rhs-offset - offset of the right hand side in its array - `int`
  result - array where result must be stored (for division the result array cannot be one of the input arrays) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this lhs ^Integer lhs-offset rhs ^Integer rhs-offset result ^Integer result-offset]
    (-> this (.divide lhs lhs-offset rhs rhs-offset result result-offset))))

(defn get-partial-derivative-index
  "Get the index of a partial derivative in the array.

   If all orders are set to 0, then the 0th order derivative
   is returned, which is the value of the function.

   The indices of derivatives are between 0 and getSize() - 1.
   Their specific order is fixed for a given compiler, but otherwise not
   publicly specified. There are however some simple cases which have guaranteed
   indices:


     the index of 0th order derivative is always 0
     if there is only 1 free parameter, then the
     derivatives are sorted in increasing derivation order (i.e. f at index 0, df/dp
     at index 1, d2f/dp2 at index 2 ...
     dkf/dpk at index k),
     if the derivation order is 1, then the derivatives
     are sorted in increasing free parameter order (i.e. f at index 0, df/dx1
     at index 1, df/dx2 at index 2 ... df/dxk at index k),
     all other cases are not publicly specified


   This method is the inverse of method getPartialDerivativeOrders(int)

  orders - derivation orders with respect to each parameter - `int`

  returns: index of the partial derivative - `int`

  throws: org.apache.commons.math4.exception.DimensionMismatchException - if the numbers of parameters does not match the instance"
  (^Integer [^DSCompiler this ^Integer orders]
    (-> this (.getPartialDerivativeIndex orders))))

(defn add
  "Perform addition of two derivative structures.

  lhs - array holding left hand side of addition - `double[]`
  lhs-offset - offset of the left hand side in its array - `int`
  rhs - array right hand side of addition - `double[]`
  rhs-offset - offset of the right hand side in its array - `int`
  result - array where result must be stored (it may be one of the input arrays) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this lhs ^Integer lhs-offset rhs ^Integer rhs-offset result ^Integer result-offset]
    (-> this (.add lhs lhs-offset rhs rhs-offset result result-offset))))

(defn atanh
  "Compute inverse hyperbolic tangent of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for inverse hyperbolic tangent the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.atanh operand operand-offset result result-offset))))

(defn sinh
  "Compute hyperbolic sine of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for hyperbolic sine the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.sinh operand operand-offset result result-offset))))

(defn asinh
  "Compute inverse hyperbolic sine of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for inverse hyperbolic sine the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.asinh operand operand-offset result result-offset))))

(defn get-size
  "Get the array size required for holding partial derivatives data.

   This number includes the single 0 order derivative element, which is
   guaranteed to be stored in the first element of the array.

  returns: array size required for holding partial derivatives data - `int`"
  (^Integer [^DSCompiler this]
    (-> this (.getSize))))

(defn asin
  "Compute arc sine of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for arc sine the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.asin operand operand-offset result result-offset))))

(defn tanh
  "Compute hyperbolic tangent of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for hyperbolic tangent the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.tanh operand operand-offset result result-offset))))

(defn linear-combination
  "Compute linear combination.
   The derivative structure built will be a1 * ds1  a2 * ds2  a3 * ds3  a4 * ds4

  a-1 - first scale factor - `double`
  c-1 - first base (unscaled) component - `double[]`
  offset-1 - offset of first operand in its array - `int`
  a-2 - second scale factor - `double`
  c-2 - second base (unscaled) component - `double[]`
  offset-2 - offset of second operand in its array - `int`
  a-3 - third scale factor - `double`
  c-3 - third base (unscaled) component - `double[]`
  offset-3 - offset of third operand in its array - `int`
  a-4 - fourth scale factor - `double`
  c-4 - fourth base (unscaled) component - `double[]`
  offset-4 - offset of fourth operand in its array - `int`
  result - array where result must be stored (it may be one of the input arrays) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this ^Double a-1 c-1 ^Integer offset-1 ^Double a-2 c-2 ^Integer offset-2 ^Double a-3 c-3 ^Integer offset-3 ^Double a-4 c-4 ^Integer offset-4 result ^Integer result-offset]
    (-> this (.linearCombination a-1 c-1 offset-1 a-2 c-2 offset-2 a-3 c-3 offset-3 a-4 c-4 offset-4 result result-offset)))
  ([^DSCompiler this ^Double a-1 c-1 ^Integer offset-1 ^Double a-2 c-2 ^Integer offset-2 ^Double a-3 c-3 ^Integer offset-3 result ^Integer result-offset]
    (-> this (.linearCombination a-1 c-1 offset-1 a-2 c-2 offset-2 a-3 c-3 offset-3 result result-offset)))
  ([^DSCompiler this ^Double a-1 c-1 ^Integer offset-1 ^Double a-2 c-2 ^Integer offset-2 result ^Integer result-offset]
    (-> this (.linearCombination a-1 c-1 offset-1 a-2 c-2 offset-2 result result-offset))))

(defn acos
  "Compute arc cosine of a derivative structure.

  operand - array holding the operand - `double[]`
  operand-offset - offset of the operand in its array - `int`
  result - array where result must be stored (for arc cosine the result array cannot be the input array) - `double[]`
  result-offset - offset of the result in its array - `int`"
  ([^DSCompiler this operand ^Integer operand-offset result ^Integer result-offset]
    (-> this (.acos operand operand-offset result result-offset))))

