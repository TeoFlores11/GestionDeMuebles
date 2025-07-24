package Proyecto;
import java.util.Scanner;
public class Mueble implements java.io.Serializable{
	protected String codigo;
	protected String tipoMaterial;
	protected double precio;
	protected String nombre;
	protected int nroPatas;
	protected int cantMueble;
	
	public void leer() {
		Scanner lee =  new Scanner(System.in);
		System.out.println("Codigo - Tipo Material - Precio - Nombre - Nro Patas");
		this.codigo = lee.nextLine();
		this.tipoMaterial = lee.nextLine();
		this.precio = lee.nextDouble();
		lee.nextLine(); 
		this.nombre = lee.nextLine();
		lee.nextLine(); 
		this.nroPatas = lee.nextInt();
		lee.nextInt();
	}
	
	public void mostrar() {
		System.out.println("\nCodigo: "+this.codigo);
		System.out.println("Tipo Material: "+this.tipoMaterial);
		System.out.println("Precio: "+this.precio);
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Nro Patas: "+this.nroPatas);
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroPatas() {
		return nroPatas;
	}

	public void setNroPatas(int nroPatas) {
		this.nroPatas = nroPatas;
	}
	
	
}
