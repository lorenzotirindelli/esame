package tirindelli.lorenzo.commercialista;

public class Imprenditori extends Clienti {

	
	//ATTRIBUTI
	private String piva;
	private int nfatture; 
	private String ragionesociale;
	
	
	//COSTRUTTORI
	//public Imprenditori (){};
	
	public Imprenditori (String pivac, int nfatturec, String nomesocietac, String nomec, String cognomec, String cfc){
		super(nomec, cognomec, cfc);
		this.piva = pivac;
		this.nfatture = nfatturec;
		this.ragionesociale = nomesocietac;
	}
	
	
	//METODO
	@Override
	public int calcolaparcella() {
		int parcella = 0;
		int pb = 50000;
		if (nfatture <= 100) {
			parcella = pb;
		} else {
			parcella = pb + 100*(nfatture-100);
		}
	return parcella;
	}

	
	//GETTERS E SETTERS
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public int getNfatture() {
		return nfatture;
	}
	public void setNfatture(int nfatture) {
		this.nfatture = nfatture;
	}
	public String getNomesocieta() {
		return ragionesociale;
	}
	public void setNomesocieta(String nomesocieta) {
		this.ragionesociale = nomesocieta;
	}
	
}