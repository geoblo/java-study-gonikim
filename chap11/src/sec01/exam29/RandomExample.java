package sec01.exam29;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// Random 클래스
		// Math.random() 보다 더 다양한 기능과 제어를 제공
		// 정수, 실수, 논리값 등 다양한 타입의 난수 생성 가능
		// 반복, 시드 필요, 테스트 용도 또는 멀티 쓰레드 환경에서 사용
		
		Random random = new Random();
		
		// 시드(seed)란?
		// 난수 생성기의 "초기값"
		// 동일한 시드를 넣으면 항상 같은 난수 순서(시퀀스)가 생성됨
		// 시드를 지정하지 않으면 시스템의 현재 시각에 따라 자동으로 지정됨
//		random.setSeed(1234);
		
		int randInt1 = random.nextInt();
		int randInt2 = random.nextInt();
		int randInt3 = random.nextInt();
		// 범위 지정(이상, 미만)
		int randInt4 = random.nextInt(0, 10); // 0~9
		int randInt5 = random.nextInt(0, 10);
		int randInt6 = random.nextInt(0, 10);
		
		System.out.println(randInt1);
		System.out.println(randInt2);
		System.out.println(randInt3);
		System.out.println(randInt4);
		System.out.println(randInt5);
		System.out.println(randInt6);
		
		double randDouble1 = random.nextDouble();
		double randDouble2 = random.nextDouble();
		// 범위 지정(이상, 미만)
		double randDouble3 = random.nextDouble(3.14, 5.67);
		double randDouble4 = random.nextDouble(3.14, 5.67);
		
		System.out.println(randDouble1);
		System.out.println(randDouble2);
		System.out.println(randDouble3);
		System.out.println(randDouble4);
		
		boolean randBoolean1 = random.nextBoolean();
		boolean randBoolean2 = random.nextBoolean();
		
		System.out.println(randBoolean1);
		System.out.println(randBoolean2);
		
	}

}
