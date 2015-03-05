package sort;
import java.util.List;

/**
 * Questa classe implementa il SelectionSort.
 * 
 * L' idea di base di questo algoritmo si fonda nel selezionare ad ogni 
 * iterazione l'i-esimo valore piú piccolo, e sostituirlo con quello che in 
 * quel momento occupa l' i-esima posizione.
 * 
 *  In altre parole alla prima iterazione verrá selezionato il valore piú 
 *  piccolo dell'intero vettore e sará scambiato con il valore che in quel 
 *  momento occupa la prima posizione, poi alla seconda iterazione viene 
 *  selezionato il secondo valore piú piccolo del vettore e sará scambiato 
 *  con il valore che in quel momento occupa la seconda posizione, e cosí via 
 *  fino a quando tutti gli elementi del vettore non sono collocati nella loro 
 *  giusta posizione.
 * 
 * @author simonecappabianca
 *
 */
public class SelectionSort implements Sort {
	
	/**
	 * Numero di ns(nanosecondi) necessari ad ordinare la lista.
	 */
	private long numNanoTime;
	
	/**
	 * Numero di confronti effettuati per ordinare la lista.
	 */
	private int numComparisons;
	
	@Override
	public String getName() {
		return "Selection Sort";
	}
	
	@Override
	public List<Integer> sort(List<Integer> l) {
		numNanoTime = System.nanoTime();
		for(int k = 0; k < l.size() - 1; k++) {
			Integer indexOfMinElement = k; // Partiamo dall'i-esimo elemento
			for (int j = k + 1; j < l.size(); j++) {
				numComparisons++;
				
				//Qui avviene la selezione, ogni volta che nell' iterazione 
				//troviamo un elemento piú piccolo di indexOfMinElement
	            //facciamo puntare indexOfMinElement all' elemento trovato
				if(l.get(j) < l.get(indexOfMinElement)) {
					indexOfMinElement = j;
				}
			}
			
			//Se indexOfMinElement e diverso dall' elemento di partenza
            //allora avviene lo scambio
			if (indexOfMinElement != k) {
				Integer temp = l.get(k);
				l.set(k, l.get(indexOfMinElement));
				l.set(indexOfMinElement, temp);
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
