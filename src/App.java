import java.awt.Color;
import java.awt.Frame;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        TrianguloRectangulo triangulo = new TrianguloRectangulo();
        triangulo.setAltura(20);
        triangulo.setBase(10);

        System.out.println(triangulo.calcularArea());

        Frame ventana = new Frame();
        ventana.setSize(1000, 300);
        ventana.setBackground(Color.red);
        ventana.setVisible(true);
        
    }
}