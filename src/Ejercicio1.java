import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static String OperacionesAritmeticas() {
        String inputNum1 = JOptionPane.showInputDialog("Ingrese el primer número entero:");
        int num1 = Integer.parseInt(inputNum1);

        String inputNum2 = JOptionPane.showInputDialog("Ingrese el segundo número entero:");
        int num2 = Integer.parseInt(inputNum2);

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;

        String mensaje = "Resultados:\n"
                + "Suma: " + suma + "\n"
                + "Resta: " + resta + "\n"
                + "Multiplicación: " + multiplicacion + "\n"
                + "División: " + division;

        return mensaje;
    }
}
