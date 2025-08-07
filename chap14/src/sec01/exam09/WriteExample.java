package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		// 주어진 배열의 off 번째 위치부터 len개 까지의 문자를 출력
		// 1번 인덱스부터 3개 출력
		writer.write(array, 1, 3);
		
		writer.flush();
		writer.close();
	}

}
