package session2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Exercise1 entero=new Exercise1();
    static Exercise2 arr_list=new Exercise2();
    static Exercise3 Linked=new Exercise3();
    public static void main(String[] args) {

        // Exercise 1 //

        int [] arrays_numeros={1,2,3,4,5};
        int numero=entero.sumaArreglos(arrays_numeros);
        System.out.println(numero);

        // Exercise 2 //

        ArrayList<String> Array_agregar = new ArrayList<>();
        Scanner sss=new Scanner(System.in);
        int verdad=0;
          while (verdad==0) {
            System.out.println("Diga 1 si quiere agregar elementos, por el contrario diga 2");
            int escoger=sss.nextInt();
            if (escoger==1) {
                arr_list.agregar_array(Array_agregar);
                System.out.println("¿Desea hacer otro cambio? si=0 o no=1");
                verdad=sss.nextInt();
            }else{
                arr_list.eliminar_array(Array_agregar);
                System.out.println("¿Desea hacer otro cambio? si=0 o no=1");
                verdad=sss.nextInt();
            }  
          }
          for (int i = 0; i < Array_agregar.size(); i++) {
            System.out.print(Array_agregar.get(i) + ",");   
        }
        System.out.println();

           // Exercise 3 //

        LinkedList<String> lista = new LinkedList<>();
        lista.add("500");
        lista.add("400");
        lista.add("300");
        lista.add("200");
        lista.add("100");

        Linked.mirarIndice(lista);     
            }
            
        }

        
    