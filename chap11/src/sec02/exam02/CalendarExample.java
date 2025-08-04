package sec02.exam02;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // Calendar의 하위(자식) 객체를 리턴
		
		int year = now.get(Calendar.YEAR); // 연도
		int month = now.get(Calendar.MONTH) + 1; // 월: 0~11
		int day = now.get(Calendar.DAY_OF_MONTH); // 일: 1~31
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일: 1(일)~7(토)
		String strWeek = null;
		
		switch (week) {
			case Calendar.MONDAY: strWeek = "월"; break;
			case Calendar.TUESDAY: strWeek = "화"; break;
			case Calendar.WEDNESDAY: strWeek = "수"; break;
			case Calendar.THURSDAY: strWeek = "목"; break;
			case Calendar.FRIDAY: strWeek = "금"; break;
			case Calendar.SATURDAY: strWeek = "토"; break;
			case Calendar.SUNDAY: strWeek = "일"; break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
