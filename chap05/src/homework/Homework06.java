package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        String[] arr = new String[size];
        
        for (int i = 0; i < arr.length; i++) { // arr.length == size
            System.out.print((i + 1) + "번째 문자열: ");
            arr[i] = sc.nextLine();
        }

        while (true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N): ");
            String answer = sc.nextLine();

            if ("N".equalsIgnoreCase(answer)) {
                break;
            } else if ("Y".equalsIgnoreCase(answer)) {
                System.out.print("더 입력하고 싶은 개수: ");
                int addCount = sc.nextInt();
                sc.nextLine(); // 개행 문자 제거
                
                // Arrays.copyOf를 이용해 크기 확장
                arr = Arrays.copyOf(arr, arr.length + addCount);

                // 추가된 부분에 새 문자열 입력
                for (int i = arr.length - addCount; i < arr.length; i++) {
                    System.out.print((i + 1) + "번째 문자열: ");
                    arr[i] = sc.nextLine();
                }
            } else {
                System.out.println("입력할 수 없는 값입니다.");
            }
        }

        // 전체 출력
        for (String str : arr) {
            System.out.println(str);
        }

	}

}
