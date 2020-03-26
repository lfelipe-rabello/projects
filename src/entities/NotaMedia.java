package entities;

public class NotaMedia {

	public String name;
	public double nA;
	public double nB;
	public double nC;
	 
	
	public double notaTotal() {
		return (nA+nB+nC);
	}
	
	public void pass(double max) {
		if (this.notaTotal() >= max) {
			System.out.println("Approved");
		}
		else {
			System.out.println("Repproved");
		}
	}
	
}
