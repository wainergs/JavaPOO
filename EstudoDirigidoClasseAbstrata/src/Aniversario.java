
public class Aniversario extends CartaoWeb {

	public Aniversario(String destinatario) {
		super(destinatario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showMessage() {
		System.out.println(this.getDestinatario());
		System.out.println("Feliz Aniversario!!");
		
	}

}
