import javax.swing.JOptionPane;

public class Ejercicio25 {
    public static void SepararPalabras() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        String[] palabras = frase.split(" ");
        System.out.println("Palabras en la frase:");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
