package listy;

public class Student {
	
	private String nazwisko;
	private int lata;
	
	public Student(String nazwisko, int lata) {
		this.nazwisko = nazwisko;
		this.lata = lata;
	}

	public Student() {
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getLata() {
		return lata;
	}

	public void setLata(int lata) {
		this.lata = lata;
	}
	
	
	

}
