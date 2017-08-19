package listySumowanieGodzin;

import java.util.ArrayList;
import java.util.List;

public class SumowanieGodzinTest {

	public static void main(String[] args) {
		
		ArrayList<Obiekt> lista1 = new ArrayList<>();
		ArrayList<Obiekt> lista2 = new ArrayList<>();
		ArrayList<Obiekt> zsumowaneGodziny = new ArrayList<>();
		
		for(int i=1;i<=31;i++) {
			lista1.add(new Obiekt(i));
		}
		
		System.out.println("Lista 1: ");
		
		for(Obiekt i:lista1) {
			System.out.println("ID: " + i.id + " godziny: " + i.liczbaGodzin);
		}
		
		lista2.add(new Obiekt(7, 3));
		lista2.add(new Obiekt(7, 5));
		lista2.add(new Obiekt(8, 8));
		lista2.add(new Obiekt(9, 1));
		lista2.add(new Obiekt(9, 7));
		lista2.add(new Obiekt(10, 3));
		lista2.add(new Obiekt(10, 4));
		lista2.add(new Obiekt(10, 1));
		
		System.out.println("Lista 2: ");
		
		for(Obiekt i:lista2) {
			System.out.println("ID: " + i.id + " godziny: " + i.liczbaGodzin);
		}
		
		System.out.println("Sumuję godziny");
		
		for(Obiekt i:lista1) {

			int sumaGodzin=0;
			
				for(Obiekt j:lista2) {
					if(j.id == i.id) {
						sumaGodzin += j.liczbaGodzin;
					}
				}
			
			zsumowaneGodziny.add(new Obiekt(i.id, sumaGodzin));
		
		}
		
		System.out.println("Wynik sumowania: ");
		
		for(Obiekt i:zsumowaneGodziny) {
			System.out.println("ID: " + i.id + " godziny: " + i.liczbaGodzin);
		}

	}

}
