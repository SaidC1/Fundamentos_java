package java_mini_proyectos._3_poo_y_arraylist;

public class Tarea {
    private String titulo;
    private String descripcion;
    private boolean completada;

    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    public boolean estaCompleta() {
        return completada;
    }

    public void nostrarInfo() {
        System.out.println("📌 Título: " + titulo);
        System.out.println("📝 Descripción " + descripcion);
        System.out.println("✅ Estado: " + (completada ? "Completada" : "Pendiente"));
    }
}
