//El switch es útil cuando tienes muchos valores fijos que quieres evaluar (como menús o respuestas exactas).
package ejercicios;

public class _3Switch {
    public static void main(String [] args) {
        int dia = 3;
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:    
                System.out.println("Día no válido");

        }
    }
}
