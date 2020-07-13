package cr.ac.ulead.lista.entidades;

public class Nodo {
	public Nodo next;
	public String cod;
	public String nombre;
	public String categoria;
	
	public Nodo (String nombre, String cod, String categoria) {

		this.cod = cod;
		this.nombre = nombre;
		this.categoria=categoria;
	}
}
