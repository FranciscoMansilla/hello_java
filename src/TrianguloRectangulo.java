public class TrianguloRectangulo {
  double base;
  double altura;

  double calcularArea(){
    double area = base * altura * 0.5;
    return area;
  }

  public TrianguloRectangulo() {
  }

  public TrianguloRectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  public double getBase() {
    return this.base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

}
