package Proyecto;
import java.util.*;
public class Ropero extends Mueble{
    private String tipoPuerta;

    /*public Ropero(){
        this.TipoPuerta = "";
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
        System.out.print("Ingrese el tipo de puerta del ropero: ");
        tipoPuerta = lee.nextLine();
    }
    @Override
    public void mostrar(){
    	System.out.println("\nCodigo: "+this.codigo);
		System.out.println("Tipo Material: "+this.tipoMaterial);
		System.out.println("Precio: "+this.precio);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Nro Patas: "+this.nroPatas);
        System.out.println("Tipo Puerta: "+this.tipoPuerta);
    }
    public String getTipoPuerta() {
        return tipoPuerta;
    }
    public void setTipoPuerta(String tipoPuerta) {
        this.tipoPuerta = tipoPuerta;
    }
}

