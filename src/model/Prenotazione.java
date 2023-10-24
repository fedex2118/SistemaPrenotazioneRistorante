package model;

/**
 * Questa classe si rappresenta la realtà delle prenotazioni di un ristorante.
 */
public class Prenotazione {
	private int id;
	private String data;
	private String orario;
	private int numeroPersone;
	
	private Tavolo tavolo;

	// Costruttori
	public Prenotazione(int id, String data, String orario, int numeroPersone, Tavolo tavolo) {
		this.id = id;
		this.data = data;
		this.orario = orario;
		this.numeroPersone = numeroPersone;
		this.tavolo = tavolo;
	}
	
	public Prenotazione(String data, String orario, int numeroPersone, Tavolo tavolo) {
		this.data = data;
		this.orario = orario;
		this.numeroPersone = numeroPersone;
		this.tavolo = tavolo;
	}

	
	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getOrario() {
		return orario;
	}

	public void setOrario(String orario) {
		this.orario = orario;
	}

	public int getNumeroPersone() {
		return numeroPersone;
	}

	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}
	
	
	
	
	
}
