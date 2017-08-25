package ytLekcje.metody;

public class MetodyTest {

	public static void main(String[] args) {
		
		System.out.println("Napis");
		
		wypiszTrzyRazy();
		
		//String mojNapis;
		//mojNapis = napis();
		//System.out.println(mojNapis);
		
		//String mojNapis = napis();
		//System.out.println(mojNapis);
		
		System.out.println(napis());

	}
	
	public static void wypiszTrzyRazy() {
		for(int i=0; i<3; i++) {
			System.out.println("Napis nr: " + i);
		}
	}
	
	public static String napis() {
		return "Jakiś napis";
	}

}
