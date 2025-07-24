package Proyecto;
import java.io.*;
import java.util.Scanner;

public class ArchMueble {
	private String nomArch;
	private Mueble rMueble;
	
	public ArchMueble(String nom){
		this.nomArch = nom;
	}
	/*==================================================================*/
	public void crear() throws ClassNotFoundException, IOException{
		ObjectOutputStream arMue = new ObjectOutputStream(new FileOutputStream(nomArch));
		arMue.close();
	}
	/*=================================================================*/
	public void adicionar() throws ClassNotFoundException, IOException{
		//String op;
		Scanner lee = new Scanner(System.in);
		ObjectOutputStream arMue = null;
		try {
			if(new File(nomArch).exists()){
				arMue = new AddObjectOutputStream(new FileOutputStream(nomArch,true));
			}else{					
				arMue = new ObjectOutputStream(new FileOutputStream(nomArch,true));
			}
			//do{
				/*==================*/
				/*rMueble = new Mueble();
				rMueble.leer();
				arMue.writeObject(rMueble);*/
				//====================
				//System.out.println("Desea continuar? s/n");
				//op = lee.next();
				//lee.nextLine();
			//}while(op.equals("s"));
			String opcion;
			do {
				System.out.println("\n\n ****** Menu de Tipo de Mueble ******"
						+ "\n1. Cama"
						+ "\n2. Mesa"
						+ "\n3. Silla"
						+ "\n4. Ropero"
						+ "\n5. Velador"
						+ "\n6. Salir");
					opcion = lee.nextLine();
					switch(opcion) {
					case "1": rMueble = new Cama();
							rMueble.leer();
							arMue.writeObject(rMueble);
							break;
					case "2": rMueble = new Mesa();
							rMueble.leer();
							arMue.writeObject(rMueble);
							break;
					case "3": rMueble = new Silla();
							rMueble.leer();
							arMue.writeObject(rMueble);
							break;
					case "4": rMueble = new Ropero();
							rMueble.leer();
							arMue.writeObject(rMueble);
							break;
					case "5": rMueble = new Velador();
							rMueble.leer();
							arMue.writeObject(rMueble);
							break;
					case "6": System.out.println("Fin Programa!!!");
							break;
					default:System.out.println("no existe la opcion");
				}
					lee.nextLine();
			}while(opcion.equals("s"));
			
		} catch (Exception e) {
			System.out.println("Fin adicion");
		}finally{
			arMue.close();
		}
	}
	/*====================================================================*/
	public boolean eliminar(String cod) throws ClassNotFoundException,IOException{
		boolean sw = false;
		ObjectInputStream arMue = null;
		ObjectOutputStream arAux = null;
		
		try {
			arMue = new ObjectInputStream(new FileInputStream(nomArch));
			arAux = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
			while(true){
				rMueble = new Mueble();
				rMueble = (Mueble)arMue.readObject();
				if(rMueble.getCodigo().equals(cod))
					sw = true;
				else {
					arAux.writeObject(rMueble);
				}
			}
		} catch (Exception e) {
			System.out.print("\n FIN ELIMINA");
		}finally{
			arMue.close();
			arAux.close();
			File f1 = new File(nomArch);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
	}
	/*===========================================*/
	public boolean modificar(String cod)throws ClassNotFoundException,IOException{
		Scanner lee =new Scanner(System.in);
		String resp;
		boolean sw=false;
		ObjectInputStream arMue = null;
		ObjectOutputStream arAux = null;
		try{
			arMue = new ObjectInputStream(new FileInputStream(nomArch));
			arAux = new ObjectOutputStream(new FileOutputStream("copia.dat", true));
			while(true){
				rMueble =new Mueble();
				rMueble =(Mueble)arMue.readObject();
				if(rMueble.getCodigo().equals(cod)){
					rMueble.mostrar();
					System.out.println("\nDesea modificar s/n");
					resp=lee.next();
					if(resp.equals("s")){
						System.out.println("introdusca  Codigo - Tipo Material - Precio - Nombre - Nro Patas :");
						lee.nextLine();
						String codi = lee.nextLine();
						String tMaterial = lee.nextLine();
						double pre = lee.nextDouble();
						lee.nextLine();
						String nombre = lee.nextLine(); 
						int nPatas = lee.nextInt();
						rMueble.setCodigo(codi);
						rMueble.setTipoMaterial(tMaterial);
						rMueble.setPrecio(pre);
						rMueble.setNombre(nombre);
						rMueble.setNroPatas(nPatas); 
						sw=true;
					}
				}
				arAux.writeObject(rMueble);
			}
		}
		catch (Exception e) {
			System.out.print("\n FIN Modifica");
		}finally{
			arMue.close();
			arAux.close();
			File f1 = new File(nomArch);
			File f2 = new File("copia.dat");
			f1.delete();
			f2.renameTo(f1);
		}
		return sw;
	}
	/*============================================================*/
	public void listar()throws ClassNotFoundException, IOException{
		ObjectInputStream arMue = null;
		try {
			arMue = new ObjectInputStream(new FileInputStream(nomArch));
			while(true){
				rMueble = new Mueble();
				rMueble = (Mueble)arMue.readObject();
				rMueble.mostrar();
			}
		} catch (Exception e) {
			System.out.println("Fin listado!!!!");
		}finally{
			arMue.close();
		}
	}
	/*==============================================================*/
	public String buscarMueblePorCodigo(String codi) throws IOException, ClassNotFoundException {
		ObjectInputStream arMue = null;
		String codMue="";
		try {
			arMue = new ObjectInputStream(new FileInputStream(nomArch));
			while(true){
				rMueble = new Mueble();
				rMueble = (Mueble)arMue.readObject();
				if(rMueble.getCodigo().equals(codi)) {
					rMueble.mostrar();
					return rMueble.getCodigo();
				}
				System.out.println(codMue);
			}
		} catch (Exception e) {
			System.out.println("Fin buscar!!!!");
			System.out.println("No se encontró el mueble >:O");
			return codi;
		}finally{
			arMue.close();
		}
	}
	
	
}


