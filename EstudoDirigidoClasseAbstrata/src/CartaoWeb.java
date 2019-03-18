
public abstract class CartaoWeb {
	private String destinatario;
	
	
	
	
	public CartaoWeb(String destinatario) {
		super();
		this.destinatario = destinatario;
	}
	
	String getDestinatario(){
		return this.destinatario;
	}




	public abstract void showMessage();
	
	
}
