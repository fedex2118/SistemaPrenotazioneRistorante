package service;

import java.util.ArrayList;

import model.Tavolo;

/**
 * Interfaccia per il servizio di prenotazioni.
 */
public interface PrenotazioneService {
	
	public void prenotaTavolo();
	
	public void annullaPrenotazione();
	
	public ArrayList<Tavolo> getTavoliDisponibili();
}
