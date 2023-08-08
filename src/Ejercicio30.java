import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio30 {
    public static void EliminarDuplicadosArreglo() {
        String inputLength = JOptionPane.showInputDialog("Ingrese la longitud del arreglo:");
        int longitud = Integer.parseInt(inputLength);
        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            String inputNum = JOptionPane.showInputDialog("Ingrese el elemento #" + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(inputNum);
        }

        int[] arregloSinDuplicados = eliminarDuplicados(arreglo);

        String resultado = Arrays.toString(arregloSinDuplicados);
        JOptionPane.showMessageDialog(null, "Arreglo sin duplicados: " + resultado);
    }

    private static int[] eliminarDuplicados(int[] arreglo) {
        int longitudOriginal = arreglo.length;

        int elementosUnicos = 0;
        for (int i = 0; i < longitudOriginal; i++) {
            boolean duplicado = false;
            for (int j = i + 1; j < longitudOriginal; j++) {
                if (arreglo[i] == arreglo[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                elementosUnicos++;
            }
        }

        int[] arregloSinDuplicados = new int[elementosUnicos];
        int indice = 0;
        for (int i = 0; i < longitudOriginal; i++) {
            boolean duplicado = false;
            for (int j = i + 1; j < longitudOriginal; j++) {
                if (arreglo[i] == arreglo[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                arregloSinDuplicados[indice] = arreglo[i];
                indice++;
            }
        }

        return arregloSinDuplicados;
    }
}
