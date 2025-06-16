import java.util.Scanner;

public class ArrayPersonalizado {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Qué tamaño quieres para el array? ");
        int tamano = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        String[] elementos = new String[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            elementos[i] = scanner.nextLine();
        }

        System.out.println("Contenido del array:");
        for (String e : elementos) {
            System.out.println("- " + e);
        }
    }
}
