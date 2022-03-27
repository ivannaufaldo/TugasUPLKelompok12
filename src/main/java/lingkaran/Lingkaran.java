package lingkaran;

public class Lingkaran {
	private double r;
	private double phi = 3.14;
	
	public Lingkaran() {
		this.r=0;
	}
	public Lingkaran(double r) {
		this.r= r;
	}
	
	public void setJariJari(double r) {
		this.r=r;
	}
	public double Luas() {
		return phi*r*r;
	}
	public double getJariJari() {
		return this.r;
				
	}
}
