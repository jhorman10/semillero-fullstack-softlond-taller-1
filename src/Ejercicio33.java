import java.util.HashMap;
import javax.swing.JOptionPane;

public class Ejercicio33 {
    public static void FrecuenciaElementosArreglo() {
        String inputLength = JOptionPane.showInputDialog("Ingrese la longitud del arreglo:");
        int longitud = Integer.parseInt(inputLength);

        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            String inputNum = JOptionPane.showInputDialog("Ingrese el elemento #" + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(inputNum);
        }

        HashMap<Integer, Integer> frecuencia = calcularFrecuencia(arreglo);

        String resultado = frecuenciaToString(frecuencia);
        JOptionPane.showMessageDialog(null, "Frecuencia de elementos:\n" + resultado);
    }

    private static HashMap<Integer, Integer> calcularFrecuencia(int[] arreglo) {
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        for (int elemento : arreglo) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }
        return frecuencia;
    }

    private static String frecuenciaToString(HashMap<Integer, Integer> frecuencia) {
        StringBuilder sb = new StringBuilder();
        for (int elemento : frecuencia.keySet()) {
            int cantidad = frecuencia.get(elemento);
            sb.append("Elemento: ").append(elemento).append(", Frecuencia: ").append(cantidad).append("\n");
        }
        return sb.toString();
    }
}
