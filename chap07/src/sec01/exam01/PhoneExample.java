package sec01.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		// CellPhone으로부터 상속 받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		// DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		// CellPhone으로부터 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();

		// DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}
	
	// 상속의 이점?
	// 1. 부모 클래스 재사용을 통해 빠른 개발 가능
	// 2. 중복되는 코드를 줄임
	// 3. 부모만 수정하면 자식들까지 수정되는 효과가 있어 유지 보수 편리
	
	// 자바는 클래스 간의 다중 상속을 허용하지 않음
	// 이유: 두 개 이상의 부모 클래스가 동일한 메서드나 멤버를 가질 경우
    // 어떤 것을 상속할지 모호하여 충돌이 발생할 수 있기 때문

}
