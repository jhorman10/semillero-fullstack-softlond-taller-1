import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static String VerificarNumero() {
        String numeroVerificado;
        String inputNum = JOptionPane.showInputDialog("Ingrese un número:");
        double numero = Double.parseDouble(inputNum);

        if (numero > 0) {
            numeroVerificado = "El número ingresado es positivo.";
        } else if (numero < 0) {
            numeroVerificado = "El número ingresado es negativo.";
        } else {
            numeroVerificado = "El número ingresado es cero.";
        }
        return numeroVerificado;
    }
}
