import java.util.LinkedList;
import java.util.List;


/**
 * Algoritmi e Strutture Dati: Laboratorio
 * Lezione del 10 marzo 2014
 * Questa classe confronta due metodi di ricerca dei duplicati implementati
 * fino a questo momento.
 * Da come si puo' vedere dai tempi di eseguzione la ricerca di un eventuale 
 * duplicato su lista e array ordinati sono notevolmente piú veloci rispetto
 * ad liste e array non ordinati.
 * Naturalmente quanto detto sopra é vero se si esclude il tempo di ordinamento
 * delle strutture.
 * 
 * @author simonecappabianca
 *
 */
public class ConfrontoRicercaDup {

	public static void main(String[] args) {
		AlgoDup verificaDupList = new VerificaDupList();
		AlgoDup verificaDupArray = new VerificaDupArray();
		AlgoDup verificaDupOrdArray = new VerificaDupOrdArray();
		AlgoDup verificaDupOrdList = new VerificaDupOrdList();
		
		
		// Dichiaro la lista da controllare
		List S=new LinkedList();
		
		// Popolo la lista
		for(long i=0;i<10000000;i++){
			Integer k=new Integer((int)(Math.random()*1000));
			S.add(k);
		}
		
		System.out.println("(List) " + verificaDupList.verificaDup(S));
		System.out.println("(Array) " + verificaDupArray.verificaDup(S));
		System.out.println("(List) " + verificaDupOrdList.verificaDup(S));
		System.out.println("(Array) " + verificaDupOrdArray.verificaDup(S));
	}

}
