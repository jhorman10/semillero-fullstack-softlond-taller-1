import javax.swing.JOptionPane;

public class Ejercicio28 {
    public static void SumaElementosArreglo() {
        String inputLength = JOptionPane.showInputDialog("Ingrese la longitud del arreglo:");
        int longitud = Integer.parseInt(inputLength);
        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            String inputNum = JOptionPane.showInputDialog("Ingrese el elemento #" + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(inputNum);
        }

        int suma = calcularSuma(arreglo);

        JOptionPane.showMessageDialog(null, "La suma de los elementos es: " + suma);
    }

    private static int calcularSuma(int[] arreglo) {
        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }
}
