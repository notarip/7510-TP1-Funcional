(ns logical_procesor)

(defn only-greater-than-five
  "Given a list, filter for some condition"
  [list]
  (filter ( fn [x] (> x 5)) list))