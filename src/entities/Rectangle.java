package entities;

public class Rectangle {

	public double whidth;
	public double heigth;
	
	public double area() {
		return whidth * heigth;
	}
	public double perimeter() {
		return whidth + whidth + heigth + heigth ;		
	}
	public double diagonal() {
		return Math.sqrt(whidth*whidth + heigth*heigth);
	}
	
	public String toString() {
		return "Area = "
				+ String.format("%.2f%n",area())
				+ "Perimeter = "
				+ String.format("%.2f%n", perimeter())
				+ String.format("Diagonal = %.2f%n ", diagonal());
				
	}
}
