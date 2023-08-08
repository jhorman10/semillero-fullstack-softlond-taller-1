import javax.swing.JOptionPane;

public class Ejercicio18 {
    public static void GeneradorContrasena() {
        String contrasena = generarContrasenaAleatoria(8);

        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contrasena);
    }

    private static String generarContrasenaAleatoria(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = (int) (Math.random() * caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            contrasena.append(caracterAleatorio);
        }

        return contrasena.toString();
    }
}
