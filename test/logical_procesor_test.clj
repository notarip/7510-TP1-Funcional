(ns logical_procesor_test
    (:require [clojure.test :refer :all]
              [logical_procesor :refer :all]))

(deftest check-mock-the-type-of-facts-list
  (testing "Tests the mock facts list"
           (is true (instance? (type get-mock-facts-map) java.util.Map))
  ))

(deftest check-mock-the-type-of-facts-list-item
  (testing "Tests the mock facts list"
           (def lists ((get-mock-facts-map) :fact1))
           (is true (instance? (type lists) (type (list 'a 'b))))
   ))

(deftest check-mock-the-tuple-under-the-map-list
  (testing "Test the tuple"
           (def lists ((get-mock-facts-map) :fact1))
           (is true (instance? (type (get lists 1)) (type ['a])))
           )
  )
;;https://repl.it/K4cK/4
;;(deftest check-mock-fact
;;  (testing "Test one fact"
;;           )
;;  )