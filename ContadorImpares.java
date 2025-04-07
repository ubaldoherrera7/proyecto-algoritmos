import java.util.Scanner;

public class ContadorImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int max = input.nextInt();
        int i = 1;

        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= max);
    }
}