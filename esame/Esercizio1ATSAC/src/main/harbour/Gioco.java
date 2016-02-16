package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {

	private Porto porto;
	
	public Gioco (Porto portoC) {
		this.porto = portoC;
	};
	
	
	public void attacco(Invasore invasori[]){
		for(Invasore inv: invasori){
			double potenzadifuoco = inv.potenzaFuoco();
			porto.addMetriQuadriDistrutti(potenzadifuoco * 2.5);
		}
	}
	
	public boolean portoDistrutto(){
		return porto.getDimensioneSqMetersNonDistrutta() <= 0; 
	}

	
	
	
	/*public void attacco() {
		double metriDistruttiPorto = Invasore.potenzaFuoco() * 2.5;
	}
	
	double metriNonDistrutti = Porto.getDimensioneSqMetersNonDistrutta();
	public void portoDistrutto() {
		if (Porto.getDimensioneSqMetersNonDistrutta() == 0);
	}*/
	
}
