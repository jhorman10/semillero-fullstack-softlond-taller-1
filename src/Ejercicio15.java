import javax.swing.JOptionPane;

public class Ejercicio15 {
    public static String NumeroCapicua() {
        String capicua;
        String inputNum = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(inputNum);

        if (esCapicua(numero)) {
            capicua = numero + " es un número capicúa.";
        } else {
            capicua = numero + " no es un número capicúa.";
        }
        return capicua;
    }

    private static boolean esCapicua(int numero) {
        int numeroReverso = 0;
        int numeroOriginal = numero;

        while (numero != 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;
        }

        return numeroReverso == numeroOriginal;
    }
}
