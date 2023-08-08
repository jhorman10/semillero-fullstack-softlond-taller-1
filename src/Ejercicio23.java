import javax.swing.JOptionPane;

public class Ejercicio23 {
    public static void ContadorPalabras() {
        String oracion = JOptionPane.showInputDialog("Ingrese una oración:");

        int cantidadPalabras = contarPalabras(oracion);

        JOptionPane.showMessageDialog(null, "La oración contiene " + cantidadPalabras + " palabras.");
    }

    private static int contarPalabras(String oracion) {
        String[] palabras = oracion.split(" ");
        
        return palabras.length;
    }
}
