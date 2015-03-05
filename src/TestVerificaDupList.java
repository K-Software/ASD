import java.util.*;

/**
 * Algoritmi e Strutture Dati: Laboratorio
 * Lezione del 3 marzo 2014
 * 
 * @author simonecappabianca
 *
 */
public class TestVerificaDupList {
	
	public static void main(String args[]) {
		AlgoDup v = new VerificaDupList();
		
		// Si istanzia una nuova lista
		List S=new LinkedList();
		
		
		// Popoliamo la lista con dei valori numerici casuali
		for(long i=0;i<20;i++){
			Integer k=new Integer((int)(Math.random()*1000));
			S.add(k);
		}
		
		// Visualizzo il contenuto della lista
		String sep = "";
		for(int i=0;i<S.size();i++) {
			System.out.print(sep + S.get(i));
			sep = " - ";
		}
		
		System.out.println();
		
		// Visualizzo i valori duplicati
		List dup = v.getDup(S);
		sep = "";
		for(int i=0;i<dup.size();i++) {
			System.out.println(sep + dup.get(i));
			sep = " - ";
		}

		// Controllo la presenza di duplicati
		System.out.println(v.verificaDup(S));
	}

}
