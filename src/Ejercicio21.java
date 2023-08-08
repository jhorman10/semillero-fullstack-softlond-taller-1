import javax.swing.JOptionPane;

public class Ejercicio21 {
    public static void ContadorLetra() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");

        String letraInput = JOptionPane.showInputDialog("Ingrese la letra que desea contar:");
        char letra = letraInput.charAt(0);

        int contador = contarLetra(cadena, letra);

        JOptionPane.showMessageDialog(null, "La letra '" + letra + "' aparece " + contador + " veces en la cadena.");
    }

    public static int contarLetra(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
}
