package homework.condition;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 과목의 점수를 입력하세요.");

        System.out.print("소프트웨어설계 점수: ");
        int design = sc.nextInt();

        System.out.print("소프트웨어개발 점수: ");
        int dev = sc.nextInt();

        System.out.print("데이터베이스구축 점수: ");
        int db = sc.nextInt();

        System.out.print("프로그래밍언어활용 점수: ");
        int lang = sc.nextInt();

        System.out.print("정보시스템구축관리 점수: ");
        int system = sc.nextInt();
        
        double avg = (design + dev + db + lang + system) / 5.0;
        
        
        
        
	}

}
