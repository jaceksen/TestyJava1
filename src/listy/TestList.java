package listy;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List<Student> lista1 = new ArrayList<>();
		List<Student> lista2 = new ArrayList<>();
		
		lista1.add(new Student("Jacek", 45));
		lista1.add(new Student("Rima", 32));
		
		Student maja = new Student();
		maja.setNazwisko("Maja");
		
		Student tigo = new Student();
		tigo.setNazwisko("Tigran");
		
		Student jacek = new Student();
		jacek.setNazwisko("Jacek");
		
		lista2.add(maja);
		lista2.add(tigo);
		lista2.add(jacek);
		
		for(Student l1:lista1) {
			System.out.println(l1.getNazwisko() + " " + l1.getLata());
		}
		
		System.out.println("");
		
		for(Student l2:lista2) {
			System.out.println(l2.getNazwisko() + " " + l2.getLata());
		}
		
		System.out.println("");
		
		List<Student> lista3 = new ArrayList<>();
		lista3.addAll(lista1);
		//lista3.addAll(lista2);
		
		for(Student l2:lista2) {
			System.out.println(l2.getNazwisko() + " " + l2.getLata());
			if(!l2.getNazwisko().equals("Jacek")){
				lista3.add(l2);
			}
		}
		
		System.out.println("");
		
		lista2.forEach(System.out::println);
	
		System.out.println("");
		
		for(Student l3:lista3) {
			System.out.println(l3.getNazwisko() + " " + l3.getLata());
		}
		
		
		

	}

}
