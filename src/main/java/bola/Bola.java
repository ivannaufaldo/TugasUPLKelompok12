package bola;
import lingkaran.Lingkaran;

public class Bola extends Lingkaran {

	private Lingkaran lingkaran;
	
	public Bola(Lingkaran lingkaran) {
		this.lingkaran=lingkaran;
	}
	
	public double LuasBola() {
		return lingkaran.Luas()*4;
	}
	
	public double VolumeBola() {
		return (LuasBola()*lingkaran.getJariJari())/3;
	}

}
