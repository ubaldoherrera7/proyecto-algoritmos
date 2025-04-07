import java.util.Scanner;

public class CalcularPrecioConDescuento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = input.nextDouble();
        double descuento = 0;

        if (precio > 100 && precio <= 200) {
            descuento = 0.10;
        } else if (precio > 200 && precio <= 500) {
            descuento = 0.20;
        } else if (precio > 500) {
            descuento = 0.25;
        }

        double precioFinal = precio - (precio * descuento);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}