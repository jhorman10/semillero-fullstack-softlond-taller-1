import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static String AreaPerimetro() {
        String inputRadio = JOptionPane.showInputDialog("Ingrese el radio del círculo:");
        double radio = Double.parseDouble(inputRadio);

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        String mensaje = "Resultados:\n"
                + "Área del círculo: " + area + "\n"
                + "Perímetro del círculo: " + perimetro;

        return mensaje;
    }

    private static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    private static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }
}
