package sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String strNow = sdf.format(now); // 원하는 날짜 포맷으로 문자열 반환
		System.out.println(strNow);
		
		// 참고
		// 주요 포맷 문자와 자주 쓰는 패턴
		// y: 연도(year) -> yyyy: 4자리 연도
		// M: 월(month) -> MM: 2자리 월(01~12)
		// d: 일(day) -> dd: 2자리 일
		// E: 요일(day name) -> E: 요일 약어, EEEE: 요일 전체 이름
		// a: 오전/오후(AM/PM)
		// H: 시(0~23시) -> HH: 24시간제 시(00~23)
		// h: 시(1~12시) -> hh: 12시간제 시(01~12)
		// m: 분(minute) -> mm: 2자리 분
		// s: 초(second) -> ss: 2자리 초
		// S: 밀리초
		
		// HH는 24시간제, hh는 12시간제(a와 함께 사용해야 오전/오후 구분 가능)
		// 대소문자를 구분합니다 (MM은 "월", mm은 "분")
		
		// Quiz
		// 아래와 같이 출력되도록 날짜 포맷을 지정하세요.
		// 25년 8월 4일 월요일 14시 5분 8초 137
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
