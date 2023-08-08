import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio34 {
    public static void RotacionArreglo() {
        String inputLength = JOptionPane.showInputDialog("Ingrese la longitud del arreglo:");
        int longitud = Integer.parseInt(inputLength);

        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            String inputNum = JOptionPane.showInputDialog("Ingrese el elemento #" + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(inputNum);
        }

        String inputPosiciones = JOptionPane.showInputDialog("Ingrese la cantidad de posiciones a rotar:");
        int posiciones = Integer.parseInt(inputPosiciones);

        String[] opciones = { "Izquierda", "Derecha" };
        int direccion = JOptionPane.showOptionDialog(null, "Seleccione la dirección de rotación:",
                "Rotación de Elementos",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

        int[] arregloRotado = rotarArreglo(arreglo, posiciones, direccion);
        String resultado = Arrays.toString(arregloRotado);
        JOptionPane.showMessageDialog(null, "Arreglo rotado: " + resultado);
    }

    private static int[] rotarArreglo(int[] arreglo, int posiciones, int direccion) {
        int n = arreglo.length;
        int[] arregloRotado = new int[n];

        for (int i = 0; i < n; i++) {
            int nuevaPosicion;
            if (direccion == 0) {
                nuevaPosicion = (i + n - posiciones) % n;
            } else {
                nuevaPosicion = (i + posiciones) % n;
            }
            arregloRotado[nuevaPosicion] = arreglo[i];
        }

        return arregloRotado;
    }
}
