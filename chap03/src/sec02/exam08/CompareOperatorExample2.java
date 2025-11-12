package sec02.exam08;

import java.math.BigDecimal;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true
		// v2가 double 타입으로 변환, 1.0 == 1.0
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		// v5가 double 타입으로 변환, 두 타입의 정밀도 차이때문에 false
		System.out.println(v4 + "==" + (double) v5);
		// 자바에서는 0.1을 float나 double로 저장하면 정확히 0.1이 저장되지 않음
		// 이는 부동소수점 표현의 한계 때문이여, 이진수로 정확히 표현할 수 없는 10진수이기 때문
		// v4도 정확히 0.1이 아님(0.1에 매우 근사한 값)
		
		// 해결책
		// 1. float로 바꿔서 비교
		System.out.println((float) v4 == v5);
		
		// 2. 정수로 바꿔서 비교
		System.out.println((int) (v4 * 10) == (int) (v5 * 10));
		
		// 정리: float 타입과 double 타입을 비교하도록 코드를 작성하지 않는 것이 좋음
		// 실수 타입을 하나로 통일하는 것이 좋음(주로 double 타입 사용)
		
		// (참고) 메모리에 실제로 저장된 값
		// 0.1f ≈ 0.100000001490116119384765625 (정밀도 대략 7)
		// 0.1(double) ≈ 0.1000000000000000055511151231257827 (정밀도 대략 15)
		
		// (참고) 정밀도 테스트
		double result = 7 * 0.1;
		System.out.println(result);
		// 부동소수점 방식에서 실수 연산을 하다보면 근사값이 나옴
		// 1. 정수로 바꿔 계산해서 실수 타입으로 변환
		// 2. 그냥 실수로 계산해서 반올림, 올림, 내림 등을 적절히 사용
		
		// (참고) BigDecimal
		// 자바에서 소수점(특히 금융, 금액, 정밀 계산)을 정확하게 다루기 위해 사용하는 클래스
		// 2진 부동소수점 근사값으로 저장하지 않고, 10진수 그대로(문자열 기반)로 저장
		BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");

        BigDecimal sum = a.add(b);
        System.out.println(sum);  // 0.3
        // 문자열 "0.1", "0.2" 로 생성하는 것이 핵심
        // 0.1 처럼 double 리터럴로 생성하면 부동소수점 오차가 그대로 들어감
	}

}
