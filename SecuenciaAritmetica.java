import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int inicio = input.nextInt();
        System.out.print("Ingrese la diferencia: ");
        int diferencia = input.nextInt();
        System.out.print("Ingrese el número máximo: ");
        int max = input.nextInt();

        int actual = inicio;
        do {
            System.out.println(actual);
            actual += diferencia;
        } while (actual <= max);
    }
}