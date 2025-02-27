import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleJDBCExample {
	public static void main(String[] args) {
// 데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@//localhost:1521/xe"; // 오라클 DB URL
		String user = "your_username"; // 오라클 사용자 이름
		String password = "your_password"; // 오라클 사용자 비밀번호

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
// JDBC 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

// 데이터베이스 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스에 성공적으로 연결되었습니다.");

// SQL 쿼리 실행
			String query = "SELECT * FROM emp";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

// 결과 처리
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				java.sql.Date hiredate = rs.getDate("hiredate");

				System.out.println("Emp No: " + empno + ", Ename: " + ename + ", Hiredate: " + hiredate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}