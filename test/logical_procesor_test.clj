(ns logical_procesor_test
    (:require [clojure.test :refer :all]
              [logical_procesor :refer :all]))

(deftest check-the-type-of-facts-list
  (testing "Tests the mock facts list"
           (is true (instance? (type get-facts-map) java.util.Map))
  ))

(deftest check-the-type-of-facts-list-item
  (testing "Tests the mock facts list"
           (def lists ((get-facts-map) :a))
           (is true (instance? (type lists) (type (list 'a 'b))))
   ))