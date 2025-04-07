import java.util.Scanner;

public class ContarLetrasA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = input.nextLine();
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece " + contador + " veces.");
    }
}