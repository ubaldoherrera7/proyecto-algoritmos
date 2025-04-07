public class NumerosDivisiblesPor3y5 {
    public static void main(String[] args) {
        System.out.println("Números entre 1 y 100 divisibles por 3 y 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}