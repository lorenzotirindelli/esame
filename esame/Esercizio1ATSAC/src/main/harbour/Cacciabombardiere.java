package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Cacciabombardiere extends Invasore {

	private int nArmamentiAlpha;
	private int nArmamentiBeta;
	
	
	@Override
	public int potenzaFuoco () {
		int potFuoco = 0;
		potFuoco = (nArmamentiAlpha + nArmamentiBeta) * 40;
		return potFuoco;
	}

	
	
	
	public int getnArmamentiAlpha() {
		return nArmamentiAlpha;
	}
	public void setnArmamentiAlpha(int nArmamentiAlpha) {
		this.nArmamentiAlpha = nArmamentiAlpha;
	}
	public int getnArmamentiBeta() {
		return nArmamentiBeta;
	}
	public void setnArmamentiBeta(int nArmamentiBeta) {
		this.nArmamentiBeta = nArmamentiBeta;
	}
	
	
}
