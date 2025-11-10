package sec03.exam01;

// 1. 각자 테마 변경 및 글자 크기 조정
// 단축키: ctrl + 또는 -

// 2. 주석 사용하기
// 여기에는 모두 주석이 됩니다.
/*
주석1
주석2
*/
/**
 * 도큐먼트 주석: 도큐먼트 문서 생성하는데 사용
 */
// TODO: Tasks 뷰 추가해서 확인
public class Hello { // 클래스 선언: 클래스 이름은 대문자로 시작하고 반드시 소스 파일의 이름과 동일
	
	// 프로그램 실행 진입점
	// main 메소드: 자바 프로그램 실행 시 가장 먼저 실행되는 메소드
	public static void main(String[] args) { // 메소드 선언
		// 콘솔에 출력하는 실행문
		System.out.println("Hello, Java");
	
		System.out.println("Hello, // /**/ Java"); // 문자열 내부에는 주석을 붙일 수 없다.		
	}
	
}

/* Eclipse 단축키 정리
- 단축키 확인
Window > Preference > General > Keys 메뉴에서 확인 가능
단축키 보기 Hint : Ctrl + Shift + L

- 코드 작성 및 편집
Ctrl + Space : 자동 완성 기능
Ctrl + Shift + O : 필요한 import 자동 추가 및 정리
Ctrl + Shift + F : 코드 자동 정렬 (포맷터 적용)
Ctrl + Alt + ↑ / ↓ : 현재 줄 위/아래로 복사
Alt + ↑ / ↓ : 현재 줄 위/아래로 이동
Ctrl + D : 한줄 삭제
Alt + Shift + R : 변수/메서드명 변경 (참조 모두 변경)

- 탐색 및 검색
F3 : 선택한 변수/메서드의 선언부로 이동
Ctrl + O : 멤버 검색창
Ctrl + Shift + G : 해당 변수/메서드를 참조하는 모든 코드 검색
Ctrl + Shift + R : 파일명으로 검색 후 파일 열기
Ctrl + H : 파일/문자열 전체 프로젝트 내 검색

- 실행 및 디버깅
Ctrl + F11 : 현재 파일 실행
F11 : 현재 파일 디버깅 실행
Ctrl + Shift + B : 현재 줄에 브레이크포인트 설정/해제
F6 : 디버깅 중 다음 줄까지 실행 (Step Over)
F5 : 메서드 내부 진입 (Step Into)
F7 : 현재 메서드에서 빠져나옴 (Step Return)

- 프로젝트 관리 및 리팩토링
Ctrl + n + java project : 새 프로젝트 생성
Ctrl + n + java class : 새 클래스 생성
Alt + Shift + N → C : 새 클래스 생성
Alt + Shift + S : 소스 메뉴
Alt + Shift + T : 리팩토링 메뉴 (Extract Method 등)

- 주석 달기
Ctrl + / : 한줄 주석 처리 또는 제거
Ctrl + Shift + / : 블록 주석
Ctrl + Shift + \ : 블록 주석 제거

- Git
Ctrl + Shift + 3 : Git Staging
*/
