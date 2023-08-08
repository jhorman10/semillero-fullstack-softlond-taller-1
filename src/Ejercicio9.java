import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static String Factorial() {
        String factor;
        String inputNum = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(inputNum);

        if (numero >= 0) {
            long factorial = calcularFactorial(numero);

            factor = "El factorial de " + numero + " es: " + factorial;
        } else {
            factor = "El número ingresado no es válido. Debe ser un número entero positivo.";
        }

        return factor;
    }

    private static long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}
