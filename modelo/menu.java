package modelo;

import java.util.Scanner;
public class menu {
    public static void menu() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Mostrar Pedidos");
            System.out.println("2. Editar Pedidos");
            System.out.println("3. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Mostrar Pedidos");

                    break;
                case 2:
                    menuEditar.probarMenuEditar();
                    break;

                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }

        }
    }
    public static void probarMenu(){
        menu();
    }
}

