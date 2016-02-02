package tirindelli.lorenzo.commercialista;

public class Commercialista {
	
	private static Clienti[] arrayclienti = new Clienti[100];
	private static int numeroclienti = 0;
	
	
	public static Clienti[] vediclienti() {
		return arrayclienti;
	}
	
	
	public static void impostaclienti(Clienti[] arrayclientiC) {
		//this.arrayclienti = arrayclienti;
		Commercialista.arrayclienti = arrayclientiC;
	}
	
	
	public static void aggiungiclienti(Clienti cliente){
		arrayclienti[numeroclienti++] = cliente;
	}
	
	
	public static int incassototale() {
		int incasso = 0;
		for (int i = 0; i < numeroclienti; i++)
			incasso += arrayclienti[i].calcolaparcella();
		return incasso;
	}
	
}
