package cr.ac.ulead.lista.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UIHelper {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void showMenu() {
        output.println("Lead University");
        output.println("Profesor: Mario Agüero");
        output.println("Tarea Programada 2");
        output.println("Que desea ingresar?");
        output.println("1. Cargar Datos");
        output.println("2. Buscar");;
        output.println("3. Generar Lista");
        output.println("4. Salir");
    }

    public void wrongOption() {
        output.println("Opcion incorrecta!");
    }


    }
