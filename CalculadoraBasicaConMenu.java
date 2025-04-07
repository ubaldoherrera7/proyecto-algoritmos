import java.util.Scanner;

public class CalculadoraBasicaConMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            int opcion = input.nextInt();
            System.out.print("Ingrese el primer número: ");
            double num1 = input.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = input.nextDouble();
            double resultado;

            switch (opcion) {
                case 1 -> resultado = num1 + num2;
                case 2 -> resultado = num1 - num2;
                case 3 -> resultado = num1 * num2;
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                        continue;
                    }
                    resultado = num1 / num2;
                }
                default -> {
                    System.out.println("Opción inválida.");
                    continue;
                }
            }

            System.out.println("Resultado: " + resultado);
            System.out.print("¿Desea continuar? (s/n): ");
            continuar = input.next().equalsIgnoreCase("s");
        }
    }
}