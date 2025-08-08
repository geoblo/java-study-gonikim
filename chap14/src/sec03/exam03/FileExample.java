package sec03.exam03;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

// File 클래스
// 파일 및 폴더의 생성과 삭제
// 파일 및 폴더의 정보(이름, 경로, 크기, 최종 수정일 등) 제공
public class FileExample {

	public static void main(String[] args) {
		// 경로 구분자
		// Windows: \(역슬래시) + 호환성과 편의성을 위해 /도 자동으로 \로 변환하여 처리
		// UNIX/Linux/macOS: /(슬래시)
		
		// 자바는 별개로 File, Path 등 경로 관련 클래스 내부적으로 플랫폼별 경로 구분자 처리를 자동으로 해줌
		// 자바는 운영체제에 독립적으로 운영체제에 상관없이 같은 코드가 동작해야 하기 때문에,
		// File, Path 등 경로 관련 클래스는 내부적으로 플랫폼별 경로 구분자 처리를 자동으로 해줌
		
		// 파일 객체 생성
		// 생성자에 상대 경로(프로젝트 루트 기준) 또는 절대 경로 작성
		// 파일 객체를 생성했다고 해서 파일이나 폴더가 생성되는 것은 아님
		// 문자열 경로에 실제 파일이나 폴더가 없더라도 예외가 발생하지 않음
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:\\Temp\\file3.txt");
		
		// 해당 경로에 실제 파일이나 폴더가 있는지 검사
		// 존재하지 않으면 생성
		// 폴더 생성
		if (!dir.exists()) dir.mkdirs(); 
		
		// 파일 생성
		try {
			if (!file1.exists()) file1.createNewFile();
			if (!file2.exists()) file2.createNewFile();
			if (!file3.exists()) file3.createNewFile();			
		} catch (IOException e) {
			System.out.println("파일 생성 중 오류 발생");
		}
		
		// 참고: 폴더 생성 2가지 방법 차이점
		// mkdir() vs mkdirs() - 주로 사용
		File dirTest = new File("C:/Temp/test/videos");
//		if (!dirTest.exists()) dirTest.mkdir(); // 경로상 맨뒤 폴더만 생성(앞에 상위 폴더가 있어야 함)
		if (!dirTest.exists()) dirTest.mkdirs(); // 경로상에 없는 모든 폴더를 생성
		
		// 폴더 삭제
		// 폴더가 비어있어야만 삭제가 가능
		// 폴더 안에 파일이나 하위 폴더가 있다면 먼저 삭제해야 함
		dirTest = new File("C:/Temp/test/videos");
		if (dirTest.delete()) {
			System.out.println("videos 폴더 삭제 완료");
		}
		dirTest = new File("C:/Temp/test");
		if (dirTest.delete()) {
			System.out.println("test 폴더 삭제 완료");
		}
		
		// 파일 삭제
		if (file3.delete()) {
			System.out.println("file3.txt 파일 삭제 완료");
		}
		
		// 파일 및 폴더 유형 확인
		// 파일인지 폴더인지 여부를 true/false로 리턴함
		System.out.println("폴더? " + dir.isDirectory());
		System.out.println("파일? " + dir.isFile());
		System.out.println("폴더? " + file1.isDirectory());
		System.out.println("파일? " + file1.isFile());
		
		// 상위(부모) 폴더 확인
		// 파일이나 폴더가 속한 상위(부모) 폴더의 경로를 문자열로 리턴
		System.out.println(dir.getParent());
		// 상위(부모) 폴더를 File 객체로 만든 후 리턴
		File parentDir = dir.getParentFile();
		
		// 파일 및 폴더의 전체 경로 확인
		System.out.println(dir.getPath());
		System.out.println(file1.getPath());
		
		// Temp 폴더 정보 출력하기
		File temp = new File("C:/Temp");
		
		if (temp.exists() && temp.isDirectory()) {
			// Temp 폴더에 있는 파일 및 하위 폴더를 File 배열로 리턴
			File[] contents = temp.listFiles();
			
			System.out.println("시간\t\t\t형태\t\t크기\t이름");
			System.out.println("--------------------------------------------------------");
			
			// 날짜 포맷 지정
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			
			// 반복문을 사용하여 모든 파일과 폴더 확인
			for (File file : contents) {
				// 파일의 마지막 수정 날짜 확인
				// 마지막 수정 시간을 밀리초 단위로 반환
				// 날짜 형식으로 바꾸기 위해 Date 클래스와 SimpleDateFormat 활용
//				System.out.println(file.lastModified()); // 확인용
				// (참고)
				// UNIX 시간(에포크 시간): 1970년 1월 1일 0시 0분 0초 UTC 기준의 경과 밀리초
				
				System.out.print(sdf.format(new Date(file.lastModified())));
				
				// 폴더인지 검사
				if (file.isDirectory()) {
					// 폴더 이름만 출력
					System.out.print("\t<DIR>\t\t\t" + file.getName());
				} else {
					// 파일 크기 + 파일 이름 출력
					System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
				}
				System.out.println();
			}
		} else {
			System.out.println("폴더가 아니거나 존재하지 않습니다.");
		}
	}

}
