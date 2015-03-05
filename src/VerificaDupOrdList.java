import java.util.Collections;
import java.util.List;

/**
 * Algoritmi e Strutture Dati: Laboratorio
 * Lezione del 17 marzo 2014
 * Si aggiungono al progetto Duplicati due nuove classi: VerificaDUpOrdList e 
 * VerificaDupOrdArray che, rispettivamente, prima ordinano la lista e l'array 
 * per poi verificare che le coppie di elementi successivi non siano uguali. 
 * L'ordinamento viene eseguito con il metodo sort() della classe Collections. 
 * Esso è possibile solo se gli elementi sono comparabili, ossia se sono istanza 
 * di una classe che implementa l'intefaccia Comparable. Si fornisce poi una 
 * classe Prenotazione che è da intendere come la scheda di uno studente che si 
 * prenota ad un esame. Per verificare se in un insieme di studenti prenotati ad 
 * un esame ci sono duplicati, volendo utilizzare una delle due ultime classi, 
 * è necessario che la classe Prenotazione implementi l'interfaccia Comparable.
 * 
 * @author simonecappabianca
 *
 */
public class VerificaDupOrdList extends TrovaDup {

	@Override
	public boolean verificaDup(List S) {
		
		// Ordino la collezione tramite il metodo sort
		Collections.sort(S);
		
		// Inizializzo il tempo di partenza
		long inizio=System.nanoTime();
		
		/*
		 *  Ciclo che inizia da 0 fino alla lunghezza di T, come si puó notare
		 *  con la lista ordinato non sono necessari due cicli for annidati 
		 *  perché il ordinamento fa si che l'eventuale duppio sia il successivo
		 *  all'elemento che stiamo controllando 
		 */
		for(int i=0;i<S.size()-1;i++)
			if(S.get(i).equals(S.get(i+1))) {
				long tempo=System.nanoTime()-inizio;
				System.out.println("Tempo di esecuzione DupOrdList: \t"+ tempo);
				return true;
			}
		long tempo=System.nanoTime()-inizio;
		System.out.println("Tempo di esecuzione DupOrdList: \t"+ tempo);
		return false;
	}

}
