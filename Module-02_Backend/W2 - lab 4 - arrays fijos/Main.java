import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ARRAYS ---");
            System.out.println("1 - Crear array personalizado");
            System.out.println("2 - Contar pares/impares");
            System.out.println("3 - Sorteo vacaciones en Ibiza");
            System.out.println("0 - Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> ArrayPersonalizado.ejecutar();
                case 2 -> ArrayParesImpares.ejecutar();
                case 3 -> SorteoIbiza.ejecutar();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
