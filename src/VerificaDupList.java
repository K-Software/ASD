import java.util.LinkedList;
import java.util.List;

/**
 * Algoritmi e Strutture Dati: Laboratorio
 * Lezione del 3 marzo 2014
 * Questa classe implementa l'interfaccia AlgoDup.
 * Per effettuare il controllo della presenza di duplicati per ogni elemento 
 * delle lista lo controlla con tutti gli elemnti suggessivi.
 * Il metodo getDup che individua gli elemti duppi all'interno delle lista
 * utilizza due for annidiati quindi avra un costo proporzioanle a nˆ2.  
 * 
 * @author simonecappabianca
 *
 */
public class VerificaDupList extends TrovaDup {

	@Override
	public boolean verificaDup(List S) {
		
		// Inizializzo il tempo di partenza
		long inizio=System.nanoTime();
		for(int i=0;i<S.size();i++){
			Object x=S.get(i);
			for(int j=i+1;j<S.size();j++){
				Object y=S.get(j);
				if(x.equals(y)){
					long tempo=System.nanoTime()-inizio;
					System.out.println("Tempo di esecuzione DupList: \t"+ tempo);
					return true;
				}
			}
		}
		long tempo=System.nanoTime()-inizio;
		System.out.println("Tempo di esecuzione DupList: \t"+ tempo);
		return false;
	}
	
}