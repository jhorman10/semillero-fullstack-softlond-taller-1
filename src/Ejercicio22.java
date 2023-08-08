import javax.swing.JOptionPane;

public class Ejercicio22 {
    public static void Palindromo() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        if (esPalindromo(frase)) {
            JOptionPane.showMessageDialog(null, "La frase es un palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "La frase no es un palíndromo.");
        }
    }

    private static boolean esPalindromo(String frase) {
        String fraseSinEspacios = frase.replaceAll(" ", "").toLowerCase();

        int izquierda = 0;
        int derecha = fraseSinEspacios.length() - 1;

        while (izquierda < derecha) {
            if (fraseSinEspacios.charAt(izquierda) != fraseSinEspacios.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
