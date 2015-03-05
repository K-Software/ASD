package sort;
import java.util.List;

/**
 * Questa classe implemente l'InsertionSort.
 *  
 * Dato un vettore di n elementi, vengono effettuate n-1 iterazioni ed a ogni 
 * iterazione k, si scandisce una porzione del vettore cha va da k-1 a 0 
 * trovando la posizione giusta dell'k-esimo elemento, tramite una serie di 
 * scambi. Quindi procedendo in questo modo la porzione del vettore che va da 
 * k-1 a 0 risulterá sempre ordinata e alla fine di n iterazioni tutto il vettore 
 * risulterá ordinato. 
 * 
 * @author simonecappabianca
 *
 */
public class InsertionSort implements Sort {

	/**
	 * Numero di ns(nanosecondi) necessari ad ordinare la lista.
	 */
	private Long numNanoTime;
	
	/**
	 * Numero di confronti effettuati per ordinare la lista.
	 */
	private int numComparisons;
	
	@Override
	public String getName() {
		return "Insertion Sort";
	}
	
	@Override
	public List<Integer> sort(List<Integer> l) {
		numNanoTime = System.nanoTime();
		for (int k = 1; k < l.size(); k++) {
			int rightPos = k;
			for (int j = k - 1; j >= 0; j--) { 
				numComparisons++;
				
				// Controllo che nel sotto-vettore 
				if(l.get(j) > l.get(rightPos)) {
					
					//Scambiamo l'elemento in posizione rightPos fino a quando 
					//non raggiunge la posizione corretta nel sotto-vettore, 
					//cioé quando non é verificata piú questa condizione
					int temp = l.get(rightPos);
					l.set(rightPos, l.get(j));
					l.set(j, temp);
					rightPos = j; //La sua nuova posizione nel sotto-vettore
				} else {
					
					//Significa che l'i-esimo elemento è nella sua giusta 
					//posizione quindi possiamo terminare l' iterazione
					break; 
				}
	                             
			}			
		}
		numNanoTime = System.nanoTime() - numNanoTime;
		return l;
	}

	@Override
	public Long getNanoTime() {
		return numNanoTime;
	}

	@Override
	public Integer getNumComparisons() {
		return numComparisons;
	}
	
}
