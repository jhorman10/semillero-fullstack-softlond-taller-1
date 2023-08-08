import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static String NumeroPrimo() {
        String primo;
        String inputNum = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(inputNum);

        boolean esPrimo = verificarPrimo(numero);

        if (esPrimo) {
            primo = numero + " es un número primo.";
        } else {
            primo = numero + " no es un número primo.";
        }
        return primo;
    }

    private static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
