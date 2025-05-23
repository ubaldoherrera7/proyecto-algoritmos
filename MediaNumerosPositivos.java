import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0, contador = 0, numero;

        do {
            System.out.print("Ingrese un número positivo (negativo para terminar): ");
            numero = input.nextInt();
            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
    }
}