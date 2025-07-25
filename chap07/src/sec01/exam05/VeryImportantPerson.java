package sec01.exam05;

// Member를 상속할 수 없음
//public class VeryImportantPerson extends Member {
public class VeryImportantPerson {

}

// 상속할 이유가 없고, 오히려 상속하면 오용될 가능성이 있는 클래스는 final로 선언
// 대표적인 예: String <-- 불변 객체이므로 변형 방지

// 예를 들어 String을 상속해서 MyString이라는 클래스를 만들고, 
// equals()나 hashCode()를 마음대로 바꾼다면, 자바의 내부적인 문자열 비교나 
// HashMap에서 String을 사용할 때 문제가 생길 수 있음 
// 그래서 아예 상속을 못 하게 final로 막아두는 것
