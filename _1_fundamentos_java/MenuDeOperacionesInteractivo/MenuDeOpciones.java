package java_mini_proyectos._1_fundamentos_java.MenuDeOperacionesInteractivo;

import java.util.Random;
import java.util.Scanner;

public class MenuDeOpciones {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int opcion;

        do {
            System.out.println("\n------MENÚ DE OPCIONES------");
            System.out.println("1. Saludar al usuario");
            System.out.println("2. Mostrar hora simulada");
            System.out.println("3. Mostrar número aleatorio");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("¡Hola, usuario! 👋");
                    break;
                case 2:
                    System.out.println("La hora actual simulada es: 14:30");
                    break;
                case 3:
                    int numeroAleatorio = rand.nextInt(100)+ 1;
                    System.out.println("Número aleatorio generado: " + numeroAleatorio);
                    break;
                case 4:
                System.out.println("Saliendo del programa...");
                break;
                default: System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion !=4);

        sc.close();
    }    
}
