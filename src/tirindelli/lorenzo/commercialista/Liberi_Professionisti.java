package tirindelli.lorenzo.commercialista;

public class Liberi_Professionisti extends Clienti {

	
	//ATTRIBUTI
	private String piva;
	private int nfatture;
	
	
	//COSTRUTTORI
	//public Liberi_Professionisti (){};
	
	public Liberi_Professionisti(String nomec, String cognomec, String cfc, String pivac, int nfatturec) {
		super(nomec, cognomec, cfc);
		this.piva = pivac;
		this.nfatture = nfatturec;
	}

	
	//METODO
	@Override
	public int calcolaparcella() {
		int parcella = 0;
		int pb = 5000;
		if (nfatture != 0) {
			parcella = pb + 50*nfatture;
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
	
}

