import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("¿Cuántos números desea ingresar?: ");
        int cantidad = input.nextInt();

        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número: ");
            int num = input.nextInt();
            if (num > 0) positivos++;
            else if (num < 0) negativos++;
            else ceros++;
        }

        System.out.println("Mayores que 0: " + positivos);
        System.out.println("Menores que 0: " + negativos);
        System.out.println("Iguales a 0: " + ceros);
    }
}