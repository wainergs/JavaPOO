
public class Exercicio1 {
	public Exercicio1() {
		System.out.println("Classe A");
		
	}

}

 class B {
	public B(){
		System.out.println("Classe B");
	}
}
 
 class C extends Exercicio1{
	 B teste = new B();
	 
 }
