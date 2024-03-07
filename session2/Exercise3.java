package session2;
import java.util.LinkedList;
import java.util.Scanner;
public class Exercise3 {
    Scanner sc=new Scanner(System.in);

    public void mirarIndice(LinkedList<String> LinkedList){
        System.out.print("Diga la ubicacion que quiere averiguar del 0 al 4:" + " ");
        int indice = sc.nextInt();
        String elemento = LinkedList.get(indice);
        String mensaje = "El valor de la posición " + indice + " es: " + elemento;
        System.out.println(mensaje);
         
    }
}