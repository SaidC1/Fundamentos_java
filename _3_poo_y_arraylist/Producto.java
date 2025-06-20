package java_mini_proyectos._3_poo_y_arraylist;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("📦 Producto: " + nombre + "| Precio: $ " + precio + "| Stock: " + cantidad);
    }
}