package sec01.exam03;

import java.util.Objects;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("재정의된 equals() 호출");
		if (obj instanceof Key compareKey) {
			if (this.number == compareKey.number) {
				return true;
			}
		}
		
		return false;
	}

//	@Override
//	public int hashCode() {
//		System.out.println("재정의된 hashCode() 호출");
//		// number가 같은 모든 Key 객체는 동일한 해시코드가 나오게 만들어줌
//		return number;
//	}
	
	// Objects.hash(...)
	// 자바에서 여러 필드를 조합하여 간편하게 hashCode()를 만들 수 있도록 제공되는 유틸리티 메소드
	// 가변 인자를 받아서 자동으로 적절한 해시코드를 계산해줌
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
}
