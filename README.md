# test-sound

demonstrate a google closure compiler problem when calling decodeAudioData on an AudioContext in clojurescript

# replicate

$ lein cljsbuild once
$ tail -10 out-adv/test_sound.min.js

yc.prototype.Ra = function(a, b) {
  return xc(this, b);
};
(new AudioContext).Eb(new ArrayBuffer(256), function(a) {
  return ae.j(Rb(["ok", a], 0));
}, function(a) {
  return ae.j(Rb(["error", a], 0));
});

})();


notice the .Eb(...) call. This should be .decodeAudio(...)

The w3c_audio.js extern file doesn't seem to work.
