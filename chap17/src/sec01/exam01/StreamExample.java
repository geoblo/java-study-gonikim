package sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("김재현");
		
		// 외부 반복자 이용
		for (String item : set) {
			System.out.println(item);
		}
		
		System.out.println();
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
		
		System.out.println();
		
		// 내부 반복자 이용
		Stream<String> stream = set.stream();
		
		// 익명 구현 객체 사용 시
		stream.forEach(new Consumer<String>() {
			@Override
			public void accept(String item) {
				System.out.println(item);
			}
		});
		
		System.out.println();
		
		// 스트림은 한 번 사용하면 재사용 불가, 다시 얻어서 사용
		stream = set.stream();

		// 데이터를 어떻게 처리할 지 스트림한테 람다식으로 제공
		stream.forEach((item) -> {
			System.out.println(item);
		});
		
		System.out.println();
		
		stream = set.stream();
		stream.forEach(item -> System.out.println(item));
		
		System.out.println();
		
		// 메소드 참조로 단축
		set.stream().forEach(System.out::println);
		
	}

}
