package sec05.exam02;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.ordering((a, b) -> {
			return a.compareToIgnoreCase(b);
		});
		
		person.ordering((a, b) -> a.compareToIgnoreCase(b));
		
		// 메소드 참조(축약형)
		// 클래스명::인스턴스 메소드 형태이면
		// a를 통해서 compareToIgnoreCase를 호출하고 매개값으로 b를 제공
		person.ordering(String::compareToIgnoreCase);
		
		// (주의!) 클래스명::정적 메소스 형태이면 해석이 달라짐
//		person.ordering(String::compareToIgnoreCase);
//		person.ordering((a, b) -> String.compareToIgnoreCase(a, b));
		
	}

}
