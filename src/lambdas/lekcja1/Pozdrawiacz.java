package lambdas.lekcja1;

public class Pozdrawiacz {
	
	public void pozdrow() {
		System.out.println("Pozdrowienia");
	}
	
	// -------------------
	
	public void pozdrow2(int liczba) {
		
		switch(liczba) {
		
		case 10: System.out.println("Pozdrowienia 10."); break;
		case 20: System.out.println("Pozdrowienia 20."); break;
		default: System.out.println("Zła liczba");
		}
		
	}
	
	// ------------------------
	
	public void pozdrow3(PozdrawiaczInt pozdrawiacz) {
		pozdrawiacz.pozdrow();
	}
	
	
	
	public static void main(String[] args) {
		
		Pozdrawiacz pozdrawiacz = new Pozdrawiacz();
		pozdrawiacz.pozdrow();
		pozdrawiacz.pozdrow2(33);
		pozdrawiacz.pozdrow2(10);
		
		System.out.println("");
		
		PozdrawiaczIntImp pii = new PozdrawiaczIntImp();
		pozdrawiacz.pozdrow3(pii);
		pii.pozdrow();
		
		System.out.println("");
		
		PozdrawiaczIntImp2 pii2 = new PozdrawiaczIntImp2();
		pozdrawiacz.pozdrow3(pii2);
		
		System.out.println("");
		
		PozdrawiaczInt myLambda = () -> System.out.println("Pozdrowienia z lambdy");
		myLambda.pozdrow();
		
	}

}
