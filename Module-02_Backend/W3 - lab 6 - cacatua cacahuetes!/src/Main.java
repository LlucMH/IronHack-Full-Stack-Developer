import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void saludar1() {
        String saludo = "Hola";
        String nombre = "Andrés";
        System.out.println(saludo + " " + nombre);
    }

    public static void saludar2(String saludo, String nombre) {
        System.out.println(saludo + " " + nombre);
    }

    public static String saludar3(String saludo, String nombre) {
        return saludo + " " + nombre;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) return a / b;
        else throw new ArithmeticException("No se puede dividir por cero");
    }

    public static void pideComida() {
        System.out.println("cacatúa cacahuetes!");
    }

    public static void dormirse() {
        System.out.println("zzZzzzz…");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\nMENÚ PRINCIPAL:");
            System.out.println("1 - Saludar");
            System.out.println("2 - Calcular");
            System.out.println("3 - Cacatúa");
            System.out.println("s - Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    saludar1();

                    saludar2("Hola", "Lucía");

                    String saludoFinal = saludar3("Hola", "Carlos");
                    System.out.println(saludoFinal);
                    break;

                case "2":
                    System.out.print("Introduce operación (+, -, *, /): ");
                    char operacion = sc.nextLine().charAt(0);
                    System.out.print("Número 1: ");
                    double n1 = Double.parseDouble(sc.nextLine());
                    System.out.print("Número 2: ");
                    double n2 = Double.parseDouble(sc.nextLine());

                    double resultado = 0;
                    boolean opValida = true;

                    switch (operacion) {
                        case '+':
                            resultado = sumar(n1, n2);
                            break;
                        case '-':
                            resultado = restar(n1, n2);
                            break;
                        case '*':
                            resultado = multiplicar(n1, n2);
                            break;
                        case '/':
                            resultado = dividir(n1, n2);
                            break;
                        default:
                            System.out.println("Operación no válida.");
                            opValida = false;
                    }

                    if (opValida) {
                        System.out.println("Resultado: " + resultado);
                    }
                    break;

                case "3":
                    String comida;
                    do {
                        pideComida();
                        System.out.print("¿Qué le das de comer?: ");
                        comida = sc.nextLine().trim().toLowerCase();
                    } while (!comida.equals("cacahuetes"));
                    dormirse();
                    opcion = "s"; 
                    break;

                case "s":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (!opcion.equals("s"));

        sc.close();
    }
}
