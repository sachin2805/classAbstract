package classAbstract;

public class SoundInstrument {

	public static void main(String[] args) {
		Instrument i=new Piano(){};
		i.play();
		i=new Flute(){};
		i.play();
		i=new guitar(){};
		i.play();

	}

}
