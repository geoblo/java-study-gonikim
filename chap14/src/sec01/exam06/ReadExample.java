package sec01.exam06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("C:/Temp/test3.txt");
			
			byte[] buffer = new byte[5];
			
			// Quiz: 입력 스트림으로부터 3바이트를 읽고 인덱스 2부터 순차적으로 저장
			int readByteNum = is.read(buffer, 2, 3);
			if (readByteNum != -1) { // 읽은 바이트가 있다면
				for (int i = 0; i < buffer.length; i++) {
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
