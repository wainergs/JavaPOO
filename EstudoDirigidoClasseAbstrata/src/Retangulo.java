
public class Retangulo extends Geometrica implements FormaGeometrica{


	public Retangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPerimeto() {
		double perimetro = (2 * this.getBase()) + (2 * this.getAltura());
		return perimetro;
	}

	@Override
	public double calcularArea() {
		double area = this.base * this.altura;
		return area;
	}
	
	
}
