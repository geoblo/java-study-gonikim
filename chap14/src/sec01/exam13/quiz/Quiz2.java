package sec01.exam13.quiz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Quiz2 {
//	Quiz
//	"자바 프로그래밍입니다."가 저장된 "C:/Temp/test.txt" 파일을 
//	"C:/Temp/test_copy.txt" 로 복사하는 코드를 구현해 보세요.
	
//	힌트: Reader를 사용해 원본 파일에서 읽어온 데이터를 Writer를 사용해 타겟 파일로 바로 출력
	
	public static void main(String[] args) {
		try (Reader reader = new FileReader("C:/Temp/test.txt");
			 Writer writer = new FileWriter("C:/Temp/test_copy.txt")) {
			
			// 방법1
//			while (true) {
//				int data = reader.read();
//				if (data == -1) break;
//				writer.write(data);
//			}
			
			// 방법2: 파일 크기가 클 경우 배열을 이용하여 효율적으로 처리하기
			char[] buffer = new char[1024];
			int readChars;
			
			while ((readChars = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, readChars);
			}
			
			writer.flush(); // try 블록이 끝나면 writer.close() 호출됨 -> 내부적으로 flush()도 호출됨
            System.out.println("파일 복사가 완료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
