package aula05;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	
	
	public ContaBanco(int numConta, String tipo, String dono) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = 0;
		this.status = false;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}




	public void abrirConta(String tipo) {
	setTipo(tipo);
	setStatus(true);
	if (tipo.equals("cc")) {
		setSaldo(50);
	}else if(tipo.equals("cp")) {
		setSaldo(150);
	}
	}
	
	
	
	
	
	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Sua conta tem: "+getSaldo()+"\n"+
		"Efetue o saque primeiro.");
		}else if (saldo < 0) {
			System.out.println("Conta em debito, efetue o pagamento para fechar a conta");
		}else {
			setStatus(false);
		}
	}
	
	
	
	 public void depositar(double valor) {
		if (valor > 0) { 
			if(isStatus()) {
				setSaldo(getSaldo()+valor);
			}
		}else {
			System.out.println("Impossivel depositar!!");
		}
	 }
	
	
	
	public void sacar(double valor) {
		if(isStatus()) {
			if(getSaldo()> valor) {
				setSaldo(getSaldo()-valor);
			}else {
				System.out.println("Saldo insuficiente!!");
			}
		}else {
			System.out.println("Impossivel sacar!");
		}
	}
	
	
	public void pagarMensal() {
		double real = 0;
			if(getTipo().equals("cc") ) {
				real=12;
			}else if(getTipo().equals("cp")) {
				real=20;
			}
		if (isStatus()) {
			if (getSaldo() > real ) {
				saldo -= real;
			}else {
				System.out.println("Saldo insuficiente!!");
			}
		}
		
	}

}
