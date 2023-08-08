public class Ejercicio10 {
    public static String SerieFibonacci() {
        int n = 20;
        String serie = "";
        System.out.println("Los primeros " + n + " números de la serie Fibonacci son:");

        for (int i = 0; i < n; i++) {
            serie += calcularFibonacci(i) + " ";
        }

        return serie;
    }

    private static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
