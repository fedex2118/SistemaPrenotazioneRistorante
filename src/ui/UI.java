package ui;

import java.util.Scanner;

import model.Ristorante;
import model.Utente;

/**
 * Questa classe rappresenta l'interfaccia utente UI.
 */
public class UI {
	private Utente u;
	private Scanner scanner = new Scanner(System.in);
	
	public UI(Utente u) {
		this.u = u;
	}

	public void displayOpzioni(Ristorante ristorante) {
		boolean exit = false;
		
		while(!exit) {
			System.out.println("Scegli un opzione:");
			System.out.println("0: Prenota un tavolo");
			System.out.println("1. Esci");
			
			int opz = scanner.nextInt();
			// TODO visualizza prenotazioni correnti
			
			switch(opz) {
			case 0:
				// scegliere data, orario e numeropersone
				break;
			case 1:
				exit = true;
				break;
			default:
				System.out.println("errore: riprova!");
			}
		}
	}
	
	private String scegliData() {
		String data = scanner.nextLine();
		
		return "";
	}
	
	private String scegliOrario() {
		String orario = scanner.nextLine();
		
		return "";
	}
	
	private int scegliNumeroPersone() {
		int numeroPersone = scanner.nextInt();
		scanner.nextLine();
		
		return 0;
	}
	
	// Getters & Setters
	public Utente getU() {
		return u;
	}

	public void setU(Utente u) {
		this.u = u;
	}
	
	
}
