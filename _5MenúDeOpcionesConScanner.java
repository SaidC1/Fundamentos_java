package ejercicios;

import java.util.Scanner;

public class _5MenúDeOpcionesConScanner {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elegir una opción:");
        System.out.println("1. Ver perfil");
        System.out.println("2.Editar perfil");
        System.out.println("3.Eliminar cuenta");
        System.out.println("Salir");

        int opcion = sc.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("ver perfil");
                break;
            case 2:
                System.out.println("Editar perfil");
                break;  
            case 3:
                System.out.println("Eliminar cuenta");
                break;
            case 4:
                System.out.println();
                break;
            default:  
                System.out.println("Opción no válida");
        }
        sc.close();
    }
    
}
