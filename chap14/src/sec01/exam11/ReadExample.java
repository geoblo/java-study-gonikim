package sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test7.txt");
		
		while (true) {
			// 입력 스트림으로부터 한 문자(2byte)씩 읽어오고
			// int(4byte) 타입으로 리턴
			int data = reader.read();
			if (data == -1) break;
			System.out.println(data);
			// int 값을 char 타입으로 변환하면 읽은 문자를 출력할 수 있음
			System.out.println((char) data);			
		}
		
		reader.close();
	}

}
