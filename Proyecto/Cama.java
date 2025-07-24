package Proyecto;
import java.util.*;
public class Cama extends Mueble{
    private String soporte;

    /*public Cama(){
        this.Soporte = "";
    }*/
    @Override
    public void leer(){
        Scanner lee = new Scanner(System.in);
        System.out.println("Codigo - Tipo Material - Precio - Nombre - Nro Patas");
		this.codigo = lee.nextLine();
		this.tipoMaterial = lee.nextLine();
		this.precio = lee.nextDouble();
		lee.nextLine(); 
		this.nombre = lee.nextLine();
		lee.nextLine();
		this.nroPatas = lee.nextInt();
		lee.nextLine();
		lee.nextInt();
        System.out.print("Ingrese el tipo de soporte de la cama: ");
        this.soporte = lee.nextLine();
    }
    @Override
    public void mostrar(){
    	System.out.println("\nCodigo: "+this.codigo);
		System.out.println("Tipo Material: "+this.tipoMaterial);
		System.out.println("Precio: "+this.precio);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Nro Patas: "+this.nroPatas);
        System.out.println("Agrega soporte: "+this.soporte);
    }
    
    public String getSoporte() {
        return soporte;
    }
    
    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
