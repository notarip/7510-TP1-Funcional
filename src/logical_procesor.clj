(ns logical_procesor)

(defn get-mock-facts-map
  "Generate the facts map"
  []
  (def map {:fact1 ['(homero bart) '(homero lisa)], :fact2 ['(lisa, bart) '(lisa, maggie)]})
  )
(comment
(
  defn check-fact
  "Check a fact"
  [fact, items]
  (def facts get-mock-facts-map)
  (def fact1 facts :fact)

  ))
