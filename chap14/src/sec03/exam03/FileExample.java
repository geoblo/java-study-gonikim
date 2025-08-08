package sec03.exam03;

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
	}

}
