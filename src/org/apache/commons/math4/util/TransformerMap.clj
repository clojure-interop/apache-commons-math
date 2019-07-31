(ns org.apache.commons.math4.util.TransformerMap
  "This TansformerMap automates the transformation of mixed object types.
  It provides a means to set NumberTransformers that will be selected
  based on the Class of the object handed to the Maps
  double transform(Object o) method."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.math4.util TransformerMap]))

(defn ->transformer-map
  "Constructor.

  Build a map containing only the default transformer."
  (^TransformerMap []
    (new TransformerMap )))

(defn transform
  "Attempts to transform the Object against the map of
   NumberTransformers. Otherwise it returns Double.NaN.

  o - the Object to be transformed. - `java.lang.Object`

  returns: the double value of the Object. - `double`

  throws: org.apache.commons.math4.exception.MathIllegalArgumentException - if the Object can not be transformed into a Double."
  (^Double [^TransformerMap this ^java.lang.Object o]
    (-> this (.transform o))))

(defn remove-transformer
  "Removes a Class to Transformer Mapping in the Map.

  key - The Class - `java.lang.Class`

  returns: the removed transformer if one is present or
   null if none was present. - `org.apache.commons.math4.util.NumberTransformer`"
  (^org.apache.commons.math4.util.NumberTransformer [^TransformerMap this ^java.lang.Class key]
    (-> this (.removeTransformer key))))

(defn put-transformer
  "Sets a Class to Transformer Mapping in the Map. If
   the Class is already present, this overwrites that
   mapping.

  key - The Class - `java.lang.Class`
  transformer - The NumberTransformer - `org.apache.commons.math4.util.NumberTransformer`

  returns: the replaced transformer if one is present - `org.apache.commons.math4.util.NumberTransformer`"
  (^org.apache.commons.math4.util.NumberTransformer [^TransformerMap this ^java.lang.Class key ^org.apache.commons.math4.util.NumberTransformer transformer]
    (-> this (.putTransformer key transformer))))

(defn get-transformer
  "Returns the Transformer that is mapped to a class
   if mapping is not present, this returns null.

  key - The Class of the object - `java.lang.Class`

  returns: the mapped NumberTransformer or null. - `org.apache.commons.math4.util.NumberTransformer`"
  (^org.apache.commons.math4.util.NumberTransformer [^TransformerMap this ^java.lang.Class key]
    (-> this (.getTransformer key))))

(defn contains-transformer
  "Tests if a NumberTransformer is present in the TransformerMap.

  value - NumberTransformer to check - `org.apache.commons.math4.util.NumberTransformer`

  returns: true|false - `boolean`"
  (^Boolean [^TransformerMap this ^org.apache.commons.math4.util.NumberTransformer value]
    (-> this (.containsTransformer value))))

(defn classes
  "Returns the Set of Classes used as keys in the map.

  returns: Set of Classes - `java.util.Set<java.lang.Class<?>>`"
  (^java.util.Set [^TransformerMap this]
    (-> this (.classes))))

(defn contains-class
  "Tests if a Class is present in the TransformerMap.

  key - Class to check - `java.lang.Class`

  returns: true|false - `boolean`"
  (^Boolean [^TransformerMap this ^java.lang.Class key]
    (-> this (.containsClass key))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TransformerMap this]
    (-> this (.hashCode))))

(defn clear
  "Clears all the Class to Transformer mappings."
  ([^TransformerMap this]
    (-> this (.clear))))

(defn equals
  "other - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TransformerMap this ^java.lang.Object other]
    (-> this (.equals other))))

(defn transformers
  "Returns the Set of NumberTransformers used as values
   in the map.

  returns: Set of NumberTransformers - `java.util.Collection<org.apache.commons.math4.util.NumberTransformer>`"
  (^java.util.Collection [^TransformerMap this]
    (-> this (.transformers))))

