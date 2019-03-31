package entities;

public class ContaBanco {
	private int numConta;
	private String nome;
	private double saldo, depInicial;

	public ContaBanco() {	
	}
	
	public ContaBanco(int numConta, String nome, double depInicial) {
		super();
		this.numConta = numConta;
		this.nome = nome;
		depositar(depInicial);
	}

	public ContaBanco(int numConta, String nome) {
		super();
		this.numConta = numConta;
		this.nome = nome;
		this.depInicial = 0;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return 	"Account = " + getNumConta()
				+ ", Holder = " + getNome() 
				+ ", balance = " + String.format("%.2f",getSaldo())+ "]";
	}

	public void depositar(double deposito) {
		if (deposito >= 0) {
			this.saldo += deposito;
		} else {
			System.out.println("Valor invalido");
			System.exit(0);
		}
	}

	public void sacar(double saque) {
			this.saldo -= saque + 5;		
	}

}
