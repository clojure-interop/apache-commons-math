(ns org.apache.commons.math4.stat.inference.OneWayAnova
  "Implements one-way ANOVA (analysis of variance) statistics.

   Tests for differences between two or more categories of univariate data
  (for example, the body mass index of accountants, lawyers, doctors and
  computer programmers).  When two categories are given, this is equivalent to
  the TTest.

  Uses the commons-math F Distribution implementation to estimate exact p-values.
  This implementation is based on a description at
  http://faculty.vassar.edu/lowry/ch13pt1.html


  Abbreviations: bg = between groups,
                 wg = within groups,
                 ss = sum squared deviations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.stat.inference OneWayAnova]))

(defn ->one-way-anova
  "Constructor.

  Default constructor."
  (^OneWayAnova []
    (new OneWayAnova )))

(defn anova-f-value
  "Computes the ANOVA F-value for a collection of double[]
   arrays.

   Preconditions:
   The categoryData Collection must contain
   double[] arrays.
    There must be at least two double[] arrays in the
   categoryData collection and each of these arrays must
   contain at least two values.
   This implementation computes the F statistic using the definitional
   formula

     F = msbg/mswg
   where

    msbg = between group mean square
    mswg = within group mean square
   are as defined
   here

  category-data - Collection of double[] arrays each containing data for one category - `java.util.Collection`

  returns: Fvalue - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if categoryData is null"
  (^Double [^OneWayAnova this ^java.util.Collection category-data]
    (-> this (.anovaFValue category-data))))

(defn anova-p-value
  "Computes the ANOVA P-value for a collection of SummaryStatistics.

   Preconditions:
   The categoryData Collection must contain
   SummaryStatistics.
    There must be at least two SummaryStatistics in the
   categoryData collection and each of these statistics must
   contain at least two values.
   This implementation uses the
   commons-math F Distribution implementation to estimate the exact
   p-value, using the formula

     p = 1 - cumulativeProbability(F)
   where F is the F value and cumulativeProbability
   is the commons-math implementation of the F distribution.

  category-data - Collection of SummaryStatistics each containing data for one category - `java.util.Collection`
  allow-one-element-data - if true, allow computation for one catagory only or for one data element per category - `boolean`

  returns: Pvalue - `double`

  throws: org.apache.commons.math4.exception.NullArgumentException - if categoryData is null"
  (^Double [^OneWayAnova this ^java.util.Collection category-data ^Boolean allow-one-element-data]
    (-> this (.anovaPValue category-data allow-one-element-data)))
  (^Double [^OneWayAnova this ^java.util.Collection category-data]
    (-> this (.anovaPValue category-data))))

(defn anova-test
  "Performs an ANOVA test, evaluating the null hypothesis that there
   is no difference among the means of the data categories.

   Preconditions:
   The categoryData Collection must contain
   double[] arrays.
    There must be at least two double[] arrays in the
   categoryData collection and each of these arrays must
   contain at least two values.
   alpha must be strictly greater than 0 and less than or equal to 0.5.

   This implementation uses the
   commons-math F Distribution implementation to estimate the exact
   p-value, using the formula

     p = 1 - cumulativeProbability(F)
   where F is the F value and cumulativeProbability
   is the commons-math implementation of the F distribution.
   True is returned iff the estimated p-value is less than alpha.

  category-data - Collection of double[] arrays each containing data for one category - `java.util.Collection`
  alpha - significance level of the test - `double`

  returns: true if the null hypothesis can be rejected with
   confidence 1 - alpha - `boolean`

  throws: org.apache.commons.math4.exception.NullArgumentException - if categoryData is null"
  (^Boolean [^OneWayAnova this ^java.util.Collection category-data ^Double alpha]
    (-> this (.anovaTest category-data alpha))))

