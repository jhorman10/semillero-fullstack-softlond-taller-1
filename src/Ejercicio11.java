import javax.swing.JOptionPane;

public class Ejercicio11 {
    public static String AreaTrianguloHeron() {
        String areaTrianguloHeron;
        String inputLado1 = JOptionPane.showInputDialog("Ingrese la longitud del lado 1:");
        double lado1 = Double.parseDouble(inputLado1);

        String inputLado2 = JOptionPane.showInputDialog("Ingrese la longitud del lado 2:");
        double lado2 = Double.parseDouble(inputLado2);

        String inputLado3 = JOptionPane.showInputDialog("Ingrese la longitud del lado 3:");
        double lado3 = Double.parseDouble(inputLado3);

        double area = calcularAreaTriangulo(lado1, lado2, lado3);

        areaTrianguloHeron = "El área del triángulo es: " + area;
        
        return areaTrianguloHeron;
    }

    private static double calcularAreaTriangulo(double a, double b, double c) {
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
