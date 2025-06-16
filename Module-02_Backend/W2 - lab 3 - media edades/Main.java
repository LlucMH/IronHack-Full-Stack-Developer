import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nElige una opción:");
            System.out.println("1 - Clasificación por edad");
            System.out.println("2 - Bucle descendente");
            System.out.println("3 - Media edad de tus padres");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> EdadClasificacion.ejecutar();
                case 2 -> BucleCuadrado.ejecutar();
                case 3 -> MediaEdadPadres.ejecutar();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
