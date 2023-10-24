package service;

import java.util.ArrayList;

import model.Tavolo;
import model.Prenotazione;

/**
 * Interfaccia per il servizio di prenotazioni.
 */
public interface PrenotazioneService {
	
	public void prenotaTavolo(Tavolo t, String data, String orario, int numeroPersone);
	
	public void annullaPrenotazione(Prenotazione p);
	
	public ArrayList<Tavolo> getTavoliDisponibili();
}
