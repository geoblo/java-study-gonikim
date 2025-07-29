package sec01.exam00;

public class AppWithJDBC {

	public static void main(String[] args) {
		Connection conn = getConnection("MySQL");
        conn.connect();
        conn.execute("SELECT * FROM member");
	}
	
	public static Connection getConnection(String dbType) {
        if (dbType.equals("MySQL")) {
            return new MySQLConnection();
        } else if (dbType.equals("Oracle")) {
            return new OracleConnection();
        }
        throw new RuntimeException("지원하지 않는 DB입니다.");
    }

}

class MySQLConnection implements Connection {
    public void connect() {
        System.out.println("MySQL 연결 완료");
    }

    public void execute(String sql) {
        System.out.println("MySQL 쿼리 실행: " + sql);
    }
}

class OracleConnection implements Connection {
    public void connect() {
        System.out.println("Oracle 연결 완료");
    }

    public void execute(String sql) {
        System.out.println("Oracle 쿼리 실행: " + sql);
    }
}

// 장점
// Connection이라는 인터페이스 하나만 보고 프로그래밍 가능
// 어떤 DB를 쓰든 connect() 와 execute()만 호출하면 됨
// 코드의 유지보수성과 확장성이 크게 향상됨
