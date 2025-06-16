import java.util.Scanner;

public class MediaEdadPadres {
    //MEDIA EDADES DE TUS PADRES
    //Se pregunta al usuario el nombre y edad de su madre, y lo mismo de su padre.
    //Al final, mostrar frase del tipo “Tu madre se llama Berta y tiene 55 años, y tu padre se llama Roberto y tiene
    // 57 años, y la media de sus edades es 56”

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de tu madre: ");
        String nombreMadre = scanner.nextLine();

        System.out.print("Edad de tu madre: ");
        double edadMadre = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nombre de tu padre: ");
        String nombrePadre = scanner.nextLine();

        System.out.print("Edad de tu padre: ");
        double edadPadre = scanner.nextDouble();

        double media = (edadMadre + edadPadre) / 2.0;

        System.out.printf("Tu madre se llama %s y tiene %.0f años, tu padre se llama %s y tiene %.0f años, y la media de sus edades es %.1f\n",
                nombreMadre, edadMadre, nombrePadre, edadPadre, media);
    }
}
