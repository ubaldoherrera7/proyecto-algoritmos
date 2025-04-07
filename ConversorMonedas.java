import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en pesos mexicanos: ");
        double pesos = input.nextDouble();

        System.out.println("Seleccione la moneda a convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        int opcion = input.nextInt();

        double tasa = switch (opcion) {
            case 1 -> 0.058;   // USD
            case 2 -> 0.053;   // EUR
            case 3 -> 2.13;    // THB
            case 4 -> 8.6;     // JPY
            case 5 -> 78.5;    // KRW
            case 6 -> 0.088;   // AUD
            case 7 -> 0.21;    // PEN
            case 8 -> 0.079;   // CAD
            case 9 -> 2.1;     // VES
            case 10 -> 49.5;   // ARS
            default -> -1;
        };

        if (tasa == -1) {
            System.out.println("Opción inválida.");
        } else {
            double convertido = pesos * tasa;
            System.out.println("Cantidad convertida: " + convertido);
        }
    }
}