package sec01.exam12;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		// bytes 배열에 키보드로부터 읽은 키코드를 저장
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		// 입력 스트림에서 바이트들을 여러 개 읽어 배열에 저장하고 읽은 바이트 수를 반환
		// System.in: 시스템의 표준 입력 장치(키보드)
		// read(): 입력된 키코드를 읽어라
		
		System.out.println(readByteNo);
		// 예: Hello 엔터를 치면 바이트 배열에 저장하고 7을 리턴함
		// 5가 아니라 7인 이유? 엔터의 키코드인 \r(CR) \n(LF) 를 포함하기 때문
		
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
	}

}
