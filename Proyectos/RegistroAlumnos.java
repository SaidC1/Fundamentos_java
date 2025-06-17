package Proyectos;

import java.util.Scanner;

public class RegistroAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        boolean inscrito;

        // Pedimos datos
        System.out.print("Ingresa tu nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingresa tu edad: ");
        edad = sc.nextInt();

        System.out.print("¿Estás inscrito en alguna materia? (true/false): ");
        inscrito = sc.nextBoolean();

        int opcion;

        // Menú
        do {
            System.out.println("\n---- MENÚ ----");
            System.out.println("1. Ver perfil");
            System.out.println("2. Editar edad");
            System.out.println("3. Saber si eres mayor de edad");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n📄 PERFIL DEL ALUMNO");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Edad: " + edad);
                    System.out.println("Inscrito: " + inscrito);
                    break;

                case 2:
                    System.out.print("Ingresa tu nueva edad: ");
                    edad = sc.nextInt();
                    System.out.println("Edad actualizada con éxito.");
                    break;

                case 3:
                    if (edad >= 18) {
                        System.out.println("Eres mayor de edad.");
                    } else {
                        System.out.println("Eres menor de edad.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }
        } while (opcion != 4);

        System.out.println("¡Gracias por usar el sistema, " + nombre + "!");
    }
}
