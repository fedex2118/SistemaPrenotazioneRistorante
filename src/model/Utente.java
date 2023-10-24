package model;


/**
 * Questa classe rappresenta l'utente che vuole effettuare prenotazioni al ristorante.
 */
public class Utente {
	private String nome;
	private String pwd;
	
	// Costruttori
	public Utente(String nome, String pwd) {
		this.nome = nome;
		this.pwd = pwd;
	}

	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
	
}
