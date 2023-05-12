// import java.awt.Color;
// import java.awt.Frame;
import javax.swing.*;
public class App extends JFrame{
    public static void main(String[] args) throws Exception {
        App window = new App();
        window.setSize(500, 500);
        // window.setTitle("Ventana Fran");
        window.setTitle("Ventana");
        window.setVisible(true);
        // System.out.println("Hello, World!");
        // TrianguloRectangulo triangulo = new TrianguloRectangulo();
        // triangulo.setAltura(20);
        // triangulo.setBase(10);

        // System.out.println(triangulo.calcularArea());

        // Frame ventana = new Frame();
        // ventana.setSize(1000, 300);
        // ventana.setBackground(Color.red);
        // ventana.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}