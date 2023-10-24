package model;

/**
 * Classe che si occupa di definire i tavoli di un Ristorante.
 */
public class Tavolo {
	private int id;
	private int numeroPosti;
	private boolean libero = true;
	
	public Tavolo(int id, int numeroPosti) {
		this.id = id;
		this.numeroPosti = numeroPosti;
	}

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

	public boolean isLibero() {
		return libero;
	}

	public void setLibero(boolean libero) {
		this.libero = libero;
	}
	
	
	
	
}
