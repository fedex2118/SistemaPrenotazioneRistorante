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

	// key tavoloID: [p1, p2, p3]
	public HashMap<Integer, ArrayList<Prenotazione>> prenotazioni = new HashMap<>();

	/**
	 * Metodo per aggiungere tavoli al ristorante.
	 */
	public void aggiungiTavolo(Tavolo t) {
		tavoli.add(t);
	}

	/**
	 * Metodo per rimuovere tavoli che si basa sulla chiave dei tavoli (id).
	 * 
	 * @param id
	 */
	public void rimuoviTavolo(int id) {
		for (Tavolo tavolo : tavoli) {
			if (tavolo.getId() == id)
				tavoli.remove(id);
		}
	}

	/**
	 * Metodo che aggiorna l'ArrayList delle prenotazioni effettuate.
	 */
	public void aggiornaPrenotazioni(int idTavolo) {
//		ArrayList<Prenotazione> prenotazioniTavolo = new ArrayList<>;
//		for(Prenotazione prenotazione : prenotazioni) {
//			if(prenotazione.getIdTavolo() == idTavolo)
//		}
//		prenotazioni.add(p);
	}

	@Override
	public void prenotaTavolo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void annullaPrenotazione() {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Tavolo> getTavoliDisponibili() {
		// la data oppure la data corrente
		// l'orario della prenotazione
		// se è disponibile
		return null;
	}

	public void verificaDisponibilitàTavolo(String data, String orario, int numeroPersone) {
		if (prenotazioni.isEmpty()) {
			// sono disponibili tutti i tavoli!
		}
		HashSet<Integer> idTavoliDisponibili = new HashSet<>();
		
//		ArrayList<Integer> checkDisponibilita = new ArrayList<>();
		
		for(int tavoloId : prenotazioni.keySet()) {
			for(Prenotazione p : prenotazioni.get(tavoloId)) {
				if(p.getData().equals(data)) {
					if(p.getOrario().equals(orario)) {
//						checkDisponibilita = false;
					}
					else if(p.getNumeroPersone() >= numeroPersone) {
//						checkDisponibilita = true;
					}
				}
			}
		}

//		for (Tavolo tavolo : tavoli) { // tutti i tavoli disponibili
//			idTavoliDisponibili.add(tavolo.getId());
//		}

		// prima di tutto prendo solo i tavoli che hanno il numero di persone corretto.
//		for (Tavolo tavolo : tavoli) { // se il tavolo ha effettivamente posto per quelle persone
//			if (tavolo.getNumeroPosti() >= numeroPersone) {
//				idTavoliDisponibili.add(tavolo.getId());
//			}
//		}

		// check data, orario, numeroPersone
//		for (Prenotazione p : prenotazioni) {
//			if (p.getData().equals(data)) { // stessa data
//				if (p.getOrario().equals(orario)) { // stesso orario
//					if(idTavoliDisponibili.contains(p.getIdTavolo()))
//						idTavoliDisponibili.remove(p.getId());
//				} else if (p.getNumeroPersone() >= numeroPersone) { // non nello stesso orario
//					idTavoliDisponibili.add(p.getId());
//				}
//			} else if (p.getNumeroPersone() >= numeroPersone) { // non nella stessa data
//				idTavoliDisponibili.add(p.getId());
//			}
//		}
		
		

		// check data
//		for (
//		Prenotazione p : prenotazioni) { // cerco quelli non già in quella data
//			if (!p.getData().equals(data)) {
//				idTavoliDisponibili.add(p.getIdTavolo());
//			}
//		}

		// check orario
//		for (Prenotazione p : prenotazioni) { // cerco quelli non già in quell'orario
//			if (!p.getOrario().equals(orario)) {
//				idTavoliDisponibili.add(p.getIdTavolo());
//			}
//		}

		// check numeroPersone
//		for (Tavolo tavolo : tavoli) { // se il tavolo ha effettivamente posto per quelle persone
//			if (tavolo.getNumeroPosti() >= numeroPersone) {
//				idTavoliDisponibili.add(tavolo.getId());
//			}
//		}

//		// check numeroPersone
//		for (Prenotazione p : prenotazioni) {
//			if (p.getNumeroPersone() >= numeroPersone) {
//				idTavoliDisponibili.remove(p.getId());
//			}
//		}

	}

	// Getters & Setters
	public ArrayList<Tavolo> getTavoli() {
		return tavoli;
	}

	public void setTavoli(ArrayList<Tavolo> tavoli) {
		this.tavoli = tavoli;
	}

}
