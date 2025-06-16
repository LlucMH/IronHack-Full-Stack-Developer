import java.util.Scanner;

public class EdadClasificacion {
    //EJERCICIO CONDICIONALES JAVA
    //Preguntas la edad, y según la respuesta, le contestas:
    //estás en primaria/ secundaria/ universidad/ trabajando
    //+EXTRA: que si pone menos de 6 o más 120, dar un mensaje de error
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu edad? ");
        int edad = scanner.nextInt();

        if (edad < 6 || edad > 120) {
            System.out.println("Edad no válida. Debe estar entre 6 y 120 años.");
        } else if (edad <= 11) {
            System.out.println("Estás en primaria.");
        } else if (edad <= 16) {
            System.out.println("Estás en secundaria.");
        } else if (edad <= 22) {
            System.out.println("Estás en la universidad.");
        } else {
            System.out.println("Probablemente estés trabajando.");
        }
    }
}
