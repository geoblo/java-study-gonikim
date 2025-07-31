package sec01.exam07;

public class ExitExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			if (i == 5) {
				System.exit(0); // 0: 정상 종료일 경우
//				break;
//				return;
			}
		}
		
		System.out.println("마무리 코드");
	}

}
