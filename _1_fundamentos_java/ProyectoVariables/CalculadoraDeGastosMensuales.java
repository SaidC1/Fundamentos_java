package java_mini_proyectos._1_fundamentos_java.ProyectoVariables;
import java.util.Scanner;

public class CalculadoraDeGastosMensuales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Solicitar datos al usuario
        System.out.println("Ingrese su ingreso mensual: ");
        double ingresoMensual = sc.nextDouble();

        System.out.println("Gasto en renta : ");
        double gastoRenta = sc.nextDouble();

        System.out.println("Gasto en comida: ");
        double gastoComida = sc.nextDouble();

        System.out.println("Gasto en transporte: ");
        double gastoTransporte = sc.nextDouble();

        //Calcular gastos totales y dinero restante
        double totalGasto = gastoRenta + gastoComida + gastoTransporte;
        double dineroGastado = ingresoMensual - totalGasto;

        //Mostrar resultado
        System.out.println("\n--- Resumen financiero mensual ---");
        System.out.println("Ingrso mensual: $" + ingresoMensual);
        System.out.println("Total de gastos: $" + totalGasto);
        System.out.println("Dinero restante: $" + dineroGastado);

        sc.close();

    }    
}
