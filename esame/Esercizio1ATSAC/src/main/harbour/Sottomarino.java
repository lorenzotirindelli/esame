package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Sottomarino extends Invasore {
	
	private int nArmamenti;
	private int stazza;
	
	@Override
	public int potenzaFuoco () {
		double potFuoco = 0;
		potFuoco = (nArmamenti * stazza) * 0.25;
		return (int)Math.round(potFuoco);
	}

	
	
	public int getnArmamenti() {
		return nArmamenti;
	}
	public void setnArmamenti(int nArmamenti) {
		this.nArmamenti = nArmamenti;
	}
	public int getStazza() {
		return stazza;
	}
	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	
	
	

	
}
