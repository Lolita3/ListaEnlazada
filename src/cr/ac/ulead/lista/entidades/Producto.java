package cr.ac.ulead.lista.entidades;
import cr.ac.ulead.lista.entidades.Nodo;
import cr.ac.ulead.lista.entidades.Lista;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Producto {
    private static String[][] datosPersona = new String[4096][3];
    Scanner scanner = new Scanner(System.in);


    public void cargarDatos() throws IOException {



        File file = new File("C:\\Users\\lolit\\ListaEnlazada\\out\\production\\ListaEnlazada\\cr\\ac\\ulead\\lista\\entidades\\flipkart_com-ecommerce_sample.csv");

        List<String> lines = Files.readAllLines(file.toPath(),
                StandardCharsets.UTF_8);
        int i=0;
        int k[]= new int[]{0,3,4};
        for (String line : lines) {
            String[] array = line.split(",", -1);
            for(int j=0; j<3;j ++)
            {
                datosPersona [i][j]=array[k[j]];
            }

            i++;
        }

    }
    
    public void enviarALista(){
    Lista l= new Lista();
//    Nodo n = new Nodo();
     for (int i=0;i<158;i++){


         datosPersona[i][0]=datosPersona[i][0].substring(1,4);
         l.agregar(new Nodo(datosPersona[i][1],datosPersona[i][0],datosPersona[i][2]));
        }
    }

}
