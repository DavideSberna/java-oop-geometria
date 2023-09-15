package org.lessons.java.geometria;

public class Rettangolo {
	public int width;
	public int height;
	public int perimeter;
	public int area;
	
	public Rettangolo(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	public int perimetro() {
		return perimeter = (width * 2) + (height * 2);
	}
	
	public int area() {
		return area = width * height;
	}
	
	public void draw() {
	
	}

}
