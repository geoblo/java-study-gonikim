package sec01.exam06;

public class MyClassExample {

	public static void main(String[] args) {
		// Quiz: 어떤 구현 객체가 실행될지 맞춰보기
		System.out.println("1)---------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn(); // TV
		myClass1.rc.setVolume(5); // TV 
		
		System.out.println("2)----------------");
		
		MyClass myClass2 = new MyClass(new Audio()); // Audio
		
		System.out.println("3)----------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA(); // Audio
		
		System.out.println("4)----------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television()); // TV
	}

}
