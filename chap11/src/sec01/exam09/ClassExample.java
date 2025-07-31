package sec01.exam09;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		// Class 객체:
		// 자바에서 해당 클래스의 메타 데이터를 표현하는 객체(메타 데이터: "데이터에 대한 데이터", 즉 어떤 데이터를 설명하는 정보)
		// JVM 내에서 한 클래스당 하나의 Class 객체만 존재
		
		// Car 클래스의 Class 객체 얻기
		// 방법1
		Class c1 = Car.class;
		
		// 방법2
		Class c2 = Class.forName("sec01.exam09.Car");
		
		// 방법3
		Car car = new Car();
		Class c3 = car.getClass();
		
		
		
		
		
		
	}

}
