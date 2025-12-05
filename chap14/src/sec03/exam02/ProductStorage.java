package sec03.exam02;

public class ProductStorage {
	// Product가 저장될 List 컬렉션
	
	// 키보드 입력 Scanner 생성
	
	// 상품을 등록할 때 pno 값을 자동으로 부여하기 위해 사용
	private int counter;
	
	public void showMenu() {
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1.등록  |  2.목록   |  3.종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택: ");
			String selectNo = scanner.nextLine();
			switch (selectNo) {
				case "1": registerProduct(); break; // Product 등록
				case "2": showProducts(); break; // 등록된 모든 Product 정보 보기
				case "3": return; // 프로그램 종료
			}
		}
	}
	
	public void registerProduct() {
		// Quiz: 예외 처리까지 추가
		
		System.out.print("상품명: ");
		
		System.out.print("가격: ");
		
		System.out.print("재고: ");
	
	}
	
	public void showProducts() {
		for (Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
	
}
