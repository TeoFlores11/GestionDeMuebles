package Proyecto;
import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Scanner lee = new Scanner(System.in);
		ArchMueble a = new ArchMueble("Mueble2025.dat");
		String cod;
		int op;
		do {
			System.out.println("\n\n ****** Menu de archivo Mueble ******"
					+ "\n1. Crear"
					+ "\n2. Adicionar"
					+ "\n3. Eliminar"
					+ "\n4. Modificar"
					+ "\n5. Listar"
					+ "\n6. Buscar"
					+ "\n7. Salir");
			op = lee.nextInt();
			switch(op) {
				case 1: a.crear();
						break;
				case 2: a.adicionar();
						break;
				case 3: System.out.println("Intr. codigo del Mueble");
						cod = lee.next();
						a.eliminar(cod);
						break;
				case 4: System.out.println("Intr. codigo del Mueble");
						cod = lee.next();
						a.modificar(cod);
						break;
				case 5: a.listar();
						break;
				case 6: System.out.println("Intr. codigo del Mueble para poder Buscar");
						cod = lee.next();
						a.buscarMueblePorCodigo(cod);
						break;
				case 7: System.out.println("Fin Programa!!!");
						break;

				default:System.out.println("no existe la opcion");
			}
		}while(op != 7);
	}
}