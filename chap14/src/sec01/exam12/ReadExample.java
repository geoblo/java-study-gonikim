package sec01.exam12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("C:/Temp/test8.txt");
			
			// 한 번에 지정한 문자 배열의 크기만큼 읽을 수 있으므로 빠르게 문자 데이터를 읽을 수 있음
			// 길이가 100인 char 타입의 빈 배열 생성 -> 최대 100개의 문자를 읽을 수 있다.
			char[] buffer = new char[100];
			
			while (true) {
				// 배열의 길이만큼 읽어와서 buffer 배열에 저장
				int readCharNum = reader.read(buffer);
				if (readCharNum == -1) break;
				
				for (int i = 0; i < readCharNum; i++) {
					System.out.println(buffer[i]);
				}
			}
			
			// 많은 양의 문자를 읽을 때는 read(char[] cbuf) 메소드를 사용하는 것이 좋다.
			// 입력 스트림으로부터 100개의 문자가 들어온다면 
			// read() 메소드는 100번을 반복해서 읽어야 하지만
			// read(char[] cbuf) 메소드는 한 번 읽을 때 배열 길이만큼 읽기 때문에 읽는 횟수가 줄어듦
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
