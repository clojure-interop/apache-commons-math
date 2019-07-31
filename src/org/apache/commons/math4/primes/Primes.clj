(ns org.apache.commons.math4.primes.Primes
  "Methods related to prime numbers in the range of int:

  primality test
  prime number generation
  factorization"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.primes Primes]))

(defn *prime?
  "Primality test: tells if the argument is a (provable) prime or not.

   It uses the Miller-Rabin probabilistic test in such a way that a result is guaranteed:
   it uses the firsts prime numbers as successive base (see Handbook of applied cryptography
   by Menezes, table 4.1).

  n - number to test. - `int`

  returns: true if n is prime. (All numbers < 2 return false). - `boolean`"
  (^Boolean [^Integer n]
    (Primes/isPrime n)))

(defn *next-prime
  "Return the smallest prime greater than or equal to n.

  n - a positive number. - `int`

  returns: the smallest prime greater than or equal to n. - `int`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if n < 0."
  (^Integer [^Integer n]
    (Primes/nextPrime n)))

(defn *prime-factors
  "Prime factors decomposition

  n - number to factorize: must be ≥ 2 - `int`

  returns: list of prime factors of n - `java.util.List<java.lang.Integer>`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if n < 2."
  (^java.util.List [^Integer n]
    (Primes/primeFactors n)))

