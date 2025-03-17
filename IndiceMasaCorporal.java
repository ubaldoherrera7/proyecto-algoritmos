public class IndiceMasaCorporal {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Su IMC es: " + imc);
        scanner.close();
    }
}