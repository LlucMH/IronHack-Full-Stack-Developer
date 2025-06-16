public class BucleCuadrado {
    //BUCLE EN JAVA:
    //Contar del 20 al 10 en orden descendente, y dar el cuadrado de cada número. i-- resta un número

    public static void ejecutar() {
        System.out.println("Contando del 20 al 10 y mostrando su cuadrado:");
        for (int i = 20; i >= 10; i--) {
            System.out.println("Número: " + i + " → Cuadrado: " + (i * i));
        }
    }
}
