package entities;

public class Student {
	public String nome;
	public double n1,n2,n3;
	
	private double calcNota() {
		return n1 + n2 +n3;
	}
	
	public void verifyNotes() {
		if (calcNota() > 60) {
			System.out.println("Aluno: "+this.nome);
			System.out.println("Final Grade: "+calcNota());
			System.out.println("PASS");
		}else {
			System.out.println("Aluno: "+this.nome);
			System.out.println("Final Grade: "+calcNota());
			System.out.println("FAILED");
			System.out.println("Missing: "+(60-calcNota()));
		}
	}

}
