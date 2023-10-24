package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import service.PrenotazioneService;

/**
 * Classe che rappresenta un ristorante.
 */
public class Ristorante implements PrenotazioneService {

	public ArrayList<Tavolo> tavoli = new ArrayList<>();
	public ArrayList<Tavolo> tavoliDisponibili = new ArrayList<>();

	// key tavoloID: [p1, p2, p3]
	public HashMap<Integer, ArrayList<Prenotazione>> prenotazioni = new HashMap<>();

	/**
	 * Metodo per aggiungere tavoli al ristorante.
	 */
	public void aggiungiTavolo(Tavolo t) {
		tavoli.add(t);
	}

	/**
	 * Metodo per rimuovere tavoli che si basa sull'id dei tavoli.
	 * 
	 * @param id
	 */
	public void rimuoviTavolo(int id) {
		for (Tavolo tavolo : tavoli) {
			if (tavolo.getId() == id)
				tavoli.remove(id);
		}
	}

	@Override
	public void prenotaTavolo(Tavolo t, String data, String orario, int numeroPersone) {
		// verificare la disponibilita
		verificaDisponibilitàTavolo(data, orario, numeroPersone);
		// mostra i tavoli disponibili
		getTavoliDisponibili();
		
		// adesso puoi scegliere un tavolo tra questi
		
		// utente sceglie e se è errato si riprova
		
		// se è corretto si aggiunge quel tavolo alle prenotazioni possibili
		int key = t.getId();
		
		ArrayList<Prenotazione> prenotazioniTavolo = prenotazioni.get(key);
		
		// crea una nuova prenotazione
		
		Prenotazione p = new Prenotazione(data, orario, numeroPersone, t);
		
		if(prenotazioniTavolo == null) { // chiave mai inserita prima
			prenotazioniTavolo = new ArrayList<>();
		}
		prenotazioniTavolo.add(p);
		prenotazioni.put(key, prenotazioniTavolo); // aggiungo alle prenotazioni
	}

	@Override
	public void annullaPrenotazione(Prenotazione p) {
		int key = p.getTavolo().getId();
		
		ArrayList<Prenotazione> prenotazioniTavolo = prenotazioni.get(key);
		
		prenotazioniTavolo.remove(p);
		
		prenotazioni.put(key, prenotazioniTavolo);
	}

	@Override
	public ArrayList<Tavolo> getTavoliDisponibili() {
		return tavoliDisponibili;
	}

	/**
	 * Metodo che controlla se il tavolo per una data, orario e numero persone è disponibile
	 * @param data
	 * @param orario
	 * @param numeroPersone
	 */
	private void verificaDisponibilitàTavolo(String data, String orario, int numeroPersone) {
		if (prenotazioni.isEmpty()) {
			// sono disponibili tutti i tavoli!
		}
		HashSet<Integer> idTavoliDisponibili = new HashSet<>();

		for (int tavoloId : prenotazioni.keySet()) {
			ArrayList<Integer> checkDisponibilita = new ArrayList<>();

			for (Prenotazione p : prenotazioni.get(tavoloId)) {
				if (p.getData().equals(data)) { // data uguale
					if (p.getOrario().equals(orario)) { // data uguale, orario uguale
						checkDisponibilita.add(0);
					} else if (p.getTavolo().getNumeroPosti() >= numeroPersone) { // data uguale, orario diverso
						checkDisponibilita.add(1);
					} else { // data uguale, orario diverso e non ha numero posti possibile
						checkDisponibilita.add(0);
					}
				} else { // data diversa
					checkDisponibilita.add(1);
				}
			}
			// alla fine se sono tutti 1, va tutto bene
			// se c'è anche un solo 0 non è possibile prenotare

			boolean tavoloDisponibile = true;

			for (int i : checkDisponibilita) {
				if (i == 0) {
					// NON E' DISPONIBILE
					tavoloDisponibile = false;
				}
			}
			if (tavoloDisponibile) {
				idTavoliDisponibili.add(tavoloId);
			}
		}

		ArrayList<Tavolo> tavoliDisponibili = new ArrayList<>();
		
		for (int id : idTavoliDisponibili) {
			for (Tavolo tavolo : tavoli) {
				if(id == tavolo.getId()) {
					tavoliDisponibili.add(tavolo);
				}
			}
		}
		
		this.setTavoliDisponibili(tavoliDisponibili);
		
		System.out.println(tavoliDisponibili);

	}

	// Getters & Setters
	public ArrayList<Tavolo> getTavoli() {
		return tavoli;
	}

	public void setTavoli(ArrayList<Tavolo> tavoli) {
		this.tavoli = tavoli;
	}

	public HashMap<Integer, ArrayList<Prenotazione>> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(HashMap<Integer, ArrayList<Prenotazione>> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}

	public void setTavoliDisponibili(ArrayList<Tavolo> tavoliDisponibili) {
		this.tavoliDisponibili = tavoliDisponibili;
	}
	
}
