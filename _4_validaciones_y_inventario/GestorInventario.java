package java_mini_proyectos._4_validaciones_y_inventario;

// 📁 4_proyectos_completos/GestorInventario.java
import java.util.ArrayList;
import java.util.Scanner;

import java_mini_proyectos._3_poo_y_arraylist.Producto;

public class GestorInventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n📦 MENÚ DE INVENTARIO:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver todos los productos");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("🛒 Nombre del producto: ");
                    String nombre = sc.nextLine().trim();

                    if (nombre.isEmpty()) {
                        System.out.println("❌ El nombre no puede estar vacío.");
                        break;
                    }

                    boolean existe = false;
                    for (Producto p : productos) {
                        if (p.getNombre().equalsIgnoreCase(nombre)) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println("❌ Ese producto ya está registrado.");
                        break;
                    }

                    System.out.print("💵 Precio del producto: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    if (precio < 0) {
                        System.out.println("❌ El precio no puede ser negativo.");
                        break;
                    }

                    System.out.print("📦 Cantidad en stock: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    if (cantidad < 0) {
                        System.out.println("❌ La cantidad no puede ser negativa.");
                        break;
                    }

                    productos.add(new Producto(nombre, precio, cantidad));
                    System.out.println("✅ Producto agregado correctamente.");
                    break;

                case 2:
                    if (productos.isEmpty()) {
                        System.out.println("📭 No hay productos registrados.");
                    } else {
                        for (int i = 0; i < productos.size(); i++) {
                            System.out.print("Producto #" + (i + 1) + ": ");
                            productos.get(i).mostrarInfo();
                        }
                    }
                    break;

                case 3:
                    System.out.print("🔍 Ingresa el nombre del producto a buscar: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;
                    for (Producto p : productos) {
                        if (p.getNombre().equalsIgnoreCase(buscar)) {
                            p.mostrarInfo();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("❌ Producto no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("❌ Ingresa el número del producto a eliminar: ");
                    int eliminar = sc.nextInt();
                    sc.nextLine();

                    if (eliminar >= 1 && eliminar <= productos.size()) {
                        productos.remove(eliminar - 1);
                        System.out.println("🗑️ Producto eliminado.");
                    } else {
                        System.out.println("❌ Número inválido.");
                    }
                    break;

                case 5:
                    System.out.println("👋 ¡Gracias por usar el gestor de inventario!");
                    break;

                default:
                    System.out.println("❌ Opción no válida.");
            }

        } while (opcion != 5);
    }
}

