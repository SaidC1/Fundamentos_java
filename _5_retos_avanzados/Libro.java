package java_mini_proyectos._5_retos_avanzados;

public class Libro {
    private String titulo;
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    public void mostrarInfo() {
        System.out.println("📘 Título: " + titulo);
        System.out.println("✍️ Autor: " + autor);
        System.out.println("📌 Estado: " + (prestado ? "Prestado" : "Disponible"));
        System.out.println("----------------------");
    }
}
