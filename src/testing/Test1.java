package testing;

import java.util.ArrayList;
import java.util.List;

import model.Ristorante;
import model.Tavolo;

public class Test1 {

	public static void main(String[] args) {
		
		// Test di inizializzazione
		Ristorante ristorante = new Ristorante();
		
		Tavolo tavolo1 = new Tavolo(1, 3);
		Tavolo tavolo2 = new Tavolo(2, 5);
		Tavolo tavolo3 = new Tavolo(3, 2);
		Tavolo tavolo4 = new Tavolo(4, 2);
		Tavolo tavolo5 = new Tavolo(5, 2);
		Tavolo tavolo6 = new Tavolo(6, 5);
		Tavolo tavolo7 = new Tavolo(7, 2);
		Tavolo tavolo8 = new Tavolo(8, 3);
		Tavolo tavolo9 = new Tavolo(9, 4);
		Tavolo tavolo10 = new Tavolo(10, 4);
		
		ArrayList<Tavolo> tavoli = new ArrayList<>();
		
		tavoli.addAll(List.of(tavolo1, tavolo1, tavolo2, tavolo3, tavolo4, tavolo5,
				tavolo6, tavolo7, tavolo8, tavolo9, tavolo10));
		
		ristorante.setTavoli(tavoli);
		
		System.out.println(ristorante.getTavoli());

	}

}
