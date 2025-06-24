package java_mini_proyectos._1_fundamentos_java.ProyectoOperadoresRelacionales;

import java.util.Scanner;

public class ComparadoresDeNumeros {
    public static void maind(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        double num1 = sc.nextInt();

        System.out.println("Ingresa el segundo número:");
        double num2 = sc.nextInt();

        if(num1 == num2) { 
            System.out.println("Resultado: Ambos números son iguales.");
        } else if (num1 > num2) {
            System.out.println("Resultado: número es mayor que elsegundo.");
        } else {
            System.out.println("Resultado: El primer número es menor que el segundo.");
        }

        sc.close();
    }     
}
