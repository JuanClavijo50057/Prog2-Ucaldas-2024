package session2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
Scanner sss=new Scanner(System.in);

    public void eliminar_y_agregar_array(ArrayList<String>Arreglos){
        int verdad=0;
        while (verdad==0) {
            System.out.println("Diga 1 si quiere agregar elementos, por el contrario diga 2");
            int escoger=sss.nextInt();
            if (escoger==1) {
                System.out.println("Escriba el elemento que quiera agregar");
                String elemento_nuevo = sss.nextLine();
                Arreglos.add(elemento_nuevo);
                System.out.println("¿Desea hacer otro cambio? si=0 o no=1");
                verdad=sss.nextInt();
            }else{
                System.out.println("Diga el indice que quiere eliminar");
                int posicion = sss.nextInt();
                Arreglos.remove(posicion);
                System.out.println("¿Desea hacer otro cambio? si=0 o no=1");
                verdad=sss.nextInt();
            }  
        }
        
    }

    
      
    }