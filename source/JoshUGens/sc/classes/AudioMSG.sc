AudioMSG : UGen {
		^this.multiNew('audio', in, index).madd(mul, add);
	}

//(in*0.5pi) + (in*2pi*index)
/*

s = Server.internal.boot;
s.scope(1);
{AudioMSG.ar(SinOsc.ar(440, 0, 0.3), MouseX.kr(0, 2pi))}.play(s);
s.quit;
*/