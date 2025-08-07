package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test2.db 파일로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		
		// 배열에 바이트 데이터를 담아서 한꺼번에 출력하면 훨씬 빠르게 출력
		byte[] array = {10, 20, 30};
		
		// 배열의 모든 바이트를 출력
		os.write(array);
		
		os.flush();
		os.close();
	}

}
