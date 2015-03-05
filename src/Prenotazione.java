
/**
 * Algoritmi e Strutture Dati: Laboratorio<br>
 * Lezione del 17 marzo 2014<br>
 * Si fornisce poi una classe Prenotazione che è da intendere come la scheda di 
 * uno studente che si prenota ad un esame. Per verificare se in un insieme di 
 * studenti prenotati ad un esame ci sono duplicati, volendo utilizzare una 
 * delle due ultime classi, è necessario che la classe Prenotazione implementi 
 * l'interfaccia Comparable.
 * 
 * @author simonecappabianca
 *
 */
public class Prenotazione implements Comparable {
	
	/**
	 * Nome dello studente
	 */
	private String Nome;
	
	/**
	 * Cognome dello studente
	 */
	private String Cognome;
	
	/**
	 * Numero di matricolo dello studente
	 */
	private int Matricola;
	
	/**
	 * Costruttore dell'oggetto che inizializa gli attributi nome, cognome e 
	 * numero di matricola
	 * 
	 * @param n Nome dello studente
	 * @param c Cognome dello studente
	 * @param m Numero di matricola dello studenste
	 */
	public Prenotazione(String n, String c, int m){
		Nome = n;
		Cognome = c;
		Matricola = m;
	}
	
	/**
	 * Metodo per recuperare il contenuto della dell'attributo Nome
	 * 
	 * @return Ritorna il contenuto dell'attributo Nome
	 */
	public String getNome() {
		return Nome;
	}
	
	/**
	 * Metodo per settare il contenuto dell'attributo Nome
	 * 
	 * @param nome Valore da assegnare all'attributo Nome
	 */
	public void setNome(String nome) {
		Nome = nome;
	}
	
	/**
	 * Metodo per recuperare il contenuto dell'attributo Cognome
	 * 
	 * @return Ritorna il contenuto dell'attributo Cognome
	 */
	public String getCognome() {
		return Cognome;
	}
	
	/**
	 * Metodo per settare il contenuto dell'attributo Cognome
	 * 
	 * @param cognome Valore da assegnare all'attributo Cognome
	 */
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	
	/**
	 * Metodo per recuperare il contenuto dell'attributo Matricola
	 * 
	 * @return Riturna il contenuto dell'attributo Matricola
	 */
	public int getMatricola() {
		return Matricola;
	}
	
	/**
	 * Metodo per settare il contenuto dell'attributo Matricola
	 * 
	 * @param mat Valore da assegnare all'attributo Matricola
	 */
	public void setMatricola(int mat) {
		Matricola = mat;
	}
	
	/**
	 * Questo metodo ritorna true quando gli attributi Nome, Cognome e Matricola 
	 * degli oggetti che si stanno confrontando sono ugnali. 
	 */
	public boolean equals(Object x){

		Prenotazione p=(Prenotazione)x;
		return (Nome.equals(p.Nome)&&
				Cognome.equals(p.Cognome)&&
				Matricola==p.Matricola);
	}
	
	/**
	 * Questo metodo utilizza il metodo comare dell'oggetto String
	 */
	public int compareTo(Object x){
		Prenotazione p=(Prenotazione) x;
		if(Nome.compareTo(p.Nome)<0)
			return -1;
		if(Nome.compareTo(p.Nome)>0)
			return 1;
		if(Cognome.compareTo(p.Cognome)<0)
			return -1;
		if(Cognome.compareTo(p.Cognome)>0)
			return 1;
		if(Matricola<p.Matricola)
			return -1;
		if(Matricola>p.Matricola)
			return 1;
		return 0;
	}

}
