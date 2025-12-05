package sec03.exam03.quiz;

import java.io.File;
import java.io.IOException;

public class Quiz2 {
//	Quiz
//	먼저 "C:/test/sub" 폴더 아래에 test1.txt, test2.txt, test3.txt 파일을 만들어주세요.
//	(파일 탐색기에서 직접 만들고 시작)
	
//	FileManager 클래스에 deleteFile(dir: File): void 메소드를 정의합니다.
//	실행 클래스에서 FileManager 클래스를 객체화한 다음 deleteFile() 메소드를 호출하세요.
//	deleteFile()은 "C:/test/sub" 아래에 있는 파일들을 모두 삭제하는 기능을 수행합니다.
	
//	[출력]
//	C:\test\sub\2025 -> 삭제 안됨
//	C:\test\sub\test1.txt -> 삭제 완료
//	C:\test\sub\test2.txt -> 삭제 완료
//	C:\test\sub\test3.txt -> 삭제 완료
	
	public static void main(String[] args) {
		File test1 = new File("C:/test/sub/test1.txt");
		File test2 = new File("C:/test/sub/test2.txt");
		File test3 = new File("C:/test/sub/test3.txt");
		
		// 파일 생성
		try {
			if (!test1.exists()) test1.createNewFile();
			if (!test2.exists()) test2.createNewFile();
			if (!test3.exists()) test3.createNewFile();
		} catch (IOException e) {
			System.out.println("파일 생성 중 오류 발생");
		}
		
		// 폴더 내 모든 파일 삭제
		FileManager fileManager = new FileManager();
		
		File dir = new File("C:/test/sub");
		fileManager.deleteFiles(dir);
	}

}
