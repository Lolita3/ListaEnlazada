package cr.ac.ulead.lista.entidades;

public class Lista {
	private static Nodo inicio = null;
	
	public boolean estaVacia() {
		return inicio == null;
	}
	
	public void agregar(Nodo nuevoNodo) {
		if (inicio == null) {

			inicio = nuevoNodo;
			System.out.println(inicio);
		} else {
			Nodo temp = inicio;
			while (temp.next != null) {

				temp = temp.next;
			}
			temp.next = nuevoNodo;
		}
		System.out.println("ultimo"+inicio);
	}
	
	public void imprimirLista() {

		Nodo temp = inicio;


		while (temp != null) {

			System.out.println("Codigo: " + temp.cod+"\nNombre: "+temp.nombre+"\nCategoria: "+temp.categoria+"\n\n");
			temp = temp.next;
		}

	}

	
}
