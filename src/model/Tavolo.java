package model;

/**
 * Classe che si occupa di definire i tavoli di un Ristorante.
 */
public class Tavolo {
	private int id;
	private int numeroPosti;
	
	// Costruttori
	public Tavolo(int id, int numeroPosti) {
		this.id = id;
		this.numeroPosti = numeroPosti;
	}

	
	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	
	@Override
	public String toString() {
		return "\nID_TAVOLO: " + id + "\nNumeroPosti: " + numeroPosti;
	}
	
	
}
