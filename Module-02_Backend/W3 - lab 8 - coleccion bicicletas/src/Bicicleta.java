public class Bicicleta {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private boolean tieneMarchas;

    // Constructor
    public Bicicleta(String marca, String modelo, int velocidadMaxima, boolean tieneMarchas) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tieneMarchas = tieneMarchas;
    }

    // Métodos de comportamiento
    public void tocarClaxon() {
        System.out.println("¡Ring ring!");
    }

    public void pedalear() {
        System.out.println(marca + " " + modelo + " está pedaleando...");
    }

    public void parar() {
        System.out.println(marca + " " + modelo + " se ha detenido.");
    }

    public void girar(String direccion) {
        System.out.println(marca + " " + modelo + " gira hacia la " + direccion);
    }

    public void cambiarMarchas() {
        if (tieneMarchas) {
            System.out.println("Cambiando de marcha...");
        } else {
            System.out.println("Esta bicicleta no tiene marchas.");
        }
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    public boolean isTieneMarchas() { return tieneMarchas; }
    public void setTieneMarchas(boolean tieneMarchas) { this.tieneMarchas = tieneMarchas; }

    @Override
    public String toString() {
        String marchasTexto = tieneMarchas ? "sí incluye cambio de marchas" : "no incluye cambio de marchas";
        return "Bicicleta: " + marca + " " + modelo +
               " | Velocidad máxima: " + velocidadMaxima + " km/h" +
               " | " + marchasTexto;
    }
}
