package sort;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author simonecappabianca
 *
 */
public class ConfrontoOrdinamenti {
	
	/**
	 * Visualizzo il contenuto della lista passata come parametro. 
	 * 
	 * @param s
	 */
	private static void printList(List s) {
		for (int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		Sort selectionSort = new SelectionSort();
		Sort insertionSort = new InsertionSort();
		Sort bubbleSort = new BubbleSort();
		
		// Dichiaro la lista da controllare
		List<Integer> selectionList = new LinkedList<Integer>();
		List<Integer> insertionList = new LinkedList<Integer>();
		List<Integer> bubbleList = new LinkedList<Integer>();
				
		// Popolo la lista
		for(long i=0;i<50;i++){
			Integer k=new Integer((int)(Math.random()*1000));
			selectionList.add(k);
			insertionList.add(k);
			bubbleList.add(k);
		}
		
		// Selection sort
		System.out.println(selectionSort.getName());
		System.out.println("Lista non ordinata: ");
		printList(selectionList);
		selectionList = selectionSort.sort(selectionList);
		System.out.println(" ");
		System.out.println("Lista ordinata: ");
		printList(selectionList);
		System.out.println(" ");
		System.out.println("Numero di confronti: " + selectionSort.getNumComparisons());
		System.out.println("Tempo (ns): " + selectionSort.getNanoTime());
		
		System.out.println("--------------------------------------------------");
		
		// Insertion sort
		System.out.println(insertionSort.getName());
		System.out.println("Lista non ordinata: ");
		printList(insertionList);
		insertionList = insertionSort.sort(insertionList);
		System.out.println(" ");
		System.out.println("Lista ordinata: ");
		printList(insertionList);
		System.out.println(" ");
		System.out.println("Numero di confronti: " + insertionSort.getNumComparisons());
		System.out.println("Tempo (ns): " + insertionSort.getNanoTime());
		
		System.out.println("--------------------------------------------------");
		
		// Bubble sort
		System.out.println(bubbleSort.getName());
		System.out.println("Lista non ordinata: ");
		printList(bubbleList);
		bubbleList = bubbleSort.sort(bubbleList);
		System.out.println(" ");
		System.out.println("Lista ordinata: ");
		printList(bubbleList);
		System.out.println(" ");
		System.out.println("Numero di confronti: " + bubbleSort.getNumComparisons());
		System.out.println("Tempo (ns): " + bubbleSort.getNanoTime());
	}
}
