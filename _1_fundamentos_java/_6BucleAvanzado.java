package java_mini_proyectos._1_fundamentos_java;

public class _6BucleAvanzado {
    public static void main(String[] args) {
        //Mostrar números del 7 al 10 usando for
        for(int i = 7; i <= 10; i++) {
            System.out.println("For: " + i);
        }

        //Mostrar números del 7 al 10 usando while
        int j = 7;
        while(j <= 10) {
            System.out.println("While: " + j);
            j++;
        }

        // do-while que se ejecuta al menos una vez
        int k = 7;
        do {
            System.out.println("Do-While: " + k);
            k++;
        }while (k <= 10);
    }
}

---
