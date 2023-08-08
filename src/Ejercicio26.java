import javax.swing.JOptionPane;

public class Ejercicio26 {
    public static void ContadorCaracteresSinEspacios() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");
        int cantidadCaracteres = contarCaracteresSinEspacios(cadena);

        JOptionPane.showMessageDialog(null, "La cadena tiene " + cantidadCaracteres + " caracteres sin contar los espacios.");
    }

    private static int contarCaracteresSinEspacios(String cadena) {
        return cadena.replaceAll(" ", "").length();
    }
}
