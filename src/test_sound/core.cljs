(ns test-sound.core)

(let [audio-context (js/AudioContext.)]
  (.decodeAudioData audio-context (js/ArrayBuffer. 256) #(println "ok" %) #(println "error" %)))
