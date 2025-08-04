package sec01.exam01_2;

import java.util.Objects;

// Comparable
// 자바에서 객체 간의 "기본 정렬 순서"를 정의하기 위해 사용되는 인터페이스
// 객체를 정렬할 수 있도록 비교 기준을 정의
public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Student)) return false;
		
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// 중요! compareTo()의 리턴값 의미(오름차순을 기준으로 함)
		// 음수: this < other - this가 앞에 온다
		// 양수: this > other - this가 뒤에 온다
		// 0: this == other - 순서 유지
		// 즉, 양수이면 자리를 바꿔주고 음수 또는 0이면 자리를 바꾸지 않음
		return 0;
	}
}
