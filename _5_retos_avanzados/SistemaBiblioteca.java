package java_mini_proyectos._5_retos_avanzados;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Libro> libros = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n📚 MENÚ BIBLIOTECA:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Ver libros registrados");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("📘 Título del libro: ");
                    String titulo = sc.nextLine().trim();

                    if (titulo.isEmpty()) {
                        System.out.println("❌ El título no puede estar vacío.");
                        break;
                    }

                    boolean existe = false;
                    for (Libro l : libros) {
                        if (l.getTitulo().equalsIgnoreCase(titulo)) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println("❌ Ya hay un libro con ese título.");
                        break;
                    }

                    System.out.print("✍️ Autor del libro: ");
                    String autor = sc.nextLine().trim();

                    if (autor.isEmpty()) {
                        System.out.println("❌ El autor no puede estar vacío.");
                        break;
                    }

                    libros.add(new Libro(titulo, autor));
                    System.out.println("✅ Libro agregado con éxito.");
                    break;

                case 2:
                    if (libros.isEmpty()) {
                        System.out.println("📭 No hay libros registrados.");
                    } else {
                        for (int i = 0; i < libros.size(); i++) {
                            System.out.println("Libro #" + (i + 1));
                            libros.get(i).mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.print("🔍 Ingresa el título del libro a buscar: ");
                    String buscar = sc.nextLine().trim();
                    boolean encontrado = false;

                    for (Libro l : libros) {
                        if (l.getTitulo().equalsIgnoreCase(buscar)) {
                            l.mostrarInfo();
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("❌ Libro no encontrado.");
                    }
                    break;

                case 4:
                    if (libros.isEmpty()) {
                        System.out.println("📭 No hay libros registrados para prestar.");
                        break;
                    }

                    System.out.print("📌 Ingresa el número del libro que deseas prestar: ");
                    int numPrestar = sc.nextInt();
                    sc.nextLine();

                    if (numPrestar >= 1 && numPrestar <= libros.size()) {
                        Libro libroAprestar = libros.get(numPrestar - 1);

                        if (libroAprestar.isPrestado()) {
                            System.out.println("❌ Este libro ya está prestado.");
                        } else {
                            libroAprestar.prestar();
                            System.out.println("✅ Libro prestado con éxito.");
                        }
                    } else {
                        System.out.println("❌ Número inválido.");
                    }
                    break;

                case 5:
                    if (libros.isEmpty()) {
                        System.out.println("📭 No hay libros registrados para devolver.");
                        break;
                    }

                    System.out.print("📌 Ingresa el número del libro que deseas devolver: ");
                    int numDevolver = sc.nextInt();
                    sc.nextLine();

                    if (numDevolver >= 1 && numDevolver <= libros.size()) {
                        Libro libroADevolver = libros.get(numDevolver - 1);

                        if (!libroADevolver.isPrestado()) {
                            System.out.println("ℹ️ Ese libro no estaba prestado.");
                        } else {
                            libroADevolver.devolver();
                            System.out.println("✅ Libro devuelto con éxito.");
                        }
                    } else {
                        System.out.println("❌ Número inválido.");
                    }
                    break;

                case 6:
                    System.out.println("👋 ¡Gracias por usar el sistema de biblioteca!");
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
