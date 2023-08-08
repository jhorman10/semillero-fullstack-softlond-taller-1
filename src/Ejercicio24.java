import javax.swing.JOptionPane;

public class Ejercicio24 {
    public static void ReemplazarLetra() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");

        String letraReemplazar = JOptionPane.showInputDialog("Ingrese la letra que desea reemplazar:");
        char letraOriginal = letraReemplazar.charAt(0);

        String letraReemplazo = JOptionPane.showInputDialog("Ingrese la letra de reemplazo:");
        char letraNueva = letraReemplazo.charAt(0);

        String cadenaReemplazada = reemplazarLetra(cadena, letraOriginal, letraNueva);

        JOptionPane.showMessageDialog(null, "Cadena reemplazada: " + cadenaReemplazada);
    }

    private static String reemplazarLetra(String cadena, char letraOriginal, char letraNueva) {
        return cadena.replace(letraOriginal, letraNueva);
    }
}
