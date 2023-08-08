import javax.swing.JOptionPane;

public class Ejercicio20 {
    public static void InvertirCadena() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");

        String cadenaInvertida = invertirCadena(cadena);

        JOptionPane.showMessageDialog(null, "Cadena invertida: " + cadenaInvertida);
    }

    private static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadenaInvertida.toString();
    }
}
