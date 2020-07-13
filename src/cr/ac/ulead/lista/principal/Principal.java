package cr.ac.ulead.lista.principal;

import cr.ac.ulead.lista.entidades.Lista;
import cr.ac.ulead.lista.entidades.Nodo;
import cr.ac.ulead.lista.entidades.Producto;
import cr.ac.ulead.lista.entidades.logic;
import cr.ac.ulead.lista.ui.UIHelper;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerConfigurationException {
		Producto p = new Producto();
		Scanner input = new Scanner(System.in);
		logic l = new logic();
		int op =0;
		boolean salir=true;

		UIHelper ui = new UIHelper();

		do {
			ui.showMenu();
			op = input.nextInt();
			salir=l.verificarMenu(op);
		}while(salir);




		//p.cargarDatos();



//		Lista miLista = new Lista();
//		System.out.println("Lista vacia?" + miLista.estaVacia());
//		for (int i = 1; i < 1000; i +=20) {
//			Nodo nuevoNodo = new Nodo(i);
//			miLista.agregar(nuevoNodo);
//		}
//		System.out.println("Lista vacia?" + miLista.estaVacia());
//		miLista.imprimirLista();
	}
	
}
