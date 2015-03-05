package sort;
import java.util.List;

/**
 * Questa classe implementa il BubbleSort.
 * 
 * L'algoritmo di ordinamento a bolle opera eseguando una serie di scansioni 
 * dell'array: in ogni scansione sono confrontate coppie di elementi adiacenti,
 * e viene efettuato uno scambio se i due elementi son rispettano l'ordinamento.
 * Se durante una scansione non viene effettuato nessuno scambio, l'array é 
 * ordinato e l'algoritmo terminato.
 * 
 * @author simonecappabianca
 *
 */
public class BubbleSort implements Sort {

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
		return "Bubble Sort";
	}

	@Override
	public List<Integer> sort(List<Integer> l) {
		numNanoTime = System.nanoTime();
		for (int k = 0; k < l.size() - 1; k++) {
			boolean flag = false;
			
			//Se l' elemento j e maggiore del successivo allora
            //scambiamo i valori
			for (int j = 0; j < l.size() - k - 1; j++) {
				numComparisons++;
				if (l.get(j) > l.get(j + 1)) {
					int temp = l.get(j);
					l.set(j, l.get(j + 1));
					l.set(j + 1, temp);
					
					//Setto flag a true per indicare che é avvenuto almeno uno 
					//scambio
					flag = true;
				}
			}
			if (!flag) {
				break;
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
