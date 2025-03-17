public class SalarioNeto {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese el salario bruto mensual: ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje de impuestos (%): ");
        double porcentajeImpuestos = scanner.nextDouble();
        System.out.print("Ingrese las deducciones adicionales: ");
        double deducciones = scanner.nextDouble();
        double impuesto = salarioBruto * (porcentajeImpuestos / 100);
        double salarioNeto = salarioBruto - impuesto - deducciones;
        System.out.println("El salario neto es: " + salarioNeto);
        scanner.close();
    }
}