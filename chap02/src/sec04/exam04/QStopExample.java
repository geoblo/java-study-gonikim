package sec04.exam04;

import java.io.IOException;

public class QStopExample {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			// q를 입력하면 종료되도록 만들기
			if (keyCode == 113) { // keyCode == 'q'
				break;
			}
		}
		
		System.out.println("종료");
	}

}
