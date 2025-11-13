package sec01.exam01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		// 중괄호 생략하고 테스트
		if (score < 90) // 중괄호가 생략된 if문의 범위는 다음 실행문 하나까지
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
	}

}
