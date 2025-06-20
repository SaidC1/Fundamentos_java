package java_mini_proyectos;

public class _4MenuDeOpciones {
    public static void main(String[] args) {
        int opcion = 2;

        switch (opcion) {
            case 1:
                System.out.println("Ver perfil");
                break;

            case 2:
                System.out.println("Editar perfil");
                break;

            case 3:
                System.out.println("Eliminar cuenta");
                break;

            case 4:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
