import java.util.Scanner;

public class SimuladorDeCalificaciones {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu calificación (0-100): ");
        int calificacion = sc.nextInt();

        if(calificacion >= 90 && calificacion <= 100) {
            System.out.println("Resultado: Exelente");
        }else if (calificacion >= 80) {
            System.out.println("Resultado: Muy bien");
        }else if (calificacion >= 70) {
            System.out.println("Resultado: Bien");
        }else if (calificacion >= 60) {
            System.out.println("Resultado: Suficiente");
        }else if (calificacion >= 0) {
            System.out.println("Resultado: Reprobado");
        }else {
            System.out.println("Calificación inválida. Debe estar entre 0 y 100.");
        }

        sc.close();
    }
}
