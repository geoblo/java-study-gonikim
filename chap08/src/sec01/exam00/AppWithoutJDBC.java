package sec01.exam00;

public class AppWithoutJDBC {
	
	public static void main(String[] args) {
		// MySQL DB 사용 시
//		MySQLDatabase mysql = new MySQLDatabase();
//		mysql.connectToMySQL();
//		mysql.runMySQLQuery("SELECT * FROM member");
		
		// Oracle DB로 변경 시
		OracleDatabase oracle = new OracleDatabase();
		oracle.openOracleConnection();
		oracle.executeOracleQuery("SELECT * FROM member");
	}
	
}

// MySQL 데이터베이스에 연결한다고 가정
class MySQLDatabase {
	public void connectToMySQL() {
		System.out.println("MySQL에 연결합니다.");
	}
	
	public void runMySQLQuery(String sql) {
		System.out.println("MySQL 쿼리 실행: " + sql);
	}
}

// Oracle 데이터베이스에 연결한다고 가정
class OracleDatabase {
	public void openOracleConnection() {
		System.out.println("Oracle에 연결합니다.");
	}
	
	public void executeOracleQuery(String sql) {
		System.out.println("Oracle 쿼리 실행: " + sql);
	}
}

// 문제점
// DB마다 메소드명이 다르고, 클래스도 달라서 하나의 코드로 통일 불가
// 만약 DB를 바꾸면 전체 코드를 다시 짜야 함
// 유지보수가 매우 어려움

