public class Main {
    public static void main(String[] args) {
        // Crear instancias
        Ordenador pc1 = new Ordenador("Lenovo", "ThinkPad T14", 16, 512, 1099.99);
        Ordenador pc2 = new Ordenador("HP", "Pavilion", 8, 256, 699.50);
        Ordenador pc3 = new Ordenador("Apple", "MacBook Air M2", 16, 512, 1449.00);

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);

        System.out.println("\nMarca del 1º ordenador: " + pc1.getMarca());
        System.out.println("Precio del 1º ordenador: " + pc1.getPrecio() + "€");

        System.out.println("\nActualizando el precio del MacBook...");
        pc3.setPrecio(1399.00);
        System.out.println("Nuevo precio: " + pc3.getPrecio() + "€");
        System.out.println("Información actualizada: " + pc3);
    }
}
