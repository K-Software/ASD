import java.util.List;

/**
/**
 * Algoritmi e Strutture Dati: Laboratorio
 * Lezione del 3 marzo 2014
 * Interfaccia di definizione dei metodi di controllo duplicati
 * 
 * @author simonecappabianca
 *
 */
public interface AlgoDup {
	
	/**
	 * Questo metodo controlla la presenza di valori duplicato all'interno della lista 
	 * passata come parametro e restituisce true o false a secondo della presenza o meno 
	 * di valori duplicati all'interno della lista.
	 * 
	 * @param S Lista da controllare
	 * @return Restituisce true se la lista contiene almeno un valore duplicato
	 */
	public boolean verificaDup(List S);
	
	/**
	 * Questo metodo restituisce i valori duplicati presenti all'interno della lista.
	 * 
	 * @param S Lista da controllare
	 * @return Restituisce una lista con all'interno i valori duplicati presenti nella
	 * lista S
	 */
	public List getDup(List S);
}
