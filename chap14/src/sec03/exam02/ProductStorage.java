package sec03.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	// Product가 저장될 List 컬렉션
	private List<Product> productList = new ArrayList<>();
	// 키보드 입력 Scanner 생성
	private Scanner sc = new Scanner(System.in);
	// 상품을 등록할 때 pno 값을 자동으로 부여하기 위해 사용
	private int counter;
	
	public void showMenu() {
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1.등록  |  2.목록   |  3.종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택: ");
			String selectNo = sc.nextLine();
			switch (selectNo) {
				case "1": registerProduct(); break; // Product 등록
				case "2": showProducts(); break; // 등록된 모든 Product 정보 보기
				case "3": return; // 프로그램 종료
			}
		}
	}
	
	public void registerProduct() {
		// Quiz: 예외 처리까지 추가
		Product product = new Product();
		
		try {
			// 상품 번호는 1부터
			product.setPno(++counter);
			
			System.out.print("상품명: ");
			product.setName(sc.nextLine());
			
			System.out.print("가격: ");
//			product.setPrice(sc.nextInt()); // nextInt(): 버퍼에 개행 문자가 남음
			product.setPrice(Integer.parseInt(sc.nextLine()));
			
			System.out.print("재고: ");
//			product.setStock(sc.nextInt()); // nextInt(): 버퍼에 개행 문자가 남음
			product.setStock(Integer.parseInt(sc.nextLine()));
		
			productList.add(product);
		} catch (Exception e) {
			System.out.println("등록 에러: "+ e.getMessage());
		}
	}
	
	public void showProducts() {
		for (Product p : productList) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
	
}
