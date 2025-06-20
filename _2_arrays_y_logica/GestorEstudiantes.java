package java_mini_proyectos._2_arrays_y_logica;

import java.util.Scanner;

public class _GestorEstudiantes {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[5];
        int[] edades = new int[5];

        System.out.println("Registro de 5 estudiantes:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Edad de " + nombres[i] + ": ");
            edades[i] = sc.nextInt();
            sc.nextLine(); // limpiar buffer
        }

        int opcion;
        do {
            System.out.println("\n📘 MENÚ DE ESTUDIANTES");
            System.out.println("1. Ver lista de estudiantes");
            System.out.println("2. Buscar estudiante por nombre");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n📋 Lista de estudiantes:");
                    for (int i = 0; i < nombres.length; i++) {
                        System.out.println("Nombre: " + nombres[i] + " | Edad: " + edades[i]);
                    }
                    break;

                case 2:
                    System.out.print("Ingresa el nombre a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < nombres.length; i++) {
                        if (nombres[i].equalsIgnoreCase(buscar)) {
                            System.out.println("🎯 Estudiante encontrado: " + nombres[i] + " | Edad: " + edades[i]);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("❌ Estudiante no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("👋 Gracias por usar el gestor de estudiantes.");
                    break;

                default:
                    System.out.println("❌ Opción inválida.");
            }

        } while (opcion != 3);
    }
}