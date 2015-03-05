package sort;
import java.util.List;

/**
 * 
 * @author simonecappabianca
 *
 */
public interface Sort {
	
	/**
	 * Restituisce il nome del metodo di ordinamento.
	 * 
	 * @return Restituisce il nome dell'ordinamento
	 */
	public String getName();
	
	/**
	 * Data  una lista come parametro restituisce la lista ordinata.
	 * 
	 * @param l Lista da ordinare
	 * @return Restituisce la lista ordinata
	 */
	public List<Integer> sort(List<Integer> l);
	
	/**
	 * Conta il numero di nano secondi necessari ad ordinare la stringa.
	 * 
	 * @return Restituisce il numero di nano secondi.
	 */
	public Long getNanoTime();
	
	/**
	 * Conta il numero di confronti effettuati per ordinare la lista.
	 * 
	 * @return Restituisce il numero di confronti
	 */
	public Integer getNumComparisons();
}
