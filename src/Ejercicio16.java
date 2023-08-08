import javax.swing.JOptionPane;

public class Ejercicio16 {
    public static String SerieFibonacciHastaNumero() {
        String serie = "";
        String inputNum = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numeroLimite = Integer.parseInt(inputNum);

        int a = 0;
        int b = 1;
        while (a <= numeroLimite) {
            serie += a + " ";
            int c = a + b;
            a = b;
            b = c;
        }

        return serie;
    }
}
