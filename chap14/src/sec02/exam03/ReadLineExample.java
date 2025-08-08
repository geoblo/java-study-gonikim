package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		Reader reader = 
				new FileReader(ReadLineExample.class.getResource("language.txt").getPath());
		BufferedReader br = new BufferedReader(reader);
		// 한 문자씩 읽는 것보다 라인(행) 단위로 문자열을 읽어 성능 향상
		
		while (true) {
			String data = br.readLine(); // 더 이상 데이터를 읽을 수 없을 때 null을 반환
			if (data == null) break;
			System.out.println(data);
		}
		
		br.close();
	}
	
	// 간단하게 쓰고 싶다면 Scanner.nextLine() 사용해도 OK
	// 하지만 성능이 중요하거나 대량의 데이터를 다룬다면 BufferedReader.readLine()이 적합
	// 둘 다 장단점이 있으므로 용도에 따라 선택
}
