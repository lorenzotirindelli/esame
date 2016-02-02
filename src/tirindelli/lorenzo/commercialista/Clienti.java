package tirindelli.lorenzo.commercialista;

public abstract class Clienti {
	
	
	//ATTRIBUTI
	private String nome;
	private String cognome;
	private String cf;
	
	
	//COSTRUTTORI
	public Clienti (){};

	public Clienti (String nomec, String cognomec, String cfc){
		this.nome = nomec;
		this.cognome = cognomec;
		this.cf = cfc;
	}
	
	
	//METODI
	public abstract int calcolaparcella();
	
	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
}

