import java.util.Arrays;
import java.util.List;

/**
 * Algoritmi e Strutture Dati: Laboratorio
 * Lezione del 17 marzo 2014
 * Si aggiungono al progetto Duplicati due nuove classi: VerificaDUpOrdList e 
 * VerificaDupOrdArray che, rispettivamente, prima ordinano la lista e l'array 
 * per poi verificare che le coppie di elementi successivi non siano uguali. 
 * L'ordinamento viene eseguito con il metodo sort() della classe Collections. 
 * Esso è possibile solo se gli elementi sono comparabili, ossia se sono istanza 
 * di una classe che implementa l'intefaccia Comparable. 
 * 
 * @author simonecappabianca
 *
 */
public class VerificaDupOrdArray extends TrovaDup {
	
	@Override
	public boolean verificaDup(List s) {
		Object[] t=s.toArray();
		
		
		// Ordino la collezione tramite il metodo sort
		Arrays.sort(t);
		
		// Inizializzo il tempo di partenza
		long inizio=System.nanoTime();
		
		/*
		 *  Ciclo che inizia da 0 fino alla lunghezza di T, come si puó notare
		 *  con l'array ordinato non sono necessari due cicli for annidati 
		 *  perché il ordinamento fa si che l'eventuale duppio sia il successivo
		 *  all'elemento che stiamo controllando 
		 */
		for(int i=0;i<t.length-1;i++) {
			if(t[i].equals(t[i+1])) {
				long tempo=System.nanoTime()-inizio;
				System.out.println("Tempo di esecuzione DupOrdArray: \t"+ tempo);
				return true;
			}
		}
		long tempo=System.nanoTime()-inizio;
		System.out.println("Tempo di esecuzione DupOrdArray: \t"+ tempo);
		return false;
	}
}
