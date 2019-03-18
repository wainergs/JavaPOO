import java.util.ArrayList;

public class testeClasses {
	public static void main(String[] args){

        ArrayList<CartaoWeb> list = new ArrayList<CartaoWeb>();

	DiaDosNamorados d1 = new DiaDosNamorados("Teste");
	
	Natal d2 = new Natal("Marcos");
	
	Aniversario d3 = new Aniversario("Eduardo");
	
	String d = "d";
	
	list.add(d1);
	list.add(d2);
	list.add(d3);
	
for (CartaoWeb item: list) {
	item.showMessage();
}

	}

}

