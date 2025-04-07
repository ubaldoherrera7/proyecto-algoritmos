import java.util.Scanner;

public class VerificarEdadParaVotar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        if (edad >= 18) {
            System.out.println("Usted es elegible para votar.");
        } else {
            System.out.println("Usted NO es elegible para votar.");
        }
    }
}