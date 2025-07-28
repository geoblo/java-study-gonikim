package sec02.exam06.quiz;

public class Student extends SchoolMember {
	@Override
    public void introduce() {
        System.out.println("안녕하세요, 학생입니다.");
    }

    public void study() {
        System.out.println("공부하는 중입니다.");
    }
}
