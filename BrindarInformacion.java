import java.util.Scanner;

public class BrindarInformacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un nombre (artista, película, serie, etc): ");
        String nombre = input.nextLine().toLowerCase();

        switch (nombre) {
            case "shakira":
                System.out.println("Shakira es una cantante colombiana famosa por su mezcla de pop y música latina.");
                break;
            case "inception":
                System.out.println("Inception es una película de ciencia ficción dirigida por Christopher Nolan.");
                break;
            case "breaking bad":
                System.out.println("Breaking Bad es una serie de televisión sobre un profesor que se convierte en fabricante de drogas.");
                break;
            case "coldplay":
                System.out.println("Coldplay es una banda británica de rock alternativo conocida por canciones como 'Yellow' y 'Fix You'.");
                break;
            case "the office":
                System.out.println("The Office es una serie de comedia que retrata la vida diaria de empleados de una oficina.");
                break;
            default:
                System.out.println("No tengo información sobre eso.");
        }
    }
}