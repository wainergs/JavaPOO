
public class Circulo extends Geometrica implements FormaGeometrica {

	double raio;
	public Circulo(double base, double altura,double raio) {
		super(base, altura);
		this.raio = raio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularPerimeto() {
		double perimetro = 2 * 3.15159 * raio;
		return perimetro;
	}

	@Override
	public double calcularArea() {
		return 0;
	}

}
