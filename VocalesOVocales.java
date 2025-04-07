import java.util.Scanner;

public class VocalesOVocales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letra;

        do {
            System.out.print("Ingrese una letra (espacio para salir): ");
            letra = input.next().toLowerCase().charAt(0);

            if (letra == ' ') {
                System.out.println("Programa terminado.");
                break;
            }

            switch (letra) {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.println("Es una vocal.");
                    break;
                default:
                    System.out.println("No es una vocal.");
            }
        } while (letra != ' ');
    }
}