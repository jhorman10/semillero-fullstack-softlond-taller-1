import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio27 {
    public static void OrdenarPalabras() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");
        String[] palabras = frase.split(" ");
        Arrays.sort(palabras);

        String palabrasOrdenadas = String.join(" ", palabras);
        JOptionPane.showMessageDialog(null, "Palabras ordenadas alfabéticamente: " + palabrasOrdenadas);
    }
}
