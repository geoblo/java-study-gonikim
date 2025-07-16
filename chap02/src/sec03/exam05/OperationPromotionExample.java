package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; // int + int
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		// char도 마찬가지(연산 시 int로 형변환)
		char charValue1 = 'A'; // 문자가 아니라 유니코드 65가 저장됨
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; // int + int
		int intValue2 = charValue1 + charValue2; // 65 + 1
		System.out.println("유니코드=" + intValue2);
		// 문자로 출력하고 싶다면 char 타입으로 강제 형변환
		System.out.println("출력문자=" + );
	
		
		
		
		
		
		
	}

}
