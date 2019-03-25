import java.util.Scanner;
import javax.swing.JOptionPane;

public class MesesDoAno {
public static void main(String[] a) {
	Scanner sc = new Scanner(System.in);
String meses[] = { "Janeiro", "Fevereiro", "Março", "Abril",
"Maio", "Junho", "Julho", "Agosto", "Setembro",
"Outubro", "Novembro", "Dezembro" };
int mes = 1;
while (mes != 0) {

	try {
		mes = Integer.parseInt(JOptionPane.showInputDialog("Numero do mês (0 para finalizar)"));
        if (mes > 0)
		JOptionPane.showMessageDialog(null, "Nome do mês = " +
				meses[mes - 1]);
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e);
	}
	
}
System.out.println("# fim do programa #");
}
}