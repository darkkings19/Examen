package modelo;

import java.util.Scanner;

public class menuEditar {
    public static void menuEditar(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Agregar modelo.Pedido");
            System.out.println("2. Eliminar modelo.Pedido");
            System.out.println("3. Editar modelo.Pedido");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Agregar Pedidos");
                    break;
                case 2:
                    System.out.println("Eliminar Pedidos");
                    break;
                case 3:
                    System.out.println("Editar Pedidos");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }

        }
    }

    public static void probarMenuEditar() {
        menuEditar();
    }
}
