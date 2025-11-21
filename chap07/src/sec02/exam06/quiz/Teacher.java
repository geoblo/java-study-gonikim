package sec02.exam06.quiz;

public class Teacher extends SchoolMember {
	@Override
	public void introduce() {
	    System.out.println("안녕하세요, 선생님입니다.");
	}

	public void teach() {
	    System.out.println("수업을 하고 있습니다.");
	}
}
