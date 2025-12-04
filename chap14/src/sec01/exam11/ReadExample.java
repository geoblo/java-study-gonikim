package sec01.exam11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("C:/Temp/test7.txt");
			
			while (true) {
				// 입력 스트림으로부터 한 문자씩 읽어오고
				// int(4byte) 타입으로 리턴
				int data = reader.read();
				if (data == -1) break;
				System.out.println(data);
				// char 타입으로 변환하면 읽은 문자를 얻을 수 있음
				System.out.println((char) data);
			}
			
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
