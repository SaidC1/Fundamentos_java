package InventarioProductos;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n MENÚ - GESTOR DE INVENTARIO");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar todos los productos");
            System.out.println("3. Buscar productos por nombre");
            System.out.println("4. Actualizar cantidad o precio");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Salir");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    // Opción 1: Agregar nuevo producoto
                    System.out.println("Nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.println("Precio del producto: ");
                    double precio = sc.nextDouble();

                    System.out.println("Cantidad disponible: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    // Creamos el objeto Producto y lo agregamos al ArrayList
                    Producto nuevoProducto = new Producto(nombre, precio, cantidad);
                    productos.add(nuevoProducto);
                    System.out.println("✅ Producto agregado exitosamente. ");
                    break;

                case 2:
                    // Opción 2: Mostrar todos los productos
                    if (productos.isEmpty()) {
                        System.out.println("📭 El inventario está vacío. ");
                    } else {
                        System.out.println("📋 Lista de productos: ");
                        for (Producto p : productos) {
                            System.out.println(p); // Esto usa el toString() de la clase Producto
                        }
                    }
                    break;

                case 3:
                    // Opción 3: Buscar producto por nombre
                    System.out.println("Ingresa el nombre del producto a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    boolean encontrado = false;

                    for (Producto p : productos) {
                        if (p.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("🔍 Producto encontrado: ");
                            System.out.println(p);
                            encontrado = true;
                            break; // termina el bucle al encontrarlo
                        }
                    }

                    if (!encontrado) {
                        System.out.println("❌ Producto no encontrado en el inventario.");
                    }
                    break;

                case 4:
                    // Opción 4: Actualizar precio o cantidad
                    System.out.println("Ingresa el nombre del producto a actualizar: ");
                    String nombreActualizar = sc.nextLine();
                    boolean productoEncontrado = false;

                    for (Producto p : productos) {
                        if (p.getNombre().equalsIgnoreCase(nombreActualizar)) {
                            productoEncontrado = true;
                            System.out.println("🔧 Producto encontrado: " + p);
                            System.out.println("¿Qué deseas actualizar?");
                            System.out.println("1. Precio");
                            System.out.println("2. Cantidad");
                            System.out.println("Selecciona una opción: ");
                            int opcionActualizar = sc.nextInt();
                            sc.nextLine(); // limpiar buffer

                            if (opcionActualizar == 1) {
                                System.out.println("Nuevo precio: ");
                                double nuevoPrecio = sc.nextDouble();
                                p.setPrecio(nuevoPrecio);
                                System.out.println("✅ Precio actualizado.");
                            } else if (opcionActualizar == 2) {
                                System.out.println("Nueva cantidad: ");
                                int nuevaCantidad = sc.nextInt();
                                p.setCantidad(nuevaCantidad);
                                System.out.println("✅ Cantidad actualizada");
                            } else {
                                System.out.println("❌ Opción no válida.");
                            }

                            break; // Salimos del bucle una vez actualizado
                        }
                    }
                    if (!productoEncontrado) {
                        System.out.println("❌ Prodcuto no encontrado en el inventario.");
                    }
                    break;

                case 5:
                    // Opción 5 Eliminar producto
                    System.out.println("Ingresa el nombre del producto a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    Producto productoAEliminar = null;

                    // Buscar el producto a eliminar
                    for (Producto p : productos) {
                        if (p.getNombre().equalsIgnoreCase(nombreEliminar)) {
                            productoAEliminar = p;
                            break;
                        }
                    }

                    // Si se encontró, se elimina
                    if (productoAEliminar != null) {
                        productos.remove(productoAEliminar);
                        System.out.println("Producto eliminado exitosamente.");
                    } else {
                        System.out.println("❌ Producto no encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("👋 Cerrando sistema de inventario...");
                    break;
            }
        } while (opcion != 6);

        sc.close();
    }
}
