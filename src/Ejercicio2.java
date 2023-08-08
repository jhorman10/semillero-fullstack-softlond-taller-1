import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static String ParImpar() {
        String parImpar;
        String inputNum = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(inputNum);

        if (esPar(numero)) {
            parImpar = numero + " es un número par.";
        } else {
            parImpar = numero + " es un número impar.";
        }
        return parImpar;
    }

    private static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
