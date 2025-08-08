package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception {
		// 기본 스트림 코드
		String originalFilePath1 = 
				NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targerFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targerFilePath1);
		
		// 버퍼 보조 스트림을 적용한 코드
		String originalFilePath2 = 
				NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targerFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targerFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// 기본 스트림 코드를 이용해서 복사
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");

		// 버퍼 보조 스트림 코드를 이용해서 복사
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때:\t\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		// 참고: 연결된 보조 스트림만 닫아도 내부의 기본 스트림까지 자동으로 닫힘
	}

	static int data = -1; // 입력 스트림으로부터 데이터를 전혀 읽지 않았을 경우 -1
	// 매개 변수의 타입은 바이트 기반 스트림으로 그림, 음악, 텍스트 등 모든 종류의 파일을 복사하기 위해
	private static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime(); // 시작 시간 저장
		
		// 파일 복사하는 방법
		// 원본 파일에서 읽은 1byte를 타겟 파일로 바로 출력
		while (true) {
			data = is.read();
			if (data == -1) break;
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime(); // 끝 시간 저장
		return end - start; // 복사에 걸린 시간 리턴
	}

}
