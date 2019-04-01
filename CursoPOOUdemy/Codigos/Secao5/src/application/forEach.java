package application;

public class forEach {
public static void main(String[] args) {
	String[] vect = new String[] {"Eduardo","Sandra","Augusto"};
	for(int i=0;i<vect.length;i++) {
		System.out.println(vect[i]);
	}
	
	System.out.println("--------------------------");
	
	//String é o tipo de colecao que vou percorrer
	// obj é o apelido que dei para os elementos da colecao
	// vect é o nome da colecao
	for(String obj:vect) {
		System.out.println(obj);
	}
}
}
