package sec04.exam05.quiz;

public class Rectangle {
	int width;
	int height;
	
	public void area() {
		int result = width * height;
		System.out.println("면적: " + result);
	}
	
	public void length() {
		int result = (width + height) * 2;
		System.out.println("둘레: " + result);
	}
	
	
}
