
public class main_app {
	public static void main(String[] args) {
		System.out.println("ejercicio 3");
		
		Libro primero = new Libro("123", 860, " La madre de Frankenstein", "Almudena Grandes");
		Libro segundo = new Libro("456", 500, " Sapiens", "Yuval Noah Harari");
		
		System.out.println(primero.toString());
		System.out.println(segundo.toString());
		
		if(primero.getPaginas()>segundo.getPaginas()) {
			System.out.println(primero.toString());
		}else {
			System.out.println(segundo.toString());
		}


	}

}
