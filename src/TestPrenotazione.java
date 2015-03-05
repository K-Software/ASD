import java.util.List;
import java.util.LinkedList;

/**
 * Algoritmi e Strutture Dati: Laboratorio
 * Lezione del 17 marzo 2014
 * In questa classe si utilizzano i metodi fin qui realizzati per la ricerca dei
 * duplicati applicati non ad una semplice lista di interi ma ad una lista di 
 * oggetti Prenotazione. Si utilizza si la versione con lista non ordinata che
 * quella con lista ordinata.
 * 
 * @author simonecappabianca
 *
 */
public class TestPrenotazione {
	
	private static String[] nomi = {"Simone", "Andrea", "Antonella", "Sara", "Francesco"
			, "Salvatore", "Tommaso", "Maria", "Federica", "Stefania"};
	private static String[] cognomi = {"Cappabianca", "Agrusa", "Rossi", "Bianchi", "Esposito"
			, "Galati", "Gelli", "Tamburri", "Evola", "Brunelli"};

	public static void main(String[] args) {
		AlgoDup verificaDupList = new VerificaDupList();
		AlgoDup verificaDupOrdList = new VerificaDupOrdList();
		List<Prenotazione> prenotazioni = new LinkedList<Prenotazione>();
		prenotazioni.add(new Prenotazione("Simone", "Cappabianca", 5423306));
		prenotazioni.add(new Prenotazione("Simone", "Cappabianca", 5423306));
		prenotazioni.add(new Prenotazione("Antonella", "Agrusa", 5423305));
		
		// Popolo la prenotazione
		for(long i=0;i<100;i++){
			Integer indNome = new Integer((int)(Math.random()*1000));
			Integer indCognome = new Integer((int)(Math.random()*1000));
			Integer matricola = new Integer((int)(Math.random()*1000));
			prenotazioni.add(new Prenotazione(nomi[indNome % 10], cognomi[indCognome % 10], matricola));
		}
		
		System.out.println("(List) " + verificaDupList.verificaDup(prenotazioni));
		System.out.println("(List) " + verificaDupOrdList.verificaDup(prenotazioni));
	}

}
