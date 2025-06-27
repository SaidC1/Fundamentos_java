package java_mini_proyectos._1_fundamentos_java.TablaDeMultiplicarPersonalizadas;

import java.util.Scanner;

public class TablasDeMultiplicar {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número para generar su tabla de multiplicar: ");
        int numero = sc.nextInt();

        System.out.println("¿Hasta qué número deseas multiplicarlo?: ");
        int limite = sc.nextInt();

        System.out.println("\nTabla del " + numero + "hasta el " + limite + ":");

        for(int i = 1; i <= limite; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));

        }
        sc.close();
    }
}
