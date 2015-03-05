/**
 * Algoritmi e Strutture Dati: Laboratorio<br>
 * Lezione del 24 marzo 2014<br>
 * Progetto CODE<br>
 * Utilizzare un array di Object per simulare una coda. Seguire le quattro 
 * strategie di seguito spiegate, costruendo quattro differenti classi che 
 * implementano tutte la stessa interfaccia Coda.<br>
 * <ul>
 * <li> CodaArrayFix1: gli elementi sono memorizzati in un array in modo che 
 * occupino sempre le prime posizioni dell'array. Gli inserimenti avvengo dalla 
 * fine dell'array mentre le estrazioni si fanno dalla parte del primo elemento. 
 * Dopo ogni estrazione si deve ricompattare gli elementi facendoli scorrere di 
 * un posto verso sinistra.</li>
 * <li> CodaArrayFix2: come prima, ma si tengono in memoria due indici, front e 
 * rear, che segnano rispettivamente l'indice dell'elemento che sarà prossimamente 
 * estratto e l'indice dell'elemento dove avverrà il prossimo inserimento. Non 
 * si richiede il ricompattamento dell'array dopo l'estrazione.</li>
 * <li> CodaArrayFixCircolare: l'array viene pensato circolare. Ossia, gli indici 
 * rear e front hanno la possibilità, una volta arrivati alla fine dell'array, 
 * di ripartire dall'inizio dell'array.</li>
 * <li> CodaArrayDinamico: quando gli elementi occupano tutta la dimensione 
 * dell'array (meno uno) allora il metodo per l'inserimento deve prevedere un 
 * raddoppiamento dell'array. Si alloca cioè un nuovo array lungo il doppio e si 
 * ricopia in esso il contenuto del precedente. Il metodo estrai invece, deve 
 * prevedere, se gli elementi che ci sono nella coda sono meno di un quarto della 
 * lunghezza, l'allocazione di un array lungo la metà che viene riempito con gli 
 * elementi presenti nella coda.</li>
 * </ul> 
 * 
 * @author simonecappabianca
 *
 */
public interface Coda {
	
	/**
	 * Metodo per svuotare la coda
	 */
	public void rendiVuota();
	
	/**
	 * Medoto per controllare se la coda é vuota.
	 * 
	 * @return Restituisce true se la lista é vuota, false altrimenti
	 */
	public boolean vuota();
	
	/**
	 * Metodo per inserire in fondo alla coda l'oggetto x
	 * 
	 * @param x Oggetto da inserire nella coda
	 */
	public void inserisci(Object x);
	
	/**
	 * Metodo per recupera l'oggetto in testa alla coda
	 * 
	 * @return Ritorna l'oggetto in testa alla coda
	 */
	public Object getFront();
	
	/**
	 * Metodo per estrarre (eliminare dalla coda) l'oggetto in testa alla coda
	 * 
	 * @return Restituisce l'oggetto in testa alla coda
	 */
	public Object estrai();
	
	/**
	 * Metodo per stampare il contenuto della coda
	 */
	public void stampaCoda();
}
