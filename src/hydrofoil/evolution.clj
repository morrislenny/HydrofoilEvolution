(ns hydrofoil.evolution
  (:require [hydrofoil.utils :refer :all]))


(defn upper-bound-check
  [exploratory-limit upper-bound]
  (if (> exploratory-limit upper-bound)
    upper-bound
    exploratory-limit))

(defn lower-bound-check
  [exploratory-limit lower-bound]
  (if (< exploratory-limit lower-bound)
    lower-bound
    exploratory-limit))

(defn p-min
  [t]
  (cond
    (and (> t 0) (< t 20)) (+ 0.21934298928655427 (* 0.006602765526534473 (Math/pow t 2)))
    ( = t 0) 0.0100
    :else 2.79 ))

(defn new-indv
  [parent]
  (let [exploration-factor 30 ;;; Doesn't do anything yet. hopefully will change m, p, and t, exp-factors.
        ;;; how far you can go from the parent value
        m-exp-factor 10
        p-exp-factor 1
        t-exp-factor 10
        ;;; the numerical values of the upper limits
        m-upper-bound (upper-bound-check (+ m-exp-factor (parent :max-camber)) 9.5)
        p-upper-bound (upper-bound-check (+ p-exp-factor (parent :positon-camber)) 9)
        t-upper-bound (upper-bound-check (+ t-exp-factor (parent :thickness)) 40)
        ;;; the numerical value of the lower limits
        m-lower-bound (lower-bound-check (- (parent :max-camber) m-exp-factor) 0)
        ;p-lower-bound (lower-bound-check (- (parent :positon-camber) p-exp-factor) 0)
        t-lower-bound (lower-bound-check (- (parent :thickness) t-exp-factor) 0)

        t-value (rand-double t-lower-bound t-upper-bound)
        p-lower-bound (lower-bound-check (- (parent :positon-camber) p-exp-factor) (p-min t-value))]

    (NACA-design (rand-double m-lower-bound m-upper-bound)
                 (rand-double p-lower-bound p-upper-bound)
                 t-value)))


(defn rand-individual
  []
  (let [t-value (rand-double 0 40)]
    (NACA-design (rand-double 0 9.5)
                 (rand-double (p-min t-value) 9)
                 t-value)))





