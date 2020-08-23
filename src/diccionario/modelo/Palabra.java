package diccionario.modelo;

public class Palabra implements Comparable<Palabra> {
	
	//-------------------- M�todos constructores --------------------//
	public Palabra(String nombre, String definicion) {
		this.nombre = nombre;
		this.definicion = definicion;
	}
	
	//-------------------- M�todos getter --------------------//
	public String getNombre() {
		return nombre;
	}
	
	public String getDefinicion() {
		return definicion;
	}
	
	public int compareTo(Palabra otraPalabra) {
		return nombre.compareTo(otraPalabra.nombre);
	}
	
	//-------------------- Campos de clase --------------------//
	private String nombre;
	private String definicion;
}
