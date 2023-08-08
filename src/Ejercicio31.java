import javax.swing.JOptionPane;

public class Ejercicio31 {
    public static void OrdenamientoBurbuja() {
        String inputLength = JOptionPane.showInputDialog("Ingrese la longitud del arreglo:");
        int longitud = Integer.parseInt(inputLength);

        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            String inputNum = JOptionPane.showInputDialog("Ingrese el elemento #" + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(inputNum);
        }

        ordenarBurbuja(arreglo);

        String resultado = arrayToString(arreglo);
        JOptionPane.showMessageDialog(null, "Arreglo ordenado: " + resultado);
    }

    private static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    private static String arrayToString(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
