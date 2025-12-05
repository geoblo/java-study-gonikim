package sec02.exam02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) throws Exception {
		// 버퍼가 없는 기본 스트림 코드
		// 현재 클래스가 있는 위치에서 파일을 찾아 절대 경로로 반환
		String originalFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		
		// 버퍼가 있는 버퍼 보조 스트림을 적용한 코드
		
		
		
		// 기본 스트림 이용해서 복사
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");
		
		// 버퍼 보조 스트림 이용해서 복사
		
		
		fis.close();
		fos.close();
		
		
	}
	
	// 입력 스트림에서 데이터를 읽고 출력 스트림으로 데이터를 보내는 코드(데이터를 복사하는 코드)
	// 매개 변수의 타입은 바이트 기반 스트림으로 그림, 음악, 텍스트 등 모든 종류의 파일을 복사하기 위해
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime(); // 시작 시간 저장

		// 파일 복사
		// 원본 파일에서 읽은 1byte를 타겟 파일로 바로 출력
		while (true) {
			int data = is.read(); // 바이트를 읽어서
			if (data == -1) break;
			os.write(data); // 바이트를 출력
		}
		os.flush();
		
		long end = System.nanoTime(); // 끝 시간 저장
		
		return end - start; // 복사에 걸린 시간 리턴
	}
	
}
