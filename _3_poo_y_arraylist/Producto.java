package InventarioProductos;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //metodo GET
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    //metodo SET
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;

    }
    
    // Representación del producto como texto
    @Override
    public String toString() {
        return "🛒 " + nombre + "| Precio: $" + precio + " | Cantidad: " + cantidad;
    }
}
