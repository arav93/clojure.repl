(ns test.core 
(:require [clojure.core.typed :as t]))

(t/ann ^:no-check clojure.repl/apropos [String -> clojure.lang.LazySeq])
(t/ann ^:no-check clojure.repl/demunge [String -> String])
(t/ann ^:no-check clojure.repl/source-fn [clojure.lang.Symbol -> String])

