package Proyecto;
import java.util.*;
public class Silla extends Mueble{
    private String espaldar;

    /*public Silla(){
        this.Espaldar = "";
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
		lee.nextInt();
        System.out.println("Ingrese el tipo de espaldar de la silla: ");
        espaldar = lee.nextLine();
    }
    
    @Override
    public void mostrar(){
    	System.out.println("\nCodigo: "+this.codigo);
		System.out.println("Tipo Material: "+this.tipoMaterial);
		System.out.println("Precio: "+this.precio);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Nro Patas: "+this.nroPatas);
        System.out.println("Espaldar: "+this.espaldar);
    }
    public String getEspaldar() {
        return espaldar;
    }
    public void setEspaldar(String espaldar) {
        this.espaldar = espaldar;
    }
}