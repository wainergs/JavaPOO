package entities;

public class Rectangle {
	public double height, width;
	
	public double area() {
		return this.height * this.width;
	}
	
	public double Perimeter() {
		return (this.width + this.height) * 2;
	}
	
	public double Diagonal() {
		return Math.pow(width, 2) + Math.pow(height, 2);
	}

	@Override
	public String toString() {
		return "Rectangle height = " + height + ", width = " + width + "]";
	}
	
	
	

}
