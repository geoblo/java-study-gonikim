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
		
		// 참고: 방법1, 2, 3 모두 같은 Class 객체를 참조
//		System.out.println(c1 == c2);
//		System.out.println(c1 == c3);
//		System.out.println(c2 == c3);
		
		System.out.println(c1.getName()); // 클래스의 전체 이름
		System.out.println(c1.getSimpleName()); // 패키지 이름을 제외한 순수 클래스 이름
		System.out.println(c1.getPackage().getName()); // 패키지 이름
		System.out.println(c1.getPackageName()); // 위와 동일(자바9 부터 추가)
		
		// 이 외에도 필드/생성자/메소드 정보도 얻을 수 있는데
		// 이 정보를 얻어 활용하는 것을 자바에서는 "리플렉션"이라고 부름
	}

}
