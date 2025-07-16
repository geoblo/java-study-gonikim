package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while (true) { // 무한 반복
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			// q를 입력하면 종료되도록 만들기
			if (keyCode == 113) {
				break; // keyCode가 113과 동일할 경우 실행
			}
		}
		
		System.out.println("종료");
	}

}
