import java.util.Scanner;

public class ConvertidorGrados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = input.nextDouble();

        System.out.println("Seleccione la conversión: ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                double fahrenheit = celsius * 9 / 5 + 32;
                System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
                break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.println("Temperatura en Kelvin: " + kelvin);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}