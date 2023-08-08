import javax.swing.JOptionPane;

public class Ejercicio17 {
    public static String NumerosPrimosEnRango() {
        String primos = "";
        String inputNum1 = JOptionPane.showInputDialog("Ingrese el primer número entero:");
        int numero1 = Integer.parseInt(inputNum1);

        String inputNum2 = JOptionPane.showInputDialog("Ingrese el segundo número entero:");
        int numero2 = Integer.parseInt(inputNum2);

        for (int num = numero1; num <= numero2; num++) {
            if (esPrimo(num)) {
                primos += num + " ";
            }
        }
        return primos;
    }

    private static boolean esPrimo(int numero) {
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
