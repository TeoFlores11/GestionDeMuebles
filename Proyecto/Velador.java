package Proyecto;
import java.util.*;
public class Velador extends Mueble{
    private int nroCajas;

    /*public Velador(){
        this.nroCajas = 0;
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
        System.out.print("Ingrese el número de cajas del velador: ");
        nroCajas = lee.nextInt();
    }
    
    @Override
    public void mostrar(){
    	System.out.println("\nCodigo: "+this.codigo);
		System.out.println("Tipo Material: "+this.tipoMaterial);
		System.out.println("Precio: "+this.precio);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Nro Patas: "+this.nroPatas);
        System.out.println("Nro Cajas: "+this.nroCajas);
    }
    
    public int getNroCajas() {
        return nroCajas;
    }
    
    public void setNroCajas(int nroCajas) {
        this.nroCajas = nroCajas;
    }
}