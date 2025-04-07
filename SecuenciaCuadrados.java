import java.util.Scanner;

public class SecuenciaCuadrados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int max = input.nextInt();
        int i = 1;

        do {
            System.out.println(i + "^2 = " + (i * i));
            i++;
        } while (i <= max);
    }
}