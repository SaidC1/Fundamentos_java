//Crea un programa que reciba un valor llamado calificación (ej. 0 a 100), e imprima.
package ejercicios;

public class _2Condicionles {
    public static void main(String [] args) {
        int nota = 100;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bien");
        } else if (nota >= 60) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Reprobado");
        }
    }
    
}
