
public class ContaEx4 {
	protected double saldo;


	
	double getSaldo(){
		return this.saldo;
	}
	
	void setSaldo(double valor){
		if(valor > 0){
			this.saldo = valor;
		}else{
			this.saldo = saldo;
		}
	}
	
	void sacar(double valor){
		if(valor > 0){
			saldo -= valor;
		}
	}
	

	

}

class Poupanca extends ContaEx4{
	private int diaRendimento;

	void setDiaRendimento(int dia){
		this.diaRendimento = dia;
	}
	
	void sacar(double valor){
		if(valor > 0){
			saldo -= valor;
		}
	}
	
	
}
