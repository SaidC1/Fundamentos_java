package ejercicios;

public class _6buclejava {
    public static void main(String[] args) {
        int numero = 7;

        // tabla con for
        System.out.println("Tabla con for ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x" + i + " = " + (numero + i));
        }

        // tabla con while
        System.out.println("Tabla con while");
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        // tabla con do - while
        System.out.println("Tabla con do - while: ");
        int j = 1;
        do {
            System.out.println(numero + " x " + j + " = " + (numero * j));
            j++;
        } while (j <= 10);
    }

}
