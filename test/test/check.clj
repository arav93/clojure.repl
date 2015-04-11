(ns test.check
(:require [clojure.core.typed :as t]
                [clojure.repl :as repl]
                [test.core]))


(repl/apropos "clojure")
(repl/demunge "clojure.repl$demunge")
(repl/source-fn 'source)

