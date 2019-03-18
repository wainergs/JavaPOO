import java.awt.Window.Type;
import java.util.ArrayList;

public class testeGeometricas {

	public static void main(String[] args) {
        ArrayList<FormaGeometrica> list = new ArrayList<FormaGeometrica>();
        
        Retangulo r1 = new Retangulo(3,4);
        Circulo c1 = new Circulo(0, 0,5);
        
        list.add(r1);
        list.add(c1);
        
        for (FormaGeometrica formaGeometrica : list) {
			System.out.println(formaGeometrica.calcularArea());
			System.out.println(formaGeometrica.calcularPerimeto());
		}

	}

}
