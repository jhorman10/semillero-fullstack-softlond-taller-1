import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static String MayorMenorEdad() {
        String outputEdad;
        String inputEdad = JOptionPane.showInputDialog("Ingrese su edad:");
        int edad = Integer.parseInt(inputEdad);

        if (esMayorDeEdad(edad)) {
            outputEdad = "Usted es mayor de edad.";
        } else {
            outputEdad = "Usted es menor de edad.";
        }
        return outputEdad;
    }

    private static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
}
