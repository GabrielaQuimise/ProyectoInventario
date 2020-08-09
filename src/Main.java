import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void mostrar(ArrayList<Libros> l) {
		for( int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
	static Scanner sc = new Scanner(System.in);
	
	public static void actualizarIventario() {
		int codigo;
		int cantidadExis; 
		int libroCant;
		int respuesta;
		System.out.println("\nIngresar cantidad existente de libros: ");
		cantidadExis = sc.nextInt();
		
		System.out.println("\nIngresar el codigo del libro (5 dígitos): ");
		codigo = sc.nextInt();
		
		if(codigo == 12345) {
			System.out.println("LIBRO: El principito --  AUTOR: Antoine de Saint-Exupéry -- PRECIO: 20$" );
		} else if(codigo == 54321){ 
			System.out.println("LIBRO: La vuelta al mundo en 80 días -- AUTOR: Julio Verne -- PRECIO: 45.50$" );
		} else if(codigo == 89562){
			System.out.println("LIBRO:LIBRO: El Alquimista -- AUTOR: Paulo Cohelo -- PRECIO: 33.99$ " );
		} else if(codigo == 78945){
			System.out.println("LIBRO: Don Quijote de la Mancha -- AUTOR: Miguel de Cervantes -- PRECIO: 45$ " );
		} else { System.out.println("Código incorrecto");}
					
		System.out.println("\nIngrese la cantidad de ese libro: ");
		libroCant = sc.nextInt();
	
		if(libroCant == 0)
			System.out.println("Libro agotado");
		if(libroCant !=0)
			System.out.println("\n¿DESEA COMPRAR EL LIBRO? " + "\n Digite 1 para SI o digite 2 para NO: ");
			respuesta = sc.nextInt();
			if(respuesta == 1) {
				libroCant = libroCant-1;
				cantidadExis = cantidadExis-1;
				System.out.println("El libro fue exitosamente comprado...");
				System.out.println("Cantidad de ese libro: " + libroCant);
				System.out.println("Cantidad de libros total: " + cantidadExis);
			}else {
				System.out.println("No se realizó la compra...");
			}
			}
	
	
	public static void librosCostosos() {
		System.out.println("\n--------------- 3 LIBROS MÁS COSTOSOS------------\n");
		System.out.println("1.- CÓDIGO: 54321 -- LIBRO: La vuelta al mundo en 80 días -- AUTOR: Julio Verne -- PRECIO: 45.50$  ");
		System.out.println("2.- CÓDIGO: 89562 -- LIBRO: El Alquimista -- AUTOR: Paulo Cohelo -- PRECIO: 33.99$ ");
		System.out.println("3.- CÓDIGO: 78945 -- LIBRO: Don Quijote de la Mancha -- AUTOR: Miguel de Cervantes -- PRECIO: 45$ ");
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Libros> lib = new ArrayList<Libros>();
		System.out.println("\n-------------DATOS DE LIBROS-------------\n");
		Libros lib1 = new Libros(12345, "El principito", " Antoine de Saint-Exupéry" , 20 );
		Libros lib2 = new Libros(54321, "La vuelta al mundo en 80 días", "Julio Verne" , 45.50 );
		Libros lib3 = new Libros(89562, "El Alquimista", " Paulo Cohelo" , 33.99 );
		Libros lib4 = new Libros(78945, "Don Quijote de la Mancha", " Miguel de Cervantes", 45 );
		
		lib.add(lib1);
		lib.add(lib2);
		lib.add(lib3);
		lib.add(lib4);
		
		mostrar(lib);
		actualizarIventario();
		librosCostosos();
		
		
		
	}

}
