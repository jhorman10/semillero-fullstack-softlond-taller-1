import javax.swing.JOptionPane;

public class Ejercicio13 {
    public static String RedondeoDecimal() {
        String numeroRedondo;
        String inputNum = JOptionPane.showInputDialog("Ingrese un número decimal:");
        double numero = Double.parseDouble(inputNum);

        String inputDecimales = JOptionPane.showInputDialog("Ingrese el número de decimales para redondear:");
        int numDecimales = Integer.parseInt(inputDecimales);

        double numeroRedondeado = redondearDecimal(numero, numDecimales);

        numeroRedondo = "El número redondeado es: " + numeroRedondeado;
        return numeroRedondo;
    }

    private static double redondearDecimal(double numero, int numDecimales) {
        double factor = Math.pow(10, numDecimales);
        return Math.round(numero * factor) / factor;
    }
}
