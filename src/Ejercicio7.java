import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static String TablaMultiplicar() {

        String tabla = "";
        String inputNum = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(inputNum);

        if (numero > 0) {
            System.out.println("Tabla de multiplicar del número " + numero + " hasta el 10:");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                tabla += numero + " x " + i + " = " + resultado + "\n";
            }
        } else {
            tabla = "El número ingresado no es válido. Debe ser un número entero positivo.";
        }
        return tabla;
    }
}
