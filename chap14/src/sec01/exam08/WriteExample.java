package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		// 배열을 이용해서 문자 데이터 한꺼번에 출력
		char[] array = {'A', 'B', 'C'};
		
		// 배열의 모든 문자를 출력
		writer.write(array);
		
		writer.flush();
		writer.close();
	}

}
