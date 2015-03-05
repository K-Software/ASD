import java.util.LinkedList;
import java.util.List;

/**
 * Algoritmi e Strutture Dati: Laboratorio
 * Lezione del 10 marzo 2014
 * Si fornisce un altro metodo (boolean VerificaDupArray), che implementa ancora 
 * l'interfaccia AlgoDup, che utilizza ancora la strategia dei due for annidati. 
 * Questo esegue sicuramente un numero di confronti proporzionale a n^2, dove n 
 * e' il numero di elementi. Un confronto di questo metodo con quello della scorsa 
 * lezione suggerisce che quest'ultimo non esegue un numero di confronti dello 
 * stesso ordine di grandezza. La ragione risiede nel fatto che nel primo metodo 
 * gli elementi sono organizzati in un array dove l'accesso ad ogni elemento e' 
 * costante anziche' proporzionale alla posizione occupata nella lista del metodo 
 * della volta scorsa.
 * 
 * @author simonecappabianca
 *
 */
public class VerificaDupArray extends TrovaDup {

	@Override
	public boolean verificaDup(List S) {
		//boolean t=false;
		Object[] T=S.toArray();
		
		// Inizializzo il tempo di partenza
		long inizio=System.nanoTime();
		for(int i=0;i<T.length;i++){
			Object x=T[i];
			for(int j=i+1;j<T.length;j++){
				Object y=T[j];
				if(x.equals(y)){
					long tempo=System.nanoTime()-inizio;
					System.out.println("Tempo di esecuzione DupArray: \t"+ tempo);
					return true;
				}
			}
		}
		long tempo=System.nanoTime()-inizio;
		System.out.println("Tempo di esecuzione DupArray: \t"+ tempo);
		return false;
	}

}
