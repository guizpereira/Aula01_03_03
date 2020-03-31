package aula3.adsm.ex31;


public class Incremental {	
	private static Incremental singleton = null;
	private static int count = 0;
	private int numero;

	private Incremental() {
		numero = ++count;
	}

	static synchronized  Incremental getInstance() {
		if(singleton ==null) {
		singleton = new Incremental();}
		return singleton;
	}

	public String toString() {
		return "Incrementando: " + numero;
	}
}

