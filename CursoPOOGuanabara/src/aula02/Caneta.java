package aula02;

public class Caneta {
		String modelo, cor;
		float ponta;
		int carga;
		boolean tampada;
		
		void rabiscar(){
			if(this.tampada){
				System.out.println("Nao posso Rabiscar");
			}
			else{
				System.out.println("Estou rabiscando");
			}
		}
		
		void tampar(){
			this.tampada=true;
		}
		
		void destampar(){
			this.tampada = false;
		}
		
		void status(){
			System.out.println("Uma caneta: "+this.cor);
			System.out.println("Ponta: "+this.ponta);
			System.out.println("Carga: "+this.carga);
			System.out.println("Esta tampada: "+this.tampada);
		}
	}


