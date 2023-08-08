import javax.swing.JOptionPane;

public class Ejercicio14 {
    public static String NumeroPerfecto() {
        String perfecto;
        String inputNum = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(inputNum);

        if (esNumeroPerfecto(numero)) {
            perfecto = numero + " es un número perfecto.";
        } else {
            perfecto = numero + " no es un número perfecto.";
        }
        return perfecto;
    }

    private static boolean esNumeroPerfecto(int numero) {
        if (numero <= 0) {
            return false;
        }

        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }
}
