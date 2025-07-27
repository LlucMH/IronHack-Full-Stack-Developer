public class Ordenador {
    private String marca;
    private String modelo;
    private int memoriaRAM;
    private int discoDuro; 
    private double precio;

    // Constructor
    public Ordenador(String marca, String modelo, int memoriaRAM, int discoDuro, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.discoDuro = discoDuro;
        this.precio = precio;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador: " + marca + " " + modelo +
               " | RAM: " + memoriaRAM + "GB" +
               " | Disco: " + discoDuro + "GB" +
               " | Precio: " + precio + "€";
    }
}
