import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SorteoIbiza {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        // Puedes modificar esta lista o pedirla por teclado
        Collections.addAll(nombres, "Ana", "Luis", "Carlos", "Marta", "Eva", "Sergio");

        while (!nombres.isEmpty()) {
            Random random = new Random();
            int ganadorIndex = random.nextInt(nombres.size());
            String ganador = nombres.remove(ganadorIndex);
            System.out.println("🏝️ ¡El ganador es: " + ganador + "!");

            if (nombres.isEmpty()) {
                System.out.println("No quedan más personas en la lista.");
                break;
            }

            System.out.print("¿Otra vez? (S/N): ");
            String respuesta = scanner.nextLine().trim().toUpperCase();

            if (!respuesta.equals("S")) {
                System.out.println("Fin del sorteo.");
                break;
            }
        }
    }
}
