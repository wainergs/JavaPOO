
public class DiaDosNamorados extends CartaoWeb {

	public DiaDosNamorados(String destinatario) {
		super(destinatario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showMessage() {
		System.out.println(this.getDestinatario());
		System.out.println("Feliz Dia dos Namorados");
	}


}
