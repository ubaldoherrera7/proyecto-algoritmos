import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Adivina el número (1-100): ");
            intento = input.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("Muy bajo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto.");
            } else {
                System.out.println("¡Correcto!");
            }
        } while (intento != numeroSecreto);
    }
}