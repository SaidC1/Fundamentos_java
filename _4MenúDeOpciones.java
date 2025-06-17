// Vamos a crear un programa tipo menú, donde el usuario elige una opción (1 al 4), y el programa responde según la opción.
/*📝 Requisitos:
El programa debe:

Tener una variable opcion de tipo int 

Usar un switch para mostrar un mensaje dependiendo de la opción

Las opciones serán:

1: "Ver perfil"

2: "Editar perfil"

3: "Eliminar cuenta"

4: "Salir"

Cualquier otro número: "Opción no válida" */

package ejercicios;
    public class _4MenúDeOpciones {
        public static void main(String [] args) {
            int opcion = 2;
            
            switch(opcion) {
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