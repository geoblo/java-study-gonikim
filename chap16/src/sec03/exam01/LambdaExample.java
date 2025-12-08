package sec03.exam01;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		// Workable 인터페이스의 추상 메소드를 보고 만들기
		person.action1((name, job) -> {
			// 실제 실행할 내용
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다.");
		});
		// 실행문이 한 개일 경우 중괄호 생략 가능
		person.action1((name, job) -> System.out.println(name + "이 " + job + "을 합니다."));
		
		// Quiz: Speakable 인터페이스의 추상 메소드 보고 만들기
		// [출력 예시]
		// "안녕하세요"라고 말합니다.
		person.action2((word) -> {
			System.out.println("\"" + word + "\"라고 말합니다.");
		});
		// 매개변수가 한 개일 경우 괄호 생략 가능
		person.action2(word -> System.out.println("\"" + word + "\"라고 말합니다."));
		
	}

}
