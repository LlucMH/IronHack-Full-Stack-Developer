import java.util.ArrayList;
import java.util.Random;

public class ArrayParesImpares {
    public static void ejecutar() {
        int[] numeros = new int[20];
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100); // 0-99
        }

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);

            }
        }

        System.out.println("Array original:");
        mostrarArray(numeros);

        System.out.println("\nPares:");
        mostrarArrayList(pares);

        System.out.println("\nImpares:");
        mostrarArrayList(impares);
    }

    private static void mostrarArray(int[] array) {
        for (int n : array) System.out.print(n + " ");
        System.out.println();
    }

    private static void mostrarArrayList(ArrayList<Integer> lista) {
        for (int n : lista) System.out.print(n + " ");
        System.out.println();
    }
}
