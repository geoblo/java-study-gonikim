package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------");
		x++; // x = x + 1; => 11
		++x; // x = x + 1; => 12
		System.out.println("x=" + x);
		
		System.out.println("--------------------");
		y--; // y = y - 1; => 9
		--y; // y = y - 1; => 8
		System.out.println("y=" + y);
		
		// 다른 연산자와 같이 쓸 때
		System.out.println("--------------------");
		// 후위 연산자는 값을 먼저 사용한 뒤 증감시키는 연산자
		z = x++; // z = x; x = x + 1;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------------");
		// 전위 연산자는 값을 먼저 증감시킨 뒤 사용하는 연산자
		z = ++x; // x = x + 1; z = x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------------");
		z = ++x + y++; // x = x + 1; z = x + y; y = y + 1;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		System.out.println("--------------------");
		// Quiz
		// 다음 코드 실행 후 x의 값은?
		x = 3;

		if (x++ == 3) {
		    x++;
		}
		
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		// 다음 코드 실행 후 x, y의 값은?
		x = 1;
		y = x++ + ++x + x;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
