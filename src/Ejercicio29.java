import javax.swing.JOptionPane;

public class Ejercicio29 {
    public static void NumeroMasGrandeArreglo() {
        String inputLength = JOptionPane.showInputDialog("Ingrese la longitud del arreglo:");
        int longitud = Integer.parseInt(inputLength);

        int[] arreglo = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            String inputNum = JOptionPane.showInputDialog("Ingrese el elemento #" + (i + 1) + ":");
            arreglo[i] = Integer.parseInt(inputNum);
        }

        int numeroMasGrande = encontrarNumeroMasGrande(arreglo);

        JOptionPane.showMessageDialog(null, "El número más grande en el arreglo es: " + numeroMasGrande);
    }

    private static int encontrarNumeroMasGrande(int[] arreglo) {
        int maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }
}
