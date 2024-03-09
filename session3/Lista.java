import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    ArrayList<Work> lista_tareas = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

    public void inputDataUser(int veces) {

        for (int i = 0; i < veces; i++) {

            System.out.println("Ingrese el nombre de la tarea");
            String nombre_tarea = scn.nextLine();

            System.out.println("Ingrese la duracion (en minutos)");
            String duracion = scn.nextLine();

            System.out.println("Ingrese de quien es la tarea");
            String encargado = scn.nextLine();

            System.out.println("Ingrese el estado de la tarea \n NOTA:Escoja algunas de estas tres opciones \nA) Activa \nB) En desarrollo \nc) Realizada");
            String estatus = scn.nextLine();
            boolean comprobar = false;
            while (!comprobar) {

                if (estatus.equals("Activa") || estatus.equals("En desarrollo") || estatus.equals("Realizada")) {
                    comprobar = true;
                } else {
                    System.out.println("Coloque bien las especificaiones pedidas \nVuelva a ingresar el estado de la tarea");
                    estatus = scn.nextLine();
                }
            }

            lista_tareas.add(new Work(nombre_tarea, duracion, encargado, estatus));
        }
    }

    public void menu() {
        boolean finalizar = false;
        System.out.println("Esto es una Lista de tareas: Agregue las primeros 5 tareas");
        inputDataUser(1);
        do {
            System.out.println("menu \nDiga 1 si: Quiere agregar otra tarea \nDiga 2 si: Quiere eliminar una tarea \nDiga 3 si: Quiere ver todas las tareas \nDiga 4 para finalizar \nDiga 5 si: requiere hacer cambios mas especificos");
            int opcion = scn.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Cuantas tareas quiere agregar");
                    int numero = scn.nextInt();
                    scn.nextLine();
                    inputDataUser(numero);
                    break;

                case 2:
                    System.out.println("Mire su lista de tareas");
                    for (Work work : lista_tareas) {
                        System.out.println(work.toString());
                    }
                    System.out.println("Cuantos elementos quiere eliminar");
                    int numero1 = scn.nextInt();
                    boolean comprobar1 = false;
                    while (!comprobar1) {
                        if (numero1 <= lista_tareas.size()) {
                            for (int i = 0; i < numero1; i++) {
                                System.out.println("Que indice desea eliminar");
                                int numero_eliminar = scn.nextInt();
                                lista_tareas.remove(numero_eliminar);
                                comprobar1 = true;
                            }
                        } else {
                            System.out.println("Este indice no existe en el arreglo \nVuelva a intentar");
                            numero1 = scn.nextInt();
                        }
                    }
                    break;

                case 3:
                    for (Work work : lista_tareas) {
                        System.out.println(work.toString());
                    }
                    break;

                case 4:
                    System.out.println("Adios");
                    finalizar = true;
                    break;

                case 5:
                    System.out.println("Ponga 1 para: cambiar el nombre de la tarea \nPonga 2 para: cambiar la duracion \nPonga 3 para: cambiar de quien es la tarea \nPonga 4 para: cambiar el estado");
                    int opcion_cambios = scn.nextInt();
                    switch (opcion_cambios) {
                        case 1:
                            System.out.println("Ponga el nombre de la tarea inicial el cual desea cambiar");
                            scn.nextLine();
                            String nombre_tarea1 = scn.nextLine();
                            boolean comprobar2 = false;
                            while (!comprobar2) {
                                for (Work work : lista_tareas) {
                                    if (work.getWork_name().equals(nombre_tarea1)) {
                                        System.out.println("Ponga el nuevo nombre");
                                        String nuevo_nombre = scn.nextLine();
                                        work.setWork_name(nuevo_nombre);
                                        comprobar2 = true;
                                    } else {
                                        System.out
                                                .println("El nombre ingresado no es el correcto \nIntente nuevamente");
                                        nombre_tarea1 = scn.nextLine();
                                    }
                                }
                            }
                            break;

                        case 2:
                            System.out.println("Ponga la duracion inicial la cual desea cambiar");
                            scn.nextLine();
                            String duracion1 = scn.nextLine();
                            boolean comprobar3 = false;
                            while (!comprobar3) {
                                for (Work work : lista_tareas) {
                                    if (work.getDuration().equals(duracion1)) {
                                        System.out.println("Ponga la nueva duracion");
                                        String nueva_duracion = scn.nextLine();
                                        work.setDuration(nueva_duracion);
                                        comprobar3 = true;
                                    } else {
                                        System.out
                                                .println("El nombre ingresado no es el correcto \nIntente nuevamente");
                                        duracion1 = scn.nextLine();
                                    }
                                }
                            }
                            break;

                        case 3:
                            System.out.println("Ponga el nombre encargado inicial el cual desea cambiar");
                            scn.nextLine();
                            String encargado1 = scn.nextLine();
                            boolean comprobar4 = false;
                            while (!comprobar4) {
                                for (Work work : lista_tareas) {
                                    if (work.getName_in_charge().equals(encargado1)) {
                                        System.out.println("Ponga el nuevo nombre encargado");
                                        String nuevo_encargado = scn.nextLine();
                                        work.setName_in_charge(nuevo_encargado);
                                        comprobar4 = true;
                                    } else {
                                        System.out
                                                .println("El nombre ingresado no es el correcto \nIntente nuevamente");
                                        encargado1 = scn.nextLine();
                                    }
                                }
                            }
                            break;

                        case 4:
                            System.out.println("Ponga el estado inicial el cual desea cambiar");
                            scn.nextLine();
                            String estatus1 = scn.nextLine();
                            boolean comprobar5 = false;
                            while (!comprobar5) {
                                for (Work work : lista_tareas) {
                                    if (work.getEstado().equals(estatus1)) {
                                        System.out.println("Ponga la nueva duracion");
                                        String nueva_estado = scn.nextLine();
                                        work.setEstado(nueva_estado);
                                        comprobar5 = true;
                                    } else {
                                        System.out
                                                .println("El nombre ingresado no es el correcto \nIntente nuevamente");
                                        estatus1 = scn.nextLine();
                                    }
                                }
                            }
                            break;                          
                        default:
                            System.out.println("hola");
                            break;                            
                    }
                break;
                default:
                    System.out.println("Este valor numerico no funciona");
                    break;
            }
        } while (!finalizar);
    }
}