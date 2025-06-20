package java_mini_proyectos._2_arrays_y_logica;

public class _7ArrayEdades {
    public static void main(String[] args) {
        int[] edades = new int[5];

        edades[0] = 15;
        edades[1] = 20;
        edades[2] = 18;
        edades[3] = 25;
        edades[4] = 30;

        System.out.println("Edades registradas: ");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + (i + 1) + ": " + edades[i]);
        }
    }
}