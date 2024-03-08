package session2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
Scanner input=new Scanner(System.in);
    public void eliminar_array(ArrayList<String>Arreglos){
        System.out.println("Diga el indice que quiere eliminar");
        int posicion = input.nextInt();
        Arreglos.remove(posicion);
    }

    public void agregar_array(ArrayList<String>Arreglos){
        System.out.println("Escriba el elemento que quiera agregar");
        String elemento_nuevo = input.nextLine();
        Arreglos.add(elemento_nuevo);
    }
}