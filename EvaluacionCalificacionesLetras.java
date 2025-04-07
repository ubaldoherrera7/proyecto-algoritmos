import java.util.Scanner;

public class EvaluacionCalificacionesLetras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la calificación numérica (0-100): ");
        int calificacion = input.nextInt();

        if (calificacion >= 90) {
            System.out.println("Calificación: A");
        } else if (calificacion >= 80) {
            System.out.println("Calificación: B");
        } else if (calificacion >= 70) {
            System.out.println("Calificación: C");
        } else if (calificacion >= 60) {
            System.out.println("Calificación: D");
        } else {
            System.out.println("Calificación: F");
        }
    }
}