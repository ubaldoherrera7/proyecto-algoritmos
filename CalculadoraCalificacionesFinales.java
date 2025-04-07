import java.util.Scanner;

public class CalculadoraCalificacionesFinales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la calificación de parciales (0-100): ");
        double parciales = input.nextDouble();

        System.out.print("Ingrese la calificación del proyecto (0-100): ");
        double proyecto = input.nextDouble();

        System.out.print("Ingrese la calificación del examen final (0-100): ");
        double examenFinal = input.nextDouble();

        if (parciales < 0 || parciales > 100 || proyecto < 0 || proyecto > 100 || examenFinal < 0 || examenFinal > 100) {
            System.out.println("Error: Las calificaciones deben estar entre 0 y 100.");
        } else {
            double promedioFinal = (parciales * 0.4) + (proyecto * 0.3) + (examenFinal * 0.3);
            System.out.println("La calificación final es: " + promedioFinal);
        }
    }
}