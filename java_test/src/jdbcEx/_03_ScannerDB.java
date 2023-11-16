package jdbcEx;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;// sql로 임포트 beans말고
import java.util.Scanner;

public class _03_ScannerDB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
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
			
//					stmt = conn.createStatement();
			System.out.print("학번 입력 : ");
			String stu_no = s.next();
			System.out.print("이름 입력 : ");
			String stu_name = s.next();
			System.out.print("학과 입력 : ");
			String stu_dept = s.next();
			System.out.println("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
			stmt.executeUpdate("insert into student(stu_no, stu_name, stu_dept) values('" + stu_no + "', '" + stu_name + "', '" + stu_dept + "')");
			printTable(stmt, stu_name);
			
		} catch (ClassNotFoundException e){
			System.out.println("JDBC 드라이버 로드오류");// "JDBC 드라이버 로드오류"라고 출력해주면 가독성이 좋음.
		} catch(SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
	static void printTable(Statement stmt, String stu_name) throws SQLException{
		ResultSet srs =  stmt.executeQuery("select * from student where stu_name = '" + stu_name + "'");
		if(srs.next()){
			System.out.print(srs.getString("stu_name"));
			System.out.print("\t|\t" + srs.getString("stu_no"));
			System.out.println("\t|\t" +  srs.getString("stu_dept"));
		} else {
			System.out.println("데이터 없음");
		}
	}
}



