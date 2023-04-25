import java.awt.Color;
import java.awt.Frame;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        TrinaguloRectangulo triangulo = new TrinaguloRectangulo();
        triangulo.altura = 20;
        triangulo.base = 10;

        System.out.println(triangulo.calcularArea());

        Frame ventana = new Frame();
        ventana.setSize(1000, 300);
        ventana.setBackground(Color.red);
        ventana.setVisible(true);
        
    }
}