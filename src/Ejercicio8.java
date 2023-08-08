import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static String JuegoAdivinarNumero() {
        int numeroAdivinar = (int) (Math.random() * 100) + 1;
        String numero;

        int intentos = 0;
        int numeroUsuario;

        do {
            String inputNum = JOptionPane.showInputDialog("Adivina el número (entre 1 y 100):");
            numeroUsuario = Integer.parseInt(inputNum);

            if (numeroUsuario > numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "El número a adivinar es menor.");
            } else if (numeroUsuario < numeroAdivinar) {
                JOptionPane.showMessageDialog(null, "El número a adivinar es mayor.");
            }

            intentos++;
        } while (numeroUsuario != numeroAdivinar);

        numero = "¡Felicidades! Adivinaste el número " + numeroAdivinar + " en " + intentos + " intentos.";
        return numero;
    }
}
