import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static String MayorMenor() {
        String mayorMenor;
        String inputNum1 = JOptionPane.showInputDialog("Ingrese el primer número entero:");
        int num1 = Integer.parseInt(inputNum1);

        String inputNum2 = JOptionPane.showInputDialog("Ingrese el segundo número entero:");
        int num2 = Integer.parseInt(inputNum2);

        int mayor = obtenerMayor(num1, num2);

        mayorMenor = "El mayor número es: " + mayor;

        return mayorMenor;
    }

    private static int obtenerMayor(int num1, int num2) {
        return Math.max(num1, num2);
    }
}
