package tirindelli.lorenzo.test.commercialista;

import static org.junit.Assert.*;

import org.junit.Test;

import tirindelli.lorenzo.commercialista.Commercialista;
import tirindelli.lorenzo.commercialista.Dipendenti;
import tirindelli.lorenzo.commercialista.Imprenditori;
import tirindelli.lorenzo.commercialista.Liberi_Professionisti;

public class CommercialistaTest {

	@Test
	public void test() {
		Dipendenti dip = new Dipendenti("dip", "pid", "dippid123");
		Commercialista.aggiungiclienti(dip);
		assertEquals(5000, Commercialista.incassototale());
		
		Liberi_Professionisti lib = new Liberi_Professionisti("lib", "bil", "libbil123", "123456789", 10);
		Commercialista.aggiungiclienti(lib);
		assertEquals(10500, Commercialista.incassototale());
		
		Imprenditori imp = new Imprenditori("123456789", 101, "impeco", "imp", "pmi", "imppmi123");
		Commercialista.aggiungiclienti(imp);
		assertEquals(60600, Commercialista.incassototale());
		
		System.out.println("Incasso totale in centesimi di euro: " + Commercialista.incassototale());
		
	}

}
