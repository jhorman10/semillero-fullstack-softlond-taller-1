import javax.swing.JOptionPane;

public class Ejercicio19 {
    public static void NombreMayusculasMinusculas() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");

        JOptionPane.showMessageDialog(null, "Nombre en mayúsculas: " + nombre.toUpperCase() +
                "\nNombre en minúsculas: " + nombre.toLowerCase());
    }
}
