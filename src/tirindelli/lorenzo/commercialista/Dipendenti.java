package tirindelli.lorenzo.commercialista;

public class Dipendenti extends Clienti {
	
	
	//COSTRUTTORI
	//public Dipendenti(){};
	
	public Dipendenti (String nomec, String cognomec, String cfc){
		super(nomec, cognomec, cfc);
	}
	
	
	//METODO
	@Override
	public int calcolaparcella() {
		return 5000;
	}
	
	
	
}

