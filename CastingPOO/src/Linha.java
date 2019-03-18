
public class Linha implements Relacao {
	int X1,Y1,X2,Y2;
	
	
	public Linha(int x1, int y1, int x2, int y2) {
		super();
		this.X1 = x1;
		this.Y1 = y1;
		this.X2 = x2;
		this.Y2 = y2;
	}

	@Override
	public boolean eMaior(Object a, Object b) {
		
		Linha a1 = (Linha) a;
		Linha a2 = (Linha)b;
		if(a1.getTamanho() > a2.getTamanho()) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean eMenor(Object a, Object b) {
		Linha a1 = (Linha) a;
		Linha a2 = (Linha)b;
		if(a1.getTamanho() < a2.getTamanho()) {
			return true;
		}else {
			return false;
		}	}

	@Override
	public boolean eIgual(Object a, Object b) {
		Linha a1 = (Linha) a;
		Linha a2 = (Linha)b;
		if(a1.getTamanho() == a2.getTamanho()) {
			return true;
		}else {
			return false;
		}
	}
	
	double getTamanho() {
		return Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1) );
	}

	
}
