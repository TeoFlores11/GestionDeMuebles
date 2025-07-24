package Proyecto;
import java.util.*;
public class Mesa extends Mueble{
    private String forma;
    private Silla silla;

    /*public Mesa(Silla silla){
        this.forma = "";
        this.silla = silla;
    }*/
    /*public Mesa() {
    	this.Forma = "";
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
        System.out.print("Ingrese la forma de la mesa: ");
        forma = lee.nextLine();
    }
    @Override
    public void mostrar(){
    	System.out.println("\nCodigo: "+this.codigo);
		System.out.println("Tipo Material: "+this.tipoMaterial);
		System.out.println("Precio: "+this.precio);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Nro Patas: "+this.nroPatas);
        System.out.println("Forma: "+this.forma);
        if (silla != null) {
            System.out.println("Comedor: ");
            silla.mostrar();
        } else {
            System.out.println("No hay sillas agregadas :c");
        }
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    public void AgregarSilla(Silla silla) {
        this.silla = silla;
    }
}