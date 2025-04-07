import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = input.nextInt();
        int contador = String.valueOf(Math.abs(numero)).length();

        System.out.println("El número tiene " + contador + " dígitos.");
    }
}