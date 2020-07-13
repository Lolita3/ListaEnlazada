package cr.ac.ulead.lista.entidades;
import cr.ac.ulead.lista.ui.UIHelper;
import cr.ac.ulead.lista.entidades.Producto;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import java.io.IOException;
import java.util.Scanner;

public class logic {


    public boolean verificarMenu(int decision) throws ParserConfigurationException, TransformerConfigurationException, IOException {
        Producto p = new Producto();
        Scanner input = new Scanner(System.in);
        Lista l = new Lista();
        int opcion= decision;
        boolean salir=true;
        UIHelper ui = new UIHelper();


        switch (opcion){
            case 1:
                p.cargarDatos();
                break;
            case 2:

                break;
            case 3:
                p.enviarALista();
                l.imprimirLista();
                break;
            case 4:
                salir = false;
                break;
            default:
                ui.wrongOption();
                break;
        }
        return salir;
    }

}
