package sec01.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("C:/Temp/test2.txt");
			
			// 한 번에 지정한 배열 크기만큼 바이트 데이터를 읽어 들이므로 훨씬 빠르게 읽어들일 수 있음
			// 길이가 100인 byte 타입의 빈 배열 생성 => 최대 100byte까지 읽을 수 있다.
			byte[] buffer = new byte[100];
			
			while (true) {
				// 입력 스트림으로부터 배열의 길이만큼 읽어와서 buffer 배열에 저장
				int readByteNum = is.read(buffer); // 배열의 길이보다 적을 경우 읽을 수 있는 바이트 수 만큼 읽음
//				System.out.println(readByteNum); // 확인용
				if (readByteNum == -1) break; 
				
				for (int i = 0; i < readByteNum; i++) {
					System.out.println(buffer[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 많은 양의 바이트를 읽을 때는 read(byte[] b) 메소드를 사용하는 것이 좋다.
		// 입력 스트림으로부터 100개의 바이트가 들어온다면 
		// read() 메소드는 100번을 반복해서 읽어야 하지만
		// read(byte[] b) 메소드는 한 번 읽을 때 배열 길이만큼 읽기 때문에 읽는 횟수가 줄어듦
	}

}
