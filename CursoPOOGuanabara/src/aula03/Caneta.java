package aula03;

public class Caneta {
		public String modelo, cor;
		private float ponta;
		protected int carga;
		protected boolean tampada;
		
		 public void rabiscar(){
			if(this.tampada){
				System.out.println("Nao posso Rabiscar");
			}
			else{
				System.out.println("Estou rabiscando");
			}
		}
		
		protected void tampar(){
			this.tampada=true;
		}
		
		protected void destampar(){
			this.tampada = false;
		}
		
		void status(){
			System.out.println("Uma caneta: "+this.modelo);
			System.out.println("Tem cor: "+this.cor);
			System.out.println("Ponta: "+this.ponta);
			System.out.println("Carga: "+this.carga);
			System.out.println("Esta tampada: "+this.tampada);
		}
	}


