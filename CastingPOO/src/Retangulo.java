
public class Retangulo implements Relacao {
		int base,altura;
		
		
	public Retangulo() {}
	
	public Retangulo(int base, int altura) {
			super();
			this.base = base;
			this.altura = altura;
		}
	


	public int getBase() {
		return base;
	}



	public void setBase(int base) {
		this.base = base;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	@Override
	public boolean eMaior(Object a, Object b) {
		Retangulo r1 = (Retangulo) a;
		Retangulo r2 = (Retangulo) b;

		if(r1.getArea()>r2.getArea()) {
			return true;
		}else {
			return false;
		}         
	}


	@Override
	public boolean eMenor(Object a, Object b) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean eIgual(Object a, Object b) {
		// TODO Auto-generated method stub
		return false;
	}

	double getArea() {
		return base * altura;
	}
}