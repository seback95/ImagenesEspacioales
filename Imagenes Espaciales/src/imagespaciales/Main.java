package imagespaciales;

public class Main {

	public static void main(String[] args) {
		Comprimir compr = new Comprimir("imagenes.in");
		compr.resolver();
		System.out.println(compr.toString());
		
		
		
	}
	
}
