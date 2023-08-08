import javax.swing.JOptionPane;

public class Ejercicio32 {
    public static void BuscarElementoArreglo() {
        String inputLength = JOptionPane.showInputDialog("Ingrese la longitud del arreglo:");
        int longitud = Integer.parseInt(inputLength);

        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            String inputNum = JOptionPane.showInputDialog("Ingrese el elemento #" + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(inputNum);
        }

        String inputNumeroBuscado = JOptionPane.showInputDialog("Ingrese el número que desea buscar:");
        int numeroBuscado = Integer.parseInt(inputNumeroBuscado);

        int indice = buscarElemento(arreglo, numeroBuscado);
        if (indice != -1) {
            JOptionPane.showMessageDialog(null, "El número " + numeroBuscado + " se encuentra en el índice: " + indice);
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
    }

    private static int buscarElemento(int[] arreglo, int numeroBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                return i;
            }
        }
        return -1;
    }
}
