import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta("Orbea", "MX30", 35, true);
        Bicicleta bici2 = new Bicicleta("Decathlon", "Rockrider", 30, false);

        System.out.println(bici1);
        System.out.println(bici2);

        ArrayList<Bicicleta> bicicletas = new ArrayList<>();
        bicicletas.add(bici1);
        bicicletas.add(bici2);
        bicicletas.add(new Bicicleta("Trek", "Marlin 7", 40, true));

        System.out.println("\nLista de bicicletas:");
        for (Bicicleta bici : bicicletas) {
            System.out.println(bici);
        }

        System.out.println("\nMarca y velocidad máxima:");
        for (Bicicleta bici : bicicletas) {
            System.out.println(bici.getMarca() + " -> " + bici.getVelocidadMaxima() + " km/h");
        }

        bici2.setVelocidadMaxima(32);
        System.out.println("\nVelocidad actualizada de bici2: " + bici2.getVelocidadMaxima());

        bici1.pedalear();
        bici2.tocarClaxon();
        bici1.girar("izquierda");
        bici2.cambiarMarchas();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Nueva bicicleta ---");
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Velocidad máxima: ");
        int velocidad = Integer.parseInt(sc.nextLine());
        System.out.print("¿Tiene marchas? (sí/no): ");
        String resp = sc.nextLine().trim().toLowerCase();
        boolean tieneMarchas = resp.equals("sí") || resp.equals("si");

        Bicicleta nuevaBici = new Bicicleta(marca, modelo, velocidad, tieneMarchas);
        bicicletas.add(nuevaBici);

        System.out.println("\nNueva bicicleta añadida:");
        System.out.println(nuevaBici);
    }
}
