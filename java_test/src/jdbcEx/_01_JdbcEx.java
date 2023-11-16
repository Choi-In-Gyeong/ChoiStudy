package jdbcEx;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;// sql로 임포트 beans말고

public class _01_JdbcEx {
	public static void main(String[] args) {
		
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "system";
			String db_pw = "test123";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB연결 완료");
			
			stmt = conn.createStatement();
//			stmt 는 쿼리문을 호출하는 객체

			ResultSet srs = stmt.executeQuery("select * from student");//반환형 ResultSet으로 만든 객체에 담음.
			printData(srs, "name", "id", "dept");//선언되지 않은 메서드 
			
			srs = stmt.executeQuery("select stu_name, stu_no, stu_dept from student where name='옥한빛'");
			printData(srs, "name", "id", "dept");
			
		} catch (ClassNotFoundException e){
			System.out.println("JDBC 드라이버 로드오류");// "JDBC 드라이버 로드오류"라고 출력해주면 가독성이 좋음.
		} catch(SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
	static void printData (ResultSet srs, String a, String b, String c)
			throws SQLException {
		System.out.print(a); //겟스트링 컬럼명으로
		System.out.print("\t|\t" + b + "\t");
		System.out.println("\t|\t" + c);
		
		while (srs.next()) {

			System.out.print(srs.getString("stu_name")); //겟스트링 컬럼명으로
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.print("\t|\t" + srs.getString("stu_dept"));
			System.out.println();
			}
	}
	
	
}


